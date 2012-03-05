package sample.validation.web.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import sample.validation.web.form.SampleValidationForm;

/**
 * 
 * @author mori_shigeki
 */
@Controller
@RequestMapping(value = { "/validation", "/validation/*" })
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class SampleValidationController {

	private Log log = LogFactory.getLog(SampleValidationController.class);

	/**
	 * 
	 */
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	}

	/**
	 * 
	 * @param form
	 * @return
	 */
	@RequestMapping(value = { "show1" }, method = { RequestMethod.GET })
	public String show1(SampleValidationForm form) {
		return "001.ftl";
	}

	/**
	 * 
	 * @param form
	 * @return
	 */
	@RequestMapping(value = { "show2" }, method = { RequestMethod.GET })
	public String show2(SampleValidationForm form) {
		return "002.ftl";
	}

	/**
	 * 
	 * @param form
	 * @return
	 */
	@RequestMapping(value = { "submit1" }, method = { RequestMethod.POST })
	public String submit1(@Valid SampleValidationForm form,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			log.error("エラーあり");
		} else {
			log.info("エラーなし");
		}
		return "001.ftl";
	}

	/**
	 * 
	 * @param form
	 * @return
	 */
	@RequestMapping(value = { "submit2" }, method = { RequestMethod.POST })
	public String submit2(@Valid SampleValidationForm form,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			log.error("エラーあり");
		} else {
			log.info("エラーなし");
		}
		return "002.ftl";
	}

	/**
	 * システム例外
	 * 
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler
	@ResponseBody
	public String handleException(Exception e) throws Exception {
		log.info("SbpsPurchaseResultController#handleException");
		log.error(e);
		return "NG,エラー";
	}
}

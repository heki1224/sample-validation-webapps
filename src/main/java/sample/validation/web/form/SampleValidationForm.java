package sample.validation.web.form;

import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class SampleValidationForm {

	@AssertTrue(message = "チェックが入っていません")
	private boolean varTrue;

	@AssertFalse(message = "チェックが入っています")
	private boolean varFalse;

	@DecimalMin(value = "2", message = "値が小さすぎます")
	@DecimalMax(value = "10", message = "値が大きすぎます")
	private String decimalMaxMin;

	@Min(value = 6, message = "値が小さすぎます")
	@Max(value = 10, message = "値が大きすぎます")
	private String maxMin;

	@Digits(integer = 3, fraction = 1, message = "数値形式が違います")
	private String digitInt;

	@Future(message = "日付が未来ではありません")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date future;

	@Past(message = "日付が過去ではありません")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date past;

	@Null(message = "値が存在しています")
	private String isNull;

	@NotNull(message = "値が存在していません")
	private String isNotNull;

	@Pattern(regexp = "test.*", message = "入力形式にマッチしていません")
	private String testPattern;

	@Size(min = 3, max = 10, message = "3桁以上10桁以下ではありません")
	private String strSize;

	public boolean isVarTrue() {
		return varTrue;
	}

	public void setVarTrue(boolean varTrue) {
		this.varTrue = varTrue;
	}

	public boolean isVarFalse() {
		return varFalse;
	}

	public void setVarFalse(boolean varFalse) {
		this.varFalse = varFalse;
	}

	public String getDecimalMaxMin() {
		return decimalMaxMin;
	}

	public void setDecimalMaxMin(String decimalMaxMin) {
		this.decimalMaxMin = decimalMaxMin;
	}

	public String getMaxMin() {
		return maxMin;
	}

	public void setMaxMin(String maxMin) {
		this.maxMin = maxMin;
	}

	public String getDigitInt() {
		return digitInt;
	}

	public void setDigitInt(String digitInt) {
		this.digitInt = digitInt;
	}

	public Date getFuture() {
		return future;
	}

	public void setFuture(Date future) {
		this.future = future;
	}

	public Date getPast() {
		return past;
	}

	public void setPast(Date past) {
		this.past = past;
	}

	public String getIsNull() {
		return isNull;
	}

	public void setIsNull(String isNull) {
		this.isNull = isNull;
	}

	public String getIsNotNull() {
		return isNotNull;
	}

	public void setIsNotNull(String isNotNull) {
		this.isNotNull = isNotNull;
	}

	public String getTestPattern() {
		return testPattern;
	}

	public void setTestPattern(String testPattern) {
		this.testPattern = testPattern;
	}

	public String getStrSize() {
		return strSize;
	}

	public void setStrSize(String strSize) {
		this.strSize = strSize;
	}

}

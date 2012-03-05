<#import "/spring.ftl" as spring />
<#import "/validation.ftl" as validation />
<html>
<head>
<meta http-equiv="Content-Language" content="ja" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h2>Bean Validation</h2>
	<form method="post" " action="/sample/validation/submit2">
		<@validation.form "sampleValidationForm" />
		Trueチェック:<input type="checkbox" name="varTrue"/><@validation.fieldErrors "varTrue" "<br/>" "color:red"/><br/>
		Falseチェック:<input type="checkbox" name="varFalse" checked="checked"/><@validation.fieldErrors "varFalse" "<br/>" "color:red"/><br/>
		数値最大値最小値チェック：<input type="text" name="decimalMaxMin" value="500" /><@validation.fieldErrors "decimalMaxMin" "<br/>" "color:red"/><br/>
		最大値最小値チェック<input type="text" name="maxMin" value="1" /><@validation.fieldErrors "maxMin" "<br/>" "color:red"/><br/>
		数値形式チェック：<input type="text" name="digitInt" value="1001.0" /><@validation.fieldErrors "digitInt" "<br/>" "color:red"/><br/>
		未来日付チェック：<input type="text" name="future" value="2010-10-10" /><@validation.fieldErrors "future" "<br/>" "color:red"/><br/>
		過去日付チェック：<input type="text" name="past" value="2021-12-24" /><@validation.fieldErrors "past" "<br/>" "color:red"/><br/>
		Nullチェック：<input type="text" name="isNull" value="a" /><@validation.fieldErrors "isNotNull" "<br/>" "color:red"/><br/>
		入力パターンチェック：<input type="text" name="testPattern" value="guest" /><@validation.fieldErrors "testPattern" "<br/>" "color:red"/><br/>
		サイズチェック：<input type="text" name="strSize" value="abcdeaaaaaaaaaa" /><@validation.fieldErrors "strSize" "<br/>" "color:red"/><br/>
		NotNullチェック：フォームデータなし<@validation.fieldErrors "isNotNull" "<br/>" "color:red"/><br/>
		<input type="submit" value="テスト" />
	</form>
</body>
</html>

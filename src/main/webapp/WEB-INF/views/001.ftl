<#import "/spring.ftl" as spring />
<#import "/validation.ftl" as validation />
<html>
<head>
<meta http-equiv="Content-Language" content="ja" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h2>Bean Validation</h2>
	<form method="post" " action="/sample/validation/submit1">
		<@validation.form "sampleValidationForm" />
		Trueチェック:<input type="checkbox" name="varTrue" checked="checked"/><@validation.fieldErrors "varTrue" "<br/>" "color:red"/><br/>
		Falseチェック:<input type="checkbox" name="varFalse" /><@validation.fieldErrors "varFalse" "<br/>" "color:red"/><br/>
		数値最大値最小値チェック：<input type="text" name="decimalMaxMin" value="5" /><@validation.fieldErrors "decimalMaxMin" "<br/>" "color:red"/><br/>
		最大値最小値チェック<input type="text" name="maxMin" value="8" /><@validation.fieldErrors "maxMin" "<br/>" "color:red"/><br/>
		数値形式チェック：<input type="text" name="digitInt" value="100.0" /><@validation.fieldErrors "digitInt" "<br/>" "color:red"/><br/>
		未来日付チェック：<input type="text" name="future" value="2020-10-10" /><@validation.fieldErrors "future" "<br/>" "color:red"/><br/>
		過去日付チェック：<input type="text" name="past" value="2001-12-24" /><@validation.fieldErrors "past" "<br/>" "color:red"/><br/>
		NotNullチェック：<input type="text" name="isNotNull" value="a" /><@validation.fieldErrors "isNotNull" "<br/>" "color:red"/><br/>
		入力パターンチェック：<input type="text" name="testPattern" value="testa" /><@validation.fieldErrors "testPattern" "<br/>" "color:red"/><br/>
		サイズチェック：<input type="text" name="strSize" value="abcde" /><@validation.fieldErrors "strSize" "<br/>" "color:red"/><br/>
		Nullチェック：フォームデータなし<br/>
		<input type="submit" value="テスト" />
	</form>
</body>
</html>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html>
<head>
<title>おみくじ|誕生日入力</title>
<link rel="stylesheet" href="${f:url('/css/stylesheet.css')}"
	type="text/css">
</head>
<body>
	<div class="omikuji">
		<h1>おみくじ</h1>
		<html:img page="/image/omikuji.sihme.png" alt="しめ縄" width="280"
			height="150"></html:img>
		<p>あなたの今日の運勢を占います</p>
		<p>誕生日を入力してください(例 19990101)</p>

				<html:errors property="birthday" />


		<s:form method="POST" action="/result/execute">
			<input type="text" name="birthday" />
			<s:submit property="result" value="おみくじを引く" />
		</s:form>


	</div>
</body>
</html:html>

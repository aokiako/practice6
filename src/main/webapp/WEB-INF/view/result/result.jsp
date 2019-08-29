<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html:html>
<head>
<title>おみくじ|結果</title>
<link rel="stylesheet" href="${f:url('/css/stylesheet.css')}" type="text/css">

</head>
<body>

	<div class="omikuji">
		<h2>
			<span class="line">おみくじ結果</span>
		</h2>
		 <p>今日の運勢は…</p>
		<h3>${f:h(omikuji.unsei.unseiName)}</h3>
		<table class="paper">

			<tr>
				<th>願い事</th>
				<th>商い</th>
				<th>学問</th>
			</tr>
			<tr>
				<td>${f:h(omikuji.negaigoto)}</td>
				<td>${f:h(omikuji.akinai)}</td>
				<td>${f:h(omikuji.gakumon)}</td>
			</tr>
		</table>


		<s:form method="POST" action="/statistics1/execute">
			<s:submit property="statistics1" value="過去半年と今日の運勢の結果" />
			<input type="hidden" name="birthday" value="${birthday}" />
		</s:form>

		<s:form method="POST" action="/statistics2/execute">

			<s:submit property="statistics2" value="入力された誕生日の過去半年の結果" />
			<input type="hidden" name="birthday" value="${birthday}" />
		</s:form>
		<br>
		<s:link href="/index">トップに戻る</s:link>

	</div>



</body>
</html:html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html:html>
<head>
<title>おみくじ|統計1</title>
<link rel="stylesheet" href="${f:url('/css/stylesheet.css')}"
	type="text/css">

</head>
<body>
	<div class="omikuji">

		<h2>
			<span class="line">おみくじの統計</span>
		</h2>

		<p>今日の運勢結果の割合</p>
		<table>
			<c:forEach var="i" items="${percent}">
				<tr>
					<th>${f:h(i.key)}</th>
					<td>${f:h(i.value)}%<br></td>
				</tr>
			</c:forEach>
		</table>

		<p>過去半年の運勢結果の割合</p>
		<table>
			<c:forEach var="j" items="${percent2}">
				<tr>
					<th>${f:h(j.key)}</th>
					<td>${f:h(j.value)}%<br></td>
				</tr>
			</c:forEach>
		</table>


		<s:form method="POST" action="/result/execute">
			<s:submit property="text" value="結果に戻る" />
			<input type="hidden" name="birthday" value="${f:h(birthday2)}">
		</s:form>
	</div>

</body>
</html:html>
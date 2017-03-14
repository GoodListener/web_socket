<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./lib/jquery-3.1.1.js"></script>
<title>월간 예배</title>
</head>
<body>
<div class="container">
<c:forEach items="${worshipList}" var="worship">
${worship.worshipNo}
</c:forEach>
</div>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/3/23
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%pageContext.setAttribute("contextPath", request.getContextPath());%>
<html>
<head>
    <title>默认适配器</title>
    <link rel="stylesheet" href="${contextPath}/lib/bootstrap/css/bootstrap.min.css">
    <script src="${contextPath}/lib/jquery/jquery-2.1.4.js"></script>
    <script src="${contextPath}/lib/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <form enctype="multipart/form-data" method="post" action="file">
        <div class="form-group">
            <label for="file">上传文件</label>
            <input type="file" name="file" id="file">
        </div>
        <button type="submit" class="btn btn-success">上传</button>
    </form>
</div>
</body>
</html>

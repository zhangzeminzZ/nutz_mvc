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
    <form>
        <div class="form-group">
            <label for="name">名字</label>
            <input type="text" class="form-control" id="name" placeholder="输入名字">
        </div>
        <div class="form-group">
            <label for="age">年龄</label>
            <input type="text" class="form-control" id="age" placeholder="输入年龄">
        </div>
        <div class="form-group">
            <label for="email">电子邮件</label>
            <input type="email" class="form-control" id="email" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="file">上传文件</label>
            <input type="file" id="file">
        </div>
        <button type="button" class="btn btn-success btn-add">保存</button>
    </form>
</div>

<script>
    $(function(){

        $(".btn-add").on("click",function(){
            $.ajax({
                type:"get",
                url:"savePerson2",
                data:{name:$("#name").val(),age:$("#age").val()},
                success:function(){

                }
            });
        });
    });
</script>
</body>
</html>

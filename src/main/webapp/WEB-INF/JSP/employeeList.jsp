<%--
  Created by IntelliJ IDEA.
  User: AaronFae
  Date: 2018/2/25
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <title>员工管理</title>
</head>
<body>
<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-员工管理</h1>
        </div>
    </div>
    <!-- 显示表格数据 -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>
                        <input type="checkbox" id="check_all"/>
                    </th>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>电子邮箱</th>
                    <th>联系电话</th>
                    <th>部门</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${employeeList}" var="employee">
                    <tr>
                        <td><input type='checkbox' class='check_item'/></td>
                        <td>${employee.eId}</td>
                        <td>${employee.eName}</td>
                        <td>${employee.eGender}</td>
                        <td>${employee.eEmail}</td>
                        <td>${employee.eTel}</td>
                        <td>${employee.dId}</td>
                        <td>
                            <form action="/editEmployee" method="post">
                                <button class="btn btn-primary btn-sm edit_btn" name="e_id" value="${employee.eId}">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </button>
                                <button class="btn btn-danger btn-sm delete_btn">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>

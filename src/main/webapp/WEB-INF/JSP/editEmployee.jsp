<%--
  Created by IntelliJ IDEA.
  User: AaronFae
  Date: 2018/2/26
  Time: 2:12
  To change this temployeelate use File | Settings | File Temployeelates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <title>编辑员工信息</title>
</head>
<body>
<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-编辑员工信息</h1>
        </div>
    </div>
    <!-- 显示表格数据 -->
    <div class="row">
        <div class="col-md-12">
            <form action="${pageContext.request.contextPath}/updateEmployee"
                  method="post">
                <input type="hidden" name="eId" value="${employee.eId}"/> 修改员工信息：
                <table class="table table-hover">
                    <tr>
                        <td>员工名称</td>
                        <td><input type="text" name="eName" value="${employee.eName}"/></td>
                    </tr>
                    <tr>
                        <td>员工性别</td>
                        <td><input type="text" name="eGender" value="${employee.eGender}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>员工邮箱</td>
                        <td><input type="email" name="eEmail"
                                   value="${employee.eEmail}"/></td>
                    </tr>
                    <tr>
                        <td>员工电话</td>
                        <td><input type="tel" name="eTel" value="${employee.eTel}"/></td>
                    </tr>
                    <tr>
                        <td>员工部门</td>
                        <td><input type="text" name="dName" value="${employee.dName}"/></td>
                    </tr>
                    <tr>
                        <td>员工照片</td>
                        <td>
                            <%--<c:if test="${employee.pic !=null}">
                                <img src="/pic/${employee.pic}" width=100 height=100/>
                                <br/>
                            </c:if>--%>
                            <input type="file" name="pictureFile"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="提交"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>

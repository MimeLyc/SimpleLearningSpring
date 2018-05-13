<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Selflearning for Spring MVC</title>
</head>
<body>

<h2>User Information</h2>
<form:form method="GET" action="/BlogWeb/comfirmUser">
    <table>
        <tr>
            <%--通过path来设置模型对应的属性的值--%>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="user.name" /></td>
        </tr>
        <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:input path="user.password" /></td>
        </tr>
        <%--<tr>--%>
            <%--<td><form:label path="id">id</form:label></td>--%>
            <%--<td><form:input path="id" /></td>--%>
        <%--</tr>--%>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
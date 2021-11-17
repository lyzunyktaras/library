<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Returning Book</title>
</head>
<body>
<%@include file="userPage.jsp" %>
<div>
    <form:form method="POST" action="user/return" modelAttribute="returningBook">
        <h1>Return book to Library</h1>
        <div>
            <form:select path="id">
                <c:forEach items="${orderId}" var="order">
                    <option value="${order.id}">${order.user} ${order.book} ${order.lendingDate}</option>
                </c:forEach>
            </form:select>
        </div>
        <div>
            <form:select path="book.id">
                <c:forEach items="${bookId}" var="book">
                    <option value="${book.id}">${book.title} ${book.author}</option>
                </c:forEach>
            </form:select>
        </div>
        <input type="submit" value="Submit">
    </form:form>
</div>
<a href="${pageContext.request.contextPath}/user">Back to user page</a>
</body>
</html>
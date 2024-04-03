<%-- 
    Document   : index
    Created on : Mar 27, 2024, 1:11:45 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div>
    <a href="<c:url value="/products"/>" class="btn btn-info text-light m-3">Add more product</a>
</div>
<table class="table table-striped">
    <th>
        <td></td>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td></td>
    </th>
     <c:forEach items="${products}" var="p">
    <tr>
        <td> <img width="300px" src="${p.image}" alt="${p.name}"></td>
        <td><h4 class="card-title">${p.id}</td>
        <td><h4 class="card-title">${p.name}</h4></td>
        <td><p class="card-text">${String.format("%,d", p.price)} VNĐ.</p></td>
        <td>
            <a href="#" class="btn btn-primary">Xem chi tiết</a>
            <a href="#" class="btn btn-danger">Đặt hàng</a>
        </td>
    </tr>
    </c:forEach>
</table>



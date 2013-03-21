<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="<c:url value='/js/jquery/1.7.1/jquery.min.js'/>" ></script>
        <title>用户信息展示</title>
    </head>
    <body>        
        <h1>用户信息</h1>
        <h4>${user}</h4>
        <h4>${watches}</h4>
        <h4>${fans}</h4>
        <table>
            <tr>                
                <td width="150">提醒标题</td>
                <td width="150">提醒内容</td>
                <td width="100">提醒时间</td>
            </tr>
            <c:forEach items="${contexts}" var="con">		
                <tr>                  
                    <td>${con.msgName}</td>
                    <td>${con.msgContext}</td>
                    <td>${con.noticeStamp}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
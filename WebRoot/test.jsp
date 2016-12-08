<%@page import="com.ibcio.AdminSendMessage"%>
<%@page import="java.util.Set"%>
<%@page import="com.ibcio.WebSocketMessageInboundPool"%>
<%@ page language="java" pageEncoding="UTF-8" import="com.ibcio.WebSocketMessageServlet"%>
<%
	AdminSendMessage.sendMessageToAllClient("{\"from\":\"管理员\",\"content\":\"我是从后台来的消息_new_test_test\",\"timestamp\":1111111111,\"type\":\"message\"}");
%>
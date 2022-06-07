<%-- 
    Document   : viewnote
    Created on : Jun 2, 2022, 10:29:48 AM
    Author     : Diego Maia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <label><b>Title: </b></label>
        <label>${titleBuffered}</label>
        <br><br>
        <label><b>Contents: </b></label><br>
        <label>${contentBuffered}</label>
        <br><br>
        <a href="note?edit">Edit</a>
    </body>
</html>

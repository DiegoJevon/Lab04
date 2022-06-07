<%-- 
    Document   : editnote
    Created on : Jun 2, 2022, 10:30:00 AM
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
        <form actio="POST" method="note">
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <label>Title: </label>
        <input type="text" name="title" value="${titleBuffered}">
        <br>
        <label>Contents: </label><br>
        <textarea name="content" cols="70" rows="10">${contentBuffered}</textarea>  <br>
        <input type="submit" name="save" value="Save">
        </form>
    </body>
</html>

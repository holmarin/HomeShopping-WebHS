<%-- 
    Document   : menu
    Created on : 8/11/2017, 11:50:32 PM
    Author     : Holmes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    nav{
        border-radius: 30px 30px 30px 30px;
        background: #a3b6c3;
        padding: 20px; 
        width: 230px;
        height: 150px;
    }
    nav ul{
        list-style:none;
        margin:0 10px 0 10px;
        padding:0;
    }
    nav ul li{
        font-family:Arial, Helvetica, sans-serif;
        font-size:16px;
        color:black;
    }
    nav ul li:hover{
        font-weight: bold;
    }
    nav ul li a{
        color:black;
        text-decoration:none;
    }
</style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="index.jsp">Inicio/Conexión...</a></li>
                <li><a href="listcreation.jsp">Generar Lista...</a></li>
                <li><a href="SMSSend.jsp">Enviar SMS...</a></li>
                <li><a href="salir.jsp">Cerrar...</a></li>
            </ul>
        </nav>
    </body>
</html>
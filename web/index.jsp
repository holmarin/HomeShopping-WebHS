<%-- 
    Document   : index
    Created on : 8/11/2017, 11:03:25 PM
    Author     : Holmes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Shopping</title>
    </head>
    <body>
        <h2>Conexión a Home Shopping</h2>
        <form name="btConnect" action="StartingHS" method="POST">
            <table border="0">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Usuario:</td>
                        <td><input type="text" name="fusername" value="" /></td>
                    </tr>
                    <tr>
                        <td>Contraseña:</td>
                        <td><input type="password" name="fpassword" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Conectar" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
            
            
        </form>
    </body>
</html>

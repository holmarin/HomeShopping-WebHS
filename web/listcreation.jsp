<%-- 
    Document   : presentacion
    Created on : 26/11/2017, 02:16:58 PM
    Author     : Holmes
--%>

<%@ page language="java" import="java.sql.*"%>
<html>
<head><title>Preliminar de la Lista</title>
</head>
<body>

<p align="center"><b>Registros sensibles a ser considerados en la Lista...</b><br>&nbsp;</p>

<div align="center" width="85%">
<center>
<table border="1" borderColor="#ffe9bf" cellPadding="0" cellSpacing="0" width="658" height="63">
<tbody>
<td bgColor="#008080" width="47" align="center" height="19"><font color="#ffffff"><b>#Item.</b></font></td>
<td bgColor="#008080" width="107" height="19"><font color="#ffffff"><b>Código</b></font></td>
<td bgColor="#008080" width="300" height="19"><font color="#ffffff"><b>Nombre</b></font></td>
<td bgColor="#008080" width="107" height="19"><font color="#ffffff"><b>Precio</b></font></td>

<%
String DRIVER = "org.gjt.mm.mysql.Driver";
Class.forName(DRIVER).newInstance();


Connection con=null;
ResultSet rst=null;
Statement stmt=null;

try{
String usr="holmarin18";
String pwd="Col$172017";
String url="jdbc:mysql://db4free.net:3307/homeshopping" + "?&useSSL=false";

int i=1;
con=DriverManager.getConnection(url, usr, pwd);
stmt=con.createStatement();
rst=stmt.executeQuery("SELECT codigo, nombre, precio, cantidad FROM producto JOIN ctrlproducto ON ((codigo = codigo_producto) and (cantidad <= limite_inferior))");
while(rst.next()){

if (i==(i/2)*2){
%>
<tr>
<td bgColor="#a3b6c3" vAlign="top" width="47" align="center" height="19"><%=i%>.</td>
<td bgColor="#a3b6c3" vAlign="top" width="107" height="19"><%=rst.getString(1)%></td>
<td bgColor="#a3b6c3" vAlign="top" width="300" height="19"><%=rst.getString(2)%></td>
<td bgColor="#a3b6c3" vAlign="top" width="107" height="19"><%=rst.getString(3)%></td>
</tr>
<%
}else{
%>
<tr>
<td bgColor="#D1DBE1" vAlign="top" width="47" align="center" height="19"><%=i%>.</td>
<td bgColor="#D1DBE1" vAlign="top" width="107" height="19"><%=rst.getString(1)%></td>
<td bgColor="#D1DBE1" vAlign="top" width="300" height="19"><%=rst.getString(2)%></td>
<td bgColor="#D1DBE1" vAlign="top" width="107" height="19"><%=rst.getString(3)%></td>
</tr>
<%	}

i++;
}
rst.close();
stmt.close();
con.close();
}catch(Exception e){
System.out.println(e.getMessage());
}
%>

</tbody>
</table>
</center>
</div>


</body>
</html>
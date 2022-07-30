
<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Personas</title>
    </head>
    <body>
        <h1>Lista De Personas</h1>
        <%
            List <Persona> listaPersonas = (List)request.getSession().getAttribute("listaPersonas");
                       
            for (Persona per : listaPersonas) {
        %>
        <p><b>Dni: </b> <%=per.getDni()%> </p>
        <p><b>Nombre: </b> <%=per.getNombre()%> </p>
        <p><b>Apellido: </b> <%=per.getApellido()%> </p>
        <p><b>Telefono: </b> <%=per.getTelefono()%> </p>
        <p>------------------------------------------</p>
        <% 
            }
        %>
        
        
        
    </body>
</html>

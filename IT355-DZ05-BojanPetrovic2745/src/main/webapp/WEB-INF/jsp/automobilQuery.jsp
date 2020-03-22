<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <title>Automobil Query</title>
    </head>
    <body>
        <form method="post">
            Naziv
            <input type="text" name="naziv" value="${naziv}" />
            <input type="submit" value="Query" />
        </form>

        <table border="1">
            <tr>
                <th>Naziv</th>
                <th>Model</th>
                <th>Klasa</th>
               
            </tr>
            <c:forEach items="${automobili}" var="reservation">
                <tr>
                    <td>${automobil.naziv}</td>
                    <td>${automobil.model}</td>
                    <td>${automobil.klasa}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
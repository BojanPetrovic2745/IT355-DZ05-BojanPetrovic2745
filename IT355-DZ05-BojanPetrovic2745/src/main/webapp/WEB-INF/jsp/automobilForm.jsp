<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title><spring:message code="welcome.title" text="Welcome" /></title>

        <style>
            .error {
                color: #ff0000;
                font-weight: bold;
            }
        </style>

    </head>
    <head>

    </head>
    <body>
        <h2><spring:message code="welcome.message"
                        text="Welcome to Car Creation System"/></h2>
            <form:form method="post" modelAttribute="automobil">
                <form:errors path="*" cssClass="error"/>
        <tr>

            <td>Naziv</td>
            <td><form:input path="naziv"/></td>
            <td><form:errors path="naziv" cssClass="error"/></td>
        </tr>
        
        <tr>
            <td> Naziv modela </td>
            <td><form:input path="NazivModela"/> </td>
            <td><form:errors path="NazivModela" cssClass="error"/></td>
            
        </tr>

        
        <tr>
            <td>Godiste</td>
            <td><form:input path="godiste"/></td>
            <td><form:errors path="godiste" cssClass="error"/></td>
        </tr>
        
        <tr>
            <td>Klasa</td>
            <td>
                <form:select path="klasa" items="${klasa}"
                             itemValue="id" itemLabel="klasa"/>
            </td>
            <td><form:errors path="klasa" cssClass="error"/></td>
        </tr>        <tr>
            <td colspan="3"><input type="submit"/></td>
        </tr>
    </form:form>

    Locale : ${pageContext.response.locale}

</body>
</html>
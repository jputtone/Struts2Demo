<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Struts 2 Demo</title>
    </head>
    <body>
        <h1>Struts 2 Demo</h1>

        <s:form action="login">
            <s:textfield name="name" label="Your name" />
            <s:submit />
        </s:form>
    </body>
</html>
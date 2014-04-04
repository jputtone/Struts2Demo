<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Struts 2 Demo</title>
    </head>
    <body>
        <h1>Struts 2 Demo</h1>

        <h4>
            Hi <s:property value="name" />!
        </h4>

        <s:form action="query">
            <s:hidden name="name" />
            <s:radio labelposition="top" label="Which is your favorite treat" list="options" name="answer" listValue="displayName" />
            <s:submit />
        </s:form>
        <a href="welcome.jsp">Back</a>
    </body>
</html>
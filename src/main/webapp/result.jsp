<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Struts 2 Demo</title>
    </head>
    <body>
        <h1>Struts 2 Demo</h1>

        <h4>
            Thank you <s:property value="name" />!
        </h4>
        Your favorite treat seems to be <b><s:property value="answer.displayName" /></b>. You should try <s:property value="suggestion"/>.<br/>
        <a href="welcome.jsp">Back</a>
    </body>
</html>
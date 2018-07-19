<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<html>
<body>
<h1  align="center">Join TouchHealth </h1>
${msg}
<div align="center">
<form action="regUser" method="post">

Full Name   :<input type="text" name="name"/></br>
Email       :<input type="text" name="email"/></br>
Mobile      :<input type="text" name="mobile"/></br>
Password    :<input type="password" name="password"/></br>
<input type="submit" value="Register"/>
</form>
</div>
</body>
</html>

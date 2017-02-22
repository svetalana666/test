<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration</h1>
        <p>Enter your details to complete the registration on the site www.mysite.com.</p>
        <form method="post" action="">
            <p><label for="name" style="padding-right:100px">Name:</label>
            <input type="text" id="name" required name="name" placeholder="Ivan"/>
            </p>
            <p>
            <label for="surname" style="padding-right:82px">Surname:</label>
            <input type="text" id="surname" width="300" required name="surname" placeholder="Ivanov"/>
            </p>
            <p>
            <label for="phone" style="padding-right:99px">Phone:</label>
            <input type="number" id="phone" required name="phone" placeholder="7894561230"/>
            </p>
            <p>
            <label for="email" style="padding-right:25px">Additional e-mail:</label>
            <input type="email" id="email" required name="email" placeholder="ivan@google.com"/>
            </p>
            <p>
            <label for="country" style="padding-right:86px">Country:</label>
            <input type="text" id="country" required name="country" placeholder="USA"/>
            </p>
            <p>
            <label for="gender" style="padding-right:87px">Gender:</label>
            <input name="gender" type="radio" required value="f" checked>Female
            <input name="gender" type="radio" required value="m" >Male</p>
            <p><input type="submit" value="OK"></p>
        </form>
    </body>
</html>
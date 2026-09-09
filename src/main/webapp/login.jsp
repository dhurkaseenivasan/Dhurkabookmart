<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login - DhurkaBookMart</title>
</head>

<body>

    <h1>Login to DhurkaBookMart</h1>

    <form action="login" method="post">

        <label>Email:</label><br>
        <input type="email" name="email" required>
        <br><br>

        <label>Password:</label><br>
        <input type="password" name="password" required>
        <br><br>

        <button type="submit">Login</button>

    </form>

    <br>

    <p>
        Don't have an account?
        <a href="register.jsp">Register Here</a>
    </p>

    <a href="index.jsp">Back to Home</a>

</body>
</html>
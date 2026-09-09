<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Register - DhurkaBookMart</title>
</head>

<body>

    <h1>Create Your Account</h1>

    <form action="register" method="post">

        <label>Name:</label><br>
        <input type="text" name="name" required>
        <br><br>

        <label>Email:</label><br>
        <input type="email" name="email" required>
        <br><br>

        <label>Password:</label><br>
        <input type="password" name="password" required>
        <br><br>

        <button type="submit">Register</button>

    </form>

    <br>

    <a href="index.jsp">Back to Home</a>

</body>
</html>
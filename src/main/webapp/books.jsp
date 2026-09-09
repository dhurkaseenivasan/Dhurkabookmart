<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Books - DhurkaBookMart</title>
</head>

<body>

    <h1>Available Books</h1>

    <hr>

    <h2>Java Programming</h2>
    <p>Price: Rs. 500</p>

    <form action="cart" method="post">
        <input type="hidden" name="book" value="Java Programming">
        <button type="submit">Add to Cart</button>
    </form>

    <hr>

    <h2>Python Programming</h2>
    <p>Price: Rs. 450</p>

    <form action="cart" method="post">
        <input type="hidden" name="book" value="Python Programming">
        <button type="submit">Add to Cart</button>
    </form>

    <hr>

    <h2>Data Science Basics</h2>
    <p>Price: Rs. 600</p>

    <form action="cart" method="post">
        <input type="hidden" name="book" value="Data Science Basics">
        <button type="submit">Add to Cart</button>
    </form>

    <br><br>

    <a href="index.jsp">Back to Home</a>

</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Book</title>
</head>
<body>

    <h2>Add New Book</h2>

    <form action="add-book" method="post">

        <label>Book Title:</label><br>
        <input type="text" name="title" required><br><br>

        <label>Author:</label><br>
        <input type="text" name="author" required><br><br>

        <label>Price:</label><br>
        <input type="number" name="price" step="0.01" required><br><br>

        <button type="submit">Add Book</button>

    </form>

    <br>

    <a href="seller-dashboard.jsp">Back to Seller Dashboard</a>

</body>
</html>
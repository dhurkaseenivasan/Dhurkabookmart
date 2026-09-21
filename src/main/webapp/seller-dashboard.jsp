<%@ page import="com.dhurka.dhurkabookmart.dao.BookDAO" %>
<%@ page import="com.dhurka.dhurkabookmart.model.Book" %>
<%@ page import="java.util.List" %>

<%
    BookDAO bookDAO = new BookDAO();
    List<Book> books = bookDAO.getAllBooks();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Seller Dashboard - DhurkaBookMart</title>
</head>

<body>

    <h1>Seller Dashboard</h1>

    <h2>Welcome Seller!</h2>

    <hr>

    <h3>Product Management</h3>

    <a href="add-book.jsp">
        <button>Add New Book</button>
    </a>

    <button>Edit Book</button>
    <button>Delete Book</button>

    <h3>My Books</h3>

    <table border="1" cellpadding="10">

        <tr>
            <th>Book Name</th>
            <th>Author</th>
            <th>Price</th>
            <th>Action</th>
        </tr>

        <%
            for (Book book : books) {
        %>

        <tr>
            <td><%= book.getTitle() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getPrice() %></td>

            <td>
                <a href="edit-book.jsp?id=<%=book.getId() %>">
                <button>Edit</button></a>
                <a href="delete-book?id=<%=book.getId() %>">
                <button>Delete</button></a>
            </td>
        </tr>

        <%
            }
        %>

    </table>

    <br>

    <a href="index.jsp">Back to Home</a>

</body>
</html>
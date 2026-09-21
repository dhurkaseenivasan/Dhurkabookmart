<%@ page import="com.dhurka.dhurkabookmart.dao.BookDAO" %>
<%@ page import="com.dhurka.dhurkabookmart.model.Book" %>

<%
    int id = Integer.parseInt(request.getParameter("id"));

    BookDAO bookDAO = new BookDAO();
    Book selectedBook = null;

    for (Book book : bookDAO.getAllBooks()) {
        if (book.getId() == id) {
            selectedBook = book;
            break;
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Book</title>
</head>
<body>

    <h2>Edit Book</h2>

    <% if (selectedBook != null) { %>

    <form action="edit-book" method="post">

        <input type="hidden" name="id"
               value="<%= selectedBook.getId() %>">

        <label>Book Title:</label><br>
        <input type="text" name="title"
               value="<%= selectedBook.getTitle() %>" required>
        <br><br>

        <label>Author:</label><br>
        <input type="text" name="author"
               value="<%= selectedBook.getAuthor() %>" required>
        <br><br>

        <label>Price:</label><br>
        <input type="number" name="price"
               value="<%= selectedBook.getPrice() %>"
               step="0.01" required>
        <br><br>

        <button type="submit">Update Book</button>

    </form>

    <% } else { %>

        <p>Book not found.</p>

    <% } %>

    <br>
    <a href="seller-dashboard.jsp">Back to Seller Dashboard</a>

</body>
</html>
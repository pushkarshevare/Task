<%@page import="com.example.demo.model.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <div class="row">
            <!-- Registration Form Column -->

            <!-- User List Column -->
            <div class="col-md-6">
                <h2 class="mb-4">Task List</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Task_ID</th>
                            <th scope="col">Description</th>
                        </tr>
                    </thead>
                    <tbody>
                    <%	
                    	List<Task> t = (List<Task>)request.getAttribute("task");
                    	for(Task task : t)
                    	{
                    %>
                        <tr>
                            <th scope="row"><%= task.getTaskId() %></th>
                            <td><%= task.getDescription() %></td>
                        </tr>
                        
                    <%
                    	}
                    %>
                        <!-- Add more rows dynamically or fetch from the database -->
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and Popper.js -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

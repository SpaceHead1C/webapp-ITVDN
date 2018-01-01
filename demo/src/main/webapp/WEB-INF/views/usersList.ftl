<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Users list</h1>
<a href="/addUser">Add</a>
<table>
    <tr>
        <th>Name</th>
        <th>E-mail</th>
        <th>Age</th>
    </tr>
<#list users as user>
        <tr>
            <td><a href="/user/${user.id}">${user.name}</a></td>
            <td>${user.email}</td>
            <td>${user.age}</td>
            <td><a href="/delete/${user.id}">Delete</a></td>
            <td><a href="/update/${user.id}">Update</a></td>
        </tr>
</#list>
</table>
<a href="/addUser">Add</a>
</body>
</html>
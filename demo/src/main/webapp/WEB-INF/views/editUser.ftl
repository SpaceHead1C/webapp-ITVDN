<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="user" action="/updateUser" method="post">
    <table>
        <tr>
            <td>Id:</td>
            <td>${user.id}</td>
            <td hidden><input title="Id" type="text" name="id" value="${user.id}"></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><input title="Name" type="text" name="name" value="${user.name}"></td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td><input title="E-mail" type="text" name="email" value="${user.email}"></td>
        </tr>
        <tr>
            <td>Age:</td>
            <td><input title="Age" type="text" name="age" value="${user.age}"></td>
        </tr>
    </table>
    <br><br>
    <input type="submit" value="OK">
</form>
</body>
</html>
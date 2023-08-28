<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    Welcome ${employee.name} ${employee.surname}
    <br>
    Your salary: ${employee.salary}
    <br>
    You are working in ${employee.department}
    <br>
    Your notebook is working at ${employee.os}
    <br>
    Your will code with
    <ul>
    <c:forEach var="lang" items="${employee.langs}">
        <li>${lang}</li>
    </c:forEach>
    </ul>
</body>
</html>
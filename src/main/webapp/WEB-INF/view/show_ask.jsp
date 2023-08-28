<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ask form</title>
</head>
<body>
    <h1>Please enter your details here</h1>
    <form:form action="showDetails" modelAttribute="employee"> <!-- атрибут модели, в который всё сохранится -->
        Name <form:input path="name"/> <!-- строка ввода -->
        <br>
        SurName <form:input path="surname"/>
        <br>
        Salary <form:input path="salary"/>
        <br>
        Department <form:select path="department">
        <form:option value="InfoTech" label="IT"/> <!-- видно "IT", при выборе в поле department упадёт "InfoTech" -->
        <form:option value="Kadrovik" label="HR"/>
        <form:option value="Management" label="Head"/>
        </form:select>
        <br>
        You are using:
        Win <form:radiobutton path="os" value="Windows"/>
        MAC <form:radiobutton path="os" value="Apple"/>
        Lin <form:radiobutton path="os" value="Linux"/>
        <br>
        Languages you know:
        Java <form:checkbox path="langs" value="Java"/>
        JS <form:checkbox path="langs" value="Java Script"/>
        C++ <form:checkbox path="langs" value="C++"/>
        <br>
        <input type="submit" value="SendData">
    </form:form>
<!-- при выводе строк формы, сработают геттеры для класса, который лежит в атрибуте "employee",
в поля вставятся пустые значения (инициаизация была пустым конструктором)
, затем после нажатия "submit" сработают сеттеры -->
</body>
</html>
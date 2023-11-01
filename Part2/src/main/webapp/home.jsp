<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addItem">
Brand<input type="text" name="brand"><br>
Description<input type="text" name="description"><br>
Price<input type="number" name="price"><br>
<input type="submit" value="Add Item"><br>
</form>
<form action ="items">
<input type="submit" value=" sort by highestprice">
</form>
</body>
</html>
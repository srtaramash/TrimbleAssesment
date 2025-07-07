
<html>
<head><title>Cars</title></head>
<body>
<c:forEach var="car" items="${cars}">
<tr>
<td>${car.brand}</td>
<td>${car.model}</td>
<td>${car.leasecar}</td>
<td> <a href="/lease/${car.id}">Lease</a></td>
</tr>
</c:forEach>
</body>
</html>
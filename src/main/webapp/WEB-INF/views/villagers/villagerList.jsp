<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>주민 목록 전체 조회</h1>
  <table>
    <tr>
      <th>주민코드</th>
      <th>주민이름</th>
      <th>성별</th>
      <th>생일</th>
      <th>종</th>
      <th>성격</th>
      <th>말버릇</th>
      <th>소속마을</th>
    </tr>
    <c:forEach items="${ requestScope.villagerList }" var="villager">
    <tr>
      <td>${ villager.villagerCode }</td>
      <td>${ villager.villagerName }</td>
      <td>${ villager.gender }</td>
      <td>${ villager.birthDate }</td>
      <td>${ villager.species }</td>
      <td>${ villager.personality }</td>
      <td>${ villager.catchphrase }</td>
      <td>${ villager.belongVillage }</td>
    </tr>
    </c:forEach>
  </table>
</body>
</html>

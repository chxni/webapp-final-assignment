<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    (function() {
        const successCode = '${ requestScope.successCode }';

        let successMessage = '';
        let movePath = '';

        switch(successCode) {
            case 'insertVillager' :
                successMessage = '주민 등록 성공!';
                movePath = '${pageContext.servletContext.contextPath}/villager/list';
                break;
            case 'updateVillager' :
                successMessage = '주민 정보 수정 성공!';
                movePath = '${pageContext.servletContext.contextPath}/villager/list';
                break;
            case 'deleteVillager' :
                successMessage = '주민 삭제 성공!';
                movePath = '${pageContext.servletContext.contextPath}/villager/list';
                break;
        }

        alert(successMessage);
        location.href = movePath;

    })();
</script>
</body>
</html>

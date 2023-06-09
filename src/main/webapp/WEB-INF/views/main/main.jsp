<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>
    <h3>전체 주민 조회</h3>
    <form action="/villager/list">
        <button type="submit">조회</button>
    </form>

    <hr>

    <form action="${ pageContext.servletContext.contextPath }/villager/select" method="post">
        <h3>검색 조건을 선택하세요</h3>
        <input type="radio" name="condition" value="species">종
        <input type="radio" name="condition" value="personality">성격

        <h4>주민 종으로 조회</h4>
        <select name="species">
            <option value="none">==선택==</option>
            <option value="개">개</option>
            <option value="고양이">고양이</option>
            <option value="토끼">토끼</option>
            <option value="꼬마곰">꼬마곰</option>
            <option value="다람쥐">다람쥐</option>
            <option value="햄스터">햄스터</option>
            <option value="사슴">사슴</option>
        </select>

        <h4>주민 성격으로 조회</h4>
        <select name="personality">
            <option value="none">==선택==</option>
            <option value="친절함" name="성격">친절함</option>
            <option value="아이돌" name="성격">아이돌</option>
            <option value="단순활발" name="성격">단순활발</option>
            <option value="성숙함" name="성격">성숙함</option>
            <option value="먹보" name="성격">먹보</option>
            <option value="운동광" name="성격">운동광</option>
            <option value="무뚝뚝" name="성격">무뚝뚝</option>
            <option value="느끼함" name="성격">느끼함</option>
        </select>
        <br>
        <button type="submit">조회</button>
    </form>

    <hr>

    <h3>신규 주민 등록</h3>
    <form action="${ pageContext.servletContext.contextPath }/villager/insert" method="post">

        이름 <input type="text" name="villagerName"><br>
        성별
        <input type="radio" name="gender" value="남">남
        <input type="radio" name="gender" value="남">여<br>
        생일 <input type="text" name="birthDate"><br>
        종
        <select name="species">
            <option value="개">개</option>
            <option value="고양이">고양이</option>
            <option value="토끼">토끼</option>
            <option value="꼬마곰">꼬마곰</option>
            <option value="다람쥐">다람쥐</option>
            <option value="햄스터">햄스터</option>
            <option value="사슴">사슴</option>
        </select>
        <br>
        성격
        <select name="personality">
            <option value="친절함">친절함</option>
            <option value="아이돌">아이돌</option>
            <option value="단순활발">단순활발</option>
            <option value="성숙함">성숙함</option>
            <option value="먹보">먹보</option>
            <option value="운동광">운동광</option>
            <option value="무뚝뚝">무뚝뚝</option>
            <option value="느끼함">느끼함</option>
        </select>
        <br>
        말버릇 <input type="text" name="catchphrase"><br>
        <button type="submit">등록하기</button>
    </form>

    <hr>

    <h3>주민 소속마을 수정</h3>
    <form action="${ pageContext.servletContext.contextPath }/villager/update" method="post">
        <h5>수정할 주민 이름을 입력해주세요</h5>
        <input type="text" name="villagerName">
        <h5>이사하려는 마을이름을 입력하세요(어떤 마을에도 소속되지 않는다면 빈칸으로 제출해주세요!)</h5>
        <input type="text" name="village">
        <button type="submit">수정하기</button>
    </form>

    <hr>

    <h3>주민 삭제</h3>
    <form action="${ pageContext.servletContext.contextPath }/villager/delete" method="post">
        <h5>삭제할 주민 이름을 입력해주세요</h5>
        <input type="text" name="villagerName">
        <button type="submit">삭제하기</button>
    </form>
</body>
</html>

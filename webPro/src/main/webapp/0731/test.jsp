<%
    //java code
    
    //post 형식으로 데이터가 전달될 때 인코딩 처리
    request.setCharacterEncoding("utf-8");
    
    //request - 요청객체
    String name = request.getParameter("erum");
    String alias = request.getParameter("alias");
    String[] chks = request.getParameterValues("chk");
    
    String hobby = "";
    if (chks != null) {
        for (int i = 0; i < chks.length; i++) {
            hobby += chks[i] + " ";
        }
    } else {
        hobby = "체크된 항목이 없습니다.";
    }
%>

<!-- 변수 내용 확인을 위해 표현식 영역을 사용 -->
나의 이름은 <%=name %> <br>
나의 별명은 <%=alias %> <br>
체크된 항목들: <%=hobby %>


















<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@page import="com.ptteng.student.*" %>
<%@page import="com.ptteng.dao.*" %>
<!DOCTYPE html>
<html>
  <head></head>
  <body>
    <form action="modify.do" method="post">
      <fieldset>
        <legend>修改员工</legend>
           <%Student e=(Student)request.getAttribute("emp"); %>
           		id: <input name="id" value=<%=e.getId() %>><br>
                姓名：<input name="studentName" value=<%=e.getStudentName() %>><br>
		        QQ：<input name="studentQq" value=<%=e.getStudentQq() %>><br>
		        修真类型：<input name="xiuzhenType" value=<%=e.getXiuzhenType() %>><br>
		        预计入学时间:<input name="admissionTime" value=<%=e.getAdmissionTime() %>><br>
		        毕业院校:<input name="graduatedSchool" value=<%=e.getGraduatedSchool() %>><br>
		        线上:<input name="xianShang" value=<%=e.getXianShang() %>><br>
		        学号:<input name="studentNumber" value=<%=e.getStudentNumber() %>><br>
		        日报链接:<input name="dailyUrl" value=<%=e.getDailyUrl()%>><br>
		        立愿:<input name="vow" value=<%=e.getVow()%>><br>
		        推荐人:<input name="recommendedPerson" value=<%=e.getRecommendedPerson()%>><br>
		       
      </fieldset>
      <input type="submit" value="Submit" />
    </form>
  </body>
</html>
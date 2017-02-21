<%@page import="com.ptteng.student.Student"%>
<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@page import="java.util.*" %>
<html>
  <head>
    <style>
      .row1{
        background-color:#f0f0f0;
      }
      .row2{
        background-color:#fff8dc;
      }
    </style>
  </head>
  <body style="font-size:30px">
    <table width="60%" border=1px cellpadding="0" cellspacing="0">
      <tr>
        <td>&nbsp;id</td>
        <td>StudentName</td>
        <td>studentQq</td>
        <td>xiuzhenType</td>
        <td>admissionTime</td>
        <td>graduatedSchool</td>
        <td>xianShang</td>
        <td>studentNumber</td>
        <td>dailyUrl</td>
        <td>vow</td>
        <td>recommendedPerson</td>
        <td>create_at</td>
        <td>update_at</td>
        <td>操作</td>
      </tr>
      <%
        List<Student> students=(List<Student>)request.getAttribute("students");
        for(int i=0;i<students.size();i++){
          Student e=students.get(i);
        %>
      <tr class=row<%=(i%2)+1 %>>
        <td><%=e.getId() %></td>
        <td><%=e.getStudentName() %></td>
        <td><%=e.getStudentQq() %></td>
        <td><%=e.getXiuzhenType() %></td>
        <td><%=e.getAdmissionTime() %></td>
        <td><%=e.getGraduatedSchool() %></td>
        <td><%=e.getXianShang() %></td>
        <td><%=e.getStudentNumber() %></td>
        <td><%=e.getDailyUrl() %></td>
        <td><%=e.getVow() %></td>
        <td><%=e.getRecommendedPerson() %></td>
        <td><%=e.getCreate_at() %></td>
        <td><%=e.getUpdate_at() %></td>
        <td><a href='load.do?id=<%=e.getId() %>'>修改</a>
            <a href='del.do?id=<%=e.getId() %>'
            onclick="return confirm('确定删除<%=e.getStudentName() %>吗?')">删除</a>
        </td>
      </tr>
      <%} %>
    </table>
    <p><a href='addEmp.jsp'>添加学员</a></p>
  </body>
</html>
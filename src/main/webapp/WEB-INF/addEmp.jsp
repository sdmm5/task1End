<%@ page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加学员</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">  
  </head>
  
  <body style="font-size:30px">
    <form action="addEmp.do" method="post">
      <fieldset>
        <legend>添加学员</legend>
		        姓名：<input name="studentName"><br>
		        QQ：<input name="studentQq"><br>
		        修真类型：<input name="xiuzhenType"><br>
		        预计入学时间:<input name="admissionTime"><br>
		        毕业院校:<input name="graduatedSchool"><br>
		        线上:<input name="xianShang"><br>
		        学号:<input name="studentNumber"><br>
		        日报链接:<input name="dailyUrl"><br>
		        立愿:<input name="vow"><br>
		        推荐人:<input name="recommendedPerson"><br>
		        <input type="submit" value="确定">
      </fieldset>
    </form>
  </body>
</html>
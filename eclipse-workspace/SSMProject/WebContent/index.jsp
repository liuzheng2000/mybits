
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>学生信息管理系统</title>
  <style type="text/css">
    td{font-family: "Fira Code";font-size: larger}
  </style>
</head>
<style type="text/css">
  .page-bg {
    width: 100%;
    height: 100%;
    /*background:url('gratisography-224-thumbnail-small.jpg') no-repeat;*/
    background-size: 100% 100%;
  }
</style>
<body>
<div class="fa div">
  <div class="page-bg">
    <div align="center">
      <h1 align="center">欢迎使用学生信息管理系统O(∩_∩)O</h1>
      <form action="LoginServlet" method="post">
        <table align="center">
          <tr>
            <td>用户名：</td>
            <td>
              <input type="text" name="UserName" autofocus="autofocus">
            </td>
          </tr>
          <tr>
            <td>用户密码:</td>
            <td><input type="password" name="UserPassword"></td>
          </tr>
        </table>
        <div align="center">
          <input type="submit" name="login" value="登陆" >
        </div>
      </form>
      <p align="center"><font size="4opx"> 还没有账号？看这里(｡･∀･)ﾉﾞ</font>
        <a href="userRegister.jsp"><font size="4opx">注册</font></a>
      </p>
    </div>
  </div>
</div>
</body>
</html>

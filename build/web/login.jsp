<%-- 
    Document   : login
    Created on : Jul 8, 2023, 10:04:43 AM
    Author     : Popun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Coding by CodingLab || www.codinglabweb.com -->
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Website with Login & Registration Form</title>
    <link rel="stylesheet" href="style.css" />
    <!-- Unicons -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css" />
  </head>
  <body>
    <!-- Header -->
    <header class="header">
      <nav class="nav">
        <a href="#" class="nav_logo">JAPANRAIL SHOP</a>

        

        <button class="button" id="form-open">Login</button>
        <button class="button1" id="form-sign">SignUp</button>
      </nav>
    </header>

    <!-- Home -->
    <section class="home">
      <div class="form_container">
        <i class="uil uil-times form_close"></i>
        <!-- Login From -->
        <div class="form login_form">
             <c:set var="cookie" value="${pageContext.request.cookies}"/>
          <form action="user?action=checkLogin" method="POST">
            <h2>Login</h2>
            
            <div class="input_box">
                <input name="user_email" type="text" value="${cookie.email.value}" placeholder="Email">
              <i class="uil uil-envelope-alt email"></i>
            </div>
            <div class="input_box">
                <input name="user_pass" type="password" value="${cookie.pass.value}" placeholder="password">
              <i class="uil uil-lock password"></i>
              <i class="uil uil-eye-slash pw_hide"></i>
            </div>

            <div class="option_field">
              <span class="checkbox">
                <input type="checkbox" id="check" />
                <label for="check">Remember me</label>
              </span>
              <a href="#" class="forgot_pw">Forgot password?</a>
            </div>

              <button class="button2" type="submit">Đăng nhập</button>

            <div class="login_signup">Don't have an account? <a href="#" id="signup">Signup</a></div>
          </form>
        </div>

        <!-- Signup From -->
        <div class="form signup_form">
          <form action="user?action=signup" method="POST">
            <h2>Register</h2>

            <div class="input_box">
                <input type="email" name="user_email" placeholder="Email">
              <i class="uil uil-envelope-alt email"></i>
            </div>
            <div class="input_box">
                <input type="password" name="user_pass" placeholder="Password">
              <i class="uil uil-lock password"></i>
              <i class="uil uil-eye-slash pw_hide"></i>
            </div>
            <div class="input_box">
                <input type="password" name="re_pass" placeholder="re-enter password">
              <i class="uil uil-lock password"></i>
              <i class="uil uil-eye-slash pw_hide"></i>
            </div>

            <button class="button2" type="submit">Đăng ký</button>

            <div class="login_signup">Already have an account? <a href="#" id="login">Login</a></div>
          </form>
        </div>
      </div>
    </section>

    <script src="script.js"></script>
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file ="Header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignIn</title>

<style>

.form-heading { color:#fff; font-size:23px;}
.panel h2{ color:#444444; font-size:18px; margin:0 0 8px 0;}
.panel p { color:#777777; font-size:14px; margin-bottom:30px; line-height:24px;}
.SignIn-form .form-control {
  background: #f7f7f7 none repeat scroll 0 0;
  border: 1px solid #d4d4d4;
  border-radius: 4px;
  font-size: 14px;
  height: 50px;
  line-height: 50px;
}
.main-div {
  background: #ffffff none repeat scroll 0 0;
  border-radius: 2px;
  margin: 10px auto 30px;
  max-width: 38%;
  padding: 50px 70px 70px 71px;
}

.SignIn-form .form-group {
  margin-bottom:10px;
}
.SignIn-form{ text-align:center;}
.forgot a {
  color: #777777;
  font-size: 14px;
  text-decoration: underline;
}
.SignIn-form  .btn.btn-primary {
  background: #f0ad4e none repeat scroll 0 0;
  border-color: #f0ad4e;
  color: #ffffff;
  font-size: 14px;
  width: 100%;
  height: 50px;
  line-height: 50px;
  padding: 0;
}
.forgot {
  text-align: left; margin-bottom:30px;
}
.botto-text {
  color: #ffffff;
  font-size: 14px;
  margin: auto;
}
.SignIn-form .btn.btn-primary.reset {
  background: #ff9900 none repeat scroll 0 0;
}
.back { text-align: left; margin-top:10px;}
.back a {color: #444444; font-size: 13px;text-decoration: none;}




</style>
</head>

<body id="SignInForm" background="resources/images/product_5.jpg">
<div class="container">
<br>
<br>
<br>
<div class="SignIn-form">
<div class="main-div">
    <div class="panel">
   <h2>User SignIn</h2>
   <p>Please enter your email and password</p>
  
   </div>
    <form id="SignIn" action="logg"  method="post">

        <div class="form-group">


            <input type="email" class="form-control" name="emailid" id="inputEmail" placeholder="Email Address" required="required"/>

        </div>

        <div class="form-group">

            <input type="password" class="form-control" name="password" id="inputPassword" placeholder="Password" required="required"/>

        </div>
        <div class="forgot">
        <a href="#">Forgot password?</a>
</div>
        <button type="submit" class="btn btn-primary">SignIn</button>

    </form>
    </div>

</div></div>


</body>
</html>
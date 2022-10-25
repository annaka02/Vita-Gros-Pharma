<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css" integrity="sha384-xeJqLiuOvjUBq3iGOjvSQSIlwrpqjSHXpduPd6rQpuiM3f5/ijby8pCsnbu5S81n" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-expand-lg" style="background-color: greenyellow;">
  <div class="container-fluid" style="font-family: serif;">
    <a class="navbar-brand" href="#">VitaGros Pharma</a>
    <div class="" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="list">Owners</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="#">New Pet</a>
        </li>        
        <li class="nav-item">
          <a class="nav-link active" href="listV">Veterinarians</a>
        </li>
       <li class="nav-item">
            <a href="/logout" class="btn btn-outline-secondary ml-auto" role="button" aria-pressed="true"><span>Logout</span></a>
        </li>
        </ul>
    </div>
  </div>
</nav>


<div style="text-align:center; font-family: Snell Roundhand; font-size: 25px;">
    <h3>Welcome to VitaGros Pharma! </h3>
    <p>VitaGros Pharma is a veterinary clinic that is an establishment of care for animals. <br>
        It offers care for your pets as well as the possibility to visit them</p>
 <img src="https://www.cityofmarcoisland.com/sites/default/files/styles/gallery500/public/imageattachments/emergency/page/81086/bg_pets_lg2.jpg?itok=1c3R8n1G" alt="image" style="background-size: cover;" >
 
 
 
 
 <footer>
  <div class="footer-content">
        <h3>VitaGros Pharma</h3>
            <p>VitaGros Pharma is a veterinary clinic that is an establishment of care for animals. <br>
        It offers care for your pets as well as the possibility to visit them</p>
        <ul class="socials">
            <li><a href="#"><i class="bi bi-facebook"></i></a></li>
            <li><a href="#"><i class="bi bi-twitter"></i></a></li>
            <li><a href="#"><i class="bi bi-whatsapp"></i></a></li>
            <li><a href="#"><i class="bi bi-google"></i></a></li>
            <li><a href="#"><i class="bi bi-youtube"></i></a></li>
        </ul>
        <div class="footer-bottom">
            <p>Copyright &copy; 2022, VitaGros Pharma. designed by <span>SarayaTech Senegal</span></p>
        </div>
    </div>
    <style>
    footer{
    background-color: greenyellow;
    height: auto;
    width: 100vw;
    font-family: "Open Sans";
    padding-top: 40px;
    color: white;
}
.footer-content{
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    text-align: center;
}
.footer-content h3{
    font-size: 1.8rem;
    font-weight: 400;
    text-transform: capitalize;
    line-height: 3rem;
}
.footer-content p{
    max-width: 500px;
    margin: 10px auto;
    line-height: 28px;
    font-size: 14px;
}
.socials{
    list-style: none;
    display: flex;
    align-items: center;
    justify-content: center;
    margin: 1rem 0 3rem 0;
}
.socials li{
    margin: 0 10px;
}
.socials a{
    text-decoration: none;
    color: white;
}
.socials a i{
    font-size: 1.1rem;
    transition: color .4s ease;
}
.socials a:hover i{
    color: aqua;
}
.footer-bottom{
    background-color: greenyellow;
    width: 100vh;
    padding: 20px 0;
    text-align: center;
}
.footer-bottom p{
    font-size: 14px;
   word-spacing: 2px;
   text-transform: capitalize; 
}
.footer-bottom span{
    text-transform: uppercase;
    opacity: .4;
    font-weight: 200;
}
    </style>
 </footer>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js" integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous"></script>
</body>
</html>
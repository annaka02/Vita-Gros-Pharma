<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Pet Page</title>
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
          <a class="nav-link active" aria-current="page" href="/home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="/list">Owners</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="/newP">New Pet</a>
        </li>        
        <li class="nav-item">
          <a class="nav-link active" href="/listV">Veterinarians</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="/editO">Add Owner</a>
        </li>
       <li class="nav-item">
            <a href="/logout" class="btn btn-outline-secondary ml-auto" role="button" aria-pressed="true"><span>Logout</span></a>
        </li>
        </ul>
    </div>
</div>
</nav>



<div class="container">
		<h4>New Pet</h4>
		 <div class="card-body">
         <dl class="row">
               <dt class="col-sm-4">Owner :</dt>
		<dd class="col-sm-8"><c:out value="${owner.firstName} ${owner.lastName}"/></dd>
		 <dl>
		 </div>
                <form:form class="form-floating" action="${owner.id}/NewPet" method="POST" modelAttribute="pet" >
                     <div class="form-floating mb-3">
                                               <label for="firstname">Name : </label>
                                     <form:input path="name" class="form-control" placeholder="name" />
                                     <form:errors path="name"/>
                </div>
                <div class="form-floating mb-3">
                <label for="dateOfBirth">Birth date:</label>
                   <form:input path="dateOfBirth" class="form-control" placeholder="birth date" />
                             <form:errors path="dateOfBirth"/>
                </div>
                <div class="form-floating mb-3">
                <label for="type">Type:</label>
                <form:select path="petType" class="form-control">
                <c:forEach var="type" items="${types}">
                <form:option value="${type.name}">
                ${type.name}
                </form:option>
                </c:forEach>
                </form:select>
                           <form:errors path="petType"/>
                    
                          </div>
                       </form:form>
                       <div class="btn-group float-right mt-3" role="group">
                          		    <button type="submit" class="btn btn-primary" value="add">Save</button>
                          		   <a href="/detailsO/${owner.id}" class="btn btn-secondary ml-2" role="button" aria-pressed="true"><span>Cancel</span></a>
                          </div>
		              </div>
	
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
 
 
 
 
 
 
 
 
 
 
</body>
</html>
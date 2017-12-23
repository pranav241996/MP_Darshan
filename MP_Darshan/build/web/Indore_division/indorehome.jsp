<%@page import="Model.UserModel"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>HOME</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
         
         
         <style>
.container {
    position: relative;
    width: 50%;
}

.image {
  opacity: 1;
  display: block;
  width: 100%;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 36%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%)
}

.container:hover .image {
  opacity: 0.3;
}

.container:hover .middle {
  opacity: 1;
}

.text {
  background-color: #4CAF50;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
}
</style>
         
         
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">gallary</a></li>
      <li><a href="#">about</a></li>
     
      <li><a href="#">contact</a></li>
      <li><a href="logout.jsp">Logout</a></li>
    </ul>
    
  </div>
</nav>
    
    
    
    
    
    
    
    
    
    
    <%
       UserModel um=(UserModel)session.getAttribute("currentuser");
          
     
    %>
    <div style="position: absolute;left: 0px;top: 50px; width: 250px; height: 600px; background-color: black; color: white">
        
        <img src="<%="../ImageLoader?id="+ um.getId()  %>"  style="position: relative; left: 30px; top: 30px; width: 180px; height: 180px;  border-radius: 200px;" >
        <br/><br/><br/><br/>
        <a href="../profileimg.jsp"><button class="ui  inverted white button" style=" position: relative; left: 50px;">Change Picture</button></a>
        <br/><br/><br/>
        
        <b style="font-size: 20px; position: relative; left: 30px;"> <%=um.getName().toUpperCase() %></b>
   <br/><br/><br/>
            <a href="../MyProfileContoller"><button class="ui  inverted white button" style=" position: relative; left: 70px;">profile</button></a>

    </div>





   <br/><br/><br/><br/>
   
   
   
   
      
       <div class="container" style="position: absolute; left: 300px; top: 100px;">
  <a href="indore.jsp" class="ui large image">
       <img src="images/Ihome1.jpg" style="width :450px; height: 250px;">
       
</a>
  <div class="middle">
    <div class="text">Indore District</div>
  </div>
</div>
       
       
       <div class="container" style="position: absolute; left: 800px;top: 100px;">
 <a href="dhar.jsp" class="ui huge image">
        <img src="images/Ihome2.jpg" style="width :450px; height: 250px;">
</a>
  <div class="middle">
    <div class="text">Dhar District</div>
  </div>
</div>
       
      
       <div class="container" style="position: absolute; left: 300px;top: 400px;">
<a href="khandwa.jsp" class="ui huge image">
        <img src="images/Ihome3.jpg"style="width :450px; height: 250px;">
</a>
  <div class="middle">
    <div class="text">Khandwa District</div>
  </div>
</div>
       
       
       
       <div class="container" style="position: absolute; left: 800px;top:400px;">
<a href="bhuranpur.jsp" class="ui huge image">
        <img src="images/Ihome4.png"style="width :450px; height: 250px;">
</a>
  <div class="middle">
    <div class="text">Bhuranpur District</div>
  </div>
</div>
  
   
   
   
  
</a>
</body>
</html>

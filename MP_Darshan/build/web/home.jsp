<%
               String msg = request.getParameter("msg");
               if(msg!=null)
               {
                 int x=Integer.parseInt(msg);
                    if(x==1)
                    {
                      
                  %>

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
         <script>
window.location.hash="no-back-button";
window.location.hash="Again-No-back-button";//again because google chrome don't insert first hash into history
window.onhashchange=function(){window.location.hash="no-back-button";}
</script>
</head>
<body
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
        
        <img src="<%="ImageLoader?id="+ um.getId()  %>"  style="position: relative; left: 30px; top: 30px; width: 180px; height: 180px;  border-radius: 200px;" >
        <br/><br/><br/><br/>
        <a href="profileimg.jsp"><button class="ui  inverted white button" style=" position: relative; left: 50px;">Change Picture</button></a>
        <br/><br/><br/>
        
        <b style="font-size: 20px; position: relative; left: 30px;"> <%=um.getName().toUpperCase() %></b>
   <br/><br/><br/>
            <a href="MyProfileContoller"><button class="ui  inverted white button" style=" position: relative; left: 70px;">profile</button></a>

    </div>




<div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel" style="width:150%; height: 400px; left: -10px;">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
          <img src="images/bs1.jpg" alt="Los Angeles" style="width:100%; height: 400px;">
        <div class="carousel-caption">
          <h3>Mandu or Mandavga</h3>
          <p> The word "Mandu" is believed to be a Prakrit corruption of "Mandapa Durga".</p>
        </div>
      </div>

      <div class="item">
          <img src="images/bs2.jpg" alt="Chicago" style="width:100%;height: 400px;">
        <div class="carousel-caption">
          <h3>Gwalior Fort</h3>
          <p><b>Gwalior - The Pride Must Never Fall</b></p>
        </div>
      </div>
    
      <div class="item">
          <img src="images/bs3.jpg" alt="New York" style="width:100%;height: 400px;">
        <div class="carousel-caption">
          <h3>Jabalpur - The Marble City</h3>
          <p>The city's name is derived from the legendary sage Jaabaali</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
    
   <br/><br/><br/><br/>
   
       
       <div class="container" style="position: absolute; left: 300px; top: 650px;">
   <a href="Indore_division/indorehome.jsp" class="ui large image">
       <img src="Indore_division/images/indoredivision.jpg" style="width :450px; height: 250px;">
       
</a>
  <div class="middle">
    <div class="text">Indore Division</div>
  </div>
</div>
       
       
       <div class="container" style="position: absolute; left: 800px; top: 650px;">
 <a href="http://google.com" class="ui large image">
        <img src="Bhopal_division/image/bhopaldivision.jpg" style="width :450px; height: 250px;">
</a>
  <div class="middle">
    <div class="text">Bhopal Division</div>
  </div>
</div>
       
       
       <div class="container" style="position: absolute; left: 300px; top: 950px;">
   <a href="http://google.com" class="ui large image">
       <img src="Ujjain_division/image/ujjaindivision.jpeg"style="width :450px; height: 250px; ">
</a>
  <div class="middle">
    <div class="text">Ujjain Division</div>
  </div>
</div>
      
      
    <div class="container" style="position: absolute; left: 800px; top: 950px;">
  <a href="http://google.com" class="ui large image">
        <img src="Jabalpur_division/image/Jabalpurdivision.JPG"style="width :450px; height: 250px; ">
</a>
  <div class="middle">
    <div class="text">Jabalpur Division</div>
  </div>
</div>
       
       
       <div class="container" style="position: absolute; left: 549px; top: 1250px;">
    <a href="http://google.com" class="ui large image" >
        <img src="Shahdol_division/image/shahdoldivision.jpg"style="width :450px; height: 250px;" >
</a>
  <div class="middle">
    <div class="text">Shahdol Division</div>
  </div>
</div>
  
   
   </div>
   
   
   
</body>
</html>
<%}}%>
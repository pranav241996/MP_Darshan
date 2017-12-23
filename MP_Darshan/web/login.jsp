


<html>
    
    <head>
        <title>MP DARSHAN</title>
        <link rel="stylesheet" type="text/css" href="css/normalize1.css" />
        <link rel="stylesheet" type="text/css" href="css/index1.css" />
        <link rel="stylesheet" type="text/css" href="css/logintxt.css" />
        <style>
            body{
                margin:0px auto;
                background-image:url(images/1.jpg);
                background-repeat: no-repeat;
                background-size: 100%;
            }
            .container{
                width: 500px;
                height: 400px;
                background-color: silver;
                margin: 0px auto;
                text-align: center;
                margin-top: 150px;
                border-radius: 5px;
                opacity: .8;
            }
            .container img{
                width: 110px;
                height: 110px;
                border-radius: 600px;
                background: #fff;
                padding: 5px;
                margin-top:-60px;
                margin-bottom: 30px;
            }
            
            .login{border:none;
                  padding:15px 30px;
                  background: azure;
                  border-radius: 5px;
                  coursor:pointer;
                  border-bottom: 5px solid #ccccff;
                  position: relative;
                  bottom: 120px;
                  left: 120px;
                    
            }
            .signup{border:none;
                    margin-bottom: 30px;
            }
            a{color:#fff;}
        </style>  
        <script>
window.location.hash="no-back-button";
window.location.hash="Again-No-back-button";//again because google chrome don't insert first hash into history
window.onhashchange=function(){window.location.hash="no-back-button";}
</script>
    </head>
    <body>
        <div class="container">
            
            <img src="images/icon1.jpg" alt="founder">
            
            <form action="LoginController" method="post" >
                     
                <span class="input input--nao" >
                    <input class="input__field input__field--nao" type="email" name="email" required style="color: black" />
					<label class="input__label input__label--nao" for="input-1">
                                            <span class="input__label-content input__label-content--nao">E-mail</span><br>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span><br>
                
                                <span class="input input--nao">
                                    <input class="input__field input__field--nao" type="password" name="password" required style="color: black"/>
					<label class="input__label input__label--nao" for="password">
						<span class="input__label-content input__label-content--nao">password</span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span><br>
                <div style="position: relative; right: 110px ">
                    <input type="checkbox" name="ck" value="remember" >Remember me
                </div><br/><br><br>
                <div style="position: relative; bottom:40px; right: 100px;">
                <a href="#">Froget Password ?</a><br><br>
                </div>
                <input type="submit" value="LOGIN" name="submit"  class="login"><br><br>
                
            </form>
            <div style="position: relative; bottom: 150px; left: 120px;">
                <a href="registration.jsp"><button  style="padding: 15px 30px; background: azure; border-radius: 5px; coursor:pointer;
                  border-bottom: 5px solid #ccccff;">sign up </button></a>
            </div>
        </div>
    </body>
</html>

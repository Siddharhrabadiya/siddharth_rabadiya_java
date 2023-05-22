<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />

  <title>Ace</title>



  <!--slick slider stylesheet -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.5.9/slick.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.5.9/slick-theme.min.css">

  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

  <!-- fonts style -->
  <link href="https://fonts.googleapis.com/css?family=Dosis:500|Raleway:400,600,700&display=swap" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="css/responsive.css" rel="stylesheet" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <!-- header section strats -->
    <header class="header_section">
      <div class="container-fluid">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a href="index.html" class="navbar-brand">
            <img src="images/logo-black.png" alt="">
          </a>
          <button class="navbar-toggler ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <div class="d-flex ml-auto flex-column flex-lg-row align-items-center">
              <ul class="navbar-nav  ">
               
                
                
                <div>
									
												
											<%
												if(session.getAttribute("myemail")!=null)
												{
											%>
									<a href="profile.jsp"><img style="margin-right: 50px;" src="images/profile.png" alt="errorprofile"></a>
											<label style="color: black; margin-right: 250px;">
										
												<%
												out.print( session.getAttribute("myemail"));
											
												}
											%>
											
											</label>
								</div>
							<%
							
							if(session.getAttribute("myemail")!=null)
							{
							%>
							
							<li class="nav-item active">
							<a class="nav-link" herf="home.jsp">Main</a>	
							</li>	
                <%
							}
							else
							{
								
                %>
                 <li class="nav-item active">
                  <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <%
							}           
                %>
                
                <%
                
                if(session.getAttribute("myemail")!=null)
                {
                
                %>
                
                <li class="nav-item">
                  <a class="nav-link" href="about.jsp"> About</a>
                </li>
                
                
                <li class="nav-item">
                  <a class="nav-link" href="Product.jsp">Product</a>
                </li>
                
                <li class="nav-item">
                  <a class="nav-link" href="cartlistview.jsp">Cart</a>
                </li>
                
                <li class="nav-item">
                  <a class="nav-link" href="wishlistview.jsp">Wishlist</a>
                </li>
                
                <li class="nav-item">
                  <a class="nav-link" href="contact.jsp">Contact us</a>
                </li>
                <%
                }
                %>
                
                <%
											
						if(session.getAttribute("myemail")!=null)
						{
												
				%>
										<li class="nav-item">
						<a class="nav-link"  href="logout.jsp">Log Out</a>
							
							</li>
				<%
						}
				%>
							<li class="nav-item">
                  <a class="nav-link" href="signup.jsp">Signup</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="login.jsp">Login</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="pohotologin.jsp">Photographer</a>
                </li>
              </ul>
              <form class="form-inline">
                <button class="btn  my-2 my-sm-0 nav_search-btn" type="submit"></button>
              </form>
            </div>
          </div>
        </nav>
      </div>
    </header>
    <!-- end header section -->
</body>
</html>
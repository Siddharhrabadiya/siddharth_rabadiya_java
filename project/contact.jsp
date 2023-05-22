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

  <title>Contact Us</title>



  <!-- slider stylesheet -->
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
</head>

<body class="sub_page">
<jsp:include page="header.jsp"></jsp:include>
  <div class="hero_area">

    <div class="main slick_main">
    </div>
    
  </div>


  <!-- contact section -->

  <section class="contact_section layout_padding">
    <div class="container ">
      <div class="">
        <h2 class="">
          Get In Touch
        </h2>
      </div>
    </div>
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <form action="Contactus.jsp" >
          
              <input name="fullname" type="text" placeholder="fullName"  />
           
              <input name="email" type="email" placeholder="Email" />
            
              <input name="phone" type="number" placeholder="Phone Number" />
           
              <input name="message" type="text" class="message-box" placeholder="Message" />
            
              <button type="submit" value="Send">
                SEND
              </button>
            
          </form>
        </div>
        <div class="col-md-6">
          <div class="img-box">
            <img src="images/contact-img.png" alt="">
            <div class="img_overlay">
              <h2>
                Best <br>
                Photo <br>
                studio
              </h2>
        
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- end contact section -->

  
  <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.js"></script>
  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.5.9/slick.min.js"></script>
  <!-- end google map js -->


  <script>
    $('.slider-for').slick({
      autoplay: true,
      autoplaySpeed: 3000,
      slidesToShow: 1,
      slidesToScroll: 1,
      arrows: false,
      fade: true,
      asNavFor: '.slider-nav'
    });
    $('.slider-nav').slick({
      slidesToShow: 3,
      slidesToScroll: 1,
      asNavFor: '.slider-for',
      dots: true,
      centerMode: true,
      focusOnSelect: true,

    });
  </script>

  <script>
    $('.slick-carousel').slick({
      infinite: true,
      slidesToShow: 3, // Shows a three slides at a time
      slidesToScroll: 1, // When you click an arrow, it scrolls 1 slide at a time
      responsive: [{
        breakpoint: 768,
        settings: {
          slidesToShow: 2,
          slidesToScroll: 1,
        }
      },
      {
        breakpoint: 420,
        settings: {
          slidesToShow: 1,
          slidesToScroll: 3,
        }
      }

      ]
    });
  </script>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
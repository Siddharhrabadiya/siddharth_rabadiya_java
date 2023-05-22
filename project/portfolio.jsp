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


  <!-- portfolio section -->

  <section class="portfolio_section layout_padding-top">
    <div class="container">
      <div class="heading_container">
        <h2>
          Our Portfolio
        </h2>
        <p>
          There are many variations of
        </p>
      </div>
    </div>
    <div class="portfolio_container slick-carousel">
      <div class="box">
        <img src="images/p-1.jpg" alt="">
        <div class="link-box">
          <a href="">
            <img src="images/link.png" alt="">
          </a>
          <h6>
            There are many
          </h6>
        </div>
      </div>
      <div class="box">
        <img src="images/p-2.jpg" alt="">
        <div class="link-box">
          <a href="">
            <img src="images/link.png" alt="">
          </a>
          <h6>
            There are many
          </h6>
        </div>
      </div>
      <div class="box">
        <img src="images/p-3.jpg" alt="">
        <div class="link-box">
          <a href="">
            <img src="images/link.png" alt="">
          </a>
          <h6>
            There are many
          </h6>
        </div>
      </div>
      <div class="box">
        <img src="images/p-4.jpg" alt="">
        <div class="link-box">
          <a href="">
            <img src="images/link.png" alt="">
          </a>
          <h6>
            There are many
          </h6>
        </div>
      </div>
    </div>
  </section>

  <!-- end portfolio section -->

  <!-- quality section -->

  <section class="quality_section layout_padding">
    <div class="container">
      <div class="quality_container">
        <h2>
          Quality <br>
          your Photo
        </h2>
        <div class="box">
          <div class="detail-box">
            <div class="img-box">
              <img src="images/q-1.png" alt="">
            </div>
            <div class="text-box">
              <h5>
                Professional Staff
              </h5>
              <p>
                There are many variations
                of passages
              </p>
            </div>
          </div>
          <div class="detail-box">
            <div class="img-box">
              <img src="images/q-2.png" alt="">
            </div>
            <div class="text-box">
              <h5>
                Save money
              </h5>
              <p>
                There are many variations
                of passages
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- end quality section -->



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
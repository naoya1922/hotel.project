$(function(){
    var pagetop = $('#page-top');
    // ボタン非表示
    pagetop.hide();
    // 1000px スクロールしたらボタン表示
    $(window).scroll(function () {
      if ($(this).scrollTop() > 1000) {
        pagetop.fadeIn();
      } else {
        pagetop.fadeOut();
      }
    });
    pagetop.click(function () {
       $('body, html').animate({ scrollTop: 0 }, 500); // 0.5秒でページトップへ移動
       return false;
    });
  });

  $('.multiple-items').slick({
    infinite: true,
    slidesToShow: 1,
    slidesToScroll: 1,
    autoplay: true
  });
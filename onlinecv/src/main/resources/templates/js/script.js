(function() {
	document.body.className += " js-loading";

	window.addEventListener("load", function() {
		document.body.className = document.body.className.replace("js-loading", "");
	}, false);
});

$(document).scroll(function() {
	var $nav = $("#mainNavbar");
	
	if($(this).scrollTop() > 0) {
		$nav.addClass("scrolled");

		if($nav.hasClass("nonScrolled")) {
			$nav.removeClass("nonScrolled");
		}

		$("#inner-cover").css({
			"background-color" : "rgba(0, 0, 0, 0.9)"
		});
	} else {
		$nav.addClass("nonScrolled");

		if($nav.hasClass("scrolled")) {
			$nav.removeClass("scrolled");
		}

		$("#inner-cover").css({
			"background-color" : "rgba(0, 0, 0, 0.6)"
		});
	}
});

const scroll = new SmoothScroll('.navbar a[href*="#"]', { speed : 800, easing : 'easeOutQuad' });
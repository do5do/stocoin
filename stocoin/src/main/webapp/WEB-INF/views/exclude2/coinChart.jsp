<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h4>${name}</h4>
<div class="tradingview-widget-container">
	<div id="tradingview_a2c70"></div>
	<script type="text/javascript">
		new TradingView.widget({
			"width" : "100%",
			"height" : "100%",
			"symbol" :  "${name}KRW",
			"interval" : "D",
			"timezone" : "Asia/Seoul",
			"theme" : "light",
			"style" : "1",
			"locale" : "en",
			"toolbar_bg" : "#f1f3f6",
			"enable_publishing" : false,
			"allow_symbol_change" : true,
			"container_id" : "tradingview_a2c70",
			"disabled_features": ["header_symbol_search"],
		});
	</script>
</div>
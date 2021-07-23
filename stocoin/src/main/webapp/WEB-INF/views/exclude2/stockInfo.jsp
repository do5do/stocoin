<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		// 수량 감소
		$('.minus').on('click', function(e) {
			e.preventDefault();
			var stat = $(this).siblings("span").text();
			var num = parseInt(stat);
			var fee = $(this).parent().siblings(".fee").text();
			var sliceFee = fee.split("원");
			
			num -= 1;

			if (num < 0) {
				num = 0;
				alert('최저 수량입니다.');
			}
			
			$(this).siblings("span").text(num);
			$(this).siblings("input").val(num);
		});
		
		// 수량 증가
		$('.plus').on('click', function(e) {
			e.preventDefault();
			var stat = $(this).siblings("span").text();
			var num = parseInt(stat);
			var fee = $(this).parent().siblings(".fee").text();
			var sliceFee = fee.split("원");

			num += 1;
			
			if (num > 20) { // 가진 돈에 맞춰서 계산 필요 주 * 수량 <= 가진 금액
				num = 20;
				alert('최고 수량입니다.');
			}
			
			$(this).siblings("span").text(num);
			$(this).siblings("input").val(num);
		});
	})
	
	// tab
	function tab(item) {
		if (item == 'sell') {
			$('#sell').addClass('blue');
			$('#buy').removeClass('red');
		} else {
			$('#buy').addClass('red');
			$('#sell').removeClass('blue');
		}
	}
</script>
<div class="trade_box col-7">
	<ul class="trade_tab">
		<li class="red" id="buy" onclick="tab('buy')">매수</li>
		<li id="sell" onclick="tab('sell')">매도</li>
	</ul>
	<div class="trade_detail">
		<div class="left">
			<p>주문가능</p>
			<p>주문가격</p>
			<p>주문수량</p>
			<p>주문금액</p>
		</div>
		<div class="right">
			<p>0원</p>
			<p>${stockInfo.get("ACC_TRDVOL") }원</p>
			<div class="fee_box">
				<p class="fee">0원</p>
				<div class="cnt_box">
					<div class="line_box minus">
						<div class="line"></div>
					</div>
					<span>0</span>
					<div class="line_box plus">
						<div class="line"><div class="line vertical"></div></div>
					</div>
					<input type="hidden" name="cnt" class="input_hidden" value="0">
				</div>
			</div>
			<input type="number" placeholder="0원">
		</div>
	</div>
</div>
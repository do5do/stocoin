package com.sc.stocoin.model;

import java.net.InetAddress;

public class StocoinStrings {
	public String IP;
	public StocoinStrings() {
		try {
//			IP = InetAddress.getLocalHost().getHostAddress() + ":8080";
			IP = "localhost:8080";
		} catch (Exception e) {
			IP = "";
		}
	}

	public void setIP(String IP) {
		this.IP = IP;
	}

	public String getIP() {
		return IP;
	}

	public String getCORPCODE() {
		return "{\r\n" + 
				"		\"list\": [\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260985\",\r\n" + 
				"				\"corp_name\": \"한빛네트\",\r\n" + 
				"				\"stock_code\": \"036720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264529\",\r\n" + 
				"				\"corp_name\": \"엔플렉스\",\r\n" + 
				"				\"stock_code\": \"040130\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00358545\",\r\n" + 
				"				\"corp_name\": \"동서정보기술\",\r\n" + 
				"				\"stock_code\": \"055000\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231567\",\r\n" + 
				"				\"corp_name\": \"애드모바일\",\r\n" + 
				"				\"stock_code\": \"032600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00247939\",\r\n" + 
				"				\"corp_name\": \"씨모스\",\r\n" + 
				"				\"stock_code\": \"037600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359614\",\r\n" + 
				"				\"corp_name\": \"리더컴\",\r\n" + 
				"				\"stock_code\": \"056140\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153551\",\r\n" + 
				"				\"corp_name\": \"허메스홀딩스\",\r\n" + 
				"				\"stock_code\": \"012400\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00344746\",\r\n" + 
				"				\"corp_name\": \"유티엑스\",\r\n" + 
				"				\"stock_code\": \"045880\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261188\",\r\n" + 
				"				\"corp_name\": \"글로포스트\",\r\n" + 
				"				\"stock_code\": \"037830\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268020\",\r\n" + 
				"				\"corp_name\": \"쏠라엔텍\",\r\n" + 
				"				\"stock_code\": \"030390\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269287\",\r\n" + 
				"				\"corp_name\": \"보홍\",\r\n" + 
				"				\"stock_code\": \"041320\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00475286\",\r\n" + 
				"				\"corp_name\": \"동북아1호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"078420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00250775\",\r\n" + 
				"				\"corp_name\": \"에듀아크\",\r\n" + 
				"				\"stock_code\": \"046350\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114321\",\r\n" + 
				"				\"corp_name\": \"데코\",\r\n" + 
				"				\"stock_code\": \"013650\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00191108\",\r\n" + 
				"				\"corp_name\": \"엘앤씨피\",\r\n" + 
				"				\"stock_code\": \"015390\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00167378\",\r\n" + 
				"				\"corp_name\": \"희훈디앤지\",\r\n" + 
				"				\"stock_code\": \"019640\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00225210\",\r\n" + 
				"				\"corp_name\": \"퓨쳐인포넷\",\r\n" + 
				"				\"stock_code\": \"058690\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00223346\",\r\n" + 
				"				\"corp_name\": \"쓰리디넷\",\r\n" + 
				"				\"stock_code\": \"035400\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00174129\",\r\n" + 
				"				\"corp_name\": \"제일저축은행\",\r\n" + 
				"				\"stock_code\": \"024100\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114826\",\r\n" + 
				"				\"corp_name\": \"제일창업투자\",\r\n" + 
				"				\"stock_code\": \"026540\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173333\",\r\n" + 
				"				\"corp_name\": \"현대DSF\",\r\n" + 
				"				\"stock_code\": \"016510\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00687599\",\r\n" + 
				"				\"corp_name\": \"네프로아이티\",\r\n" + 
				"				\"stock_code\": \"950030\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00256292\",\r\n" + 
				"				\"corp_name\": \"자강\",\r\n" + 
				"				\"stock_code\": \"036790\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00271431\",\r\n" + 
				"				\"corp_name\": \"케이엠에스\",\r\n" + 
				"				\"stock_code\": \"038830\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154727\",\r\n" + 
				"				\"corp_name\": \"에버리소스\",\r\n" + 
				"				\"stock_code\": \"020070\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00246189\",\r\n" + 
				"				\"corp_name\": \"제이에스\",\r\n" + 
				"				\"stock_code\": \"037110\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154204\",\r\n" + 
				"				\"corp_name\": \"태창기업\",\r\n" + 
				"				\"stock_code\": \"007490\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152631\",\r\n" + 
				"				\"corp_name\": \"에이치비이에너지\",\r\n" + 
				"				\"stock_code\": \"017300\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107923\",\r\n" + 
				"				\"corp_name\": \"남한제지\",\r\n" + 
				"				\"stock_code\": \"001950\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00358095\",\r\n" + 
				"				\"corp_name\": \"코어비트\",\r\n" + 
				"				\"stock_code\": \"056850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00510215\",\r\n" + 
				"				\"corp_name\": \"동북아8호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"082110\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00347619\",\r\n" + 
				"				\"corp_name\": \"한국통신데이타\",\r\n" + 
				"				\"stock_code\": \"045760\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00372013\",\r\n" + 
				"				\"corp_name\": \"케너텍\",\r\n" + 
				"				\"stock_code\": \"062730\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00353735\",\r\n" + 
				"				\"corp_name\": \"다휘\",\r\n" + 
				"				\"stock_code\": \"055250\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00186540\",\r\n" + 
				"				\"corp_name\": \"코오롱아이넷\",\r\n" + 
				"				\"stock_code\": \"022520\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128759\",\r\n" + 
				"				\"corp_name\": \"캠브리지코오롱\",\r\n" + 
				"				\"stock_code\": \"004620\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00535588\",\r\n" + 
				"				\"corp_name\": \"네오세미테크\",\r\n" + 
				"				\"stock_code\": \"089240\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264981\",\r\n" + 
				"				\"corp_name\": \"디에이치패션\",\r\n" + 
				"				\"stock_code\": \"045260\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231521\",\r\n" + 
				"				\"corp_name\": \"핸디소프트\",\r\n" + 
				"				\"stock_code\": \"032380\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159908\",\r\n" + 
				"				\"corp_name\": \"케이엠에이치\",\r\n" + 
				"				\"stock_code\": \"009690\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259493\",\r\n" + 
				"				\"corp_name\": \"씨엘엘씨디\",\r\n" + 
				"				\"stock_code\": \"035710\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359641\",\r\n" + 
				"				\"corp_name\": \"현대푸드시스템\",\r\n" + 
				"				\"stock_code\": \"114410\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103325\",\r\n" + 
				"				\"corp_name\": \"고제\",\r\n" + 
				"				\"stock_code\": \"002540\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161639\",\r\n" + 
				"				\"corp_name\": \"메리츠종합금융\",\r\n" + 
				"				\"stock_code\": \"012420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00211271\",\r\n" + 
				"				\"corp_name\": \"제넥셀세인\",\r\n" + 
				"				\"stock_code\": \"034660\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00388272\",\r\n" + 
				"				\"corp_name\": \"쓰리디월드\",\r\n" + 
				"				\"stock_code\": \"065340\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264796\",\r\n" + 
				"				\"corp_name\": \"스톰이앤에프\",\r\n" + 
				"				\"stock_code\": \"043680\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134909\",\r\n" + 
				"				\"corp_name\": \"소예\",\r\n" + 
				"				\"stock_code\": \"035010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00236368\",\r\n" + 
				"				\"corp_name\": \"엠엔에프씨\",\r\n" + 
				"				\"stock_code\": \"048640\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00684547\",\r\n" + 
				"				\"corp_name\": \"하이트맥주\",\r\n" + 
				"				\"stock_code\": \"103150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00251385\",\r\n" + 
				"				\"corp_name\": \"보광티에스\",\r\n" + 
				"				\"stock_code\": \"066690\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00262682\",\r\n" + 
				"				\"corp_name\": \"아인스엠앤엠\",\r\n" + 
				"				\"stock_code\": \"040740\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00234555\",\r\n" + 
				"				\"corp_name\": \"씨엔씨엔터프라이즈\",\r\n" + 
				"				\"stock_code\": \"038420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00507257\",\r\n" + 
				"				\"corp_name\": \"아이알디\",\r\n" + 
				"				\"stock_code\": \"084810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00417963\",\r\n" + 
				"				\"corp_name\": \"바이나믹\",\r\n" + 
				"				\"stock_code\": \"067850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00543523\",\r\n" + 
				"				\"corp_name\": \"코크렙제7호위탁관리부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"086720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00300566\",\r\n" + 
				"				\"corp_name\": \"엔빅스\",\r\n" + 
				"				\"stock_code\": \"054170\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00299376\",\r\n" + 
				"				\"corp_name\": \"선팩테크\",\r\n" + 
				"				\"stock_code\": \"054010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112068\",\r\n" + 
				"				\"corp_name\": \"마이크로닉스\",\r\n" + 
				"				\"stock_code\": \"001190\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00257194\",\r\n" + 
				"				\"corp_name\": \"블루스톤디앤아이\",\r\n" + 
				"				\"stock_code\": \"033720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00477372\",\r\n" + 
				"				\"corp_name\": \"신지소프트\",\r\n" + 
				"				\"stock_code\": \"078700\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00465410\",\r\n" + 
				"				\"corp_name\": \"맥쿼리센트럴오피스기업구조조정부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"076850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00331760\",\r\n" + 
				"				\"corp_name\": \"테스텍\",\r\n" + 
				"				\"stock_code\": \"048510\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00200761\",\r\n" + 
				"				\"corp_name\": \"중앙디자인\",\r\n" + 
				"				\"stock_code\": \"030030\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268297\",\r\n" + 
				"				\"corp_name\": \"에코페트로시스템\",\r\n" + 
				"				\"stock_code\": \"042870\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161301\",\r\n" + 
				"				\"corp_name\": \"한림창업투자\",\r\n" + 
				"				\"stock_code\": \"021060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00237260\",\r\n" + 
				"				\"corp_name\": \"헤쎄나\",\r\n" + 
				"				\"stock_code\": \"036270\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00297970\",\r\n" + 
				"				\"corp_name\": \"미래에셋굿라이프혼합형자녀를위한투자회사10-1\",\r\n" + 
				"				\"stock_code\": \"037510\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107358\",\r\n" + 
				"				\"corp_name\": \"일공공일안경콘택트\",\r\n" + 
				"				\"stock_code\": \"032030\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115427\",\r\n" + 
				"				\"corp_name\": \"신동방CP\",\r\n" + 
				"				\"stock_code\": \"004660\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267474\",\r\n" + 
				"				\"corp_name\": \"지앤알\",\r\n" + 
				"				\"stock_code\": \"043630\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134051\",\r\n" + 
				"				\"corp_name\": \"셀런\",\r\n" + 
				"				\"stock_code\": \"013240\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00596066\",\r\n" + 
				"				\"corp_name\": \"한국베트남15-1유전해외자원개발투자회사\",\r\n" + 
				"				\"stock_code\": \"093820\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00347363\",\r\n" + 
				"				\"corp_name\": \"에이치원바이오\",\r\n" + 
				"				\"stock_code\": \"052310\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150226\",\r\n" + 
				"				\"corp_name\": \"씨앤중공업\",\r\n" + 
				"				\"stock_code\": \"008400\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152914\",\r\n" + 
				"				\"corp_name\": \"FnC코오롱\",\r\n" + 
				"				\"stock_code\": \"001370\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158839\",\r\n" + 
				"				\"corp_name\": \"제너비오믹스\",\r\n" + 
				"				\"stock_code\": \"017010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159281\",\r\n" + 
				"				\"corp_name\": \"케드콤\",\r\n" + 
				"				\"stock_code\": \"011050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00210537\",\r\n" + 
				"				\"corp_name\": \"지엔텍홀딩스\",\r\n" + 
				"				\"stock_code\": \"065410\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00240370\",\r\n" + 
				"				\"corp_name\": \"동부씨엔아이\",\r\n" + 
				"				\"stock_code\": \"044640\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00247887\",\r\n" + 
				"				\"corp_name\": \"아이피에스\",\r\n" + 
				"				\"stock_code\": \"051820\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268358\",\r\n" + 
				"				\"corp_name\": \"에스브이에이치\",\r\n" + 
				"				\"stock_code\": \"046240\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00316488\",\r\n" + 
				"				\"corp_name\": \"제이콤\",\r\n" + 
				"				\"stock_code\": \"060750\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264130\",\r\n" + 
				"				\"corp_name\": \"옥션\",\r\n" + 
				"				\"stock_code\": \"043790\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540304\",\r\n" + 
				"				\"corp_name\": \"네이쳐글로벌\",\r\n" + 
				"				\"stock_code\": \"088020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00617299\",\r\n" + 
				"				\"corp_name\": \"GB블루오션베트남주식혼합형투자회사1호\",\r\n" + 
				"				\"stock_code\": \"094950\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00262275\",\r\n" + 
				"				\"corp_name\": \"엠씨티티코어\",\r\n" + 
				"				\"stock_code\": \"052210\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00200798\",\r\n" + 
				"				\"corp_name\": \"에이스앤파트너스\",\r\n" + 
				"				\"stock_code\": \"032930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00335924\",\r\n" + 
				"				\"corp_name\": \"지앤디윈텍\",\r\n" + 
				"				\"stock_code\": \"061050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111591\",\r\n" + 
				"				\"corp_name\": \"인터피온반도체\",\r\n" + 
				"				\"stock_code\": \"014010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00189343\",\r\n" + 
				"				\"corp_name\": \"솔로몬저축은행\",\r\n" + 
				"				\"stock_code\": \"007800\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00252588\",\r\n" + 
				"				\"corp_name\": \"엠트론스토리지테크놀로지\",\r\n" + 
				"				\"stock_code\": \"046320\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267997\",\r\n" + 
				"				\"corp_name\": \"에스티앤아이\",\r\n" + 
				"				\"stock_code\": \"031800\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367376\",\r\n" + 
				"				\"corp_name\": \"사이노젠\",\r\n" + 
				"				\"stock_code\": \"064060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00299686\",\r\n" + 
				"				\"corp_name\": \"유퍼트\",\r\n" + 
				"				\"stock_code\": \"060670\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00463050\",\r\n" + 
				"				\"corp_name\": \"엑스로드\",\r\n" + 
				"				\"stock_code\": \"074140\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00238913\",\r\n" + 
				"				\"corp_name\": \"선우중공업\",\r\n" + 
				"				\"stock_code\": \"068770\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107446\",\r\n" + 
				"				\"corp_name\": \"남양\",\r\n" + 
				"				\"stock_code\": \"003020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114303\",\r\n" + 
				"				\"corp_name\": \"엘지데이콤\",\r\n" + 
				"				\"stock_code\": \"015940\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00318617\",\r\n" + 
				"				\"corp_name\": \"LG파워콤\",\r\n" + 
				"				\"stock_code\": \"045820\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267775\",\r\n" + 
				"				\"corp_name\": \"동산진흥\",\r\n" + 
				"				\"stock_code\": \"031960\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00394574\",\r\n" + 
				"				\"corp_name\": \"티이씨\",\r\n" + 
				"				\"stock_code\": \"067950\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110176\",\r\n" + 
				"				\"corp_name\": \"한국기술산업\",\r\n" + 
				"				\"stock_code\": \"008320\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00349787\",\r\n" + 
				"				\"corp_name\": \"지케이파워\",\r\n" + 
				"				\"stock_code\": \"054020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136554\",\r\n" + 
				"				\"corp_name\": \"스타맥스\",\r\n" + 
				"				\"stock_code\": \"017050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144562\",\r\n" + 
				"				\"corp_name\": \"유성티에스아이\",\r\n" + 
				"				\"stock_code\": \"024870\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00370547\",\r\n" + 
				"				\"corp_name\": \"네오리소스\",\r\n" + 
				"				\"stock_code\": \"058550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00242439\",\r\n" + 
				"				\"corp_name\": \"케이알\",\r\n" + 
				"				\"stock_code\": \"035950\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134060\",\r\n" + 
				"				\"corp_name\": \"씨앤상선\",\r\n" + 
				"				\"stock_code\": \"000790\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00392600\",\r\n" + 
				"				\"corp_name\": \"투미비티\",\r\n" + 
				"				\"stock_code\": \"058900\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259855\",\r\n" + 
				"				\"corp_name\": \"코아정보시스템\",\r\n" + 
				"				\"stock_code\": \"039990\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00385451\",\r\n" + 
				"				\"corp_name\": \"케이에스리소스\",\r\n" + 
				"				\"stock_code\": \"066340\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00258944\",\r\n" + 
				"				\"corp_name\": \"세계투어\",\r\n" + 
				"				\"stock_code\": \"047600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00798530\",\r\n" + 
				"				\"corp_name\": \"동양밸류오션기업인수목적\",\r\n" + 
				"				\"stock_code\": \"122290\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00451268\",\r\n" + 
				"				\"corp_name\": \"케이이엔지\",\r\n" + 
				"				\"stock_code\": \"077960\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00336570\",\r\n" + 
				"				\"corp_name\": \"사이버패스\",\r\n" + 
				"				\"stock_code\": \"063280\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00363325\",\r\n" + 
				"				\"corp_name\": \"산양전기\",\r\n" + 
				"				\"stock_code\": \"079870\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148188\",\r\n" + 
				"				\"corp_name\": \"으뜸상호저축은행\",\r\n" + 
				"				\"stock_code\": \"032150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00508566\",\r\n" + 
				"				\"corp_name\": \"국제개발\",\r\n" + 
				"				\"stock_code\": \"080570\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133928\",\r\n" + 
				"				\"corp_name\": \"세신\",\r\n" + 
				"				\"stock_code\": \"004230\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540784\",\r\n" + 
				"				\"corp_name\": \"골든브릿지더블유엠경매부동산일호투자회사\",\r\n" + 
				"				\"stock_code\": \"084160\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00298252\",\r\n" + 
				"				\"corp_name\": \"엘앤피아너스\",\r\n" + 
				"				\"stock_code\": \"061140\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264556\",\r\n" + 
				"				\"corp_name\": \"에이스일렉트로닉스\",\r\n" + 
				"				\"stock_code\": \"038690\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00581000\",\r\n" + 
				"				\"corp_name\": \"디앤샵\",\r\n" + 
				"				\"stock_code\": \"090090\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359094\",\r\n" + 
				"				\"corp_name\": \"더체인지\",\r\n" + 
				"				\"stock_code\": \"054120\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00686970\",\r\n" + 
				"				\"corp_name\": \"다산자기관리부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"105380\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255309\",\r\n" + 
				"				\"corp_name\": \"써니트렌드\",\r\n" + 
				"				\"stock_code\": \"035500\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00362380\",\r\n" + 
				"				\"corp_name\": \"뉴젠비아이티\",\r\n" + 
				"				\"stock_code\": \"054650\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244862\",\r\n" + 
				"				\"corp_name\": \"룩소네이트\",\r\n" + 
				"				\"stock_code\": \"033880\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00301015\",\r\n" + 
				"				\"corp_name\": \"한서제약\",\r\n" + 
				"				\"stock_code\": \"044070\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00297165\",\r\n" + 
				"				\"corp_name\": \"현대오토넷\",\r\n" + 
				"				\"stock_code\": \"042100\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105767\",\r\n" + 
				"				\"corp_name\": \"LG마이크론\",\r\n" + 
				"				\"stock_code\": \"016990\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173397\",\r\n" + 
				"				\"corp_name\": \"서광건설산업\",\r\n" + 
				"				\"stock_code\": \"001600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259606\",\r\n" + 
				"				\"corp_name\": \"플러스프로핏\",\r\n" + 
				"				\"stock_code\": \"036660\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00178471\",\r\n" + 
				"				\"corp_name\": \"한와이어리스\",\r\n" + 
				"				\"stock_code\": \"037020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00331733\",\r\n" + 
				"				\"corp_name\": \"포휴먼\",\r\n" + 
				"				\"stock_code\": \"049690\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104892\",\r\n" + 
				"				\"corp_name\": \"알이네트웍스\",\r\n" + 
				"				\"stock_code\": \"023670\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00647917\",\r\n" + 
				"				\"corp_name\": \"케이알제2호개발전문위탁관리부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"101790\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00597764\",\r\n" + 
				"				\"corp_name\": \"미래에셋맵스오퍼튜니티베트남주식혼합형투자회사1호\",\r\n" + 
				"				\"stock_code\": \"094520\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00355821\",\r\n" + 
				"				\"corp_name\": \"씨티엘테크\",\r\n" + 
				"				\"stock_code\": \"088960\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00329677\",\r\n" + 
				"				\"corp_name\": \"이디디컴퍼니\",\r\n" + 
				"				\"stock_code\": \"052650\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244871\",\r\n" + 
				"				\"corp_name\": \"케이티프리텔\",\r\n" + 
				"				\"stock_code\": \"032390\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00246383\",\r\n" + 
				"				\"corp_name\": \"메카포럼\",\r\n" + 
				"				\"stock_code\": \"035830\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00345499\",\r\n" + 
				"				\"corp_name\": \"에스피코프\",\r\n" + 
				"				\"stock_code\": \"048130\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00348140\",\r\n" + 
				"				\"corp_name\": \"이롬텍\",\r\n" + 
				"				\"stock_code\": \"045400\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00215107\",\r\n" + 
				"				\"corp_name\": \"이앤텍\",\r\n" + 
				"				\"stock_code\": \"047450\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106508\",\r\n" + 
				"				\"corp_name\": \"기린\",\r\n" + 
				"				\"stock_code\": \"006070\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00560991\",\r\n" + 
				"				\"corp_name\": \"맥스브로\",\r\n" + 
				"				\"stock_code\": \"088810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265263\",\r\n" + 
				"				\"corp_name\": \"토자이홀딩스\",\r\n" + 
				"				\"stock_code\": \"037700\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00142564\",\r\n" + 
				"				\"corp_name\": \"우방\",\r\n" + 
				"				\"stock_code\": \"013200\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00198572\",\r\n" + 
				"				\"corp_name\": \"동양매직\",\r\n" + 
				"				\"stock_code\": \"023020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00642648\",\r\n" + 
				"				\"corp_name\": \"코웰이홀딩스유한공사\",\r\n" + 
				"				\"stock_code\": \"900020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00537443\",\r\n" + 
				"				\"corp_name\": \"아구스\",\r\n" + 
				"				\"stock_code\": \"078670\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113173\",\r\n" + 
				"				\"corp_name\": \"대한은박지\",\r\n" + 
				"				\"stock_code\": \"007480\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00441872\",\r\n" + 
				"				\"corp_name\": \"인스프리트\",\r\n" + 
				"				\"stock_code\": \"073130\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00480844\",\r\n" + 
				"				\"corp_name\": \"하이럭스\",\r\n" + 
				"				\"stock_code\": \"079340\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00262044\",\r\n" + 
				"				\"corp_name\": \"트리니티\",\r\n" + 
				"				\"stock_code\": \"053070\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101442\",\r\n" + 
				"				\"corp_name\": \"카라반케이디이\",\r\n" + 
				"				\"stock_code\": \"032570\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00295875\",\r\n" + 
				"				\"corp_name\": \"더존디지털웨어\",\r\n" + 
				"				\"stock_code\": \"045380\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00441298\",\r\n" + 
				"				\"corp_name\": \"디보스\",\r\n" + 
				"				\"stock_code\": \"080140\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00263885\",\r\n" + 
				"				\"corp_name\": \"포네이처\",\r\n" + 
				"				\"stock_code\": \"045290\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00475532\",\r\n" + 
				"				\"corp_name\": \"테이크시스템즈\",\r\n" + 
				"				\"stock_code\": \"076090\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130204\",\r\n" + 
				"				\"corp_name\": \"폴켐\",\r\n" + 
				"				\"stock_code\": \"033190\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128731\",\r\n" + 
				"				\"corp_name\": \"유리이에스\",\r\n" + 
				"				\"stock_code\": \"007050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00325981\",\r\n" + 
				"				\"corp_name\": \"에프아이투어\",\r\n" + 
				"				\"stock_code\": \"047370\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540021\",\r\n" + 
				"				\"corp_name\": \"모빌탑\",\r\n" + 
				"				\"stock_code\": \"085680\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00362089\",\r\n" + 
				"				\"corp_name\": \"올리브나인\",\r\n" + 
				"				\"stock_code\": \"052970\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00228916\",\r\n" + 
				"				\"corp_name\": \"디패션\",\r\n" + 
				"				\"stock_code\": \"030420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114215\",\r\n" + 
				"				\"corp_name\": \"알덱스\",\r\n" + 
				"				\"stock_code\": \"025970\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264103\",\r\n" + 
				"				\"corp_name\": \"에이엠에스\",\r\n" + 
				"				\"stock_code\": \"044770\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109648\",\r\n" + 
				"				\"corp_name\": \"오라바이오틱스\",\r\n" + 
				"				\"stock_code\": \"016160\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261212\",\r\n" + 
				"				\"corp_name\": \"시노펙스그린테크\",\r\n" + 
				"				\"stock_code\": \"037320\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00348007\",\r\n" + 
				"				\"corp_name\": \"야호커뮤니케이션\",\r\n" + 
				"				\"stock_code\": \"059720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00275808\",\r\n" + 
				"				\"corp_name\": \"브이케이\",\r\n" + 
				"				\"stock_code\": \"048760\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00375579\",\r\n" + 
				"				\"corp_name\": \"팬택앤큐리텔\",\r\n" + 
				"				\"stock_code\": \"063350\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00197324\",\r\n" + 
				"				\"corp_name\": \"팬텀엔터테인먼트그룹\",\r\n" + 
				"				\"stock_code\": \"025460\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00339063\",\r\n" + 
				"				\"corp_name\": \"삼성수산\",\r\n" + 
				"				\"stock_code\": \"052560\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00538497\",\r\n" + 
				"				\"corp_name\": \"동북아15호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"084240\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00329084\",\r\n" + 
				"				\"corp_name\": \"비엔디\",\r\n" + 
				"				\"stock_code\": \"047940\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00225140\",\r\n" + 
				"				\"corp_name\": \"쌈지\",\r\n" + 
				"				\"stock_code\": \"033260\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101947\",\r\n" + 
				"				\"corp_name\": \"브이오산업\",\r\n" + 
				"				\"stock_code\": \"018890\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00287724\",\r\n" + 
				"				\"corp_name\": \"코디콤\",\r\n" + 
				"				\"stock_code\": \"041800\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00347840\",\r\n" + 
				"				\"corp_name\": \"제네시스엔알디\",\r\n" + 
				"				\"stock_code\": \"052640\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00504357\",\r\n" + 
				"				\"corp_name\": \"동북아6호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"080410\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269339\",\r\n" + 
				"				\"corp_name\": \"인네트\",\r\n" + 
				"				\"stock_code\": \"041450\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00634959\",\r\n" + 
				"				\"corp_name\": \"한국월드와이드아시아태평양특별자산1호투자회사\",\r\n" + 
				"				\"stock_code\": \"098150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267094\",\r\n" + 
				"				\"corp_name\": \"헤파호프코리아\",\r\n" + 
				"				\"stock_code\": \"039350\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00142698\",\r\n" + 
				"				\"corp_name\": \"휴리프\",\r\n" + 
				"				\"stock_code\": \"006210\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350057\",\r\n" + 
				"				\"corp_name\": \"하이스마텍\",\r\n" + 
				"				\"stock_code\": \"057100\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00721981\",\r\n" + 
				"				\"corp_name\": \"삼성디지털이미징\",\r\n" + 
				"				\"stock_code\": \"108070\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00248691\",\r\n" + 
				"				\"corp_name\": \"씨제이인터넷\",\r\n" + 
				"				\"stock_code\": \"037150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00335562\",\r\n" + 
				"				\"corp_name\": \"엠넷미디어\",\r\n" + 
				"				\"stock_code\": \"056200\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00369675\",\r\n" + 
				"				\"corp_name\": \"온미디어\",\r\n" + 
				"				\"stock_code\": \"045710\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265078\",\r\n" + 
				"				\"corp_name\": \"유니텍전자\",\r\n" + 
				"				\"stock_code\": \"039040\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267809\",\r\n" + 
				"				\"corp_name\": \"위더스기술금융\",\r\n" + 
				"				\"stock_code\": \"019430\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00314000\",\r\n" + 
				"				\"corp_name\": \"클라스타\",\r\n" + 
				"				\"stock_code\": \"037550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00355292\",\r\n" + 
				"				\"corp_name\": \"아시아미디어홀딩스\",\r\n" + 
				"				\"stock_code\": \"052810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00386557\",\r\n" + 
				"				\"corp_name\": \"아이스테이션\",\r\n" + 
				"				\"stock_code\": \"056010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00548865\",\r\n" + 
				"				\"corp_name\": \"동북아21호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"088010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00221320\",\r\n" + 
				"				\"corp_name\": \"에이스디지텍\",\r\n" + 
				"				\"stock_code\": \"036550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124054\",\r\n" + 
				"				\"corp_name\": \"부산저축은행\",\r\n" + 
				"				\"stock_code\": \"007830\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00301486\",\r\n" + 
				"				\"corp_name\": \"에피밸리\",\r\n" + 
				"				\"stock_code\": \"068630\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149248\",\r\n" + 
				"				\"corp_name\": \"아세아페이퍼텍\",\r\n" + 
				"				\"stock_code\": \"009380\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00311298\",\r\n" + 
				"				\"corp_name\": \"오페스\",\r\n" + 
				"				\"stock_code\": \"053470\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00348557\",\r\n" + 
				"				\"corp_name\": \"액티투오\",\r\n" + 
				"				\"stock_code\": \"047710\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265342\",\r\n" + 
				"				\"corp_name\": \"에이치에스씨홀딩스\",\r\n" + 
				"				\"stock_code\": \"038920\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156734\",\r\n" + 
				"				\"corp_name\": \"한국고덴시\",\r\n" + 
				"				\"stock_code\": \"027840\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00208693\",\r\n" + 
				"				\"corp_name\": \"나리지*온\",\r\n" + 
				"				\"stock_code\": \"036850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128953\",\r\n" + 
				"				\"corp_name\": \"프로비타\",\r\n" + 
				"				\"stock_code\": \"014420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00428792\",\r\n" + 
				"				\"corp_name\": \"제로원인터랙티브\",\r\n" + 
				"				\"stock_code\": \"069470\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148744\",\r\n" + 
				"				\"corp_name\": \"제일화재해상보험\",\r\n" + 
				"				\"stock_code\": \"000610\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00518873\",\r\n" + 
				"				\"corp_name\": \"동북아9호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083120\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00300779\",\r\n" + 
				"				\"corp_name\": \"굿이엠지\",\r\n" + 
				"				\"stock_code\": \"051530\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00397766\",\r\n" + 
				"				\"corp_name\": \"아이드림\",\r\n" + 
				"				\"stock_code\": \"066850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00174305\",\r\n" + 
				"				\"corp_name\": \"조인에너지\",\r\n" + 
				"				\"stock_code\": \"004820\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00320807\",\r\n" + 
				"				\"corp_name\": \"태광이엔시\",\r\n" + 
				"				\"stock_code\": \"048140\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106492\",\r\n" + 
				"				\"corp_name\": \"렉스엘이앤지\",\r\n" + 
				"				\"stock_code\": \"004790\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00592583\",\r\n" + 
				"				\"corp_name\": \"코리아퍼시픽05호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"093400\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00275260\",\r\n" + 
				"				\"corp_name\": \"엑큐리스\",\r\n" + 
				"				\"stock_code\": \"048460\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00183914\",\r\n" + 
				"				\"corp_name\": \"우경\",\r\n" + 
				"				\"stock_code\": \"025920\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00481676\",\r\n" + 
				"				\"corp_name\": \"세미텍\",\r\n" + 
				"				\"stock_code\": \"081220\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104971\",\r\n" + 
				"				\"corp_name\": \"그린손해보험\",\r\n" + 
				"				\"stock_code\": \"000470\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269773\",\r\n" + 
				"				\"corp_name\": \"대양글로벌\",\r\n" + 
				"				\"stock_code\": \"040180\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00334767\",\r\n" + 
				"				\"corp_name\": \"엔하이테크\",\r\n" + 
				"				\"stock_code\": \"046720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00453752\",\r\n" + 
				"				\"corp_name\": \"제너시스템즈\",\r\n" + 
				"				\"stock_code\": \"073930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140919\",\r\n" + 
				"				\"corp_name\": \"엘트온\",\r\n" + 
				"				\"stock_code\": \"015050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255840\",\r\n" + 
				"				\"corp_name\": \"태산엘시디\",\r\n" + 
				"				\"stock_code\": \"036210\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133034\",\r\n" + 
				"				\"corp_name\": \"성원건설\",\r\n" + 
				"				\"stock_code\": \"012090\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161028\",\r\n" + 
				"				\"corp_name\": \"대우송도개발\",\r\n" + 
				"				\"stock_code\": \"004550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00174475\",\r\n" + 
				"				\"corp_name\": \"현대금속\",\r\n" + 
				"				\"stock_code\": \"018410\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00251482\",\r\n" + 
				"				\"corp_name\": \"트라이써클\",\r\n" + 
				"				\"stock_code\": \"034010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00824659\",\r\n" + 
				"				\"corp_name\": \"아이비케이에스스마트에스엠이기업인수목적1호\",\r\n" + 
				"				\"stock_code\": \"126680\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259536\",\r\n" + 
				"				\"corp_name\": \"네스테크\",\r\n" + 
				"				\"stock_code\": \"037540\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00505198\",\r\n" + 
				"				\"corp_name\": \"동북아5호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"080980\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00679730\",\r\n" + 
				"				\"corp_name\": \"파브코\",\r\n" + 
				"				\"stock_code\": \"101990\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00803504\",\r\n" + 
				"				\"corp_name\": \"우리기업인수목적1호\",\r\n" + 
				"				\"stock_code\": \"122750\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350118\",\r\n" + 
				"				\"corp_name\": \"뉴젠아이씨티\",\r\n" + 
				"				\"stock_code\": \"054150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00352295\",\r\n" + 
				"				\"corp_name\": \"인젠\",\r\n" + 
				"				\"stock_code\": \"041630\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00240088\",\r\n" + 
				"				\"corp_name\": \"지앤에스티\",\r\n" + 
				"				\"stock_code\": \"036920\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00356158\",\r\n" + 
				"				\"corp_name\": \"영진코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"053330\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00560025\",\r\n" + 
				"				\"corp_name\": \"코크렙제8호위탁관리부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"090540\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140380\",\r\n" + 
				"				\"corp_name\": \"유니온스틸\",\r\n" + 
				"				\"stock_code\": \"003640\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101275\",\r\n" + 
				"				\"corp_name\": \"경남모직\",\r\n" + 
				"				\"stock_code\": \"001670\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00334493\",\r\n" + 
				"				\"corp_name\": \"씨티앤티\",\r\n" + 
				"				\"stock_code\": \"050470\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00797674\",\r\n" + 
				"				\"corp_name\": \"대우증권그린코리아기업인수목적회사\",\r\n" + 
				"				\"stock_code\": \"121910\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244589\",\r\n" + 
				"				\"corp_name\": \"지노시스템\",\r\n" + 
				"				\"stock_code\": \"033850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00802028\",\r\n" + 
				"				\"corp_name\": \"한국투자신성장1호기업인수목적회사\",\r\n" + 
				"				\"stock_code\": \"123290\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164292\",\r\n" + 
				"				\"corp_name\": \"동원데어리푸드\",\r\n" + 
				"				\"stock_code\": \"003900\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00371519\",\r\n" + 
				"				\"corp_name\": \"휴먼텍코리아\",\r\n" + 
				"				\"stock_code\": \"066060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126593\",\r\n" + 
				"				\"corp_name\": \"에스에스씨피\",\r\n" + 
				"				\"stock_code\": \"071660\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220181\",\r\n" + 
				"				\"corp_name\": \"평산\",\r\n" + 
				"				\"stock_code\": \"089480\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00254009\",\r\n" + 
				"				\"corp_name\": \"지디코프\",\r\n" + 
				"				\"stock_code\": \"036610\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00505541\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽2호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"081190\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00240398\",\r\n" + 
				"				\"corp_name\": \"무한투자\",\r\n" + 
				"				\"stock_code\": \"034510\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00828309\",\r\n" + 
				"				\"corp_name\": \"동부티에스블랙펄기업인수목적\",\r\n" + 
				"				\"stock_code\": \"128910\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00349468\",\r\n" + 
				"				\"corp_name\": \"블루젬디앤씨\",\r\n" + 
				"				\"stock_code\": \"053040\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00808262\",\r\n" + 
				"				\"corp_name\": \"부국퓨쳐스타즈기업인수목적\",\r\n" + 
				"				\"stock_code\": \"123300\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00252393\",\r\n" + 
				"				\"corp_name\": \"예당컴퍼니\",\r\n" + 
				"				\"stock_code\": \"049000\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00229818\",\r\n" + 
				"				\"corp_name\": \"터보테크\",\r\n" + 
				"				\"stock_code\": \"032420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154189\",\r\n" + 
				"				\"corp_name\": \"케이비물산\",\r\n" + 
				"				\"stock_code\": \"008540\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00680161\",\r\n" + 
				"				\"corp_name\": \"연합과기공고유한공사\",\r\n" + 
				"				\"stock_code\": \"900030\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102645\",\r\n" + 
				"				\"corp_name\": \"글로스텍\",\r\n" + 
				"				\"stock_code\": \"012410\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00844884\",\r\n" + 
				"				\"corp_name\": \"중국고섬공고유한공사\",\r\n" + 
				"				\"stock_code\": \"950070\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00592592\",\r\n" + 
				"				\"corp_name\": \"코리아퍼시픽06호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"093410\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268437\",\r\n" + 
				"				\"corp_name\": \"나노트로닉스\",\r\n" + 
				"				\"stock_code\": \"010670\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00798284\",\r\n" + 
				"				\"corp_name\": \"미래에셋제1호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"121950\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164195\",\r\n" + 
				"				\"corp_name\": \"에이원마이크로\",\r\n" + 
				"				\"stock_code\": \"037380\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264811\",\r\n" + 
				"				\"corp_name\": \"에이프로테크놀로지\",\r\n" + 
				"				\"stock_code\": \"045470\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00208301\",\r\n" + 
				"				\"corp_name\": \"성우몰드\",\r\n" + 
				"				\"stock_code\": \"053440\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00676380\",\r\n" + 
				"				\"corp_name\": \"모린스\",\r\n" + 
				"				\"stock_code\": \"110310\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00543231\",\r\n" + 
				"				\"corp_name\": \"디지텍시스템스\",\r\n" + 
				"				\"stock_code\": \"091690\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103121\",\r\n" + 
				"				\"corp_name\": \"세븐코스프\",\r\n" + 
				"				\"stock_code\": \"017160\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122436\",\r\n" + 
				"				\"corp_name\": \"배명금속\",\r\n" + 
				"				\"stock_code\": \"011800\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00505189\",\r\n" + 
				"				\"corp_name\": \"동북아4호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"080970\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00271413\",\r\n" + 
				"				\"corp_name\": \"사라콤\",\r\n" + 
				"				\"stock_code\": \"040020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00245296\",\r\n" + 
				"				\"corp_name\": \"폴리플러스\",\r\n" + 
				"				\"stock_code\": \"065610\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00188122\",\r\n" + 
				"				\"corp_name\": \"하나물산\",\r\n" + 
				"				\"stock_code\": \"036280\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00480905\",\r\n" + 
				"				\"corp_name\": \"영찬테크\",\r\n" + 
				"				\"stock_code\": \"085990\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00890333\",\r\n" + 
				"				\"corp_name\": \"케이비부국제1호개발전문위탁관리부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"149130\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00510534\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽8호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"081930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150855\",\r\n" + 
				"				\"corp_name\": \"진흥저축은행\",\r\n" + 
				"				\"stock_code\": \"007200\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173634\",\r\n" + 
				"				\"corp_name\": \"에듀언스\",\r\n" + 
				"				\"stock_code\": \"009010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00830377\",\r\n" + 
				"				\"corp_name\": \"성융광전투자유한공사\",\r\n" + 
				"				\"stock_code\": \"900150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00224567\",\r\n" + 
				"				\"corp_name\": \"샤인시스템\",\r\n" + 
				"				\"stock_code\": \"066300\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00582054\",\r\n" + 
				"				\"corp_name\": \"씨모텍\",\r\n" + 
				"				\"stock_code\": \"081090\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125929\",\r\n" + 
				"				\"corp_name\": \"에스컴\",\r\n" + 
				"				\"stock_code\": \"014900\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00502793\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽1호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"080180\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00505550\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽3호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"081200\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104704\",\r\n" + 
				"				\"corp_name\": \"한국저축은행\",\r\n" + 
				"				\"stock_code\": \"025610\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361035\",\r\n" + 
				"				\"corp_name\": \"미리넷\",\r\n" + 
				"				\"stock_code\": \"056710\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00630111\",\r\n" + 
				"				\"corp_name\": \"3노드디지탈그룹유한공사\",\r\n" + 
				"				\"stock_code\": \"900010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264802\",\r\n" + 
				"				\"corp_name\": \"유일엔시스\",\r\n" + 
				"				\"stock_code\": \"038720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00399773\",\r\n" + 
				"				\"corp_name\": \"케이피케미칼\",\r\n" + 
				"				\"stock_code\": \"064420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00257529\",\r\n" + 
				"				\"corp_name\": \"이루넷\",\r\n" + 
				"				\"stock_code\": \"041030\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00804114\",\r\n" + 
				"				\"corp_name\": \"대신증권그로쓰알파기업인수목적\",\r\n" + 
				"				\"stock_code\": \"123550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00416706\",\r\n" + 
				"				\"corp_name\": \"유에이블\",\r\n" + 
				"				\"stock_code\": \"071530\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121251\",\r\n" + 
				"				\"corp_name\": \"네오퍼플\",\r\n" + 
				"				\"stock_code\": \"028090\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173324\",\r\n" + 
				"				\"corp_name\": \"경윤하이드로에너지\",\r\n" + 
				"				\"stock_code\": \"019120\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121729\",\r\n" + 
				"				\"corp_name\": \"롯데미도파\",\r\n" + 
				"				\"stock_code\": \"004010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00808226\",\r\n" + 
				"				\"corp_name\": \"한화에스브이명장제1호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"124050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162577\",\r\n" + 
				"				\"corp_name\": \"셀텍\",\r\n" + 
				"				\"stock_code\": \"019260\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00812229\",\r\n" + 
				"				\"corp_name\": \"에스비아이앤솔로몬드림기업인수목적\",\r\n" + 
				"				\"stock_code\": \"123910\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351153\",\r\n" + 
				"				\"corp_name\": \"위다스\",\r\n" + 
				"				\"stock_code\": \"056810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126885\",\r\n" + 
				"				\"corp_name\": \"에스와이코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"008080\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264741\",\r\n" + 
				"				\"corp_name\": \"어울림네트웍스\",\r\n" + 
				"				\"stock_code\": \"042820\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00266989\",\r\n" + 
				"				\"corp_name\": \"에이디모터스\",\r\n" + 
				"				\"stock_code\": \"038120\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260693\",\r\n" + 
				"				\"corp_name\": \"평안물산\",\r\n" + 
				"				\"stock_code\": \"037240\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267951\",\r\n" + 
				"				\"corp_name\": \"아큐텍\",\r\n" + 
				"				\"stock_code\": \"013780\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132114\",\r\n" + 
				"				\"corp_name\": \"선진지주\",\r\n" + 
				"				\"stock_code\": \"014300\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00804983\",\r\n" + 
				"				\"corp_name\": \"히든챔피언제1호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"123160\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00502474\",\r\n" + 
				"				\"corp_name\": \"동북아2호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"080030\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00579379\",\r\n" + 
				"				\"corp_name\": \"금강제강\",\r\n" + 
				"				\"stock_code\": \"105070\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264857\",\r\n" + 
				"				\"corp_name\": \"아라온테크\",\r\n" + 
				"				\"stock_code\": \"041060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00375302\",\r\n" + 
				"				\"corp_name\": \"우리금융지주\",\r\n" + 
				"				\"stock_code\": \"053000\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00252658\",\r\n" + 
				"				\"corp_name\": \"코리언일랙트로닉스파워소스\",\r\n" + 
				"				\"stock_code\": \"046810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264848\",\r\n" + 
				"				\"corp_name\": \"대국\",\r\n" + 
				"				\"stock_code\": \"042340\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138376\",\r\n" + 
				"				\"corp_name\": \"쎄라텍\",\r\n" + 
				"				\"stock_code\": \"041550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00251190\",\r\n" + 
				"				\"corp_name\": \"글로웍스\",\r\n" + 
				"				\"stock_code\": \"034600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00694003\",\r\n" + 
				"				\"corp_name\": \"중국식품포장유한공사\",\r\n" + 
				"				\"stock_code\": \"900060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00505170\",\r\n" + 
				"				\"corp_name\": \"동북아3호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"080960\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259439\",\r\n" + 
				"				\"corp_name\": \"지아이바이오\",\r\n" + 
				"				\"stock_code\": \"035450\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00207436\",\r\n" + 
				"				\"corp_name\": \"알에스넷\",\r\n" + 
				"				\"stock_code\": \"046430\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00408585\",\r\n" + 
				"				\"corp_name\": \"나이스메탈\",\r\n" + 
				"				\"stock_code\": \"072530\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111829\",\r\n" + 
				"				\"corp_name\": \"대웅바이오\",\r\n" + 
				"				\"stock_code\": \"016890\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00956028\",\r\n" + 
				"				\"corp_name\": \"엑세스바이오\",\r\n" + 
				"				\"stock_code\": \"950130\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115038\",\r\n" + 
				"				\"corp_name\": \"하나IB증권\",\r\n" + 
				"				\"stock_code\": \"003330\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00288653\",\r\n" + 
				"				\"corp_name\": \"퓨쳐비젼\",\r\n" + 
				"				\"stock_code\": \"042570\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00303837\",\r\n" + 
				"				\"corp_name\": \"이레전자산업\",\r\n" + 
				"				\"stock_code\": \"045310\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00330017\",\r\n" + 
				"				\"corp_name\": \"레이더스컴퍼니\",\r\n" + 
				"				\"stock_code\": \"047420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264769\",\r\n" + 
				"				\"corp_name\": \"포이보스\",\r\n" + 
				"				\"stock_code\": \"038810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00308948\",\r\n" + 
				"				\"corp_name\": \"미디어코프\",\r\n" + 
				"				\"stock_code\": \"053890\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00321222\",\r\n" + 
				"				\"corp_name\": \"케이디세코\",\r\n" + 
				"				\"stock_code\": \"073780\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361202\",\r\n" + 
				"				\"corp_name\": \"이노블루\",\r\n" + 
				"				\"stock_code\": \"066200\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00450728\",\r\n" + 
				"				\"corp_name\": \"도움\",\r\n" + 
				"				\"stock_code\": \"078610\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00535773\",\r\n" + 
				"				\"corp_name\": \"엑스씨이\",\r\n" + 
				"				\"stock_code\": \"081500\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152950\",\r\n" + 
				"				\"corp_name\": \"코오롱유화\",\r\n" + 
				"				\"stock_code\": \"011020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00296069\",\r\n" + 
				"				\"corp_name\": \"세라온홀딩스\",\r\n" + 
				"				\"stock_code\": \"050600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00521956\",\r\n" + 
				"				\"corp_name\": \"현대경매부동산일호투자회사\",\r\n" + 
				"				\"stock_code\": \"083160\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00360540\",\r\n" + 
				"				\"corp_name\": \"우수씨엔에스\",\r\n" + 
				"				\"stock_code\": \"060550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00593519\",\r\n" + 
				"				\"corp_name\": \"동북아31호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"093730\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00194372\",\r\n" + 
				"				\"corp_name\": \"후야인포넷\",\r\n" + 
				"				\"stock_code\": \"032050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154693\",\r\n" + 
				"				\"corp_name\": \"이레아이엔씨\",\r\n" + 
				"				\"stock_code\": \"036900\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106650\",\r\n" + 
				"				\"corp_name\": \"카스코\",\r\n" + 
				"				\"stock_code\": \"005330\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00368791\",\r\n" + 
				"				\"corp_name\": \"모델라인\",\r\n" + 
				"				\"stock_code\": \"064720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220552\",\r\n" + 
				"				\"corp_name\": \"청람디지탈\",\r\n" + 
				"				\"stock_code\": \"035270\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00301626\",\r\n" + 
				"				\"corp_name\": \"플래닛팔이\",\r\n" + 
				"				\"stock_code\": \"057330\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00294371\",\r\n" + 
				"				\"corp_name\": \"한텔\",\r\n" + 
				"				\"stock_code\": \"041940\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00353683\",\r\n" + 
				"				\"corp_name\": \"코스모스피엘씨\",\r\n" + 
				"				\"stock_code\": \"053170\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00252375\",\r\n" + 
				"				\"corp_name\": \"나노하이텍\",\r\n" + 
				"				\"stock_code\": \"071360\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260903\",\r\n" + 
				"				\"corp_name\": \"쓰리소프트\",\r\n" + 
				"				\"stock_code\": \"036360\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261461\",\r\n" + 
				"				\"corp_name\": \"트라이콤\",\r\n" + 
				"				\"stock_code\": \"038410\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265218\",\r\n" + 
				"				\"corp_name\": \"케이엔에스홀딩스\",\r\n" + 
				"				\"stock_code\": \"036760\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00471989\",\r\n" + 
				"				\"corp_name\": \"지비에스\",\r\n" + 
				"				\"stock_code\": \"076170\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00306986\",\r\n" + 
				"				\"corp_name\": \"피더블유제네틱스\",\r\n" + 
				"				\"stock_code\": \"065910\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00356644\",\r\n" + 
				"				\"corp_name\": \"엠텍반도체\",\r\n" + 
				"				\"stock_code\": \"054440\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00305695\",\r\n" + 
				"				\"corp_name\": \"세니콘\",\r\n" + 
				"				\"stock_code\": \"056060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151252\",\r\n" + 
				"				\"corp_name\": \"에스와이\",\r\n" + 
				"				\"stock_code\": \"004530\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00257051\",\r\n" + 
				"				\"corp_name\": \"유씨아이콜스\",\r\n" + 
				"				\"stock_code\": \"065810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00459589\",\r\n" + 
				"				\"corp_name\": \"코크렙제3호CR리츠\",\r\n" + 
				"				\"stock_code\": \"073530\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264839\",\r\n" + 
				"				\"corp_name\": \"아이비진\",\r\n" + 
				"				\"stock_code\": \"039060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00366164\",\r\n" + 
				"				\"corp_name\": \"아이티센네트웍스\",\r\n" + 
				"				\"stock_code\": \"057110\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00436728\",\r\n" + 
				"				\"corp_name\": \"리얼티코리아제1호기업구조조정부동산투자\",\r\n" + 
				"				\"stock_code\": \"072450\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136235\",\r\n" + 
				"				\"corp_name\": \"BHK\",\r\n" + 
				"				\"stock_code\": \"003990\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00328854\",\r\n" + 
				"				\"corp_name\": \"포넷\",\r\n" + 
				"				\"stock_code\": \"048270\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120960\",\r\n" + 
				"				\"corp_name\": \"맥슨텔레콤\",\r\n" + 
				"				\"stock_code\": \"009890\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220446\",\r\n" + 
				"				\"corp_name\": \"예일바이오텍\",\r\n" + 
				"				\"stock_code\": \"054250\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00119733\",\r\n" + 
				"				\"corp_name\": \"엔토리노\",\r\n" + 
				"				\"stock_code\": \"032590\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00119423\",\r\n" + 
				"				\"corp_name\": \"두림티앤씨\",\r\n" + 
				"				\"stock_code\": \"033330\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00557067\",\r\n" + 
				"				\"corp_name\": \"동북아27호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"089170\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00557058\",\r\n" + 
				"				\"corp_name\": \"동북아28호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"089180\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00557030\",\r\n" + 
				"				\"corp_name\": \"동북아30호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"089200\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00557049\",\r\n" + 
				"				\"corp_name\": \"동북아29호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"089190\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244330\",\r\n" + 
				"				\"corp_name\": \"현주컴퓨터\",\r\n" + 
				"				\"stock_code\": \"038960\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120100\",\r\n" + 
				"				\"corp_name\": \"LG석유화학\",\r\n" + 
				"				\"stock_code\": \"012990\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00246657\",\r\n" + 
				"				\"corp_name\": \"오브제\",\r\n" + 
				"				\"stock_code\": \"058680\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130037\",\r\n" + 
				"				\"corp_name\": \"휴닉스\",\r\n" + 
				"				\"stock_code\": \"009790\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00405074\",\r\n" + 
				"				\"corp_name\": \"세이프아시아\",\r\n" + 
				"				\"stock_code\": \"066330\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00398534\",\r\n" + 
				"				\"corp_name\": \"코크렙제1호기업구조조정부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"067910\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00234449\",\r\n" + 
				"				\"corp_name\": \"제이엠피\",\r\n" + 
				"				\"stock_code\": \"054790\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165200\",\r\n" + 
				"				\"corp_name\": \"위너스인프라인\",\r\n" + 
				"				\"stock_code\": \"005760\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150183\",\r\n" + 
				"				\"corp_name\": \"AP우주통신\",\r\n" + 
				"				\"stock_code\": \"015670\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268482\",\r\n" + 
				"				\"corp_name\": \"조이토토\",\r\n" + 
				"				\"stock_code\": \"044370\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00363033\",\r\n" + 
				"				\"corp_name\": \"한도하이테크\",\r\n" + 
				"				\"stock_code\": \"060660\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364227\",\r\n" + 
				"				\"corp_name\": \"에너윈\",\r\n" + 
				"				\"stock_code\": \"055970\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00458915\",\r\n" + 
				"				\"corp_name\": \"유레스메리츠제1호\",\r\n" + 
				"				\"stock_code\": \"073470\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00386876\",\r\n" + 
				"				\"corp_name\": \"교보메리츠퍼스트기업구조조정부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"064900\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163044\",\r\n" + 
				"				\"corp_name\": \"한일약품공업\",\r\n" + 
				"				\"stock_code\": \"003040\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00543073\",\r\n" + 
				"				\"corp_name\": \"굿앤리치부동산공경매투자회사1호\",\r\n" + 
				"				\"stock_code\": \"085450\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160445\",\r\n" + 
				"				\"corp_name\": \"한국합섬\",\r\n" + 
				"				\"stock_code\": \"025830\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00554468\",\r\n" + 
				"				\"corp_name\": \"굿앤리치부동산공경매투자회사2호\",\r\n" + 
				"				\"stock_code\": \"088510\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165565\",\r\n" + 
				"				\"corp_name\": \"디에스피이엔티\",\r\n" + 
				"				\"stock_code\": \"016040\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00300256\",\r\n" + 
				"				\"corp_name\": \"시큐어소프트\",\r\n" + 
				"				\"stock_code\": \"037060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138491\",\r\n" + 
				"				\"corp_name\": \"동부일렉트로닉스\",\r\n" + 
				"				\"stock_code\": \"001830\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102821\",\r\n" + 
				"				\"corp_name\": \"고려시멘트\",\r\n" + 
				"				\"stock_code\": \"003660\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00377814\",\r\n" + 
				"				\"corp_name\": \"베스트플로우\",\r\n" + 
				"				\"stock_code\": \"060410\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364670\",\r\n" + 
				"				\"corp_name\": \"쿨투\",\r\n" + 
				"				\"stock_code\": \"056020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00143013\",\r\n" + 
				"				\"corp_name\": \"우영\",\r\n" + 
				"				\"stock_code\": \"012460\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00263991\",\r\n" + 
				"				\"corp_name\": \"모빌링크텔레콤\",\r\n" + 
				"				\"stock_code\": \"041310\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105183\",\r\n" + 
				"				\"corp_name\": \"극동제혁\",\r\n" + 
				"				\"stock_code\": \"010200\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173254\",\r\n" + 
				"				\"corp_name\": \"한마음상호저축은행\",\r\n" + 
				"				\"stock_code\": \"025450\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101637\",\r\n" + 
				"				\"corp_name\": \"그로웰전자\",\r\n" + 
				"				\"stock_code\": \"009220\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124513\",\r\n" + 
				"				\"corp_name\": \"부흥\",\r\n" + 
				"				\"stock_code\": \"003930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139418\",\r\n" + 
				"				\"corp_name\": \"알루코\",\r\n" + 
				"				\"stock_code\": \"021570\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154417\",\r\n" + 
				"				\"corp_name\": \"퍼시픽글라스\",\r\n" + 
				"				\"stock_code\": \"009080\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00119362\",\r\n" + 
				"				\"corp_name\": \"아이인프라\",\r\n" + 
				"				\"stock_code\": \"008780\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140353\",\r\n" + 
				"				\"corp_name\": \"씨크롭\",\r\n" + 
				"				\"stock_code\": \"016970\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00170451\",\r\n" + 
				"				\"corp_name\": \"외환신용카드\",\r\n" + 
				"				\"stock_code\": \"038400\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267793\",\r\n" + 
				"				\"corp_name\": \"삼화기연\",\r\n" + 
				"				\"stock_code\": \"033210\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260639\",\r\n" + 
				"				\"corp_name\": \"대흥멀티미디어통신\",\r\n" + 
				"				\"stock_code\": \"037250\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153852\",\r\n" + 
				"				\"corp_name\": \"텔슨정보통신\",\r\n" + 
				"				\"stock_code\": \"018180\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00248956\",\r\n" + 
				"				\"corp_name\": \"비이티\",\r\n" + 
				"				\"stock_code\": \"036820\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00390028\",\r\n" + 
				"				\"corp_name\": \"코오롱인터내셔널\",\r\n" + 
				"				\"stock_code\": \"063510\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260888\",\r\n" + 
				"				\"corp_name\": \"엔써커뮤니티\",\r\n" + 
				"				\"stock_code\": \"037750\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00275710\",\r\n" + 
				"				\"corp_name\": \"써미트테크놀로지\",\r\n" + 
				"				\"stock_code\": \"039000\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00172103\",\r\n" + 
				"				\"corp_name\": \"코리아이앤디\",\r\n" + 
				"				\"stock_code\": \"027440\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00263955\",\r\n" + 
				"				\"corp_name\": \"트래픽아이티에스\",\r\n" + 
				"				\"stock_code\": \"038050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261601\",\r\n" + 
				"				\"corp_name\": \"호성\",\r\n" + 
				"				\"stock_code\": \"035870\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265254\",\r\n" + 
				"				\"corp_name\": \"넥스텔\",\r\n" + 
				"				\"stock_code\": \"037220\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255266\",\r\n" + 
				"				\"corp_name\": \"쓰리알\",\r\n" + 
				"				\"stock_code\": \"037730\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259916\",\r\n" + 
				"				\"corp_name\": \"그로웰텔레콤\",\r\n" + 
				"				\"stock_code\": \"035780\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131434\",\r\n" + 
				"				\"corp_name\": \"서통\",\r\n" + 
				"				\"stock_code\": \"001150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00271352\",\r\n" + 
				"				\"corp_name\": \"테크메이트\",\r\n" + 
				"				\"stock_code\": \"043690\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244932\",\r\n" + 
				"				\"corp_name\": \"한아시스템\",\r\n" + 
				"				\"stock_code\": \"036020\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00348052\",\r\n" + 
				"				\"corp_name\": \"엔에스아이\",\r\n" + 
				"				\"stock_code\": \"053250\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367598\",\r\n" + 
				"				\"corp_name\": \"케이티씨텔레콤\",\r\n" + 
				"				\"stock_code\": \"055810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267720\",\r\n" + 
				"				\"corp_name\": \"신한SIT\",\r\n" + 
				"				\"stock_code\": \"054530\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00147949\",\r\n" + 
				"				\"corp_name\": \"스마텔\",\r\n" + 
				"				\"stock_code\": \"004190\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00203458\",\r\n" + 
				"				\"corp_name\": \"동방라이텍\",\r\n" + 
				"				\"stock_code\": \"025690\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130000\",\r\n" + 
				"				\"corp_name\": \"아이텍스필\",\r\n" + 
				"				\"stock_code\": \"008030\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145534\",\r\n" + 
				"				\"corp_name\": \"이수세라믹\",\r\n" + 
				"				\"stock_code\": \"032180\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00425360\",\r\n" + 
				"				\"corp_name\": \"코크렙제2호기업구조조정부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"070540\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141334\",\r\n" + 
				"				\"corp_name\": \"영풍산업\",\r\n" + 
				"				\"stock_code\": \"002850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00384452\",\r\n" + 
				"				\"corp_name\": \"모닷텔\",\r\n" + 
				"				\"stock_code\": \"048150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103583\",\r\n" + 
				"				\"corp_name\": \"광덕물산\",\r\n" + 
				"				\"stock_code\": \"003590\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162142\",\r\n" + 
				"				\"corp_name\": \"동원증권\",\r\n" + 
				"				\"stock_code\": \"005890\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00236021\",\r\n" + 
				"				\"corp_name\": \"우주통신\",\r\n" + 
				"				\"stock_code\": \"054080\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106483\",\r\n" + 
				"				\"corp_name\": \"기라정보통신\",\r\n" + 
				"				\"stock_code\": \"019930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00208374\",\r\n" + 
				"				\"corp_name\": \"텔슨전자\",\r\n" + 
				"				\"stock_code\": \"027350\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00309983\",\r\n" + 
				"				\"corp_name\": \"하이콤정보통신\",\r\n" + 
				"				\"stock_code\": \"048540\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00277727\",\r\n" + 
				"				\"corp_name\": \"미래에셋굿라이프혼합형자녀를위한펀드5-1\",\r\n" + 
				"				\"stock_code\": \"037500\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136217\",\r\n" + 
				"				\"corp_name\": \"한메엔에스\",\r\n" + 
				"				\"stock_code\": \"006150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00229827\",\r\n" + 
				"				\"corp_name\": \"이지클럽\",\r\n" + 
				"				\"stock_code\": \"038980\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00247902\",\r\n" + 
				"				\"corp_name\": \"넷컴스토리지\",\r\n" + 
				"				\"stock_code\": \"037010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00318477\",\r\n" + 
				"				\"corp_name\": \"모디아\",\r\n" + 
				"				\"stock_code\": \"046000\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00246815\",\r\n" + 
				"				\"corp_name\": \"성진산업\",\r\n" + 
				"				\"stock_code\": \"037650\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260921\",\r\n" + 
				"				\"corp_name\": \"아이엠아이티\",\r\n" + 
				"				\"stock_code\": \"038100\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00247762\",\r\n" + 
				"				\"corp_name\": \"맥시스템\",\r\n" + 
				"				\"stock_code\": \"036880\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350224\",\r\n" + 
				"				\"corp_name\": \"슈마일렉트론\",\r\n" + 
				"				\"stock_code\": \"056500\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101992\",\r\n" + 
				"				\"corp_name\": \"센추리\",\r\n" + 
				"				\"stock_code\": \"006750\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151614\",\r\n" + 
				"				\"corp_name\": \"베네데스하이텍\",\r\n" + 
				"				\"stock_code\": \"009360\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00179832\",\r\n" + 
				"				\"corp_name\": \"에스오케이\",\r\n" + 
				"				\"stock_code\": \"032610\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00241120\",\r\n" + 
				"				\"corp_name\": \"세원텔레콤\",\r\n" + 
				"				\"stock_code\": \"036910\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00277985\",\r\n" + 
				"				\"corp_name\": \"한강구조조정기금\",\r\n" + 
				"				\"stock_code\": \"036060\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00325918\",\r\n" + 
				"				\"corp_name\": \"케이엔티\",\r\n" + 
				"				\"stock_code\": \"036590\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110981\",\r\n" + 
				"				\"corp_name\": \"대아리드선\",\r\n" + 
				"				\"stock_code\": \"009940\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116499\",\r\n" + 
				"				\"corp_name\": \"동신제약\",\r\n" + 
				"				\"stock_code\": \"006600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104467\",\r\n" + 
				"				\"corp_name\": \"국민은행\",\r\n" + 
				"				\"stock_code\": \"031150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00257361\",\r\n" + 
				"				\"corp_name\": \"월드텔레콤\",\r\n" + 
				"				\"stock_code\": \"047610\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00358730\",\r\n" + 
				"				\"corp_name\": \"업필\",\r\n" + 
				"				\"stock_code\": \"054370\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00248406\",\r\n" + 
				"				\"corp_name\": \"화림모드\",\r\n" + 
				"				\"stock_code\": \"045920\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00348788\",\r\n" + 
				"				\"corp_name\": \"디이시스\",\r\n" + 
				"				\"stock_code\": \"053200\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110963\",\r\n" + 
				"				\"corp_name\": \"대아건설\",\r\n" + 
				"				\"stock_code\": \"000380\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149840\",\r\n" + 
				"				\"corp_name\": \"중앙제지\",\r\n" + 
				"				\"stock_code\": \"005600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267021\",\r\n" + 
				"				\"corp_name\": \"창민테크\",\r\n" + 
				"				\"stock_code\": \"042960\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00330406\",\r\n" + 
				"				\"corp_name\": \"씨제이엔터테인먼트\",\r\n" + 
				"				\"stock_code\": \"049370\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110079\",\r\n" + 
				"				\"corp_name\": \"대백쇼핑\",\r\n" + 
				"				\"stock_code\": \"027700\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141440\",\r\n" + 
				"				\"corp_name\": \"지니웍스\",\r\n" + 
				"				\"stock_code\": \"036600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135670\",\r\n" + 
				"				\"corp_name\": \"신광기업\",\r\n" + 
				"				\"stock_code\": \"001580\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144933\",\r\n" + 
				"				\"corp_name\": \"유진종합개발\",\r\n" + 
				"				\"stock_code\": \"023420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00371139\",\r\n" + 
				"				\"corp_name\": \"휘튼\",\r\n" + 
				"				\"stock_code\": \"066480\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00218654\",\r\n" + 
				"				\"corp_name\": \"엠바이엔\",\r\n" + 
				"				\"stock_code\": \"031970\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115852\",\r\n" + 
				"				\"corp_name\": \"두산건설\",\r\n" + 
				"				\"stock_code\": \"002950\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113696\",\r\n" + 
				"				\"corp_name\": \"대호\",\r\n" + 
				"				\"stock_code\": \"001980\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00253514\",\r\n" + 
				"				\"corp_name\": \"한신코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"037120\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105509\",\r\n" + 
				"				\"corp_name\": \"금강화섬\",\r\n" + 
				"				\"stock_code\": \"010730\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163178\",\r\n" + 
				"				\"corp_name\": \"우리증권\",\r\n" + 
				"				\"stock_code\": \"001280\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264185\",\r\n" + 
				"				\"corp_name\": \"피코소프트\",\r\n" + 
				"				\"stock_code\": \"039580\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265157\",\r\n" + 
				"				\"corp_name\": \"바이오시스\",\r\n" + 
				"				\"stock_code\": \"035960\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00270405\",\r\n" + 
				"				\"corp_name\": \"윌텍정보통신\",\r\n" + 
				"				\"stock_code\": \"039390\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125406\",\r\n" + 
				"				\"corp_name\": \"삼도물산\",\r\n" + 
				"				\"stock_code\": \"002930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00258731\",\r\n" + 
				"				\"corp_name\": \"현대멀티캡\",\r\n" + 
				"				\"stock_code\": \"035910\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00822572\",\r\n" + 
				"				\"corp_name\": \"씨아이에스\",\r\n" + 
				"				\"stock_code\": \"144630\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00423609\",\r\n" + 
				"				\"corp_name\": \"LG생명과학\",\r\n" + 
				"				\"stock_code\": \"068870\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580603\",\r\n" + 
				"				\"corp_name\": \"코리아퍼시픽01호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"090970\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580612\",\r\n" + 
				"				\"corp_name\": \"코리아퍼시픽02호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"090980\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00317830\",\r\n" + 
				"				\"corp_name\": \"신양오라컴디스플레이\",\r\n" + 
				"				\"stock_code\": \"086830\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00311030\",\r\n" + 
				"				\"corp_name\": \"미래에셋증권\",\r\n" + 
				"				\"stock_code\": \"037620\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00439053\",\r\n" + 
				"				\"corp_name\": \"이룸지엔지\",\r\n" + 
				"				\"stock_code\": \"050640\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00992312\",\r\n" + 
				"				\"corp_name\": \"에스와이이노베이션\",\r\n" + 
				"				\"stock_code\": \"194860\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580621\",\r\n" + 
				"				\"corp_name\": \"코리아퍼시픽03호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"090990\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580630\",\r\n" + 
				"				\"corp_name\": \"코리아퍼시픽04호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"091000\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00262123\",\r\n" + 
				"				\"corp_name\": \"유아이에너지\",\r\n" + 
				"				\"stock_code\": \"050050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533696\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽14호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083610\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140362\",\r\n" + 
				"				\"corp_name\": \"제이에스전선\",\r\n" + 
				"				\"stock_code\": \"005560\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533757\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽13호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533580\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽10호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083570\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01041217\",\r\n" + 
				"				\"corp_name\": \"현대에이블기업인수목적1호\",\r\n" + 
				"				\"stock_code\": \"204760\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533793\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽11호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083580\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533836\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽12호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083590\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144766\",\r\n" + 
				"				\"corp_name\": \"호반산업\",\r\n" + 
				"				\"stock_code\": \"004320\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00525527\",\r\n" + 
				"				\"corp_name\": \"실리콘화일\",\r\n" + 
				"				\"stock_code\": \"082930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00372989\",\r\n" + 
				"				\"corp_name\": \"비엔씨컴퍼니\",\r\n" + 
				"				\"stock_code\": \"058370\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00529523\",\r\n" + 
				"				\"corp_name\": \"동북아11호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083360\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526474\",\r\n" + 
				"				\"corp_name\": \"동북아14호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083390\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00302801\",\r\n" + 
				"				\"corp_name\": \"디아이디\",\r\n" + 
				"				\"stock_code\": \"074130\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124018\",\r\n" + 
				"				\"corp_name\": \"부산방직공업\",\r\n" + 
				"				\"stock_code\": \"025270\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255071\",\r\n" + 
				"				\"corp_name\": \"현대에이치씨엔동작방송\",\r\n" + 
				"				\"stock_code\": \"034750\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364926\",\r\n" + 
				"				\"corp_name\": \"플렉스컴\",\r\n" + 
				"				\"stock_code\": \"065270\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350491\",\r\n" + 
				"				\"corp_name\": \"웹솔루스\",\r\n" + 
				"				\"stock_code\": \"160350\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00450214\",\r\n" + 
				"				\"corp_name\": \"마이스코\",\r\n" + 
				"				\"stock_code\": \"088700\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01022054\",\r\n" + 
				"				\"corp_name\": \"솔트웍스\",\r\n" + 
				"				\"stock_code\": \"222520\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164955\",\r\n" + 
				"				\"corp_name\": \"현대페인트\",\r\n" + 
				"				\"stock_code\": \"011720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00790501\",\r\n" + 
				"				\"corp_name\": \"한진해운\",\r\n" + 
				"				\"stock_code\": \"117930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00272412\",\r\n" + 
				"				\"corp_name\": \"글라소울\",\r\n" + 
				"				\"stock_code\": \"045050\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00207542\",\r\n" + 
				"				\"corp_name\": \"팬택자산관리\",\r\n" + 
				"				\"stock_code\": \"025930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00394778\",\r\n" + 
				"				\"corp_name\": \"케이엔씨글로벌\",\r\n" + 
				"				\"stock_code\": \"068150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00446460\",\r\n" + 
				"				\"corp_name\": \"아이디에스\",\r\n" + 
				"				\"stock_code\": \"078780\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00188946\",\r\n" + 
				"				\"corp_name\": \"훈영\",\r\n" + 
				"				\"stock_code\": \"017170\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137702\",\r\n" + 
				"				\"corp_name\": \"한솔아트원제지\",\r\n" + 
				"				\"stock_code\": \"007190\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00418476\",\r\n" + 
				"				\"corp_name\": \"엠제이비\",\r\n" + 
				"				\"stock_code\": \"074150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00587101\",\r\n" + 
				"				\"corp_name\": \"바다로3호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"092630\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351047\",\r\n" + 
				"				\"corp_name\": \"아이팩토리\",\r\n" + 
				"				\"stock_code\": \"053810\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00778040\",\r\n" + 
				"				\"corp_name\": \"거북선5호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"114130\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00778059\",\r\n" + 
				"				\"corp_name\": \"거북선6호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"114140\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126229\",\r\n" + 
				"				\"corp_name\": \"삼성물산\",\r\n" + 
				"				\"stock_code\": \"000830\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00496003\",\r\n" + 
				"				\"corp_name\": \"피엘에이\",\r\n" + 
				"				\"stock_code\": \"082390\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359030\",\r\n" + 
				"				\"corp_name\": \"닉스테크\",\r\n" + 
				"				\"stock_code\": \"063840\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00510914\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽9호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"081940\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00697329\",\r\n" + 
				"				\"corp_name\": \"거북선4호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"108890\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149664\",\r\n" + 
				"				\"corp_name\": \"중앙건설\",\r\n" + 
				"				\"stock_code\": \"015110\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00318839\",\r\n" + 
				"				\"corp_name\": \"미래에셋새천년코리아벤처펀드일호\",\r\n" + 
				"				\"stock_code\": \"042950\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130897\",\r\n" + 
				"				\"corp_name\": \"하나은행\",\r\n" + 
				"				\"stock_code\": \"002860\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00183260\",\r\n" + 
				"				\"corp_name\": \"에이스하이텍\",\r\n" + 
				"				\"stock_code\": \"071930\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00246347\",\r\n" + 
				"				\"corp_name\": \"태창파로스\",\r\n" + 
				"				\"stock_code\": \"039850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00599230\",\r\n" + 
				"				\"corp_name\": \"평산차업집단유한공사\",\r\n" + 
				"				\"stock_code\": \"950010\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00970277\",\r\n" + 
				"				\"corp_name\": \"스탠다드펌\",\r\n" + 
				"				\"stock_code\": \"179280\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122922\",\r\n" + 
				"				\"corp_name\": \"벽산건설\",\r\n" + 
				"				\"stock_code\": \"002530\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116860\",\r\n" + 
				"				\"corp_name\": \"NH농협증권\",\r\n" + 
				"				\"stock_code\": \"016420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00505569\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽4호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"081210\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160612\",\r\n" + 
				"				\"corp_name\": \"한화화인케미칼\",\r\n" + 
				"				\"stock_code\": \"025850\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00659435\",\r\n" + 
				"				\"corp_name\": \"정다운\",\r\n" + 
				"				\"stock_code\": \"224090\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00232317\",\r\n" + 
				"				\"corp_name\": \"지오엠씨\",\r\n" + 
				"				\"stock_code\": \"033030\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130860\",\r\n" + 
				"				\"corp_name\": \"에듀패스\",\r\n" + 
				"				\"stock_code\": \"031950\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113632\",\r\n" + 
				"				\"corp_name\": \"아이디에이치\",\r\n" + 
				"				\"stock_code\": \"026230\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00837680\",\r\n" + 
				"				\"corp_name\": \"거북선7호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"134000\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130815\",\r\n" + 
				"				\"corp_name\": \"서울상호저축은행\",\r\n" + 
				"				\"stock_code\": \"016560\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00248123\",\r\n" + 
				"				\"corp_name\": \"와이즈파워\",\r\n" + 
				"				\"stock_code\": \"040670\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00788807\",\r\n" + 
				"				\"corp_name\": \"코크렙제15호기업구조조정부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"121550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00270432\",\r\n" + 
				"				\"corp_name\": \"티브로드한빛방송\",\r\n" + 
				"				\"stock_code\": \"043890\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00648697\",\r\n" + 
				"				\"corp_name\": \"거북선3호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"102000\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165529\",\r\n" + 
				"				\"corp_name\": \"동성하이켐\",\r\n" + 
				"				\"stock_code\": \"013450\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00419989\",\r\n" + 
				"				\"corp_name\": \"클루넷\",\r\n" + 
				"				\"stock_code\": \"067130\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00637114\",\r\n" + 
				"				\"corp_name\": \"코리아퍼시픽07호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"099210\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361114\",\r\n" + 
				"				\"corp_name\": \"씨유전자\",\r\n" + 
				"				\"stock_code\": \"056340\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125628\",\r\n" + 
				"				\"corp_name\": \"삼목강업\",\r\n" + 
				"				\"stock_code\": \"158380\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265227\",\r\n" + 
				"				\"corp_name\": \"에스비엠\",\r\n" + 
				"				\"stock_code\": \"037630\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267669\",\r\n" + 
				"				\"corp_name\": \"솔빛미디어\",\r\n" + 
				"				\"stock_code\": \"044440\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00693800\",\r\n" + 
				"				\"corp_name\": \"에프지엔개발전문자기관리부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"119250\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00991012\",\r\n" + 
				"				\"corp_name\": \"판타지오\",\r\n" + 
				"				\"stock_code\": \"187770\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164469\",\r\n" + 
				"				\"corp_name\": \"현대하이스코\",\r\n" + 
				"				\"stock_code\": \"010520\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00586652\",\r\n" + 
				"				\"corp_name\": \"거북선1호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"092970\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132105\",\r\n" + 
				"				\"corp_name\": \"삼양제넥스\",\r\n" + 
				"				\"stock_code\": \"003940\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00345657\",\r\n" + 
				"				\"corp_name\": \"코아에스앤아이\",\r\n" + 
				"				\"stock_code\": \"052350\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00810531\",\r\n" + 
				"				\"corp_name\": \"자원메디칼\",\r\n" + 
				"				\"stock_code\": \"181980\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127370\",\r\n" + 
				"				\"corp_name\": \"삼우이엠씨\",\r\n" + 
				"				\"stock_code\": \"026250\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261124\",\r\n" + 
				"				\"corp_name\": \"어울림정보기술\",\r\n" + 
				"				\"stock_code\": \"038320\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244729\",\r\n" + 
				"				\"corp_name\": \"티브로드도봉강북방송\",\r\n" + 
				"				\"stock_code\": \"035210\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138127\",\r\n" + 
				"				\"corp_name\": \"티이씨앤코\",\r\n" + 
				"				\"stock_code\": \"008900\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156521\",\r\n" + 
				"				\"corp_name\": \"화인자산관리\",\r\n" + 
				"				\"stock_code\": \"010460\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00446831\",\r\n" + 
				"				\"corp_name\": \"세실\",\r\n" + 
				"				\"stock_code\": \"084450\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127024\",\r\n" + 
				"				\"corp_name\": \"삼양엔텍\",\r\n" + 
				"				\"stock_code\": \"008720\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120377\",\r\n" + 
				"				\"corp_name\": \"로케트전기\",\r\n" + 
				"				\"stock_code\": \"000420\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136970\",\r\n" + 
				"				\"corp_name\": \"신일건업\",\r\n" + 
				"				\"stock_code\": \"014350\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148328\",\r\n" + 
				"				\"corp_name\": \"제일모직\",\r\n" + 
				"				\"stock_code\": \"001300\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00842479\",\r\n" + 
				"				\"corp_name\": \"퓨얼셀파워\",\r\n" + 
				"				\"stock_code\": \"139170\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00907660\",\r\n" + 
				"				\"corp_name\": \"아루히\",\r\n" + 
				"				\"stock_code\": \"950100\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351269\",\r\n" + 
				"				\"corp_name\": \"지티앤티\",\r\n" + 
				"				\"stock_code\": \"053870\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350251\",\r\n" + 
				"				\"corp_name\": \"모아에스앤에스\",\r\n" + 
				"				\"stock_code\": \"052880\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00206127\",\r\n" + 
				"				\"corp_name\": \"어울림엘시스\",\r\n" + 
				"				\"stock_code\": \"033280\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00846396\",\r\n" + 
				"				\"corp_name\": \"이코리아자기관리부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"138440\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144155\",\r\n" + 
				"				\"corp_name\": \"SK\",\r\n" + 
				"				\"stock_code\": \"003600\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00678281\",\r\n" + 
				"				\"corp_name\": \"에이치앤아이\",\r\n" + 
				"				\"stock_code\": \"103650\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00314888\",\r\n" + 
				"				\"corp_name\": \"디에스\",\r\n" + 
				"				\"stock_code\": \"051710\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00653990\",\r\n" + 
				"				\"corp_name\": \"유니드코리아\",\r\n" + 
				"				\"stock_code\": \"110500\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00451116\",\r\n" + 
				"				\"corp_name\": \"아이레보\",\r\n" + 
				"				\"stock_code\": \"072430\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159926\",\r\n" + 
				"				\"corp_name\": \"포스코티엠씨\",\r\n" + 
				"				\"stock_code\": \"010150\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00648688\",\r\n" + 
				"				\"corp_name\": \"거북선2호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"101380\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00512550\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽5호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"082240\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00512532\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽7호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"082260\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00512541\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽6호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"082250\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00907013\",\r\n" + 
				"				\"corp_name\": \"한국ANKOR유전\",\r\n" + 
				"				\"stock_code\": \"152550\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01047929\",\r\n" + 
				"				\"corp_name\": \"에스케이제1호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"207930\",\r\n" + 
				"				\"modify_date\": \"20171106\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01064315\",\r\n" + 
				"				\"corp_name\": \"대우기업인수목적3호\",\r\n" + 
				"				\"stock_code\": \"215580\",\r\n" + 
				"				\"modify_date\": \"20171226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01047567\",\r\n" + 
				"				\"corp_name\": \"엔에이치에스엘기업인수목적\",\r\n" + 
				"				\"stock_code\": \"207720\",\r\n" + 
				"				\"modify_date\": \"20171016\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01043871\",\r\n" + 
				"				\"corp_name\": \"케이티비기업인수목적1호\",\r\n" + 
				"				\"stock_code\": \"204650\",\r\n" + 
				"				\"modify_date\": \"20170707\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01065536\",\r\n" + 
				"				\"corp_name\": \"미래에셋제3호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"215750\",\r\n" + 
				"				\"modify_date\": \"20180104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00636045\",\r\n" + 
				"				\"corp_name\": \"넥솔론\",\r\n" + 
				"				\"stock_code\": \"110570\",\r\n" + 
				"				\"modify_date\": \"20170918\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00632331\",\r\n" + 
				"				\"corp_name\": \"디피앤케이\",\r\n" + 
				"				\"stock_code\": \"189700\",\r\n" + 
				"				\"modify_date\": \"20171220\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00974459\",\r\n" + 
				"				\"corp_name\": \"비앤에스미디어\",\r\n" + 
				"				\"stock_code\": \"156170\",\r\n" + 
				"				\"modify_date\": \"20170918\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00461690\",\r\n" + 
				"				\"corp_name\": \"세화피앤씨\",\r\n" + 
				"				\"stock_code\": \"085980\",\r\n" + 
				"				\"modify_date\": \"20170919\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01111057\",\r\n" + 
				"				\"corp_name\": \"에스지에이시스템즈\",\r\n" + 
				"				\"stock_code\": \"232290\",\r\n" + 
				"				\"modify_date\": \"20171222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00653112\",\r\n" + 
				"				\"corp_name\": \"미래자원엠엘\",\r\n" + 
				"				\"stock_code\": \"233190\",\r\n" + 
				"				\"modify_date\": \"20171228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00823687\",\r\n" + 
				"				\"corp_name\": \"웨이포트유한공사\",\r\n" + 
				"				\"stock_code\": \"900130\",\r\n" + 
				"				\"modify_date\": \"20170725\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00318538\",\r\n" + 
				"				\"corp_name\": \"아스팩오일\",\r\n" + 
				"				\"stock_code\": \"232360\",\r\n" + 
				"				\"modify_date\": \"20170725\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00855145\",\r\n" + 
				"				\"corp_name\": \"하이골드오션2호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"139200\",\r\n" + 
				"				\"modify_date\": \"20171127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01046179\",\r\n" + 
				"				\"corp_name\": \"골든브릿지제2호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"206660\",\r\n" + 
				"				\"modify_date\": \"20171020\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110495\",\r\n" + 
				"				\"corp_name\": \"대성합동지주\",\r\n" + 
				"				\"stock_code\": \"005620\",\r\n" + 
				"				\"modify_date\": \"20170825\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00722500\",\r\n" + 
				"				\"corp_name\": \"중국원양자원유한공사\",\r\n" + 
				"				\"stock_code\": \"900050\",\r\n" + 
				"				\"modify_date\": \"20170927\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01018167\",\r\n" + 
				"				\"corp_name\": \"캐로스\",\r\n" + 
				"				\"stock_code\": \"260490\",\r\n" + 
				"				\"modify_date\": \"20171129\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533678\",\r\n" + 
				"				\"corp_name\": \"아시아퍼시픽15호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083620\",\r\n" + 
				"				\"modify_date\": \"20170731\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01047716\",\r\n" + 
				"				\"corp_name\": \"하나머스트3호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"208870\",\r\n" + 
				"				\"modify_date\": \"20170731\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00686147\",\r\n" + 
				"				\"corp_name\": \"신성에프에이\",\r\n" + 
				"				\"stock_code\": \"104120\",\r\n" + 
				"				\"modify_date\": \"20171207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00686068\",\r\n" + 
				"				\"corp_name\": \"신성이엔지\",\r\n" + 
				"				\"stock_code\": \"104110\",\r\n" + 
				"				\"modify_date\": \"20171208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00783246\",\r\n" + 
				"				\"corp_name\": \"글로벌에스엠\",\r\n" + 
				"				\"stock_code\": \"900070\",\r\n" + 
				"				\"modify_date\": \"20170703\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00800084\",\r\n" + 
				"				\"corp_name\": \"씨케이에이치\",\r\n" + 
				"				\"stock_code\": \"900120\",\r\n" + 
				"				\"modify_date\": \"20170703\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163619\",\r\n" + 
				"				\"corp_name\": \"한진피앤씨\",\r\n" + 
				"				\"stock_code\": \"061460\",\r\n" + 
				"				\"modify_date\": \"20170929\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00967778\",\r\n" + 
				"				\"corp_name\": \"나이코\",\r\n" + 
				"				\"stock_code\": \"192240\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01038161\",\r\n" + 
				"				\"corp_name\": \"대우기업인수목적2호\",\r\n" + 
				"				\"stock_code\": \"204440\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267960\",\r\n" + 
				"				\"corp_name\": \"에스에스컴텍\",\r\n" + 
				"				\"stock_code\": \"036500\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00529310\",\r\n" + 
				"				\"corp_name\": \"동북아10호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083350\",\r\n" + 
				"				\"modify_date\": \"20170630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01080410\",\r\n" + 
				"				\"corp_name\": \"골든브릿지제3호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"219580\",\r\n" + 
				"				\"modify_date\": \"20180207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00413824\",\r\n" + 
				"				\"corp_name\": \"제이앤유글로벌\",\r\n" + 
				"				\"stock_code\": \"086200\",\r\n" + 
				"				\"modify_date\": \"20180508\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01090301\",\r\n" + 
				"				\"corp_name\": \"케이비제8호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"222390\",\r\n" + 
				"				\"modify_date\": \"20180313\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00626710\",\r\n" + 
				"				\"corp_name\": \"베트남개발1\",\r\n" + 
				"				\"stock_code\": \"096300\",\r\n" + 
				"				\"modify_date\": \"20180313\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01010572\",\r\n" + 
				"				\"corp_name\": \"패션플랫폼\",\r\n" + 
				"				\"stock_code\": \"256090\",\r\n" + 
				"				\"modify_date\": \"20180213\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01075047\",\r\n" + 
				"				\"corp_name\": \"키움제3호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"218710\",\r\n" + 
				"				\"modify_date\": \"20180214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01089828\",\r\n" + 
				"				\"corp_name\": \"유진기업인수목적3호\",\r\n" + 
				"				\"stock_code\": \"221200\",\r\n" + 
				"				\"modify_date\": \"20180417\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01087079\",\r\n" + 
				"				\"corp_name\": \"한화에이스기업인수목적2호\",\r\n" + 
				"				\"stock_code\": \"219860\",\r\n" + 
				"				\"modify_date\": \"20180302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01072660\",\r\n" + 
				"				\"corp_name\": \"엔에이치기업인수목적7호\",\r\n" + 
				"				\"stock_code\": \"217810\",\r\n" + 
				"				\"modify_date\": \"20180119\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01091391\",\r\n" + 
				"				\"corp_name\": \"교보5호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"223040\",\r\n" + 
				"				\"modify_date\": \"20180330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01089961\",\r\n" + 
				"				\"corp_name\": \"케이비드림투게더제3호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"221950\",\r\n" + 
				"				\"modify_date\": \"20180330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01089387\",\r\n" + 
				"				\"corp_name\": \"유안타제2호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"219960\",\r\n" + 
				"				\"modify_date\": \"20180223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01111765\",\r\n" + 
				"				\"corp_name\": \"에스엠로보틱스\",\r\n" + 
				"				\"stock_code\": \"252940\",\r\n" + 
				"				\"modify_date\": \"20180425\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01115257\",\r\n" + 
				"				\"corp_name\": \"시냅스엠\",\r\n" + 
				"				\"stock_code\": \"246830\",\r\n" + 
				"				\"modify_date\": \"20180514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00408336\",\r\n" + 
				"				\"corp_name\": \"인산가\",\r\n" + 
				"				\"stock_code\": \"062580\",\r\n" + 
				"				\"modify_date\": \"20180911\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01109186\",\r\n" + 
				"				\"corp_name\": \"동부제4호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"230490\",\r\n" + 
				"				\"modify_date\": \"20180726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01095892\",\r\n" + 
				"				\"corp_name\": \"태경피엔에스\",\r\n" + 
				"				\"stock_code\": \"235090\",\r\n" + 
				"				\"modify_date\": \"20180801\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130949\",\r\n" + 
				"				\"corp_name\": \"카카오엠\",\r\n" + 
				"				\"stock_code\": \"016170\",\r\n" + 
				"				\"modify_date\": \"20180918\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00202778\",\r\n" + 
				"				\"corp_name\": \"썬코어\",\r\n" + 
				"				\"stock_code\": \"051170\",\r\n" + 
				"				\"modify_date\": \"20180820\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01090921\",\r\n" + 
				"				\"corp_name\": \"케이엠제약\",\r\n" + 
				"				\"stock_code\": \"237720\",\r\n" + 
				"				\"modify_date\": \"20180928\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01102800\",\r\n" + 
				"				\"corp_name\": \"키움제4호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"226850\",\r\n" + 
				"				\"modify_date\": \"20180605\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148717\",\r\n" + 
				"				\"corp_name\": \"도레이케미칼\",\r\n" + 
				"				\"stock_code\": \"008000\",\r\n" + 
				"				\"modify_date\": \"20180810\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00959265\",\r\n" + 
				"				\"corp_name\": \"디와이엘엔제이\",\r\n" + 
				"				\"stock_code\": \"207230\",\r\n" + 
				"				\"modify_date\": \"20180514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447478\",\r\n" + 
				"				\"corp_name\": \"엔에스브이\",\r\n" + 
				"				\"stock_code\": \"095300\",\r\n" + 
				"				\"modify_date\": \"20180524\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163789\",\r\n" + 
				"				\"corp_name\": \"심팩메탈\",\r\n" + 
				"				\"stock_code\": \"090730\",\r\n" + 
				"				\"modify_date\": \"20180717\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00838421\",\r\n" + 
				"				\"corp_name\": \"씨제이이앤엠\",\r\n" + 
				"				\"stock_code\": \"130960\",\r\n" + 
				"				\"modify_date\": \"20180718\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01094565\",\r\n" + 
				"				\"corp_name\": \"이베스트기업인수목적3호\",\r\n" + 
				"				\"stock_code\": \"225440\",\r\n" + 
				"				\"modify_date\": \"20180528\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00842327\",\r\n" + 
				"				\"corp_name\": \"완리인터내셔널홀딩스\",\r\n" + 
				"				\"stock_code\": \"900180\",\r\n" + 
				"				\"modify_date\": \"20180528\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156044\",\r\n" + 
				"				\"corp_name\": \"하림홀딩스\",\r\n" + 
				"				\"stock_code\": \"024660\",\r\n" + 
				"				\"modify_date\": \"20180716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109170\",\r\n" + 
				"				\"corp_name\": \"대덕GDS\",\r\n" + 
				"				\"stock_code\": \"004130\",\r\n" + 
				"				\"modify_date\": \"20181219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00207223\",\r\n" + 
				"				\"corp_name\": \"위너지스\",\r\n" + 
				"				\"stock_code\": \"026260\",\r\n" + 
				"				\"modify_date\": \"20181012\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00454265\",\r\n" + 
				"				\"corp_name\": \"스틸플라워\",\r\n" + 
				"				\"stock_code\": \"087220\",\r\n" + 
				"				\"modify_date\": \"20190213\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01170962\",\r\n" + 
				"				\"corp_name\": \"GRT\",\r\n" + 
				"				\"stock_code\": \"900290\",\r\n" + 
				"				\"modify_date\": \"20181122\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00348177\",\r\n" + 
				"				\"corp_name\": \"트레이스\",\r\n" + 
				"				\"stock_code\": \"052290\",\r\n" + 
				"				\"modify_date\": \"20181011\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01111020\",\r\n" + 
				"				\"corp_name\": \"케이비제9호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"232270\",\r\n" + 
				"				\"modify_date\": \"20181012\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01117103\",\r\n" + 
				"				\"corp_name\": \"하이에이아이1호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"235010\",\r\n" + 
				"				\"modify_date\": \"20181012\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264644\",\r\n" + 
				"				\"corp_name\": \"넥스콘테크놀러지\",\r\n" + 
				"				\"stock_code\": \"038990\",\r\n" + 
				"				\"modify_date\": \"20190227\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00334244\",\r\n" + 
				"				\"corp_name\": \"덴소코리아\",\r\n" + 
				"				\"stock_code\": \"047060\",\r\n" + 
				"				\"modify_date\": \"20181113\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00535719\",\r\n" + 
				"				\"corp_name\": \"프렉코\",\r\n" + 
				"				\"stock_code\": \"082220\",\r\n" + 
				"				\"modify_date\": \"20190226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00790121\",\r\n" + 
				"				\"corp_name\": \"차이나하오란리사이클링유한공사\",\r\n" + 
				"				\"stock_code\": \"900090\",\r\n" + 
				"				\"modify_date\": \"20190102\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00960641\",\r\n" + 
				"				\"corp_name\": \"한국패러랠\",\r\n" + 
				"				\"stock_code\": \"168490\",\r\n" + 
				"				\"modify_date\": \"20190116\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00569992\",\r\n" + 
				"				\"corp_name\": \"원익테라세미콘\",\r\n" + 
				"				\"stock_code\": \"123100\",\r\n" + 
				"				\"modify_date\": \"20190220\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01328639\",\r\n" + 
				"				\"corp_name\": \"윙입푸드\",\r\n" + 
				"				\"stock_code\": \"900340\",\r\n" + 
				"				\"modify_date\": \"20181130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00925453\",\r\n" + 
				"				\"corp_name\": \"나무기술\",\r\n" + 
				"				\"stock_code\": \"167380\",\r\n" + 
				"				\"modify_date\": \"20181211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00263140\",\r\n" + 
				"				\"corp_name\": \"루트원플러스\",\r\n" + 
				"				\"stock_code\": \"046400\",\r\n" + 
				"				\"modify_date\": \"20190128\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01130937\",\r\n" + 
				"				\"corp_name\": \"한국제4호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"240540\",\r\n" + 
				"				\"modify_date\": \"20190129\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00232496\",\r\n" + 
				"				\"corp_name\": \"씨그널엔터테인먼트그룹\",\r\n" + 
				"				\"stock_code\": \"099830\",\r\n" + 
				"				\"modify_date\": \"20190111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01088458\",\r\n" + 
				"				\"corp_name\": \"극동자동화\",\r\n" + 
				"				\"stock_code\": \"272420\",\r\n" + 
				"				\"modify_date\": \"20190212\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108047\",\r\n" + 
				"				\"corp_name\": \"세원화성\",\r\n" + 
				"				\"stock_code\": \"007910\",\r\n" + 
				"				\"modify_date\": \"20190226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00600013\",\r\n" + 
				"				\"corp_name\": \"맵스리얼티1\",\r\n" + 
				"				\"stock_code\": \"094800\",\r\n" + 
				"				\"modify_date\": \"20190405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268181\",\r\n" + 
				"				\"corp_name\": \"에스피컴텍\",\r\n" + 
				"				\"stock_code\": \"039110\",\r\n" + 
				"				\"modify_date\": \"20190228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00609254\",\r\n" + 
				"				\"corp_name\": \"세왕\",\r\n" + 
				"				\"stock_code\": \"111610\",\r\n" + 
				"				\"modify_date\": \"20190329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01117495\",\r\n" + 
				"				\"corp_name\": \"에스와이제이\",\r\n" + 
				"				\"stock_code\": \"251540\",\r\n" + 
				"				\"modify_date\": \"20190402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00835734\",\r\n" + 
				"				\"corp_name\": \"피엠디아카데미\",\r\n" + 
				"				\"stock_code\": \"144740\",\r\n" + 
				"				\"modify_date\": \"20190523\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01119217\",\r\n" + 
				"				\"corp_name\": \"본느\",\r\n" + 
				"				\"stock_code\": \"242420\",\r\n" + 
				"				\"modify_date\": \"20190521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00865382\",\r\n" + 
				"				\"corp_name\": \"트러스와이제7호위탁관리부동산투자회사\",\r\n" + 
				"				\"stock_code\": \"140890\",\r\n" + 
				"				\"modify_date\": \"20190507\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149877\",\r\n" + 
				"				\"corp_name\": \"중앙바이오텍\",\r\n" + 
				"				\"stock_code\": \"015170\",\r\n" + 
				"				\"modify_date\": \"20190510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123514\",\r\n" + 
				"				\"corp_name\": \"보진재\",\r\n" + 
				"				\"stock_code\": \"030950\",\r\n" + 
				"				\"modify_date\": \"20190514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01139266\",\r\n" + 
				"				\"corp_name\": \"로스웰\",\r\n" + 
				"				\"stock_code\": \"900260\",\r\n" + 
				"				\"modify_date\": \"20190312\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01168143\",\r\n" + 
				"				\"corp_name\": \"골든센츄리\",\r\n" + 
				"				\"stock_code\": \"900280\",\r\n" + 
				"				\"modify_date\": \"20190703\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01018954\",\r\n" + 
				"				\"corp_name\": \"제이에스피브이\",\r\n" + 
				"				\"stock_code\": \"250300\",\r\n" + 
				"				\"modify_date\": \"20191210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00921475\",\r\n" + 
				"				\"corp_name\": \"자비스\",\r\n" + 
				"				\"stock_code\": \"230400\",\r\n" + 
				"				\"modify_date\": \"20191115\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01199985\",\r\n" + 
				"				\"corp_name\": \"미래에셋대우기업인수목적1호\",\r\n" + 
				"				\"stock_code\": \"265480\",\r\n" + 
				"				\"modify_date\": \"20200103\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00619020\",\r\n" + 
				"				\"corp_name\": \"세종머티리얼즈\",\r\n" + 
				"				\"stock_code\": \"135270\",\r\n" + 
				"				\"modify_date\": \"20191002\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01179839\",\r\n" + 
				"				\"corp_name\": \"신한제3호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"257730\",\r\n" + 
				"				\"modify_date\": \"20191001\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01095397\",\r\n" + 
				"				\"corp_name\": \"줌인터넷\",\r\n" + 
				"				\"stock_code\": \"229480\",\r\n" + 
				"				\"modify_date\": \"20190610\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01051339\",\r\n" + 
				"				\"corp_name\": \"한국비엔씨\",\r\n" + 
				"				\"stock_code\": \"226610\",\r\n" + 
				"				\"modify_date\": \"20191203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01113277\",\r\n" + 
				"				\"corp_name\": \"인프라웨어테크놀러지\",\r\n" + 
				"				\"stock_code\": \"247300\",\r\n" + 
				"				\"modify_date\": \"20191206\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01197428\",\r\n" + 
				"				\"corp_name\": \"한화에이스기업인수목적3호\",\r\n" + 
				"				\"stock_code\": \"264290\",\r\n" + 
				"				\"modify_date\": \"20191206\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00252755\",\r\n" + 
				"				\"corp_name\": \"씨앤케이인터내셔널\",\r\n" + 
				"				\"stock_code\": \"039530\",\r\n" + 
				"				\"modify_date\": \"20190718\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01181940\",\r\n" + 
				"				\"corp_name\": \"아이엘사이언스\",\r\n" + 
				"				\"stock_code\": \"122050\",\r\n" + 
				"				\"modify_date\": \"20191227\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580180\",\r\n" + 
				"				\"corp_name\": \"포인트엔지니어링\",\r\n" + 
				"				\"stock_code\": \"176560\",\r\n" + 
				"				\"modify_date\": \"20190716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00473400\",\r\n" + 
				"				\"corp_name\": \"한컴지엠디\",\r\n" + 
				"				\"stock_code\": \"077280\",\r\n" + 
				"				\"modify_date\": \"20200116\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00100717\",\r\n" + 
				"				\"corp_name\": \"아이이\",\r\n" + 
				"				\"stock_code\": \"023430\",\r\n" + 
				"				\"modify_date\": \"20191120\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261285\",\r\n" + 
				"				\"corp_name\": \"한국가스공사\",\r\n" + 
				"				\"stock_code\": \"036460\",\r\n" + 
				"				\"modify_date\": \"20200109\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00503899\",\r\n" + 
				"				\"corp_name\": \"사조해표\",\r\n" + 
				"				\"stock_code\": \"079660\",\r\n" + 
				"				\"modify_date\": \"20190626\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133317\",\r\n" + 
				"				\"corp_name\": \"에스티씨라이프\",\r\n" + 
				"				\"stock_code\": \"026220\",\r\n" + 
				"				\"modify_date\": \"20190906\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01201581\",\r\n" + 
				"				\"corp_name\": \"한화수성기업인수목적\",\r\n" + 
				"				\"stock_code\": \"265920\",\r\n" + 
				"				\"modify_date\": \"20200115\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00200956\",\r\n" + 
				"				\"corp_name\": \"현대정보기술\",\r\n" + 
				"				\"stock_code\": \"026180\",\r\n" + 
				"				\"modify_date\": \"20190717\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01111570\",\r\n" + 
				"				\"corp_name\": \"에스케이제3호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"232330\",\r\n" + 
				"				\"modify_date\": \"20190830\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01113781\",\r\n" + 
				"				\"corp_name\": \"영현무역\",\r\n" + 
				"				\"stock_code\": \"242850\",\r\n" + 
				"				\"modify_date\": \"20190827\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01212383\",\r\n" + 
				"				\"corp_name\": \"엔케이맥스\",\r\n" + 
				"				\"stock_code\": \"262760\",\r\n" + 
				"				\"modify_date\": \"20190704\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01194759\",\r\n" + 
				"				\"corp_name\": \"대신밸런스제4호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"262830\",\r\n" + 
				"				\"modify_date\": \"20191010\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00872850\",\r\n" + 
				"				\"corp_name\": \"비지스틸\",\r\n" + 
				"				\"stock_code\": \"179440\",\r\n" + 
				"				\"modify_date\": \"20200207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00527880\",\r\n" + 
				"				\"corp_name\": \"썬테크놀로지스\",\r\n" + 
				"				\"stock_code\": \"122800\",\r\n" + 
				"				\"modify_date\": \"20200212\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117638\",\r\n" + 
				"				\"corp_name\": \"동양텔레콤\",\r\n" + 
				"				\"stock_code\": \"007150\",\r\n" + 
				"				\"modify_date\": \"20200226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"99999999\",\r\n" + 
				"				\"corp_name\": \"금감원(테스트)\",\r\n" + 
				"				\"stock_code\": \"999980\",\r\n" + 
				"				\"modify_date\": \"20200129\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01063963\",\r\n" + 
				"				\"corp_name\": \"유쎌\",\r\n" + 
				"				\"stock_code\": \"252370\",\r\n" + 
				"				\"modify_date\": \"20200227\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00656340\",\r\n" + 
				"				\"corp_name\": \"소프트캠프\",\r\n" + 
				"				\"stock_code\": \"210610\",\r\n" + 
				"				\"modify_date\": \"20200227\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01194892\",\r\n" + 
				"				\"corp_name\": \"알로이스\",\r\n" + 
				"				\"stock_code\": \"271400\",\r\n" + 
				"				\"modify_date\": \"20200227\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00222806\",\r\n" + 
				"				\"corp_name\": \"에임하이글로벌\",\r\n" + 
				"				\"stock_code\": \"043580\",\r\n" + 
				"				\"modify_date\": \"20200228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01234525\",\r\n" + 
				"				\"corp_name\": \"한국제5호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"271740\",\r\n" + 
				"				\"modify_date\": \"20200303\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00389679\",\r\n" + 
				"				\"corp_name\": \"해피드림\",\r\n" + 
				"				\"stock_code\": \"065180\",\r\n" + 
				"				\"modify_date\": \"20200228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526465\",\r\n" + 
				"				\"corp_name\": \"동북아13호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083380\",\r\n" + 
				"				\"modify_date\": \"20200504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00324104\",\r\n" + 
				"				\"corp_name\": \"디케이씨\",\r\n" + 
				"				\"stock_code\": \"047440\",\r\n" + 
				"				\"modify_date\": \"20200228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00410678\",\r\n" + 
				"				\"corp_name\": \"다린\",\r\n" + 
				"				\"stock_code\": \"204690\",\r\n" + 
				"				\"modify_date\": \"20200228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00291152\",\r\n" + 
				"				\"corp_name\": \"디비엘\",\r\n" + 
				"				\"stock_code\": \"041500\",\r\n" + 
				"				\"modify_date\": \"20200508\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00595243\",\r\n" + 
				"				\"corp_name\": \"엔스퍼트\",\r\n" + 
				"				\"stock_code\": \"098400\",\r\n" + 
				"				\"modify_date\": \"20200304\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00930321\",\r\n" + 
				"				\"corp_name\": \"하이골드오션8호국제선박투자회사\",\r\n" + 
				"				\"stock_code\": \"159650\",\r\n" + 
				"				\"modify_date\": \"20200427\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00307037\",\r\n" + 
				"				\"corp_name\": \"더스텔라\",\r\n" + 
				"				\"stock_code\": \"065310\",\r\n" + 
				"				\"modify_date\": \"20200408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00695464\",\r\n" + 
				"				\"corp_name\": \"차이나그레이트스타인터내셔널리미티드\",\r\n" + 
				"				\"stock_code\": \"900040\",\r\n" + 
				"				\"modify_date\": \"20200522\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01245062\",\r\n" + 
				"				\"corp_name\": \"코오롱티슈진\",\r\n" + 
				"				\"stock_code\": \"950160\",\r\n" + 
				"				\"modify_date\": \"20200325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123152\",\r\n" + 
				"				\"corp_name\": \"보루네오가구\",\r\n" + 
				"				\"stock_code\": \"004740\",\r\n" + 
				"				\"modify_date\": \"20200228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01086812\",\r\n" + 
				"				\"corp_name\": \"케미메디\",\r\n" + 
				"				\"stock_code\": \"205290\",\r\n" + 
				"				\"modify_date\": \"20200526\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00961136\",\r\n" + 
				"				\"corp_name\": \"씨티네트웍스\",\r\n" + 
				"				\"stock_code\": \"189540\",\r\n" + 
				"				\"modify_date\": \"20200512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00893923\",\r\n" + 
				"				\"corp_name\": \"이푸른\",\r\n" + 
				"				\"stock_code\": \"185280\",\r\n" + 
				"				\"modify_date\": \"20200228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00938688\",\r\n" + 
				"				\"corp_name\": \"SBI핀테크솔루션즈\",\r\n" + 
				"				\"stock_code\": \"950110\",\r\n" + 
				"				\"modify_date\": \"20200401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00530796\",\r\n" + 
				"				\"corp_name\": \"미성포리테크\",\r\n" + 
				"				\"stock_code\": \"094700\",\r\n" + 
				"				\"modify_date\": \"20200228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00343127\",\r\n" + 
				"				\"corp_name\": \"자유투어\",\r\n" + 
				"				\"stock_code\": \"046840\",\r\n" + 
				"				\"modify_date\": \"20200228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00671437\",\r\n" + 
				"				\"corp_name\": \"파인넥스\",\r\n" + 
				"				\"stock_code\": \"123260\",\r\n" + 
				"				\"modify_date\": \"20200410\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159564\",\r\n" + 
				"				\"corp_name\": \"한국주강\",\r\n" + 
				"				\"stock_code\": \"025890\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00362858\",\r\n" + 
				"				\"corp_name\": \"예스24\",\r\n" + 
				"				\"stock_code\": \"053280\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155638\",\r\n" + 
				"				\"corp_name\": \"피에스텍\",\r\n" + 
				"				\"stock_code\": \"002230\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116408\",\r\n" + 
				"				\"corp_name\": \"동신건설\",\r\n" + 
				"				\"stock_code\": \"025950\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01276026\",\r\n" + 
				"				\"corp_name\": \"지놈앤컴퍼니\",\r\n" + 
				"				\"stock_code\": \"314130\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00878915\",\r\n" + 
				"				\"corp_name\": \"DGB금융지주\",\r\n" + 
				"				\"stock_code\": \"139130\",\r\n" + 
				"				\"modify_date\": \"20201118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140858\",\r\n" + 
				"				\"corp_name\": \"영신금속\",\r\n" + 
				"				\"stock_code\": \"007530\",\r\n" + 
				"				\"modify_date\": \"20201126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00185505\",\r\n" + 
				"				\"corp_name\": \"제일바이오\",\r\n" + 
				"				\"stock_code\": \"052670\",\r\n" + 
				"				\"modify_date\": \"20201126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133751\",\r\n" + 
				"				\"corp_name\": \"세명전기\",\r\n" + 
				"				\"stock_code\": \"017510\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109268\",\r\n" + 
				"				\"corp_name\": \"대동스틸\",\r\n" + 
				"				\"stock_code\": \"048470\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00412348\",\r\n" + 
				"				\"corp_name\": \"엘비세미콘\",\r\n" + 
				"				\"stock_code\": \"061970\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00238001\",\r\n" + 
				"				\"corp_name\": \"블루콤\",\r\n" + 
				"				\"stock_code\": \"033560\",\r\n" + 
				"				\"modify_date\": \"20201117\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133557\",\r\n" + 
				"				\"corp_name\": \"PN풍년\",\r\n" + 
				"				\"stock_code\": \"024940\",\r\n" + 
				"				\"modify_date\": \"20201124\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00353878\",\r\n" + 
				"				\"corp_name\": \"다스코\",\r\n" + 
				"				\"stock_code\": \"058730\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00652159\",\r\n" + 
				"				\"corp_name\": \"코오롱머티리얼\",\r\n" + 
				"				\"stock_code\": \"144620\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149239\",\r\n" + 
				"				\"corp_name\": \"조일알미늄\",\r\n" + 
				"				\"stock_code\": \"018470\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107677\",\r\n" + 
				"				\"corp_name\": \"비비안\",\r\n" + 
				"				\"stock_code\": \"002070\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447928\",\r\n" + 
				"				\"corp_name\": \"네오티스\",\r\n" + 
				"				\"stock_code\": \"085910\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127158\",\r\n" + 
				"				\"corp_name\": \"씨아이테크\",\r\n" + 
				"				\"stock_code\": \"004920\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109824\",\r\n" + 
				"				\"corp_name\": \"대림통상\",\r\n" + 
				"				\"stock_code\": \"006570\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00258801\",\r\n" + 
				"				\"corp_name\": \"카카오\",\r\n" + 
				"				\"stock_code\": \"035720\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00295857\",\r\n" + 
				"				\"corp_name\": \"코다코\",\r\n" + 
				"				\"stock_code\": \"046070\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00369657\",\r\n" + 
				"				\"corp_name\": \"리노공업\",\r\n" + 
				"				\"stock_code\": \"058470\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00638487\",\r\n" + 
				"				\"corp_name\": \"파수\",\r\n" + 
				"				\"stock_code\": \"150900\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00186717\",\r\n" + 
				"				\"corp_name\": \"태양\",\r\n" + 
				"				\"stock_code\": \"053620\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00147772\",\r\n" + 
				"				\"corp_name\": \"정원엔시스\",\r\n" + 
				"				\"stock_code\": \"045510\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101752\",\r\n" + 
				"				\"corp_name\": \"케이씨피드\",\r\n" + 
				"				\"stock_code\": \"025880\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00405320\",\r\n" + 
				"				\"corp_name\": \"웹젠\",\r\n" + 
				"				\"stock_code\": \"069080\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00664048\",\r\n" + 
				"				\"corp_name\": \"우리넷\",\r\n" + 
				"				\"stock_code\": \"115440\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01267967\",\r\n" + 
				"				\"corp_name\": \"마이크로디지탈\",\r\n" + 
				"				\"stock_code\": \"305090\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00157070\",\r\n" + 
				"				\"corp_name\": \"한국단자공업\",\r\n" + 
				"				\"stock_code\": \"025540\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361488\",\r\n" + 
				"				\"corp_name\": \"텔코웨어\",\r\n" + 
				"				\"stock_code\": \"078000\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00828789\",\r\n" + 
				"				\"corp_name\": \"대성산업\",\r\n" + 
				"				\"stock_code\": \"128820\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00592653\",\r\n" + 
				"				\"corp_name\": \"유비벨록스\",\r\n" + 
				"				\"stock_code\": \"089850\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540429\",\r\n" + 
				"				\"corp_name\": \"휴림로봇\",\r\n" + 
				"				\"stock_code\": \"090710\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265041\",\r\n" + 
				"				\"corp_name\": \"KCI\",\r\n" + 
				"				\"stock_code\": \"036670\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121570\",\r\n" + 
				"				\"corp_name\": \"문배철강\",\r\n" + 
				"				\"stock_code\": \"008420\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350048\",\r\n" + 
				"				\"corp_name\": \"오성첨단소재\",\r\n" + 
				"				\"stock_code\": \"052420\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00178851\",\r\n" + 
				"				\"corp_name\": \"동양에스텍\",\r\n" + 
				"				\"stock_code\": \"060380\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152783\",\r\n" + 
				"				\"corp_name\": \"코메론\",\r\n" + 
				"				\"stock_code\": \"049430\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112165\",\r\n" + 
				"				\"corp_name\": \"디아이씨\",\r\n" + 
				"				\"stock_code\": \"092200\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137012\",\r\n" + 
				"				\"corp_name\": \"에스앤더블류\",\r\n" + 
				"				\"stock_code\": \"103230\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00759294\",\r\n" + 
				"				\"corp_name\": \"와이솔\",\r\n" + 
				"				\"stock_code\": \"122990\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00217947\",\r\n" + 
				"				\"corp_name\": \"신세계건설\",\r\n" + 
				"				\"stock_code\": \"034300\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00994994\",\r\n" + 
				"				\"corp_name\": \"나노\",\r\n" + 
				"				\"stock_code\": \"187790\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00306870\",\r\n" + 
				"				\"corp_name\": \"손오공\",\r\n" + 
				"				\"stock_code\": \"066910\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00147994\",\r\n" + 
				"				\"corp_name\": \"새로닉스\",\r\n" + 
				"				\"stock_code\": \"042600\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00297934\",\r\n" + 
				"				\"corp_name\": \"피씨디렉트\",\r\n" + 
				"				\"stock_code\": \"051380\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01067808\",\r\n" + 
				"				\"corp_name\": \"넵튠\",\r\n" + 
				"				\"stock_code\": \"217270\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00185356\",\r\n" + 
				"				\"corp_name\": \"제룡전기\",\r\n" + 
				"				\"stock_code\": \"033100\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155452\",\r\n" + 
				"				\"corp_name\": \"풍국주정\",\r\n" + 
				"				\"stock_code\": \"023900\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00242378\",\r\n" + 
				"				\"corp_name\": \"이지홀딩스\",\r\n" + 
				"				\"stock_code\": \"035810\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01480568\",\r\n" + 
				"				\"corp_name\": \"이지바이오\",\r\n" + 
				"				\"stock_code\": \"353810\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00192499\",\r\n" + 
				"				\"corp_name\": \"팜스토리\",\r\n" + 
				"				\"stock_code\": \"027710\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00204208\",\r\n" + 
				"				\"corp_name\": \"마니커\",\r\n" + 
				"				\"stock_code\": \"027740\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00418379\",\r\n" + 
				"				\"corp_name\": \"자연과환경\",\r\n" + 
				"				\"stock_code\": \"043910\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110431\",\r\n" + 
				"				\"corp_name\": \"JW신약\",\r\n" + 
				"				\"stock_code\": \"067290\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152686\",\r\n" + 
				"				\"corp_name\": \"코리아써키트\",\r\n" + 
				"				\"stock_code\": \"007810\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00206686\",\r\n" + 
				"				\"corp_name\": \"케이피엠테크\",\r\n" + 
				"				\"stock_code\": \"042040\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00954242\",\r\n" + 
				"				\"corp_name\": \"하이골드12호\",\r\n" + 
				"				\"stock_code\": \"172580\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01095704\",\r\n" + 
				"				\"corp_name\": \"케이엠제약\",\r\n" + 
				"				\"stock_code\": \"225430\",\r\n" + 
				"				\"modify_date\": \"20210126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01398151\",\r\n" + 
				"				\"corp_name\": \"교보9호스팩\",\r\n" + 
				"				\"stock_code\": \"331520\",\r\n" + 
				"				\"modify_date\": \"20210126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00523176\",\r\n" + 
				"				\"corp_name\": \"네추럴FNP\",\r\n" + 
				"				\"stock_code\": \"086220\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01063990\",\r\n" + 
				"				\"corp_name\": \"로보로보\",\r\n" + 
				"				\"stock_code\": \"215100\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367604\",\r\n" + 
				"				\"corp_name\": \"SM Life Design\",\r\n" + 
				"				\"stock_code\": \"063440\",\r\n" + 
				"				\"modify_date\": \"20201216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231372\",\r\n" + 
				"				\"corp_name\": \"롯데관광개발\",\r\n" + 
				"				\"stock_code\": \"032350\",\r\n" + 
				"				\"modify_date\": \"20201216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124151\",\r\n" + 
				"				\"corp_name\": \"부산주공\",\r\n" + 
				"				\"stock_code\": \"005030\",\r\n" + 
				"				\"modify_date\": \"20201217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151298\",\r\n" + 
				"				\"corp_name\": \"DSR제강\",\r\n" + 
				"				\"stock_code\": \"069730\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01476219\",\r\n" + 
				"				\"corp_name\": \"교보10호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"355150\",\r\n" + 
				"				\"modify_date\": \"20210126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01414422\",\r\n" + 
				"				\"corp_name\": \"아이비김영\",\r\n" + 
				"				\"stock_code\": \"339950\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01035942\",\r\n" + 
				"				\"corp_name\": \"메디안디노스틱\",\r\n" + 
				"				\"stock_code\": \"233250\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00191287\",\r\n" + 
				"				\"corp_name\": \"대동금속\",\r\n" + 
				"				\"stock_code\": \"020400\",\r\n" + 
				"				\"modify_date\": \"20201110\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01437292\",\r\n" + 
				"				\"corp_name\": \"미래에셋맵스리츠\",\r\n" + 
				"				\"stock_code\": \"357250\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00257732\",\r\n" + 
				"				\"corp_name\": \"한국정밀기계\",\r\n" + 
				"				\"stock_code\": \"101680\",\r\n" + 
				"				\"modify_date\": \"20210128\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01153105\",\r\n" + 
				"				\"corp_name\": \"비비씨\",\r\n" + 
				"				\"stock_code\": \"318410\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00799177\",\r\n" + 
				"				\"corp_name\": \"삼기\",\r\n" + 
				"				\"stock_code\": \"122350\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01116380\",\r\n" + 
				"				\"corp_name\": \"씨앤에스링크\",\r\n" + 
				"				\"stock_code\": \"245450\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158963\",\r\n" + 
				"				\"corp_name\": \"유나이티드\",\r\n" + 
				"				\"stock_code\": \"033270\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102681\",\r\n" + 
				"				\"corp_name\": \"고려개발\",\r\n" + 
				"				\"stock_code\": \"004200\",\r\n" + 
				"				\"modify_date\": \"20200721\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136925\",\r\n" + 
				"				\"corp_name\": \"신원종합개발\",\r\n" + 
				"				\"stock_code\": \"017000\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124276\",\r\n" + 
				"				\"corp_name\": \"부스타\",\r\n" + 
				"				\"stock_code\": \"008470\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136624\",\r\n" + 
				"				\"corp_name\": \"신영와코루\",\r\n" + 
				"				\"stock_code\": \"005800\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00356389\",\r\n" + 
				"				\"corp_name\": \"프럼파스트\",\r\n" + 
				"				\"stock_code\": \"035200\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103130\",\r\n" + 
				"				\"corp_name\": \"엔케이물산\",\r\n" + 
				"				\"stock_code\": \"009810\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145190\",\r\n" + 
				"				\"corp_name\": \"유화증권\",\r\n" + 
				"				\"stock_code\": \"003460\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00307028\",\r\n" + 
				"				\"corp_name\": \"경남제약\",\r\n" + 
				"				\"stock_code\": \"053950\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00301246\",\r\n" + 
				"				\"corp_name\": \"SFA반도체\",\r\n" + 
				"				\"stock_code\": \"036540\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01207761\",\r\n" + 
				"				\"corp_name\": \"디자인\",\r\n" + 
				"				\"stock_code\": \"227100\",\r\n" + 
				"				\"modify_date\": \"20201223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01263022\",\r\n" + 
				"				\"corp_name\": \"BGF리테일\",\r\n" + 
				"				\"stock_code\": \"282330\",\r\n" + 
				"				\"modify_date\": \"20201228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264228\",\r\n" + 
				"				\"corp_name\": \"위즈코프\",\r\n" + 
				"				\"stock_code\": \"038620\",\r\n" + 
				"				\"modify_date\": \"20201228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01310269\",\r\n" + 
				"				\"corp_name\": \"HDC현대산업개발\",\r\n" + 
				"				\"stock_code\": \"294870\",\r\n" + 
				"				\"modify_date\": \"20201228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00962223\",\r\n" + 
				"				\"corp_name\": \"지니언스\",\r\n" + 
				"				\"stock_code\": \"263860\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01065013\",\r\n" + 
				"				\"corp_name\": \"우정바이오\",\r\n" + 
				"				\"stock_code\": \"215380\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00624998\",\r\n" + 
				"				\"corp_name\": \"제닉\",\r\n" + 
				"				\"stock_code\": \"123330\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129280\",\r\n" + 
				"				\"corp_name\": \"삼화전자공업\",\r\n" + 
				"				\"stock_code\": \"011230\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129679\",\r\n" + 
				"				\"corp_name\": \"녹십자\",\r\n" + 
				"				\"stock_code\": \"006280\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108135\",\r\n" + 
				"				\"corp_name\": \"녹십자홀딩스\",\r\n" + 
				"				\"stock_code\": \"005250\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125974\",\r\n" + 
				"				\"corp_name\": \"삼부토건\",\r\n" + 
				"				\"stock_code\": \"001470\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00249894\",\r\n" + 
				"				\"corp_name\": \"테라젠이텍스\",\r\n" + 
				"				\"stock_code\": \"066700\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00199988\",\r\n" + 
				"				\"corp_name\": \"동아화성\",\r\n" + 
				"				\"stock_code\": \"041930\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105138\",\r\n" + 
				"				\"corp_name\": \"파라텍\",\r\n" + 
				"				\"stock_code\": \"033540\",\r\n" + 
				"				\"modify_date\": \"20210105\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105101\",\r\n" + 
				"				\"corp_name\": \"예스코홀딩스\",\r\n" + 
				"				\"stock_code\": \"015360\",\r\n" + 
				"				\"modify_date\": \"20210105\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00203023\",\r\n" + 
				"				\"corp_name\": \"시노펙스\",\r\n" + 
				"				\"stock_code\": \"025320\",\r\n" + 
				"				\"modify_date\": \"20210105\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173102\",\r\n" + 
				"				\"corp_name\": \"모나리자\",\r\n" + 
				"				\"stock_code\": \"012690\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109514\",\r\n" + 
				"				\"corp_name\": \"티웨이홀딩스\",\r\n" + 
				"				\"stock_code\": \"004870\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01243550\",\r\n" + 
				"				\"corp_name\": \"아이비케이에스제7호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"276920\",\r\n" + 
				"				\"modify_date\": \"20200618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102113\",\r\n" + 
				"				\"corp_name\": \"경인양행\",\r\n" + 
				"				\"stock_code\": \"012610\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00266952\",\r\n" + 
				"				\"corp_name\": \"네오위즈홀딩스\",\r\n" + 
				"				\"stock_code\": \"042420\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145552\",\r\n" + 
				"				\"corp_name\": \"이수화학\",\r\n" + 
				"				\"stock_code\": \"005950\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00406727\",\r\n" + 
				"				\"corp_name\": \"세진티에스\",\r\n" + 
				"				\"stock_code\": \"067770\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00778235\",\r\n" + 
				"				\"corp_name\": \"TS인베스트먼트\",\r\n" + 
				"				\"stock_code\": \"246690\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00389970\",\r\n" + 
				"				\"corp_name\": \"다날\",\r\n" + 
				"				\"stock_code\": \"064260\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00605328\",\r\n" + 
				"				\"corp_name\": \"씨앤지하이테크\",\r\n" + 
				"				\"stock_code\": \"264660\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129235\",\r\n" + 
				"				\"corp_name\": \"삼화왕관\",\r\n" + 
				"				\"stock_code\": \"004450\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122551\",\r\n" + 
				"				\"corp_name\": \"백산\",\r\n" + 
				"				\"stock_code\": \"035150\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01394377\",\r\n" + 
				"				\"corp_name\": \"이지스밸류플러스리츠\",\r\n" + 
				"				\"stock_code\": \"334890\",\r\n" + 
				"				\"modify_date\": \"20201022\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155373\",\r\n" + 
				"				\"corp_name\": \"풍강\",\r\n" + 
				"				\"stock_code\": \"093380\",\r\n" + 
				"				\"modify_date\": \"20201026\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261443\",\r\n" + 
				"				\"corp_name\": \"엔씨소프트\",\r\n" + 
				"				\"stock_code\": \"036570\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00208444\",\r\n" + 
				"				\"corp_name\": \"피에스케이홀딩스\",\r\n" + 
				"				\"stock_code\": \"031980\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105961\",\r\n" + 
				"				\"corp_name\": \"LG이노텍\",\r\n" + 
				"				\"stock_code\": \"011070\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01112889\",\r\n" + 
				"				\"corp_name\": \"피엔에이치테크\",\r\n" + 
				"				\"stock_code\": \"239890\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01055317\",\r\n" + 
				"				\"corp_name\": \"비엔디생활건강\",\r\n" + 
				"				\"stock_code\": \"215050\",\r\n" + 
				"				\"modify_date\": \"20210112\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148364\",\r\n" + 
				"				\"corp_name\": \"하림지주\",\r\n" + 
				"				\"stock_code\": \"003380\",\r\n" + 
				"				\"modify_date\": \"20210204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00573269\",\r\n" + 
				"				\"corp_name\": \"에스코넥\",\r\n" + 
				"				\"stock_code\": \"096630\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126414\",\r\n" + 
				"				\"corp_name\": \"삼성제약\",\r\n" + 
				"				\"stock_code\": \"001360\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00661847\",\r\n" + 
				"				\"corp_name\": \"화인베스틸\",\r\n" + 
				"				\"stock_code\": \"133820\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105165\",\r\n" + 
				"				\"corp_name\": \"극동전선\",\r\n" + 
				"				\"stock_code\": \"006250\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149266\",\r\n" + 
				"				\"corp_name\": \"CNH\",\r\n" + 
				"				\"stock_code\": \"023460\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00206084\",\r\n" + 
				"				\"corp_name\": \"세아메탈\",\r\n" + 
				"				\"stock_code\": \"033020\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01090471\",\r\n" + 
				"				\"corp_name\": \"씨아이에스\",\r\n" + 
				"				\"stock_code\": \"222080\",\r\n" + 
				"				\"modify_date\": \"20201216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00352718\",\r\n" + 
				"				\"corp_name\": \"소리바다\",\r\n" + 
				"				\"stock_code\": \"053110\",\r\n" + 
				"				\"modify_date\": \"20201221\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00298447\",\r\n" + 
				"				\"corp_name\": \"아모텍\",\r\n" + 
				"				\"stock_code\": \"052710\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00814810\",\r\n" + 
				"				\"corp_name\": \"엠에프엠코리아\",\r\n" + 
				"				\"stock_code\": \"251960\",\r\n" + 
				"				\"modify_date\": \"20201230\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01186811\",\r\n" + 
				"				\"corp_name\": \"티에스트릴리온\",\r\n" + 
				"				\"stock_code\": \"284610\",\r\n" + 
				"				\"modify_date\": \"20201230\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131850\",\r\n" + 
				"				\"corp_name\": \"SK증권\",\r\n" + 
				"				\"stock_code\": \"001510\",\r\n" + 
				"				\"modify_date\": \"20201231\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00288343\",\r\n" + 
				"				\"corp_name\": \"삼영이엔씨\",\r\n" + 
				"				\"stock_code\": \"065570\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132202\",\r\n" + 
				"				\"corp_name\": \"선진뷰티사이언스\",\r\n" + 
				"				\"stock_code\": \"086710\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01267170\",\r\n" + 
				"				\"corp_name\": \"SK케미칼\",\r\n" + 
				"				\"stock_code\": \"285130\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00910202\",\r\n" + 
				"				\"corp_name\": \"대동고려삼\",\r\n" + 
				"				\"stock_code\": \"178600\",\r\n" + 
				"				\"modify_date\": \"20200814\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126292\",\r\n" + 
				"				\"corp_name\": \"삼성카드\",\r\n" + 
				"				\"stock_code\": \"029780\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540340\",\r\n" + 
				"				\"corp_name\": \"코리아센터\",\r\n" + 
				"				\"stock_code\": \"290510\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00877174\",\r\n" + 
				"				\"corp_name\": \"엠브레인\",\r\n" + 
				"				\"stock_code\": \"169330\",\r\n" + 
				"				\"modify_date\": \"20201015\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01236286\",\r\n" + 
				"				\"corp_name\": \"컬러레이\",\r\n" + 
				"				\"stock_code\": \"900310\",\r\n" + 
				"				\"modify_date\": \"20201015\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01478712\",\r\n" + 
				"				\"corp_name\": \"대덕전자\",\r\n" + 
				"				\"stock_code\": \"353200\",\r\n" + 
				"				\"modify_date\": \"20201231\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01066030\",\r\n" + 
				"				\"corp_name\": \"드림티엔터테인먼트\",\r\n" + 
				"				\"stock_code\": \"220110\",\r\n" + 
				"				\"modify_date\": \"20200713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00539274\",\r\n" + 
				"				\"corp_name\": \"대상홀딩스\",\r\n" + 
				"				\"stock_code\": \"084690\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00808086\",\r\n" + 
				"				\"corp_name\": \"애니젠\",\r\n" + 
				"				\"stock_code\": \"196300\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00670766\",\r\n" + 
				"				\"corp_name\": \"엠투아이\",\r\n" + 
				"				\"stock_code\": \"347890\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103176\",\r\n" + 
				"				\"corp_name\": \"흥국화재\",\r\n" + 
				"				\"stock_code\": \"000540\",\r\n" + 
				"				\"modify_date\": \"20210129\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01359736\",\r\n" + 
				"				\"corp_name\": \"유진스팩4호\",\r\n" + 
				"				\"stock_code\": \"321260\",\r\n" + 
				"				\"modify_date\": \"20210202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01393721\",\r\n" + 
				"				\"corp_name\": \"유진스팩5호\",\r\n" + 
				"				\"stock_code\": \"331380\",\r\n" + 
				"				\"modify_date\": \"20210202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01110474\",\r\n" + 
				"				\"corp_name\": \"에스씨엠생명과학\",\r\n" + 
				"				\"stock_code\": \"298060\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122348\",\r\n" + 
				"				\"corp_name\": \"방림\",\r\n" + 
				"				\"stock_code\": \"003610\",\r\n" + 
				"				\"modify_date\": \"20201116\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00480756\",\r\n" + 
				"				\"corp_name\": \"이트론\",\r\n" + 
				"				\"stock_code\": \"096040\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01436628\",\r\n" + 
				"				\"corp_name\": \"이지스레지던스리츠\",\r\n" + 
				"				\"stock_code\": \"350520\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01237540\",\r\n" + 
				"				\"corp_name\": \"이녹스첨단소재\",\r\n" + 
				"				\"stock_code\": \"272290\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00587925\",\r\n" + 
				"				\"corp_name\": \"바이오리더스\",\r\n" + 
				"				\"stock_code\": \"142760\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00584362\",\r\n" + 
				"				\"corp_name\": \"넥스지\",\r\n" + 
				"				\"stock_code\": \"081970\",\r\n" + 
				"				\"modify_date\": \"20210208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166500\",\r\n" + 
				"				\"corp_name\": \"화천기계\",\r\n" + 
				"				\"stock_code\": \"010660\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00623661\",\r\n" + 
				"				\"corp_name\": \"원익머트리얼즈\",\r\n" + 
				"				\"stock_code\": \"104830\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00609315\",\r\n" + 
				"				\"corp_name\": \"멜파스\",\r\n" + 
				"				\"stock_code\": \"096640\",\r\n" + 
				"				\"modify_date\": \"20210128\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123718\",\r\n" + 
				"				\"corp_name\": \"부광약품\",\r\n" + 
				"				\"stock_code\": \"003000\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00349097\",\r\n" + 
				"				\"corp_name\": \"케이티스카이라이프\",\r\n" + 
				"				\"stock_code\": \"053210\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442145\",\r\n" + 
				"				\"corp_name\": \"아바코\",\r\n" + 
				"				\"stock_code\": \"083930\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136271\",\r\n" + 
				"				\"corp_name\": \"신성이엔지\",\r\n" + 
				"				\"stock_code\": \"011930\",\r\n" + 
				"				\"modify_date\": \"20201113\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01237434\",\r\n" + 
				"				\"corp_name\": \"플리토\",\r\n" + 
				"				\"stock_code\": \"300080\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135467\",\r\n" + 
				"				\"corp_name\": \"승일\",\r\n" + 
				"				\"stock_code\": \"049830\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00537832\",\r\n" + 
				"				\"corp_name\": \"푸른기술\",\r\n" + 
				"				\"stock_code\": \"094940\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00233653\",\r\n" + 
				"				\"corp_name\": \"한국토지신탁\",\r\n" + 
				"				\"stock_code\": \"034830\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00855163\",\r\n" + 
				"				\"corp_name\": \"미원화학\",\r\n" + 
				"				\"stock_code\": \"134380\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120872\",\r\n" + 
				"				\"corp_name\": \"만호제강\",\r\n" + 
				"				\"stock_code\": \"001080\",\r\n" + 
				"				\"modify_date\": \"20200825\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00311216\",\r\n" + 
				"				\"corp_name\": \"에이치엔에스하이텍\",\r\n" + 
				"				\"stock_code\": \"044990\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00296290\",\r\n" + 
				"				\"corp_name\": \"키움증권\",\r\n" + 
				"				\"stock_code\": \"039490\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00356927\",\r\n" + 
				"				\"corp_name\": \"에이디칩스\",\r\n" + 
				"				\"stock_code\": \"054630\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144650\",\r\n" + 
				"				\"corp_name\": \"유신\",\r\n" + 
				"				\"stock_code\": \"054930\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00568188\",\r\n" + 
				"				\"corp_name\": \"마이크로컨텍솔\",\r\n" + 
				"				\"stock_code\": \"098120\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00531917\",\r\n" + 
				"				\"corp_name\": \"톱텍\",\r\n" + 
				"				\"stock_code\": \"108230\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442835\",\r\n" + 
				"				\"corp_name\": \"메타랩스\",\r\n" + 
				"				\"stock_code\": \"090370\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00296078\",\r\n" + 
				"				\"corp_name\": \"APS홀딩스\",\r\n" + 
				"				\"stock_code\": \"054620\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01187458\",\r\n" + 
				"				\"corp_name\": \"에스알바이오텍\",\r\n" + 
				"				\"stock_code\": \"270210\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00202839\",\r\n" + 
				"				\"corp_name\": \"한창산업\",\r\n" + 
				"				\"stock_code\": \"079170\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00508274\",\r\n" + 
				"				\"corp_name\": \"일진다이아\",\r\n" + 
				"				\"stock_code\": \"081000\",\r\n" + 
				"				\"modify_date\": \"20210202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01497869\",\r\n" + 
				"				\"corp_name\": \"티와이홀딩스\",\r\n" + 
				"				\"stock_code\": \"363280\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00611736\",\r\n" + 
				"				\"corp_name\": \"엑시콘\",\r\n" + 
				"				\"stock_code\": \"092870\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01117422\",\r\n" + 
				"				\"corp_name\": \"나눔테크\",\r\n" + 
				"				\"stock_code\": \"244880\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00252001\",\r\n" + 
				"				\"corp_name\": \"해원에스티\",\r\n" + 
				"				\"stock_code\": \"058480\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364847\",\r\n" + 
				"				\"corp_name\": \"이글루시큐리티\",\r\n" + 
				"				\"stock_code\": \"067920\",\r\n" + 
				"				\"modify_date\": \"20201119\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00235183\",\r\n" + 
				"				\"corp_name\": \"에이치케이\",\r\n" + 
				"				\"stock_code\": \"044780\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00100601\",\r\n" + 
				"				\"corp_name\": \"강원\",\r\n" + 
				"				\"stock_code\": \"114190\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00986898\",\r\n" + 
				"				\"corp_name\": \"팜스빌\",\r\n" + 
				"				\"stock_code\": \"318010\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264714\",\r\n" + 
				"				\"corp_name\": \"SG&G\",\r\n" + 
				"				\"stock_code\": \"040610\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00939687\",\r\n" + 
				"				\"corp_name\": \"동일고무벨트\",\r\n" + 
				"				\"stock_code\": \"163560\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00168401\",\r\n" + 
				"				\"corp_name\": \"금비\",\r\n" + 
				"				\"stock_code\": \"008870\",\r\n" + 
				"				\"modify_date\": \"20201116\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01047451\",\r\n" + 
				"				\"corp_name\": \"셀바스헬스케어\",\r\n" + 
				"				\"stock_code\": \"208370\",\r\n" + 
				"				\"modify_date\": \"20201124\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261957\",\r\n" + 
				"				\"corp_name\": \"한국정보공학\",\r\n" + 
				"				\"stock_code\": \"039740\",\r\n" + 
				"				\"modify_date\": \"20201124\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00642541\",\r\n" + 
				"				\"corp_name\": \"디엔에이링크\",\r\n" + 
				"				\"stock_code\": \"127120\",\r\n" + 
				"				\"modify_date\": \"20201124\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00694942\",\r\n" + 
				"				\"corp_name\": \"이미지스\",\r\n" + 
				"				\"stock_code\": \"115610\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01013694\",\r\n" + 
				"				\"corp_name\": \"인카금융서비스\",\r\n" + 
				"				\"stock_code\": \"211050\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00216498\",\r\n" + 
				"				\"corp_name\": \"성도이엔지\",\r\n" + 
				"				\"stock_code\": \"037350\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00579139\",\r\n" + 
				"				\"corp_name\": \"한국맥널티\",\r\n" + 
				"				\"stock_code\": \"222980\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00843900\",\r\n" + 
				"				\"corp_name\": \"육일씨엔에쓰\",\r\n" + 
				"				\"stock_code\": \"191410\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00910947\",\r\n" + 
				"				\"corp_name\": \"바다로19호\",\r\n" + 
				"				\"stock_code\": \"155900\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120289\",\r\n" + 
				"				\"corp_name\": \"제이에스티나\",\r\n" + 
				"				\"stock_code\": \"026040\",\r\n" + 
				"				\"modify_date\": \"20201229\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00855093\",\r\n" + 
				"				\"corp_name\": \"선진\",\r\n" + 
				"				\"stock_code\": \"136490\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00167280\",\r\n" + 
				"				\"corp_name\": \"폴루스바이오팜\",\r\n" + 
				"				\"stock_code\": \"007630\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00199076\",\r\n" + 
				"				\"corp_name\": \"동일기연\",\r\n" + 
				"				\"stock_code\": \"032960\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132318\",\r\n" + 
				"				\"corp_name\": \"성광벤드\",\r\n" + 
				"				\"stock_code\": \"014620\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00861076\",\r\n" + 
				"				\"corp_name\": \"케이탑리츠\",\r\n" + 
				"				\"stock_code\": \"145270\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109161\",\r\n" + 
				"				\"corp_name\": \"태경케미컬\",\r\n" + 
				"				\"stock_code\": \"006890\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01414936\",\r\n" + 
				"				\"corp_name\": \"SK6호스팩\",\r\n" + 
				"				\"stock_code\": \"340350\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00858364\",\r\n" + 
				"				\"corp_name\": \"BNK금융지주\",\r\n" + 
				"				\"stock_code\": \"138930\",\r\n" + 
				"				\"modify_date\": \"20201228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00178790\",\r\n" + 
				"				\"corp_name\": \"동양이엔피\",\r\n" + 
				"				\"stock_code\": \"079960\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103547\",\r\n" + 
				"				\"corp_name\": \"우진비앤지\",\r\n" + 
				"				\"stock_code\": \"018620\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264671\",\r\n" + 
				"				\"corp_name\": \"세중\",\r\n" + 
				"				\"stock_code\": \"039310\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01008762\",\r\n" + 
				"				\"corp_name\": \"데브시스터즈\",\r\n" + 
				"				\"stock_code\": \"194480\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01311286\",\r\n" + 
				"				\"corp_name\": \"퀀타매트릭스\",\r\n" + 
				"				\"stock_code\": \"317690\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01251595\",\r\n" + 
				"				\"corp_name\": \"압타바이오\",\r\n" + 
				"				\"stock_code\": \"293780\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00925587\",\r\n" + 
				"				\"corp_name\": \"위드텍\",\r\n" + 
				"				\"stock_code\": \"348350\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00399694\",\r\n" + 
				"				\"corp_name\": \"아프리카TV\",\r\n" + 
				"				\"stock_code\": \"067160\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01344363\",\r\n" + 
				"				\"corp_name\": \"다원넥스뷰\",\r\n" + 
				"				\"stock_code\": \"323350\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152127\",\r\n" + 
				"				\"corp_name\": \"심텍홀딩스\",\r\n" + 
				"				\"stock_code\": \"036710\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01095722\",\r\n" + 
				"				\"corp_name\": \"심텍\",\r\n" + 
				"				\"stock_code\": \"222800\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01050738\",\r\n" + 
				"				\"corp_name\": \"솔트룩스\",\r\n" + 
				"				\"stock_code\": \"304100\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00397191\",\r\n" + 
				"				\"corp_name\": \"팬엔터테인먼트\",\r\n" + 
				"				\"stock_code\": \"068050\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01159233\",\r\n" + 
				"				\"corp_name\": \"솔루엠\",\r\n" + 
				"				\"stock_code\": \"248070\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00157539\",\r\n" + 
				"				\"corp_name\": \"KB오토시스\",\r\n" + 
				"				\"stock_code\": \"024120\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01049422\",\r\n" + 
				"				\"corp_name\": \"썸에이지\",\r\n" + 
				"				\"stock_code\": \"208640\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128661\",\r\n" + 
				"				\"corp_name\": \"에스에이엠티\",\r\n" + 
				"				\"stock_code\": \"031330\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00266934\",\r\n" + 
				"				\"corp_name\": \"파루\",\r\n" + 
				"				\"stock_code\": \"043200\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00373021\",\r\n" + 
				"				\"corp_name\": \"테라사이언스\",\r\n" + 
				"				\"stock_code\": \"073640\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108038\",\r\n" + 
				"				\"corp_name\": \"엔피씨\",\r\n" + 
				"				\"stock_code\": \"004250\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132992\",\r\n" + 
				"				\"corp_name\": \"성우하이텍\",\r\n" + 
				"				\"stock_code\": \"015750\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447502\",\r\n" + 
				"				\"corp_name\": \"바이오톡스텍\",\r\n" + 
				"				\"stock_code\": \"086040\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00174004\",\r\n" + 
				"				\"corp_name\": \"유성기업\",\r\n" + 
				"				\"stock_code\": \"002920\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00288495\",\r\n" + 
				"				\"corp_name\": \"홈센타홀딩스\",\r\n" + 
				"				\"stock_code\": \"060560\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00554024\",\r\n" + 
				"				\"corp_name\": \"셀트리온헬스케어\",\r\n" + 
				"				\"stock_code\": \"091990\",\r\n" + 
				"				\"modify_date\": \"20210105\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00230814\",\r\n" + 
				"				\"corp_name\": \"OQP\",\r\n" + 
				"				\"stock_code\": \"078590\",\r\n" + 
				"				\"modify_date\": \"20210105\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00878517\",\r\n" + 
				"				\"corp_name\": \"에스케이씨에스\",\r\n" + 
				"				\"stock_code\": \"224020\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00608839\",\r\n" + 
				"				\"corp_name\": \"에이루트\",\r\n" + 
				"				\"stock_code\": \"096690\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00313649\",\r\n" + 
				"				\"corp_name\": \"현대바이오\",\r\n" + 
				"				\"stock_code\": \"048410\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00270113\",\r\n" + 
				"				\"corp_name\": \"멕아이씨에스\",\r\n" + 
				"				\"stock_code\": \"058110\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00245898\",\r\n" + 
				"				\"corp_name\": \"아래스\",\r\n" + 
				"				\"stock_code\": \"050320\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136165\",\r\n" + 
				"				\"corp_name\": \"스페코\",\r\n" + 
				"				\"stock_code\": \"013810\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134723\",\r\n" + 
				"				\"corp_name\": \"페이퍼코리아\",\r\n" + 
				"				\"stock_code\": \"001020\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111218\",\r\n" + 
				"				\"corp_name\": \"KD\",\r\n" + 
				"				\"stock_code\": \"044180\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113508\",\r\n" + 
				"				\"corp_name\": \"노루홀딩스\",\r\n" + 
				"				\"stock_code\": \"000320\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01251489\",\r\n" + 
				"				\"corp_name\": \"라온피플\",\r\n" + 
				"				\"stock_code\": \"300120\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01227039\",\r\n" + 
				"				\"corp_name\": \"브릿지바이오\",\r\n" + 
				"				\"stock_code\": \"288330\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145163\",\r\n" + 
				"				\"corp_name\": \"파미셀\",\r\n" + 
				"				\"stock_code\": \"005690\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00365758\",\r\n" + 
				"				\"corp_name\": \"아이앤씨\",\r\n" + 
				"				\"stock_code\": \"052860\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137915\",\r\n" + 
				"				\"corp_name\": \"에스엠코어\",\r\n" + 
				"				\"stock_code\": \"007820\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01327092\",\r\n" + 
				"				\"corp_name\": \"라닉스\",\r\n" + 
				"				\"stock_code\": \"317120\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00997812\",\r\n" + 
				"				\"corp_name\": \"코미코\",\r\n" + 
				"				\"stock_code\": \"183300\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141389\",\r\n" + 
				"				\"corp_name\": \"영풍정밀\",\r\n" + 
				"				\"stock_code\": \"036560\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00200275\",\r\n" + 
				"				\"corp_name\": \"YTN\",\r\n" + 
				"				\"stock_code\": \"040300\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00300557\",\r\n" + 
				"				\"corp_name\": \"위니아딤채\",\r\n" + 
				"				\"stock_code\": \"071460\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00480950\",\r\n" + 
				"				\"corp_name\": \"이아이디\",\r\n" + 
				"				\"stock_code\": \"093230\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149804\",\r\n" + 
				"				\"corp_name\": \"대유에이텍\",\r\n" + 
				"				\"stock_code\": \"002880\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00194947\",\r\n" + 
				"				\"corp_name\": \"한전산업\",\r\n" + 
				"				\"stock_code\": \"130660\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00186939\",\r\n" + 
				"				\"corp_name\": \"특수건설\",\r\n" + 
				"				\"stock_code\": \"026150\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00491938\",\r\n" + 
				"				\"corp_name\": \"GH신소재\",\r\n" + 
				"				\"stock_code\": \"130500\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00842585\",\r\n" + 
				"				\"corp_name\": \"네이블커뮤니케이션즈\",\r\n" + 
				"				\"stock_code\": \"153460\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01219155\",\r\n" + 
				"				\"corp_name\": \"네오크레마\",\r\n" + 
				"				\"stock_code\": \"311390\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00876908\",\r\n" + 
				"				\"corp_name\": \"모트렉스\",\r\n" + 
				"				\"stock_code\": \"118990\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00612188\",\r\n" + 
				"				\"corp_name\": \"에스티오\",\r\n" + 
				"				\"stock_code\": \"098660\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148896\",\r\n" + 
				"				\"corp_name\": \"OCI\",\r\n" + 
				"				\"stock_code\": \"010060\",\r\n" + 
				"				\"modify_date\": \"20210106\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00187725\",\r\n" + 
				"				\"corp_name\": \"코콤\",\r\n" + 
				"				\"stock_code\": \"015710\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00232089\",\r\n" + 
				"				\"corp_name\": \"바이온\",\r\n" + 
				"				\"stock_code\": \"032980\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129554\",\r\n" + 
				"				\"corp_name\": \"갤럭시아에스엠\",\r\n" + 
				"				\"stock_code\": \"011420\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00423177\",\r\n" + 
				"				\"corp_name\": \"텔레칩스\",\r\n" + 
				"				\"stock_code\": \"054450\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00230911\",\r\n" + 
				"				\"corp_name\": \"HRS\",\r\n" + 
				"				\"stock_code\": \"036640\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114093\",\r\n" + 
				"				\"corp_name\": \"덕성\",\r\n" + 
				"				\"stock_code\": \"004830\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01326224\",\r\n" + 
				"				\"corp_name\": \"원바이오젠\",\r\n" + 
				"				\"stock_code\": \"307280\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132628\",\r\n" + 
				"				\"corp_name\": \"성문전자\",\r\n" + 
				"				\"stock_code\": \"014910\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124726\",\r\n" + 
				"				\"corp_name\": \"빙그레\",\r\n" + 
				"				\"stock_code\": \"005180\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141477\",\r\n" + 
				"				\"corp_name\": \"영흥\",\r\n" + 
				"				\"stock_code\": \"012160\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00617998\",\r\n" + 
				"				\"corp_name\": \"세원\",\r\n" + 
				"				\"stock_code\": \"234100\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00573579\",\r\n" + 
				"				\"corp_name\": \"평화산업\",\r\n" + 
				"				\"stock_code\": \"090080\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00532855\",\r\n" + 
				"				\"corp_name\": \"한국유니온제약\",\r\n" + 
				"				\"stock_code\": \"080720\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173874\",\r\n" + 
				"				\"corp_name\": \"넥센타이어\",\r\n" + 
				"				\"stock_code\": \"002350\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101220\",\r\n" + 
				"				\"corp_name\": \"KG케미칼\",\r\n" + 
				"				\"stock_code\": \"001390\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00513948\",\r\n" + 
				"				\"corp_name\": \"녹십자엠에스\",\r\n" + 
				"				\"stock_code\": \"142280\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447487\",\r\n" + 
				"				\"corp_name\": \"제주반도체\",\r\n" + 
				"				\"stock_code\": \"080220\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101044\",\r\n" + 
				"				\"corp_name\": \"에이프로젠제약\",\r\n" + 
				"				\"stock_code\": \"003060\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141608\",\r\n" + 
				"				\"corp_name\": \"오리엔탈정공\",\r\n" + 
				"				\"stock_code\": \"014940\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00653194\",\r\n" + 
				"				\"corp_name\": \"에이프로젠 H&G\",\r\n" + 
				"				\"stock_code\": \"109960\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01084364\",\r\n" + 
				"				\"corp_name\": \"엔지스테크널러지\",\r\n" + 
				"				\"stock_code\": \"208860\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122825\",\r\n" + 
				"				\"corp_name\": \"인스코비\",\r\n" + 
				"				\"stock_code\": \"006490\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136402\",\r\n" + 
				"				\"corp_name\": \"신송홀딩스\",\r\n" + 
				"				\"stock_code\": \"006880\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00449379\",\r\n" + 
				"				\"corp_name\": \"도이치모터스\",\r\n" + 
				"				\"stock_code\": \"067990\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00552859\",\r\n" + 
				"				\"corp_name\": \"지트리비앤티\",\r\n" + 
				"				\"stock_code\": \"115450\",\r\n" + 
				"				\"modify_date\": \"20201023\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533191\",\r\n" + 
				"				\"corp_name\": \"비보존 헬스케어\",\r\n" + 
				"				\"stock_code\": \"082800\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00335076\",\r\n" + 
				"				\"corp_name\": \"오픈베이스\",\r\n" + 
				"				\"stock_code\": \"049480\",\r\n" + 
				"				\"modify_date\": \"20201230\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00186559\",\r\n" + 
				"				\"corp_name\": \"콤텍시스템\",\r\n" + 
				"				\"stock_code\": \"031820\",\r\n" + 
				"				\"modify_date\": \"20201230\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00767460\",\r\n" + 
				"				\"corp_name\": \"PI첨단소재\",\r\n" + 
				"				\"stock_code\": \"178920\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01190780\",\r\n" + 
				"				\"corp_name\": \"파워풀엑스\",\r\n" + 
				"				\"stock_code\": \"266870\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00687711\",\r\n" + 
				"				\"corp_name\": \"한국철강\",\r\n" + 
				"				\"stock_code\": \"104700\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159740\",\r\n" + 
				"				\"corp_name\": \"KISCO홀딩스\",\r\n" + 
				"				\"stock_code\": \"001940\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145598\",\r\n" + 
				"				\"corp_name\": \"이연제약\",\r\n" + 
				"				\"stock_code\": \"102460\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133812\",\r\n" + 
				"				\"corp_name\": \"세방\",\r\n" + 
				"				\"stock_code\": \"004360\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155124\",\r\n" + 
				"				\"corp_name\": \"평화홀딩스\",\r\n" + 
				"				\"stock_code\": \"010770\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156442\",\r\n" + 
				"				\"corp_name\": \"한국가구\",\r\n" + 
				"				\"stock_code\": \"004590\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163673\",\r\n" + 
				"				\"corp_name\": \"한진중공업홀딩스\",\r\n" + 
				"				\"stock_code\": \"003480\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00197476\",\r\n" + 
				"				\"corp_name\": \"코엔텍\",\r\n" + 
				"				\"stock_code\": \"029960\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01142075\",\r\n" + 
				"				\"corp_name\": \"핑거\",\r\n" + 
				"				\"stock_code\": \"163730\",\r\n" + 
				"				\"modify_date\": \"20210129\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526447\",\r\n" + 
				"				\"corp_name\": \"동북아12호선박투자회사\",\r\n" + 
				"				\"stock_code\": \"083370\",\r\n" + 
				"				\"modify_date\": \"20200623\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111874\",\r\n" + 
				"				\"corp_name\": \"대원산업\",\r\n" + 
				"				\"stock_code\": \"005710\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00453929\",\r\n" + 
				"				\"corp_name\": \"메디포스트\",\r\n" + 
				"				\"stock_code\": \"078160\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00176516\",\r\n" + 
				"				\"corp_name\": \"금화피에스시\",\r\n" + 
				"				\"stock_code\": \"036190\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00925967\",\r\n" + 
				"				\"corp_name\": \"이엠티\",\r\n" + 
				"				\"stock_code\": \"232530\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166315\",\r\n" + 
				"				\"corp_name\": \"화신\",\r\n" + 
				"				\"stock_code\": \"010690\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123143\",\r\n" + 
				"				\"corp_name\": \"보령제약\",\r\n" + 
				"				\"stock_code\": \"003850\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01042650\",\r\n" + 
				"				\"corp_name\": \"큐리언트\",\r\n" + 
				"				\"stock_code\": \"115180\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134963\",\r\n" + 
				"				\"corp_name\": \"송원산업\",\r\n" + 
				"				\"stock_code\": \"004430\",\r\n" + 
				"				\"modify_date\": \"20210107\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00273439\",\r\n" + 
				"				\"corp_name\": \"메디아나\",\r\n" + 
				"				\"stock_code\": \"041920\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00870861\",\r\n" + 
				"				\"corp_name\": \"와이엠씨\",\r\n" + 
				"				\"stock_code\": \"155650\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01166109\",\r\n" + 
				"				\"corp_name\": \"예선테크\",\r\n" + 
				"				\"stock_code\": \"250930\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127167\",\r\n" + 
				"				\"corp_name\": \"삼영무역\",\r\n" + 
				"				\"stock_code\": \"002810\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01139035\",\r\n" + 
				"				\"corp_name\": \"티에스아이\",\r\n" + 
				"				\"stock_code\": \"277880\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00654175\",\r\n" + 
				"				\"corp_name\": \"마이크로프랜드\",\r\n" + 
				"				\"stock_code\": \"147760\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01267958\",\r\n" + 
				"				\"corp_name\": \"프로테옴텍\",\r\n" + 
				"				\"stock_code\": \"303360\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129989\",\r\n" + 
				"				\"corp_name\": \"코스모신소재\",\r\n" + 
				"				\"stock_code\": \"005070\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580199\",\r\n" + 
				"				\"corp_name\": \"메디톡스\",\r\n" + 
				"				\"stock_code\": \"086900\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113225\",\r\n" + 
				"				\"corp_name\": \"대한제강\",\r\n" + 
				"				\"stock_code\": \"084010\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00248974\",\r\n" + 
				"				\"corp_name\": \"하나제약\",\r\n" + 
				"				\"stock_code\": \"293480\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120562\",\r\n" + 
				"				\"corp_name\": \"롯데지주\",\r\n" + 
				"				\"stock_code\": \"004990\",\r\n" + 
				"				\"modify_date\": \"20210113\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01030132\",\r\n" + 
				"				\"corp_name\": \"경남은행\",\r\n" + 
				"				\"stock_code\": \"192520\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104856\",\r\n" + 
				"				\"corp_name\": \"삼성증권\",\r\n" + 
				"				\"stock_code\": \"016360\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163114\",\r\n" + 
				"				\"corp_name\": \"서연\",\r\n" + 
				"				\"stock_code\": \"007860\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00277736\",\r\n" + 
				"				\"corp_name\": \"한일네트웍스\",\r\n" + 
				"				\"stock_code\": \"046110\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265421\",\r\n" + 
				"				\"corp_name\": \"인지디스플레\",\r\n" + 
				"				\"stock_code\": \"037330\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00207375\",\r\n" + 
				"				\"corp_name\": \"대한뉴팜\",\r\n" + 
				"				\"stock_code\": \"054670\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367695\",\r\n" + 
				"				\"corp_name\": \"대한그린파워\",\r\n" + 
				"				\"stock_code\": \"060900\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00374738\",\r\n" + 
				"				\"corp_name\": \"위세아이텍\",\r\n" + 
				"				\"stock_code\": \"065370\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117726\",\r\n" + 
				"				\"corp_name\": \"동양피스톤\",\r\n" + 
				"				\"stock_code\": \"092780\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00435297\",\r\n" + 
				"				\"corp_name\": \"맥쿼리인프라\",\r\n" + 
				"				\"stock_code\": \"088980\",\r\n" + 
				"				\"modify_date\": \"20200715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244419\",\r\n" + 
				"				\"corp_name\": \"디에스티\",\r\n" + 
				"				\"stock_code\": \"033430\",\r\n" + 
				"				\"modify_date\": \"20201223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00230036\",\r\n" + 
				"				\"corp_name\": \"드래곤플라이\",\r\n" + 
				"				\"stock_code\": \"030350\",\r\n" + 
				"				\"modify_date\": \"20201224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00317104\",\r\n" + 
				"				\"corp_name\": \"라이온켐텍\",\r\n" + 
				"				\"stock_code\": \"171120\",\r\n" + 
				"				\"modify_date\": \"20210118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00651017\",\r\n" + 
				"				\"corp_name\": \"나우IB\",\r\n" + 
				"				\"stock_code\": \"293580\",\r\n" + 
				"				\"modify_date\": \"20210121\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159102\",\r\n" + 
				"				\"corp_name\": \"DB손해보험\",\r\n" + 
				"				\"stock_code\": \"005830\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159023\",\r\n" + 
				"				\"corp_name\": \"SK텔레콤\",\r\n" + 
				"				\"stock_code\": \"017670\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265005\",\r\n" + 
				"				\"corp_name\": \"옴니시스템\",\r\n" + 
				"				\"stock_code\": \"057540\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00347442\",\r\n" + 
				"				\"corp_name\": \"모보\",\r\n" + 
				"				\"stock_code\": \"051810\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151368\",\r\n" + 
				"				\"corp_name\": \"인터지스\",\r\n" + 
				"				\"stock_code\": \"129260\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148504\",\r\n" + 
				"				\"corp_name\": \"한국스탠다드차타드은행\",\r\n" + 
				"				\"stock_code\": \"000110\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127802\",\r\n" + 
				"				\"corp_name\": \"삼익THK\",\r\n" + 
				"				\"stock_code\": \"004380\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120030\",\r\n" + 
				"				\"corp_name\": \"GS건설\",\r\n" + 
				"				\"stock_code\": \"006360\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166519\",\r\n" + 
				"				\"corp_name\": \"화천기공\",\r\n" + 
				"				\"stock_code\": \"000850\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00308896\",\r\n" + 
				"				\"corp_name\": \"아이씨케이\",\r\n" + 
				"				\"stock_code\": \"068940\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138279\",\r\n" + 
				"				\"corp_name\": \"S-Oil\",\r\n" + 
				"				\"stock_code\": \"010950\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00258421\",\r\n" + 
				"				\"corp_name\": \"기산텔레콤\",\r\n" + 
				"				\"stock_code\": \"035460\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00172228\",\r\n" + 
				"				\"corp_name\": \"엔케이\",\r\n" + 
				"				\"stock_code\": \"085310\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113234\",\r\n" + 
				"				\"corp_name\": \"대한제당\",\r\n" + 
				"				\"stock_code\": \"001790\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00250997\",\r\n" + 
				"				\"corp_name\": \"대정화금\",\r\n" + 
				"				\"stock_code\": \"120240\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00483735\",\r\n" + 
				"				\"corp_name\": \"해성옵틱스\",\r\n" + 
				"				\"stock_code\": \"076610\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533003\",\r\n" + 
				"				\"corp_name\": \"디케이락\",\r\n" + 
				"				\"stock_code\": \"105740\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129013\",\r\n" + 
				"				\"corp_name\": \"CJ씨푸드\",\r\n" + 
				"				\"stock_code\": \"011150\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01113718\",\r\n" + 
				"				\"corp_name\": \"올릭스\",\r\n" + 
				"				\"stock_code\": \"226950\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132354\",\r\n" + 
				"				\"corp_name\": \"쿠쿠홀딩스\",\r\n" + 
				"				\"stock_code\": \"192400\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00119007\",\r\n" + 
				"				\"corp_name\": \"무림P&P\",\r\n" + 
				"				\"stock_code\": \"009580\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367871\",\r\n" + 
				"				\"corp_name\": \"인바이오\",\r\n" + 
				"				\"stock_code\": \"352940\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01152470\",\r\n" + 
				"				\"corp_name\": \"펄어비스\",\r\n" + 
				"				\"stock_code\": \"263750\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00583026\",\r\n" + 
				"				\"corp_name\": \"율호\",\r\n" + 
				"				\"stock_code\": \"072770\",\r\n" + 
				"				\"modify_date\": \"20201224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164876\",\r\n" + 
				"				\"corp_name\": \"케이비증권\",\r\n" + 
				"				\"stock_code\": \"003450\",\r\n" + 
				"				\"modify_date\": \"20210106\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161444\",\r\n" + 
				"				\"corp_name\": \"한국씨티은행\",\r\n" + 
				"				\"stock_code\": \"016830\",\r\n" + 
				"				\"modify_date\": \"20210114\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00174208\",\r\n" + 
				"				\"corp_name\": \"진성티이씨\",\r\n" + 
				"				\"stock_code\": \"036890\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00574611\",\r\n" + 
				"				\"corp_name\": \"SDN\",\r\n" + 
				"				\"stock_code\": \"099220\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00441243\",\r\n" + 
				"				\"corp_name\": \"형지엘리트\",\r\n" + 
				"				\"stock_code\": \"093240\",\r\n" + 
				"				\"modify_date\": \"20200610\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00598587\",\r\n" + 
				"				\"corp_name\": \"인터파크\",\r\n" + 
				"				\"stock_code\": \"108790\",\r\n" + 
				"				\"modify_date\": \"20200716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00184889\",\r\n" + 
				"				\"corp_name\": \"이건홀딩스\",\r\n" + 
				"				\"stock_code\": \"039020\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145446\",\r\n" + 
				"				\"corp_name\": \"이건산업\",\r\n" + 
				"				\"stock_code\": \"008250\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00945208\",\r\n" + 
				"				\"corp_name\": \"THE MIDONG\",\r\n" + 
				"				\"stock_code\": \"161570\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116268\",\r\n" + 
				"				\"corp_name\": \"동성제약\",\r\n" + 
				"				\"stock_code\": \"002210\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01026616\",\r\n" + 
				"				\"corp_name\": \"유투바이오\",\r\n" + 
				"				\"stock_code\": \"221800\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00458562\",\r\n" + 
				"				\"corp_name\": \"에이티세미콘\",\r\n" + 
				"				\"stock_code\": \"089530\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00946030\",\r\n" + 
				"				\"corp_name\": \"로보티즈\",\r\n" + 
				"				\"stock_code\": \"108490\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01051092\",\r\n" + 
				"				\"corp_name\": \"피씨엘\",\r\n" + 
				"				\"stock_code\": \"241820\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00527491\",\r\n" + 
				"				\"corp_name\": \"코리아에스이\",\r\n" + 
				"				\"stock_code\": \"101670\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00939331\",\r\n" + 
				"				\"corp_name\": \"한국콜마\",\r\n" + 
				"				\"stock_code\": \"161890\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260879\",\r\n" + 
				"				\"corp_name\": \"카페24\",\r\n" + 
				"				\"stock_code\": \"042000\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00425254\",\r\n" + 
				"				\"corp_name\": \"나우코스\",\r\n" + 
				"				\"stock_code\": \"257990\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01027794\",\r\n" + 
				"				\"corp_name\": \"브이원텍\",\r\n" + 
				"				\"stock_code\": \"251630\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139454\",\r\n" + 
				"				\"corp_name\": \"애경산업\",\r\n" + 
				"				\"stock_code\": \"018250\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00362201\",\r\n" + 
				"				\"corp_name\": \"세운메디칼\",\r\n" + 
				"				\"stock_code\": \"100700\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129350\",\r\n" + 
				"				\"corp_name\": \"삼화콘덴서공업\",\r\n" + 
				"				\"stock_code\": \"001820\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112819\",\r\n" + 
				"				\"corp_name\": \"데코앤이\",\r\n" + 
				"				\"stock_code\": \"017680\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00355089\",\r\n" + 
				"				\"corp_name\": \"토탈소프트\",\r\n" + 
				"				\"stock_code\": \"045340\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104786\",\r\n" + 
				"				\"corp_name\": \"미래아이앤지\",\r\n" + 
				"				\"stock_code\": \"007120\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01505450\",\r\n" + 
				"				\"corp_name\": \"DB금융스팩8호\",\r\n" + 
				"				\"stock_code\": \"367340\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01189438\",\r\n" + 
				"				\"corp_name\": \"노터스\",\r\n" + 
				"				\"stock_code\": \"278650\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01442115\",\r\n" + 
				"				\"corp_name\": \"소마젠\",\r\n" + 
				"				\"stock_code\": \"950200\",\r\n" + 
				"				\"modify_date\": \"20200730\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00599957\",\r\n" + 
				"				\"corp_name\": \"슈프리마에이치큐\",\r\n" + 
				"				\"stock_code\": \"094840\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01508855\",\r\n" + 
				"				\"corp_name\": \"대신밸런스제9호스팩\",\r\n" + 
				"				\"stock_code\": \"369370\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01251577\",\r\n" + 
				"				\"corp_name\": \"휴네시온\",\r\n" + 
				"				\"stock_code\": \"290270\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115694\",\r\n" + 
				"				\"corp_name\": \"DB금융투자\",\r\n" + 
				"				\"stock_code\": \"016610\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131780\",\r\n" + 
				"				\"corp_name\": \"SK네트웍스\",\r\n" + 
				"				\"stock_code\": \"001740\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00832700\",\r\n" + 
				"				\"corp_name\": \"에이펙스인텍\",\r\n" + 
				"				\"stock_code\": \"207490\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173591\",\r\n" + 
				"				\"corp_name\": \"세원물산\",\r\n" + 
				"				\"stock_code\": \"024830\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161860\",\r\n" + 
				"				\"corp_name\": \"한성기업\",\r\n" + 
				"				\"stock_code\": \"003680\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00356802\",\r\n" + 
				"				\"corp_name\": \"큐렉소\",\r\n" + 
				"				\"stock_code\": \"060280\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00423690\",\r\n" + 
				"				\"corp_name\": \"삼성출판사\",\r\n" + 
				"				\"stock_code\": \"068290\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00608699\",\r\n" + 
				"				\"corp_name\": \"디엠티\",\r\n" + 
				"				\"stock_code\": \"134580\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114154\",\r\n" + 
				"				\"corp_name\": \"덕양산업\",\r\n" + 
				"				\"stock_code\": \"024900\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01063237\",\r\n" + 
				"				\"corp_name\": \"플럼라인생명과학\",\r\n" + 
				"				\"stock_code\": \"222670\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00393618\",\r\n" + 
				"				\"corp_name\": \"제노텍\",\r\n" + 
				"				\"stock_code\": \"066830\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140779\",\r\n" + 
				"				\"corp_name\": \"영보화학\",\r\n" + 
				"				\"stock_code\": \"014440\",\r\n" + 
				"				\"modify_date\": \"20201228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01419384\",\r\n" + 
				"				\"corp_name\": \"하나금융16호스팩\",\r\n" + 
				"				\"stock_code\": \"343510\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231354\",\r\n" + 
				"				\"corp_name\": \"파워넷\",\r\n" + 
				"				\"stock_code\": \"037030\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123523\",\r\n" + 
				"				\"corp_name\": \"창해에탄올\",\r\n" + 
				"				\"stock_code\": \"004650\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149026\",\r\n" + 
				"				\"corp_name\": \"CS홀딩스\",\r\n" + 
				"				\"stock_code\": \"000590\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00796994\",\r\n" + 
				"				\"corp_name\": \"조선선재\",\r\n" + 
				"				\"stock_code\": \"120030\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00360595\",\r\n" + 
				"				\"corp_name\": \"현대글로비스\",\r\n" + 
				"				\"stock_code\": \"086280\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00439965\",\r\n" + 
				"				\"corp_name\": \"나노신소재\",\r\n" + 
				"				\"stock_code\": \"121600\",\r\n" + 
				"				\"modify_date\": \"20201113\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128315\",\r\n" + 
				"				\"corp_name\": \"삼지전자\",\r\n" + 
				"				\"stock_code\": \"037460\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01243772\",\r\n" + 
				"				\"corp_name\": \"신한제4호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"277480\",\r\n" + 
				"				\"modify_date\": \"20200820\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351092\",\r\n" + 
				"				\"corp_name\": \"삼보모터스\",\r\n" + 
				"				\"stock_code\": \"053700\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140964\",\r\n" + 
				"				\"corp_name\": \"영원무역홀딩스\",\r\n" + 
				"				\"stock_code\": \"009970\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00172079\",\r\n" + 
				"				\"corp_name\": \"파나진\",\r\n" + 
				"				\"stock_code\": \"046210\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00171867\",\r\n" + 
				"				\"corp_name\": \"에스씨디\",\r\n" + 
				"				\"stock_code\": \"042110\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133876\",\r\n" + 
				"				\"corp_name\": \"세보엠이씨\",\r\n" + 
				"				\"stock_code\": \"011560\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00174527\",\r\n" + 
				"				\"corp_name\": \"화성산업\",\r\n" + 
				"				\"stock_code\": \"002460\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00191472\",\r\n" + 
				"				\"corp_name\": \"KPX케미칼\",\r\n" + 
				"				\"stock_code\": \"025000\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01137903\",\r\n" + 
				"				\"corp_name\": \"디케이티\",\r\n" + 
				"				\"stock_code\": \"290550\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01187175\",\r\n" + 
				"				\"corp_name\": \"라이프사이언스테크놀로지\",\r\n" + 
				"				\"stock_code\": \"285770\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134510\",\r\n" + 
				"				\"corp_name\": \"세종공업\",\r\n" + 
				"				\"stock_code\": \"033530\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00490151\",\r\n" + 
				"				\"corp_name\": \"파트론\",\r\n" + 
				"				\"stock_code\": \"091700\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01335851\",\r\n" + 
				"				\"corp_name\": \"박셀바이오\",\r\n" + 
				"				\"stock_code\": \"323990\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159971\",\r\n" + 
				"				\"corp_name\": \"KC그린홀딩스\",\r\n" + 
				"				\"stock_code\": \"009440\",\r\n" + 
				"				\"modify_date\": \"20210118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00556615\",\r\n" + 
				"				\"corp_name\": \"모바일어플라이언스\",\r\n" + 
				"				\"stock_code\": \"087260\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01336735\",\r\n" + 
				"				\"corp_name\": \"펨토바이오메드\",\r\n" + 
				"				\"stock_code\": \"327610\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01364297\",\r\n" + 
				"				\"corp_name\": \"코퍼스코리아\",\r\n" + 
				"				\"stock_code\": \"322780\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01066058\",\r\n" + 
				"				\"corp_name\": \"파마리서치바이오\",\r\n" + 
				"				\"stock_code\": \"217950\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00660121\",\r\n" + 
				"				\"corp_name\": \"디에이테크놀로지\",\r\n" + 
				"				\"stock_code\": \"196490\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105299\",\r\n" + 
				"				\"corp_name\": \"금강공업\",\r\n" + 
				"				\"stock_code\": \"014280\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533508\",\r\n" + 
				"				\"corp_name\": \"제이엠티\",\r\n" + 
				"				\"stock_code\": \"094970\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00529815\",\r\n" + 
				"				\"corp_name\": \"오디텍\",\r\n" + 
				"				\"stock_code\": \"080520\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00347734\",\r\n" + 
				"				\"corp_name\": \"진양화학\",\r\n" + 
				"				\"stock_code\": \"051630\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350482\",\r\n" + 
				"				\"corp_name\": \"성우테크론\",\r\n" + 
				"				\"stock_code\": \"045300\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00263654\",\r\n" + 
				"				\"corp_name\": \"오스코텍\",\r\n" + 
				"				\"stock_code\": \"039200\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00542074\",\r\n" + 
				"				\"corp_name\": \"나노캠텍\",\r\n" + 
				"				\"stock_code\": \"091970\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103510\",\r\n" + 
				"				\"corp_name\": \"인지컨트롤스\",\r\n" + 
				"				\"stock_code\": \"023800\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00295547\",\r\n" + 
				"				\"corp_name\": \"디지아이\",\r\n" + 
				"				\"stock_code\": \"043360\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111421\",\r\n" + 
				"				\"corp_name\": \"휴니드테크놀러지스\",\r\n" + 
				"				\"stock_code\": \"005870\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00204262\",\r\n" + 
				"				\"corp_name\": \"한글과컴퓨터\",\r\n" + 
				"				\"stock_code\": \"030520\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121543\",\r\n" + 
				"				\"corp_name\": \"무학\",\r\n" + 
				"				\"stock_code\": \"033920\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01325979\",\r\n" + 
				"				\"corp_name\": \"세아제강\",\r\n" + 
				"				\"stock_code\": \"306200\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00629212\",\r\n" + 
				"				\"corp_name\": \"딜리\",\r\n" + 
				"				\"stock_code\": \"131180\",\r\n" + 
				"				\"modify_date\": \"20201123\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00866062\",\r\n" + 
				"				\"corp_name\": \"엘티씨\",\r\n" + 
				"				\"stock_code\": \"170920\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138367\",\r\n" + 
				"				\"corp_name\": \"플레이위드\",\r\n" + 
				"				\"stock_code\": \"023770\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00170026\",\r\n" + 
				"				\"corp_name\": \"시공테크\",\r\n" + 
				"				\"stock_code\": \"020710\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136864\",\r\n" + 
				"				\"corp_name\": \"신원\",\r\n" + 
				"				\"stock_code\": \"009270\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00454937\",\r\n" + 
				"				\"corp_name\": \"덕신하우징\",\r\n" + 
				"				\"stock_code\": \"090410\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01141942\",\r\n" + 
				"				\"corp_name\": \"액트로\",\r\n" + 
				"				\"stock_code\": \"290740\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137359\",\r\n" + 
				"				\"corp_name\": \"신풍제약\",\r\n" + 
				"				\"stock_code\": \"019170\",\r\n" + 
				"				\"modify_date\": \"20210204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103626\",\r\n" + 
				"				\"corp_name\": \"한솔피엔에스\",\r\n" + 
				"				\"stock_code\": \"010420\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00397243\",\r\n" + 
				"				\"corp_name\": \"티에스엠텍\",\r\n" + 
				"				\"stock_code\": \"066350\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139889\",\r\n" + 
				"				\"corp_name\": \"SKC\",\r\n" + 
				"				\"stock_code\": \"011790\",\r\n" + 
				"				\"modify_date\": \"20210114\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112721\",\r\n" + 
				"				\"corp_name\": \"대창스틸\",\r\n" + 
				"				\"stock_code\": \"140520\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00298340\",\r\n" + 
				"				\"corp_name\": \"에스티아이\",\r\n" + 
				"				\"stock_code\": \"039440\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115931\",\r\n" + 
				"				\"corp_name\": \"디오\",\r\n" + 
				"				\"stock_code\": \"039840\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01069736\",\r\n" + 
				"				\"corp_name\": \"한독크린텍\",\r\n" + 
				"				\"stock_code\": \"256150\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00657987\",\r\n" + 
				"				\"corp_name\": \"KMH\",\r\n" + 
				"				\"stock_code\": \"122450\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00671978\",\r\n" + 
				"				\"corp_name\": \"그리티\",\r\n" + 
				"				\"stock_code\": \"204020\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351995\",\r\n" + 
				"				\"corp_name\": \"지에스이\",\r\n" + 
				"				\"stock_code\": \"053050\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00456218\",\r\n" + 
				"				\"corp_name\": \"모두투어\",\r\n" + 
				"				\"stock_code\": \"080160\",\r\n" + 
				"				\"modify_date\": \"20210201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01109539\",\r\n" + 
				"				\"corp_name\": \"와이아이케이\",\r\n" + 
				"				\"stock_code\": \"232140\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01174038\",\r\n" + 
				"				\"corp_name\": \"자비스\",\r\n" + 
				"				\"stock_code\": \"254120\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00147152\",\r\n" + 
				"				\"corp_name\": \"유니크\",\r\n" + 
				"				\"stock_code\": \"011320\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00554352\",\r\n" + 
				"				\"corp_name\": \"아이큐어\",\r\n" + 
				"				\"stock_code\": \"175250\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158325\",\r\n" + 
				"				\"corp_name\": \"NICE평가정보\",\r\n" + 
				"				\"stock_code\": \"030190\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01419135\",\r\n" + 
				"				\"corp_name\": \"이노진\",\r\n" + 
				"				\"stock_code\": \"344860\",\r\n" + 
				"				\"modify_date\": \"20210126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00799539\",\r\n" + 
				"				\"corp_name\": \"제노레이\",\r\n" + 
				"				\"stock_code\": \"122310\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442826\",\r\n" + 
				"				\"corp_name\": \"대봉엘에스\",\r\n" + 
				"				\"stock_code\": \"078140\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00874195\",\r\n" + 
				"				\"corp_name\": \"코썬바이오\",\r\n" + 
				"				\"stock_code\": \"204990\",\r\n" + 
				"				\"modify_date\": \"20200811\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159175\",\r\n" + 
				"				\"corp_name\": \"한국전기초자\",\r\n" + 
				"				\"stock_code\": \"009720\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00357360\",\r\n" + 
				"				\"corp_name\": \"한세엠케이\",\r\n" + 
				"				\"stock_code\": \"069640\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00249982\",\r\n" + 
				"				\"corp_name\": \"솔본\",\r\n" + 
				"				\"stock_code\": \"035610\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120924\",\r\n" + 
				"				\"corp_name\": \"매일홀딩스\",\r\n" + 
				"				\"stock_code\": \"005990\",\r\n" + 
				"				\"modify_date\": \"20201216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111689\",\r\n" + 
				"				\"corp_name\": \"대우부품\",\r\n" + 
				"				\"stock_code\": \"009320\",\r\n" + 
				"				\"modify_date\": \"20201216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106669\",\r\n" + 
				"				\"corp_name\": \"세아베스틸\",\r\n" + 
				"				\"stock_code\": \"001430\",\r\n" + 
				"				\"modify_date\": \"20210118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00273110\",\r\n" + 
				"				\"corp_name\": \"에스티큐브\",\r\n" + 
				"				\"stock_code\": \"052020\",\r\n" + 
				"				\"modify_date\": \"20201030\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00157991\",\r\n" + 
				"				\"corp_name\": \"한국석유공업\",\r\n" + 
				"				\"stock_code\": \"004090\",\r\n" + 
				"				\"modify_date\": \"20201222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106456\",\r\n" + 
				"				\"corp_name\": \"지앤엘\",\r\n" + 
				"				\"stock_code\": \"014590\",\r\n" + 
				"				\"modify_date\": \"20210208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01138993\",\r\n" + 
				"				\"corp_name\": \"원바이오젠\",\r\n" + 
				"				\"stock_code\": \"278380\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159786\",\r\n" + 
				"				\"corp_name\": \"유니드\",\r\n" + 
				"				\"stock_code\": \"014830\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01119387\",\r\n" + 
				"				\"corp_name\": \"이에스산업\",\r\n" + 
				"				\"stock_code\": \"241510\",\r\n" + 
				"				\"modify_date\": \"20210126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148540\",\r\n" + 
				"				\"corp_name\": \"CJ\",\r\n" + 
				"				\"stock_code\": \"001040\",\r\n" + 
				"				\"modify_date\": \"20210128\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00760999\",\r\n" + 
				"				\"corp_name\": \"상신전자\",\r\n" + 
				"				\"stock_code\": \"263810\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146436\",\r\n" + 
				"				\"corp_name\": \"엔브이에이치코리아\",\r\n" + 
				"				\"stock_code\": \"067570\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00611912\",\r\n" + 
				"				\"corp_name\": \"아모그린텍\",\r\n" + 
				"				\"stock_code\": \"125210\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00346407\",\r\n" + 
				"				\"corp_name\": \"큐로컴\",\r\n" + 
				"				\"stock_code\": \"040350\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00297095\",\r\n" + 
				"				\"corp_name\": \"나라엠앤디\",\r\n" + 
				"				\"stock_code\": \"051490\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00407285\",\r\n" + 
				"				\"corp_name\": \"아이컴포넌트\",\r\n" + 
				"				\"stock_code\": \"059100\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00825223\",\r\n" + 
				"				\"corp_name\": \"화신정공\",\r\n" + 
				"				\"stock_code\": \"126640\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00206039\",\r\n" + 
				"				\"corp_name\": \"경남스틸\",\r\n" + 
				"				\"stock_code\": \"039240\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00475985\",\r\n" + 
				"				\"corp_name\": \"시너지이노베이션\",\r\n" + 
				"				\"stock_code\": \"048870\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00599595\",\r\n" + 
				"				\"corp_name\": \"코프라\",\r\n" + 
				"				\"stock_code\": \"126600\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110608\",\r\n" + 
				"				\"corp_name\": \"DSR\",\r\n" + 
				"				\"stock_code\": \"155660\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01234507\",\r\n" + 
				"				\"corp_name\": \"매일유업\",\r\n" + 
				"				\"stock_code\": \"267980\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173999\",\r\n" + 
				"				\"corp_name\": \"유성티엔에스\",\r\n" + 
				"				\"stock_code\": \"024800\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114808\",\r\n" + 
				"				\"corp_name\": \"동국제약\",\r\n" + 
				"				\"stock_code\": \"086450\",\r\n" + 
				"				\"modify_date\": \"20201217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00210980\",\r\n" + 
				"				\"corp_name\": \"원익\",\r\n" + 
				"				\"stock_code\": \"032940\",\r\n" + 
				"				\"modify_date\": \"20201217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01107665\",\r\n" + 
				"				\"corp_name\": \"크리스탈신소재\",\r\n" + 
				"				\"stock_code\": \"900250\",\r\n" + 
				"				\"modify_date\": \"20201109\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104120\",\r\n" + 
				"				\"corp_name\": \"광진실업\",\r\n" + 
				"				\"stock_code\": \"026910\",\r\n" + 
				"				\"modify_date\": \"20201109\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158024\",\r\n" + 
				"				\"corp_name\": \"KBI메탈\",\r\n" + 
				"				\"stock_code\": \"024840\",\r\n" + 
				"				\"modify_date\": \"20201116\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133335\",\r\n" + 
				"				\"corp_name\": \"성창기업지주\",\r\n" + 
				"				\"stock_code\": \"000180\",\r\n" + 
				"				\"modify_date\": \"20201116\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00761952\",\r\n" + 
				"				\"corp_name\": \"아나패스\",\r\n" + 
				"				\"stock_code\": \"123860\",\r\n" + 
				"				\"modify_date\": \"20201117\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00249034\",\r\n" + 
				"				\"corp_name\": \"드림라인\",\r\n" + 
				"				\"stock_code\": \"035430\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153339\",\r\n" + 
				"				\"corp_name\": \"태경산업\",\r\n" + 
				"				\"stock_code\": \"015890\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00239596\",\r\n" + 
				"				\"corp_name\": \"쎄니트\",\r\n" + 
				"				\"stock_code\": \"037760\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01351822\",\r\n" + 
				"				\"corp_name\": \"한화에스비아이스팩\",\r\n" + 
				"				\"stock_code\": \"317320\",\r\n" + 
				"				\"modify_date\": \"20201106\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231831\",\r\n" + 
				"				\"corp_name\": \"조아제약\",\r\n" + 
				"				\"stock_code\": \"034940\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00468374\",\r\n" + 
				"				\"corp_name\": \"원익QnC\",\r\n" + 
				"				\"stock_code\": \"074600\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361008\",\r\n" + 
				"				\"corp_name\": \"HSD엔진\",\r\n" + 
				"				\"stock_code\": \"082740\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231707\",\r\n" + 
				"				\"corp_name\": \"비트컴퓨터\",\r\n" + 
				"				\"stock_code\": \"032850\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00363592\",\r\n" + 
				"				\"corp_name\": \"한컴위드\",\r\n" + 
				"				\"stock_code\": \"054920\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351418\",\r\n" + 
				"				\"corp_name\": \"코리아오토글라스\",\r\n" + 
				"				\"stock_code\": \"152330\",\r\n" + 
				"				\"modify_date\": \"20201218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149770\",\r\n" + 
				"				\"corp_name\": \"중앙에너비스\",\r\n" + 
				"				\"stock_code\": \"000440\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00549925\",\r\n" + 
				"				\"corp_name\": \"루트로닉\",\r\n" + 
				"				\"stock_code\": \"085370\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00445799\",\r\n" + 
				"				\"corp_name\": \"서원인텍\",\r\n" + 
				"				\"stock_code\": \"093920\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109587\",\r\n" + 
				"				\"corp_name\": \"대륙제관\",\r\n" + 
				"				\"stock_code\": \"004780\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00494476\",\r\n" + 
				"				\"corp_name\": \"이녹스\",\r\n" + 
				"				\"stock_code\": \"088390\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01112700\",\r\n" + 
				"				\"corp_name\": \"에스엘에스바이오\",\r\n" + 
				"				\"stock_code\": \"246250\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105466\",\r\n" + 
				"				\"corp_name\": \"KCC건설\",\r\n" + 
				"				\"stock_code\": \"021320\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00688358\",\r\n" + 
				"				\"corp_name\": \"하이즈항공\",\r\n" + 
				"				\"stock_code\": \"221840\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00939942\",\r\n" + 
				"				\"corp_name\": \"포시에스\",\r\n" + 
				"				\"stock_code\": \"189690\",\r\n" + 
				"				\"modify_date\": \"20200824\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01396931\",\r\n" + 
				"				\"corp_name\": \"유엑스엔\",\r\n" + 
				"				\"stock_code\": \"337840\",\r\n" + 
				"				\"modify_date\": \"20201116\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01080687\",\r\n" + 
				"				\"corp_name\": \"아우딘퓨쳐스\",\r\n" + 
				"				\"stock_code\": \"227610\",\r\n" + 
				"				\"modify_date\": \"20201218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00620868\",\r\n" + 
				"				\"corp_name\": \"아이티센\",\r\n" + 
				"				\"stock_code\": \"124500\",\r\n" + 
				"				\"modify_date\": \"20201218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113535\",\r\n" + 
				"				\"corp_name\": \"대한해운\",\r\n" + 
				"				\"stock_code\": \"005880\",\r\n" + 
				"				\"modify_date\": \"20201113\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00331016\",\r\n" + 
				"				\"corp_name\": \"에프앤가이드\",\r\n" + 
				"				\"stock_code\": \"064850\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00869272\",\r\n" + 
				"				\"corp_name\": \"서전기전\",\r\n" + 
				"				\"stock_code\": \"189860\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01353848\",\r\n" + 
				"				\"corp_name\": \"이노벡스\",\r\n" + 
				"				\"stock_code\": \"279060\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01338724\",\r\n" + 
				"				\"corp_name\": \"SNK\",\r\n" + 
				"				\"stock_code\": \"950180\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447609\",\r\n" + 
				"				\"corp_name\": \"비에이치\",\r\n" + 
				"				\"stock_code\": \"090460\",\r\n" + 
				"				\"modify_date\": \"20210205\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00360036\",\r\n" + 
				"				\"corp_name\": \"백금T&A\",\r\n" + 
				"				\"stock_code\": \"046310\",\r\n" + 
				"				\"modify_date\": \"20201116\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01036367\",\r\n" + 
				"				\"corp_name\": \"프로스테믹스\",\r\n" + 
				"				\"stock_code\": \"203690\",\r\n" + 
				"				\"modify_date\": \"20201118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00462121\",\r\n" + 
				"				\"corp_name\": \"이노와이어리스\",\r\n" + 
				"				\"stock_code\": \"073490\",\r\n" + 
				"				\"modify_date\": \"20201224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264787\",\r\n" + 
				"				\"corp_name\": \"럭슬\",\r\n" + 
				"				\"stock_code\": \"033600\",\r\n" + 
				"				\"modify_date\": \"20201224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164973\",\r\n" + 
				"				\"corp_name\": \"현대해상\",\r\n" + 
				"				\"stock_code\": \"001450\",\r\n" + 
				"				\"modify_date\": \"20201229\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01136001\",\r\n" + 
				"				\"corp_name\": \"나노브릭\",\r\n" + 
				"				\"stock_code\": \"286750\",\r\n" + 
				"				\"modify_date\": \"20201230\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267854\",\r\n" + 
				"				\"corp_name\": \"메디앙스\",\r\n" + 
				"				\"stock_code\": \"014100\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442561\",\r\n" + 
				"				\"corp_name\": \"에프알텍\",\r\n" + 
				"				\"stock_code\": \"073540\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00357740\",\r\n" + 
				"				\"corp_name\": \"NHN한국사이버결제\",\r\n" + 
				"				\"stock_code\": \"060250\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141556\",\r\n" + 
				"				\"corp_name\": \"오로라\",\r\n" + 
				"				\"stock_code\": \"039830\",\r\n" + 
				"				\"modify_date\": \"20210128\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00867478\",\r\n" + 
				"				\"corp_name\": \"농업회사법인아시아종묘\",\r\n" + 
				"				\"stock_code\": \"154030\",\r\n" + 
				"				\"modify_date\": \"20201123\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00492894\",\r\n" + 
				"				\"corp_name\": \"젬백스\",\r\n" + 
				"				\"stock_code\": \"082270\",\r\n" + 
				"				\"modify_date\": \"20201123\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00843830\",\r\n" + 
				"				\"corp_name\": \"카이노스메드\",\r\n" + 
				"				\"stock_code\": \"220250\",\r\n" + 
				"				\"modify_date\": \"20200611\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00482426\",\r\n" + 
				"				\"corp_name\": \"인화정공\",\r\n" + 
				"				\"stock_code\": \"101930\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00210856\",\r\n" + 
				"				\"corp_name\": \"코아스\",\r\n" + 
				"				\"stock_code\": \"071950\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261656\",\r\n" + 
				"				\"corp_name\": \"잉크테크\",\r\n" + 
				"				\"stock_code\": \"049550\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107613\",\r\n" + 
				"				\"corp_name\": \"이수페타시스\",\r\n" + 
				"				\"stock_code\": \"007660\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01190513\",\r\n" + 
				"				\"corp_name\": \"명진홀딩스\",\r\n" + 
				"				\"stock_code\": \"267060\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128926\",\r\n" + 
				"				\"corp_name\": \"삼현철강\",\r\n" + 
				"				\"stock_code\": \"017480\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261355\",\r\n" + 
				"				\"corp_name\": \"레드캡투어\",\r\n" + 
				"				\"stock_code\": \"038390\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00516246\",\r\n" + 
				"				\"corp_name\": \"알에프세미\",\r\n" + 
				"				\"stock_code\": \"096610\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00390408\",\r\n" + 
				"				\"corp_name\": \"에프앤리퍼블릭\",\r\n" + 
				"				\"stock_code\": \"064090\",\r\n" + 
				"				\"modify_date\": \"20201118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108977\",\r\n" + 
				"				\"corp_name\": \"대구백화점\",\r\n" + 
				"				\"stock_code\": \"006370\",\r\n" + 
				"				\"modify_date\": \"20201118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01091382\",\r\n" + 
				"				\"corp_name\": \"마이더스AI\",\r\n" + 
				"				\"stock_code\": \"222810\",\r\n" + 
				"				\"modify_date\": \"20201231\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00202060\",\r\n" + 
				"				\"corp_name\": \"구영테크\",\r\n" + 
				"				\"stock_code\": \"053270\",\r\n" + 
				"				\"modify_date\": \"20210104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351454\",\r\n" + 
				"				\"corp_name\": \"큐브앤컴퍼니\",\r\n" + 
				"				\"stock_code\": \"043090\",\r\n" + 
				"				\"modify_date\": \"20210128\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00475976\",\r\n" + 
				"				\"corp_name\": \"인콘\",\r\n" + 
				"				\"stock_code\": \"083640\",\r\n" + 
				"				\"modify_date\": \"20201124\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160621\",\r\n" + 
				"				\"corp_name\": \"한국화장품제조\",\r\n" + 
				"				\"stock_code\": \"003350\",\r\n" + 
				"				\"modify_date\": \"20201124\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00177320\",\r\n" + 
				"				\"corp_name\": \"대성미생물\",\r\n" + 
				"				\"stock_code\": \"036480\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00385336\",\r\n" + 
				"				\"corp_name\": \"홈캐스트\",\r\n" + 
				"				\"stock_code\": \"064240\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00409788\",\r\n" + 
				"				\"corp_name\": \"비에이치아이\",\r\n" + 
				"				\"stock_code\": \"083650\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264732\",\r\n" + 
				"				\"corp_name\": \"파인디지털\",\r\n" + 
				"				\"stock_code\": \"038950\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244783\",\r\n" + 
				"				\"corp_name\": \"한네트\",\r\n" + 
				"				\"stock_code\": \"052600\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00543204\",\r\n" + 
				"				\"corp_name\": \"아이오케이\",\r\n" + 
				"				\"stock_code\": \"078860\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152260\",\r\n" + 
				"				\"corp_name\": \"카스\",\r\n" + 
				"				\"stock_code\": \"016920\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00328191\",\r\n" + 
				"				\"corp_name\": \"케이에스피\",\r\n" + 
				"				\"stock_code\": \"073010\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00246417\",\r\n" + 
				"				\"corp_name\": \"이오테크닉스\",\r\n" + 
				"				\"stock_code\": \"039030\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116301\",\r\n" + 
				"				\"corp_name\": \"NI스틸\",\r\n" + 
				"				\"stock_code\": \"008260\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00230425\",\r\n" + 
				"				\"corp_name\": \"나노엔텍\",\r\n" + 
				"				\"stock_code\": \"039860\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00541437\",\r\n" + 
				"				\"corp_name\": \"코렌텍\",\r\n" + 
				"				\"stock_code\": \"104540\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269940\",\r\n" + 
				"				\"corp_name\": \"하나투어\",\r\n" + 
				"				\"stock_code\": \"039130\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141671\",\r\n" + 
				"				\"corp_name\": \"오리콤\",\r\n" + 
				"				\"stock_code\": \"010470\",\r\n" + 
				"				\"modify_date\": \"20201123\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123781\",\r\n" + 
				"				\"corp_name\": \"부국철강\",\r\n" + 
				"				\"stock_code\": \"026940\",\r\n" + 
				"				\"modify_date\": \"20201123\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220109\",\r\n" + 
				"				\"corp_name\": \"솔고바이오\",\r\n" + 
				"				\"stock_code\": \"043100\",\r\n" + 
				"				\"modify_date\": \"20201123\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173032\",\r\n" + 
				"				\"corp_name\": \"동화기업\",\r\n" + 
				"				\"stock_code\": \"025900\",\r\n" + 
				"				\"modify_date\": \"20201126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00365590\",\r\n" + 
				"				\"corp_name\": \"에이치엘비생명과학\",\r\n" + 
				"				\"stock_code\": \"067630\",\r\n" + 
				"				\"modify_date\": \"20210104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00656021\",\r\n" + 
				"				\"corp_name\": \"시티랩스\",\r\n" + 
				"				\"stock_code\": \"139050\",\r\n" + 
				"				\"modify_date\": \"20210201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146427\",\r\n" + 
				"				\"corp_name\": \"일야\",\r\n" + 
				"				\"stock_code\": \"058450\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269922\",\r\n" + 
				"				\"corp_name\": \"인바디\",\r\n" + 
				"				\"stock_code\": \"041830\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00201742\",\r\n" + 
				"				\"corp_name\": \"유라테크\",\r\n" + 
				"				\"stock_code\": \"048430\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110884\",\r\n" + 
				"				\"corp_name\": \"엠젠플러스\",\r\n" + 
				"				\"stock_code\": \"032790\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00535375\",\r\n" + 
				"				\"corp_name\": \"키네마스터\",\r\n" + 
				"				\"stock_code\": \"139670\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123107\",\r\n" + 
				"				\"corp_name\": \"보락\",\r\n" + 
				"				\"stock_code\": \"002760\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00142865\",\r\n" + 
				"				\"corp_name\": \"WISCOM\",\r\n" + 
				"				\"stock_code\": \"024070\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526678\",\r\n" + 
				"				\"corp_name\": \"동방선기\",\r\n" + 
				"				\"stock_code\": \"099410\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00831428\",\r\n" + 
				"				\"corp_name\": \"디에이치피코리아\",\r\n" + 
				"				\"stock_code\": \"131030\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00257149\",\r\n" + 
				"				\"corp_name\": \"지더블유바이텍\",\r\n" + 
				"				\"stock_code\": \"036180\",\r\n" + 
				"				\"modify_date\": \"20210106\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01110076\",\r\n" + 
				"				\"corp_name\": \"에이트원\",\r\n" + 
				"				\"stock_code\": \"230980\",\r\n" + 
				"				\"modify_date\": \"20210106\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00256043\",\r\n" + 
				"				\"corp_name\": \"비씨월드제약\",\r\n" + 
				"				\"stock_code\": \"200780\",\r\n" + 
				"				\"modify_date\": \"20210201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159810\",\r\n" + 
				"				\"corp_name\": \"카프로\",\r\n" + 
				"				\"stock_code\": \"006380\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160302\",\r\n" + 
				"				\"corp_name\": \"코스모화학\",\r\n" + 
				"				\"stock_code\": \"005420\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00638539\",\r\n" + 
				"				\"corp_name\": \"뉴로스\",\r\n" + 
				"				\"stock_code\": \"126870\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526836\",\r\n" + 
				"				\"corp_name\": \"미래나노텍\",\r\n" + 
				"				\"stock_code\": \"095500\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00256502\",\r\n" + 
				"				\"corp_name\": \"에이텍\",\r\n" + 
				"				\"stock_code\": \"045660\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351375\",\r\n" + 
				"				\"corp_name\": \"뉴보텍\",\r\n" + 
				"				\"stock_code\": \"060260\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145473\",\r\n" + 
				"				\"corp_name\": \"이글벳\",\r\n" + 
				"				\"stock_code\": \"044960\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00618401\",\r\n" + 
				"				\"corp_name\": \"크루셜텍\",\r\n" + 
				"				\"stock_code\": \"114120\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00491053\",\r\n" + 
				"				\"corp_name\": \"진바이오텍\",\r\n" + 
				"				\"stock_code\": \"086060\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00339072\",\r\n" + 
				"				\"corp_name\": \"팬스타엔터프라이즈\",\r\n" + 
				"				\"stock_code\": \"054300\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106881\",\r\n" + 
				"				\"corp_name\": \"인디에프\",\r\n" + 
				"				\"stock_code\": \"014990\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00536888\",\r\n" + 
				"				\"corp_name\": \"다믈멀티미디어\",\r\n" + 
				"				\"stock_code\": \"093640\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159500\",\r\n" + 
				"				\"corp_name\": \"한국종합기술\",\r\n" + 
				"				\"stock_code\": \"023350\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00633835\",\r\n" + 
				"				\"corp_name\": \"한진중공업\",\r\n" + 
				"				\"stock_code\": \"097230\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108490\",\r\n" + 
				"				\"corp_name\": \"엔피케이\",\r\n" + 
				"				\"stock_code\": \"048830\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261887\",\r\n" + 
				"				\"corp_name\": \"티엘아이\",\r\n" + 
				"				\"stock_code\": \"062860\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00647935\",\r\n" + 
				"				\"corp_name\": \"하나유비에스암바토비니켈해외자원개발2호\",\r\n" + 
				"				\"stock_code\": \"099350\",\r\n" + 
				"				\"modify_date\": \"20200701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00647883\",\r\n" + 
				"				\"corp_name\": \"하나유비에스암바토비니켈해외자원개발1호\",\r\n" + 
				"				\"stock_code\": \"099340\",\r\n" + 
				"				\"modify_date\": \"20200701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01395279\",\r\n" + 
				"				\"corp_name\": \"하나금융14호스팩\",\r\n" + 
				"				\"stock_code\": \"332710\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01034730\",\r\n" + 
				"				\"corp_name\": \"크로넥스\",\r\n" + 
				"				\"stock_code\": \"215570\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00292434\",\r\n" + 
				"				\"corp_name\": \"인트론바이오\",\r\n" + 
				"				\"stock_code\": \"048530\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00435969\",\r\n" + 
				"				\"corp_name\": \"인피니트헬스케어\",\r\n" + 
				"				\"stock_code\": \"071200\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442905\",\r\n" + 
				"				\"corp_name\": \"대성파인텍\",\r\n" + 
				"				\"stock_code\": \"104040\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130383\",\r\n" + 
				"				\"corp_name\": \"서부T&D\",\r\n" + 
				"				\"stock_code\": \"006730\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105271\",\r\n" + 
				"				\"corp_name\": \"케이씨씨\",\r\n" + 
				"				\"stock_code\": \"002380\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00428251\",\r\n" + 
				"				\"corp_name\": \"현대백화점\",\r\n" + 
				"				\"stock_code\": \"069960\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01064069\",\r\n" + 
				"				\"corp_name\": \"토박스코리아\",\r\n" + 
				"				\"stock_code\": \"215480\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109037\",\r\n" + 
				"				\"corp_name\": \"대성창투\",\r\n" + 
				"				\"stock_code\": \"027830\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141413\",\r\n" + 
				"				\"corp_name\": \"영화금속\",\r\n" + 
				"				\"stock_code\": \"012280\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00501970\",\r\n" + 
				"				\"corp_name\": \"코드네이처\",\r\n" + 
				"				\"stock_code\": \"078940\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00352064\",\r\n" + 
				"				\"corp_name\": \"프리엠스\",\r\n" + 
				"				\"stock_code\": \"053160\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128546\",\r\n" + 
				"				\"corp_name\": \"삼천당제약\",\r\n" + 
				"				\"stock_code\": \"000250\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151395\",\r\n" + 
				"				\"corp_name\": \"천일고속\",\r\n" + 
				"				\"stock_code\": \"000650\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104698\",\r\n" + 
				"				\"corp_name\": \"LS네트웍스\",\r\n" + 
				"				\"stock_code\": \"000680\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260569\",\r\n" + 
				"				\"corp_name\": \"유니셈\",\r\n" + 
				"				\"stock_code\": \"036200\",\r\n" + 
				"				\"modify_date\": \"20210107\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00401731\",\r\n" + 
				"				\"corp_name\": \"LG전자\",\r\n" + 
				"				\"stock_code\": \"066570\",\r\n" + 
				"				\"modify_date\": \"20210107\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135917\",\r\n" + 
				"				\"corp_name\": \"한화손해보험\",\r\n" + 
				"				\"stock_code\": \"000370\",\r\n" + 
				"				\"modify_date\": \"20210108\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00585538\",\r\n" + 
				"				\"corp_name\": \"에스에너지\",\r\n" + 
				"				\"stock_code\": \"095910\",\r\n" + 
				"				\"modify_date\": \"20210108\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00204226\",\r\n" + 
				"				\"corp_name\": \"소프트센\",\r\n" + 
				"				\"stock_code\": \"032680\",\r\n" + 
				"				\"modify_date\": \"20201231\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124805\",\r\n" + 
				"				\"corp_name\": \"푸른저축은행\",\r\n" + 
				"				\"stock_code\": \"007330\",\r\n" + 
				"				\"modify_date\": \"20210113\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159412\",\r\n" + 
				"				\"corp_name\": \"한국제지\",\r\n" + 
				"				\"stock_code\": \"002300\",\r\n" + 
				"				\"modify_date\": \"20200713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134565\",\r\n" + 
				"				\"corp_name\": \"이스타코\",\r\n" + 
				"				\"stock_code\": \"015020\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153375\",\r\n" + 
				"				\"corp_name\": \"태광\",\r\n" + 
				"				\"stock_code\": \"023160\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00185222\",\r\n" + 
				"				\"corp_name\": \"크린앤사이언스\",\r\n" + 
				"				\"stock_code\": \"045520\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01047169\",\r\n" + 
				"				\"corp_name\": \"지란지교시큐리티\",\r\n" + 
				"				\"stock_code\": \"208350\",\r\n" + 
				"				\"modify_date\": \"20210120\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00542898\",\r\n" + 
				"				\"corp_name\": \"하이소닉\",\r\n" + 
				"				\"stock_code\": \"106080\",\r\n" + 
				"				\"modify_date\": \"20201230\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00240857\",\r\n" + 
				"				\"corp_name\": \"바이오스마트\",\r\n" + 
				"				\"stock_code\": \"038460\",\r\n" + 
				"				\"modify_date\": \"20201228\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00929228\",\r\n" + 
				"				\"corp_name\": \"엔에스컴퍼니\",\r\n" + 
				"				\"stock_code\": \"224760\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139685\",\r\n" + 
				"				\"corp_name\": \"양지사\",\r\n" + 
				"				\"stock_code\": \"030960\",\r\n" + 
				"				\"modify_date\": \"20200909\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105606\",\r\n" + 
				"				\"corp_name\": \"금호에이치티\",\r\n" + 
				"				\"stock_code\": \"214330\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220969\",\r\n" + 
				"				\"corp_name\": \"오공\",\r\n" + 
				"				\"stock_code\": \"045060\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01128613\",\r\n" + 
				"				\"corp_name\": \"화승엔터프라이즈\",\r\n" + 
				"				\"stock_code\": \"241590\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166227\",\r\n" + 
				"				\"corp_name\": \"화승인더스트리\",\r\n" + 
				"				\"stock_code\": \"006060\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01068348\",\r\n" + 
				"				\"corp_name\": \"러셀\",\r\n" + 
				"				\"stock_code\": \"217500\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00377018\",\r\n" + 
				"				\"corp_name\": \"기가레인\",\r\n" + 
				"				\"stock_code\": \"049080\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00608802\",\r\n" + 
				"				\"corp_name\": \"텔콘RF제약\",\r\n" + 
				"				\"stock_code\": \"200230\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00362292\",\r\n" + 
				"				\"corp_name\": \"씨티씨바이오\",\r\n" + 
				"				\"stock_code\": \"060590\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00222435\",\r\n" + 
				"				\"corp_name\": \"제이엠아이\",\r\n" + 
				"				\"stock_code\": \"033050\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00441650\",\r\n" + 
				"				\"corp_name\": \"케이씨에스\",\r\n" + 
				"				\"stock_code\": \"115500\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00432102\",\r\n" + 
				"				\"corp_name\": \"한국금융지주\",\r\n" + 
				"				\"stock_code\": \"071050\",\r\n" + 
				"				\"modify_date\": \"20210111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01277928\",\r\n" + 
				"				\"corp_name\": \"한국제7호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"291210\",\r\n" + 
				"				\"modify_date\": \"20210115\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01447217\",\r\n" + 
				"				\"corp_name\": \"에이치엠씨제4호스팩\",\r\n" + 
				"				\"stock_code\": \"353070\",\r\n" + 
				"				\"modify_date\": \"20210201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01447244\",\r\n" + 
				"				\"corp_name\": \"에이치엠씨제5호스팩\",\r\n" + 
				"				\"stock_code\": \"353060\",\r\n" + 
				"				\"modify_date\": \"20210201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00863038\",\r\n" + 
				"				\"corp_name\": \"윌링스\",\r\n" + 
				"				\"stock_code\": \"313760\",\r\n" + 
				"				\"modify_date\": \"20210202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122728\",\r\n" + 
				"				\"corp_name\": \"범양사\",\r\n" + 
				"				\"stock_code\": \"002480\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00413046\",\r\n" + 
				"				\"corp_name\": \"셀트리온\",\r\n" + 
				"				\"stock_code\": \"068270\",\r\n" + 
				"				\"modify_date\": \"20210104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150244\",\r\n" + 
				"				\"corp_name\": \"하이트진로\",\r\n" + 
				"				\"stock_code\": \"000080\",\r\n" + 
				"				\"modify_date\": \"20210104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148993\",\r\n" + 
				"				\"corp_name\": \"하이트진로홀딩스\",\r\n" + 
				"				\"stock_code\": \"000140\",\r\n" + 
				"				\"modify_date\": \"20210104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01205851\",\r\n" + 
				"				\"corp_name\": \"현대일렉트릭\",\r\n" + 
				"				\"stock_code\": \"267260\",\r\n" + 
				"				\"modify_date\": \"20210104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00842619\",\r\n" + 
				"				\"corp_name\": \"레고켐바이오\",\r\n" + 
				"				\"stock_code\": \"141080\",\r\n" + 
				"				\"modify_date\": \"20210104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155948\",\r\n" + 
				"				\"corp_name\": \"코웰패션\",\r\n" + 
				"				\"stock_code\": \"033290\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00325112\",\r\n" + 
				"				\"corp_name\": \"프로텍\",\r\n" + 
				"				\"stock_code\": \"053610\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00143651\",\r\n" + 
				"				\"corp_name\": \"웅진\",\r\n" + 
				"				\"stock_code\": \"016880\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00406037\",\r\n" + 
				"				\"corp_name\": \"CSA 코스믹\",\r\n" + 
				"				\"stock_code\": \"083660\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150536\",\r\n" + 
				"				\"corp_name\": \"진양제약\",\r\n" + 
				"				\"stock_code\": \"007370\",\r\n" + 
				"				\"modify_date\": \"20201130\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01109715\",\r\n" + 
				"				\"corp_name\": \"DSC인베스트먼트\",\r\n" + 
				"				\"stock_code\": \"241520\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00661157\",\r\n" + 
				"				\"corp_name\": \"인트로메딕\",\r\n" + 
				"				\"stock_code\": \"150840\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00228350\",\r\n" + 
				"				\"corp_name\": \"신화인터텍\",\r\n" + 
				"				\"stock_code\": \"056700\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00819073\",\r\n" + 
				"				\"corp_name\": \"인크로스\",\r\n" + 
				"				\"stock_code\": \"216050\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140131\",\r\n" + 
				"				\"corp_name\": \"키다리스튜디오\",\r\n" + 
				"				\"stock_code\": \"020120\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00536541\",\r\n" + 
				"				\"corp_name\": \"에코프로\",\r\n" + 
				"				\"stock_code\": \"086520\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00683007\",\r\n" + 
				"				\"corp_name\": \"엑스큐어\",\r\n" + 
				"				\"stock_code\": \"070300\",\r\n" + 
				"				\"modify_date\": \"20210112\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153861\",\r\n" + 
				"				\"corp_name\": \"태영건설\",\r\n" + 
				"				\"stock_code\": \"009410\",\r\n" + 
				"				\"modify_date\": \"20210112\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164706\",\r\n" + 
				"				\"corp_name\": \"현대약품\",\r\n" + 
				"				\"stock_code\": \"004310\",\r\n" + 
				"				\"modify_date\": \"20210208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01015160\",\r\n" + 
				"				\"corp_name\": \"와이팜\",\r\n" + 
				"				\"stock_code\": \"332570\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01091054\",\r\n" + 
				"				\"corp_name\": \"쎄노텍\",\r\n" + 
				"				\"stock_code\": \"222420\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112022\",\r\n" + 
				"				\"corp_name\": \"대원화성\",\r\n" + 
				"				\"stock_code\": \"024890\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109019\",\r\n" + 
				"				\"corp_name\": \"대구은행\",\r\n" + 
				"				\"stock_code\": \"005270\",\r\n" + 
				"				\"modify_date\": \"20210107\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128555\",\r\n" + 
				"				\"corp_name\": \"삼천리\",\r\n" + 
				"				\"stock_code\": \"004690\",\r\n" + 
				"				\"modify_date\": \"20210107\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124504\",\r\n" + 
				"				\"corp_name\": \"포스코인터내셔널\",\r\n" + 
				"				\"stock_code\": \"047050\",\r\n" + 
				"				\"modify_date\": \"20210107\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01035678\",\r\n" + 
				"				\"corp_name\": \"와이제이엠게임즈\",\r\n" + 
				"				\"stock_code\": \"193250\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00266943\",\r\n" + 
				"				\"corp_name\": \"넥슨지티\",\r\n" + 
				"				\"stock_code\": \"041140\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00545734\",\r\n" + 
				"				\"corp_name\": \"아미코젠\",\r\n" + 
				"				\"stock_code\": \"092040\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00223434\",\r\n" + 
				"				\"corp_name\": \"에프에스티\",\r\n" + 
				"				\"stock_code\": \"036810\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00305297\",\r\n" + 
				"				\"corp_name\": \"코텍\",\r\n" + 
				"				\"stock_code\": \"052330\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00336297\",\r\n" + 
				"				\"corp_name\": \"고려신용정보\",\r\n" + 
				"				\"stock_code\": \"049720\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01158553\",\r\n" + 
				"				\"corp_name\": \"켄코아에어로스페이스\",\r\n" + 
				"				\"stock_code\": \"274090\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130408\",\r\n" + 
				"				\"corp_name\": \"서산\",\r\n" + 
				"				\"stock_code\": \"079650\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127936\",\r\n" + 
				"				\"corp_name\": \"삼일기업공사\",\r\n" + 
				"				\"stock_code\": \"002290\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00340272\",\r\n" + 
				"				\"corp_name\": \"에스폴리텍\",\r\n" + 
				"				\"stock_code\": \"050760\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00563837\",\r\n" + 
				"				\"corp_name\": \"제로투세븐\",\r\n" + 
				"				\"stock_code\": \"159580\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00409371\",\r\n" + 
				"				\"corp_name\": \"인베니아\",\r\n" + 
				"				\"stock_code\": \"079950\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00688996\",\r\n" + 
				"				\"corp_name\": \"KB금융\",\r\n" + 
				"				\"stock_code\": \"105560\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264547\",\r\n" + 
				"				\"corp_name\": \"KG이니시스\",\r\n" + 
				"				\"stock_code\": \"035600\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00201131\",\r\n" + 
				"				\"corp_name\": \"아즈텍WB\",\r\n" + 
				"				\"stock_code\": \"032080\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121534\",\r\n" + 
				"				\"corp_name\": \"MH에탄올\",\r\n" + 
				"				\"stock_code\": \"023150\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161781\",\r\n" + 
				"				\"corp_name\": \"아난티\",\r\n" + 
				"				\"stock_code\": \"025980\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138297\",\r\n" + 
				"				\"corp_name\": \"STX\",\r\n" + 
				"				\"stock_code\": \"011810\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00524786\",\r\n" + 
				"				\"corp_name\": \"비엠티\",\r\n" + 
				"				\"stock_code\": \"086670\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00232821\",\r\n" + 
				"				\"corp_name\": \"클라우드에어\",\r\n" + 
				"				\"stock_code\": \"036170\",\r\n" + 
				"				\"modify_date\": \"20210113\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01187148\",\r\n" + 
				"				\"corp_name\": \"케어랩스\",\r\n" + 
				"				\"stock_code\": \"263700\",\r\n" + 
				"				\"modify_date\": \"20210203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01243161\",\r\n" + 
				"				\"corp_name\": \"인산가\",\r\n" + 
				"				\"stock_code\": \"277410\",\r\n" + 
				"				\"modify_date\": \"20210203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00959229\",\r\n" + 
				"				\"corp_name\": \"세종메디칼\",\r\n" + 
				"				\"stock_code\": \"258830\",\r\n" + 
				"				\"modify_date\": \"20210203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01262458\",\r\n" + 
				"				\"corp_name\": \"동아타이어\",\r\n" + 
				"				\"stock_code\": \"282690\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00858124\",\r\n" + 
				"				\"corp_name\": \"알에스오토메이션\",\r\n" + 
				"				\"stock_code\": \"140670\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00977377\",\r\n" + 
				"				\"corp_name\": \"에이비온\",\r\n" + 
				"				\"stock_code\": \"203400\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00596677\",\r\n" + 
				"				\"corp_name\": \"매커스\",\r\n" + 
				"				\"stock_code\": \"093520\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00500254\",\r\n" + 
				"				\"corp_name\": \"GS\",\r\n" + 
				"				\"stock_code\": \"078930\",\r\n" + 
				"				\"modify_date\": \"20210107\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01041828\",\r\n" + 
				"				\"corp_name\": \"JTC\",\r\n" + 
				"				\"stock_code\": \"950170\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01201590\",\r\n" + 
				"				\"corp_name\": \"에브리봇\",\r\n" + 
				"				\"stock_code\": \"270660\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138446\",\r\n" + 
				"				\"corp_name\": \"아가방컴퍼니\",\r\n" + 
				"				\"stock_code\": \"013990\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00258360\",\r\n" + 
				"				\"corp_name\": \"위지트\",\r\n" + 
				"				\"stock_code\": \"036090\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00800145\",\r\n" + 
				"				\"corp_name\": \"서진오토모티브\",\r\n" + 
				"				\"stock_code\": \"122690\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130587\",\r\n" + 
				"				\"corp_name\": \"서울전자통신\",\r\n" + 
				"				\"stock_code\": \"027040\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00404288\",\r\n" + 
				"				\"corp_name\": \"아진엑스텍\",\r\n" + 
				"				\"stock_code\": \"059120\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00348034\",\r\n" + 
				"				\"corp_name\": \"액토즈소프트\",\r\n" + 
				"				\"stock_code\": \"052790\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264635\",\r\n" + 
				"				\"corp_name\": \"에스넷\",\r\n" + 
				"				\"stock_code\": \"038680\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00243067\",\r\n" + 
				"				\"corp_name\": \"부방\",\r\n" + 
				"				\"stock_code\": \"014470\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361169\",\r\n" + 
				"				\"corp_name\": \"한국전자인증\",\r\n" + 
				"				\"stock_code\": \"041460\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00287788\",\r\n" + 
				"				\"corp_name\": \"정상제이엘에스\",\r\n" + 
				"				\"stock_code\": \"040420\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149646\",\r\n" + 
				"				\"corp_name\": \"기업은행\",\r\n" + 
				"				\"stock_code\": \"024110\",\r\n" + 
				"				\"modify_date\": \"20210113\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105952\",\r\n" + 
				"				\"corp_name\": \"LS\",\r\n" + 
				"				\"stock_code\": \"006260\",\r\n" + 
				"				\"modify_date\": \"20210114\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00429694\",\r\n" + 
				"				\"corp_name\": \"파버나인\",\r\n" + 
				"				\"stock_code\": \"177830\",\r\n" + 
				"				\"modify_date\": \"20210208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155276\",\r\n" + 
				"				\"corp_name\": \"포스코케미칼\",\r\n" + 
				"				\"stock_code\": \"003670\",\r\n" + 
				"				\"modify_date\": \"20201222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00992543\",\r\n" + 
				"				\"corp_name\": \"삼양옵틱스\",\r\n" + 
				"				\"stock_code\": \"225190\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141404\",\r\n" + 
				"				\"corp_name\": \"영풍제지\",\r\n" + 
				"				\"stock_code\": \"006740\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164645\",\r\n" + 
				"				\"corp_name\": \"HMM\",\r\n" + 
				"				\"stock_code\": \"011200\",\r\n" + 
				"				\"modify_date\": \"20201222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01051065\",\r\n" + 
				"				\"corp_name\": \"엔비티\",\r\n" + 
				"				\"stock_code\": \"236810\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00681142\",\r\n" + 
				"				\"corp_name\": \"쌍방울\",\r\n" + 
				"				\"stock_code\": \"102280\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125938\",\r\n" + 
				"				\"corp_name\": \"삼보판지\",\r\n" + 
				"				\"stock_code\": \"023600\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152589\",\r\n" + 
				"				\"corp_name\": \"코리아나\",\r\n" + 
				"				\"stock_code\": \"027050\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00918222\",\r\n" + 
				"				\"corp_name\": \"엘앤케이바이오\",\r\n" + 
				"				\"stock_code\": \"156100\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109189\",\r\n" + 
				"				\"corp_name\": \"대덕\",\r\n" + 
				"				\"stock_code\": \"008060\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00143907\",\r\n" + 
				"				\"corp_name\": \"원일특강\",\r\n" + 
				"				\"stock_code\": \"012620\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00683469\",\r\n" + 
				"				\"corp_name\": \"일진전기\",\r\n" + 
				"				\"stock_code\": \"103590\",\r\n" + 
				"				\"modify_date\": \"20201217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152880\",\r\n" + 
				"				\"corp_name\": \"코오롱글로벌\",\r\n" + 
				"				\"stock_code\": \"003070\",\r\n" + 
				"				\"modify_date\": \"20210114\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153524\",\r\n" + 
				"				\"corp_name\": \"태림포장\",\r\n" + 
				"				\"stock_code\": \"011280\",\r\n" + 
				"				\"modify_date\": \"20201221\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00825959\",\r\n" + 
				"				\"corp_name\": \"하이비젼시스템\",\r\n" + 
				"				\"stock_code\": \"126700\",\r\n" + 
				"				\"modify_date\": \"20201221\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01023822\",\r\n" + 
				"				\"corp_name\": \"메디젠휴먼케어\",\r\n" + 
				"				\"stock_code\": \"236340\",\r\n" + 
				"				\"modify_date\": \"20201221\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00415594\",\r\n" + 
				"				\"corp_name\": \"동국S&C\",\r\n" + 
				"				\"stock_code\": \"100130\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00410915\",\r\n" + 
				"				\"corp_name\": \"서울옥션\",\r\n" + 
				"				\"stock_code\": \"063170\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00583442\",\r\n" + 
				"				\"corp_name\": \"노루페인트\",\r\n" + 
				"				\"stock_code\": \"090350\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00189538\",\r\n" + 
				"				\"corp_name\": \"피델릭스\",\r\n" + 
				"				\"stock_code\": \"032580\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151128\",\r\n" + 
				"				\"corp_name\": \"모토닉\",\r\n" + 
				"				\"stock_code\": \"009680\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00820352\",\r\n" + 
				"				\"corp_name\": \"파인텍\",\r\n" + 
				"				\"stock_code\": \"131760\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118345\",\r\n" + 
				"				\"corp_name\": \"디아이동일\",\r\n" + 
				"				\"stock_code\": \"001530\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00227333\",\r\n" + 
				"				\"corp_name\": \"네패스\",\r\n" + 
				"				\"stock_code\": \"033640\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00392691\",\r\n" + 
				"				\"corp_name\": \"젬백스링크\",\r\n" + 
				"				\"stock_code\": \"064800\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00177870\",\r\n" + 
				"				\"corp_name\": \"대창솔루션\",\r\n" + 
				"				\"stock_code\": \"096350\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105040\",\r\n" + 
				"				\"corp_name\": \"뉴인텍\",\r\n" + 
				"				\"stock_code\": \"012340\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00349060\",\r\n" + 
				"				\"corp_name\": \"한스바이오메드\",\r\n" + 
				"				\"stock_code\": \"042520\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01075126\",\r\n" + 
				"				\"corp_name\": \"경남제약헬스케어\",\r\n" + 
				"				\"stock_code\": \"223310\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255105\",\r\n" + 
				"				\"corp_name\": \"골드퍼시픽\",\r\n" + 
				"				\"stock_code\": \"038530\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00807397\",\r\n" + 
				"				\"corp_name\": \"코이즈\",\r\n" + 
				"				\"stock_code\": \"121850\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00356839\",\r\n" + 
				"				\"corp_name\": \"메디콕스\",\r\n" + 
				"				\"stock_code\": \"054180\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00302926\",\r\n" + 
				"				\"corp_name\": \"현대로템\",\r\n" + 
				"				\"stock_code\": \"064350\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00808022\",\r\n" + 
				"				\"corp_name\": \"메지온\",\r\n" + 
				"				\"stock_code\": \"140410\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00188797\",\r\n" + 
				"				\"corp_name\": \"포메탈\",\r\n" + 
				"				\"stock_code\": \"119500\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00147082\",\r\n" + 
				"				\"corp_name\": \"재영솔루텍\",\r\n" + 
				"				\"stock_code\": \"049630\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105873\",\r\n" + 
				"				\"corp_name\": \"LG디스플레이\",\r\n" + 
				"				\"stock_code\": \"034220\",\r\n" + 
				"				\"modify_date\": \"20210114\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00222213\",\r\n" + 
				"				\"corp_name\": \"포트로닉스천안\",\r\n" + 
				"				\"stock_code\": \"039870\",\r\n" + 
				"				\"modify_date\": \"20210114\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117629\",\r\n" + 
				"				\"corp_name\": \"동양철관\",\r\n" + 
				"				\"stock_code\": \"008970\",\r\n" + 
				"				\"modify_date\": \"20210203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01261644\",\r\n" + 
				"				\"corp_name\": \"레인보우로보틱스\",\r\n" + 
				"				\"stock_code\": \"277810\",\r\n" + 
				"				\"modify_date\": \"20210203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01013311\",\r\n" + 
				"				\"corp_name\": \"민앤지\",\r\n" + 
				"				\"stock_code\": \"214180\",\r\n" + 
				"				\"modify_date\": \"20210203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00404701\",\r\n" + 
				"				\"corp_name\": \"한국자산신탁\",\r\n" + 
				"				\"stock_code\": \"123890\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01418543\",\r\n" + 
				"				\"corp_name\": \"케이비제20호스팩\",\r\n" + 
				"				\"stock_code\": \"342550\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00175173\",\r\n" + 
				"				\"corp_name\": \"오스템\",\r\n" + 
				"				\"stock_code\": \"031510\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00445160\",\r\n" + 
				"				\"corp_name\": \"디이엔티\",\r\n" + 
				"				\"stock_code\": \"079810\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00788737\",\r\n" + 
				"				\"corp_name\": \"이퓨쳐\",\r\n" + 
				"				\"stock_code\": \"134060\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136642\",\r\n" + 
				"				\"corp_name\": \"엠벤처투자\",\r\n" + 
				"				\"stock_code\": \"019590\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139205\",\r\n" + 
				"				\"corp_name\": \"안국약품\",\r\n" + 
				"				\"stock_code\": \"001540\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00287812\",\r\n" + 
				"				\"corp_name\": \"에코바이오\",\r\n" + 
				"				\"stock_code\": \"038870\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114765\",\r\n" + 
				"				\"corp_name\": \"케이비아이동국실업\",\r\n" + 
				"				\"stock_code\": \"001620\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160375\",\r\n" + 
				"				\"corp_name\": \"진양폴리우레탄\",\r\n" + 
				"				\"stock_code\": \"010640\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00910840\",\r\n" + 
				"				\"corp_name\": \"윈하이텍\",\r\n" + 
				"				\"stock_code\": \"192390\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359580\",\r\n" + 
				"				\"corp_name\": \"아이디스홀딩스\",\r\n" + 
				"				\"stock_code\": \"054800\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126256\",\r\n" + 
				"				\"corp_name\": \"삼성생명\",\r\n" + 
				"				\"stock_code\": \"032830\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00496225\",\r\n" + 
				"				\"corp_name\": \"이엠네트웍스\",\r\n" + 
				"				\"stock_code\": \"087730\",\r\n" + 
				"				\"modify_date\": \"20210118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00370006\",\r\n" + 
				"				\"corp_name\": \"iMBC\",\r\n" + 
				"				\"stock_code\": \"052220\",\r\n" + 
				"				\"modify_date\": \"20201221\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130772\",\r\n" + 
				"				\"corp_name\": \"SBS\",\r\n" + 
				"				\"stock_code\": \"034120\",\r\n" + 
				"				\"modify_date\": \"20201221\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00353018\",\r\n" + 
				"				\"corp_name\": \"슈펙스비앤피\",\r\n" + 
				"				\"stock_code\": \"058530\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01416235\",\r\n" + 
				"				\"corp_name\": \"미투젠\",\r\n" + 
				"				\"stock_code\": \"950190\",\r\n" + 
				"				\"modify_date\": \"20200818\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00618410\",\r\n" + 
				"				\"corp_name\": \"상상인인더스트리\",\r\n" + 
				"				\"stock_code\": \"101000\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00654272\",\r\n" + 
				"				\"corp_name\": \"램테크놀러지\",\r\n" + 
				"				\"stock_code\": \"171010\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00250614\",\r\n" + 
				"				\"corp_name\": \"삼영엠텍\",\r\n" + 
				"				\"stock_code\": \"054540\",\r\n" + 
				"				\"modify_date\": \"20201203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580667\",\r\n" + 
				"				\"corp_name\": \"S&K폴리텍\",\r\n" + 
				"				\"stock_code\": \"091340\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00463342\",\r\n" + 
				"				\"corp_name\": \"에스텍파마\",\r\n" + 
				"				\"stock_code\": \"041910\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00100258\",\r\n" + 
				"				\"corp_name\": \"에스마크\",\r\n" + 
				"				\"stock_code\": \"030270\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144243\",\r\n" + 
				"				\"corp_name\": \"유니슨\",\r\n" + 
				"				\"stock_code\": \"018000\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00400121\",\r\n" + 
				"				\"corp_name\": \"유아이디\",\r\n" + 
				"				\"stock_code\": \"069330\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103006\",\r\n" + 
				"				\"corp_name\": \"고려제강\",\r\n" + 
				"				\"stock_code\": \"002240\",\r\n" + 
				"				\"modify_date\": \"20201207\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141246\",\r\n" + 
				"				\"corp_name\": \"SGC이테크건설\",\r\n" + 
				"				\"stock_code\": \"016250\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117708\",\r\n" + 
				"				\"corp_name\": \"리드코프\",\r\n" + 
				"				\"stock_code\": \"012700\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159731\",\r\n" + 
				"				\"corp_name\": \"글로본\",\r\n" + 
				"				\"stock_code\": \"019660\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113191\",\r\n" + 
				"				\"corp_name\": \"코리안리\",\r\n" + 
				"				\"stock_code\": \"003690\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136004\",\r\n" + 
				"				\"corp_name\": \"신라에스지\",\r\n" + 
				"				\"stock_code\": \"025870\",\r\n" + 
				"				\"modify_date\": \"20201215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104537\",\r\n" + 
				"				\"corp_name\": \"국영지앤엠\",\r\n" + 
				"				\"stock_code\": \"006050\",\r\n" + 
				"				\"modify_date\": \"20201126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00415707\",\r\n" + 
				"				\"corp_name\": \"엔텔스\",\r\n" + 
				"				\"stock_code\": \"069410\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00523307\",\r\n" + 
				"				\"corp_name\": \"다원시스\",\r\n" + 
				"				\"stock_code\": \"068240\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153755\",\r\n" + 
				"				\"corp_name\": \"태양금속공업\",\r\n" + 
				"				\"stock_code\": \"004100\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108065\",\r\n" + 
				"				\"corp_name\": \"쎌마테라퓨틱스\",\r\n" + 
				"				\"stock_code\": \"015540\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260392\",\r\n" + 
				"				\"corp_name\": \"대원전선\",\r\n" + 
				"				\"stock_code\": \"006340\",\r\n" + 
				"				\"modify_date\": \"20201223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149594\",\r\n" + 
				"				\"corp_name\": \"한국캐피탈\",\r\n" + 
				"				\"stock_code\": \"023760\",\r\n" + 
				"				\"modify_date\": \"20201223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00305570\",\r\n" + 
				"				\"corp_name\": \"서울리거\",\r\n" + 
				"				\"stock_code\": \"043710\",\r\n" + 
				"				\"modify_date\": \"20201223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00926522\",\r\n" + 
				"				\"corp_name\": \"테고사이언스\",\r\n" + 
				"				\"stock_code\": \"191420\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00306719\",\r\n" + 
				"				\"corp_name\": \"에스텍\",\r\n" + 
				"				\"stock_code\": \"069510\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359623\",\r\n" + 
				"				\"corp_name\": \"우리산업홀딩스\",\r\n" + 
				"				\"stock_code\": \"072470\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00479787\",\r\n" + 
				"				\"corp_name\": \"인텍플러스\",\r\n" + 
				"				\"stock_code\": \"064290\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00995993\",\r\n" + 
				"				\"corp_name\": \"캔서롭\",\r\n" + 
				"				\"stock_code\": \"180400\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141307\",\r\n" + 
				"				\"corp_name\": \"영풍\",\r\n" + 
				"				\"stock_code\": \"000670\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00390365\",\r\n" + 
				"				\"corp_name\": \"토비스\",\r\n" + 
				"				\"stock_code\": \"051360\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00562360\",\r\n" + 
				"				\"corp_name\": \"에스맥\",\r\n" + 
				"				\"stock_code\": \"097780\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259590\",\r\n" + 
				"				\"corp_name\": \"바른손이앤에이\",\r\n" + 
				"				\"stock_code\": \"035620\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00653103\",\r\n" + 
				"				\"corp_name\": \"나노스\",\r\n" + 
				"				\"stock_code\": \"151910\",\r\n" + 
				"				\"modify_date\": \"20201214\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117027\",\r\n" + 
				"				\"corp_name\": \"알루코\",\r\n" + 
				"				\"stock_code\": \"001780\",\r\n" + 
				"				\"modify_date\": \"20201216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131896\",\r\n" + 
				"				\"corp_name\": \"선광\",\r\n" + 
				"				\"stock_code\": \"003100\",\r\n" + 
				"				\"modify_date\": \"20201216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00302120\",\r\n" + 
				"				\"corp_name\": \"피앤텔\",\r\n" + 
				"				\"stock_code\": \"054340\",\r\n" + 
				"				\"modify_date\": \"20201216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00569646\",\r\n" + 
				"				\"corp_name\": \"영우디에스피\",\r\n" + 
				"				\"stock_code\": \"143540\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145668\",\r\n" + 
				"				\"corp_name\": \"이화공영\",\r\n" + 
				"				\"stock_code\": \"001840\",\r\n" + 
				"				\"modify_date\": \"20201125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01061327\",\r\n" + 
				"				\"corp_name\": \"클래시스\",\r\n" + 
				"				\"stock_code\": \"214150\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260356\",\r\n" + 
				"				\"corp_name\": \"산은캐피탈\",\r\n" + 
				"				\"stock_code\": \"008270\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00991191\",\r\n" + 
				"				\"corp_name\": \"앱클론\",\r\n" + 
				"				\"stock_code\": \"174900\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153126\",\r\n" + 
				"				\"corp_name\": \"크라운해태홀딩스\",\r\n" + 
				"				\"stock_code\": \"005740\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00821607\",\r\n" + 
				"				\"corp_name\": \"알톤스포츠\",\r\n" + 
				"				\"stock_code\": \"123750\",\r\n" + 
				"				\"modify_date\": \"20210203\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01399071\",\r\n" + 
				"				\"corp_name\": \"고바이오랩\",\r\n" + 
				"				\"stock_code\": \"348150\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00925189\",\r\n" + 
				"				\"corp_name\": \"신화콘텍\",\r\n" + 
				"				\"stock_code\": \"187270\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00188973\",\r\n" + 
				"				\"corp_name\": \"화일약품\",\r\n" + 
				"				\"stock_code\": \"061250\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00389110\",\r\n" + 
				"				\"corp_name\": \"지어소프트\",\r\n" + 
				"				\"stock_code\": \"051160\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01293388\",\r\n" + 
				"				\"corp_name\": \"무진메디\",\r\n" + 
				"				\"stock_code\": \"322970\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108649\",\r\n" + 
				"				\"corp_name\": \"TPC\",\r\n" + 
				"				\"stock_code\": \"048770\",\r\n" + 
				"				\"modify_date\": \"20201201\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141273\",\r\n" + 
				"				\"corp_name\": \"웰바이오텍\",\r\n" + 
				"				\"stock_code\": \"010600\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144012\",\r\n" + 
				"				\"corp_name\": \"원풍\",\r\n" + 
				"				\"stock_code\": \"008370\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269241\",\r\n" + 
				"				\"corp_name\": \"주연테크\",\r\n" + 
				"				\"stock_code\": \"044380\",\r\n" + 
				"				\"modify_date\": \"20201208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00377610\",\r\n" + 
				"				\"corp_name\": \"세아홀딩스\",\r\n" + 
				"				\"stock_code\": \"058650\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00379229\",\r\n" + 
				"				\"corp_name\": \"에스에이티\",\r\n" + 
				"				\"stock_code\": \"060540\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00585608\",\r\n" + 
				"				\"corp_name\": \"다나와\",\r\n" + 
				"				\"stock_code\": \"119860\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117300\",\r\n" + 
				"				\"corp_name\": \"TCC스틸\",\r\n" + 
				"				\"stock_code\": \"002710\",\r\n" + 
				"				\"modify_date\": \"20201211\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118026\",\r\n" + 
				"				\"corp_name\": \"동원산업\",\r\n" + 
				"				\"stock_code\": \"006040\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103592\",\r\n" + 
				"				\"corp_name\": \"광동제약\",\r\n" + 
				"				\"stock_code\": \"009290\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130046\",\r\n" + 
				"				\"corp_name\": \"다함이텍\",\r\n" + 
				"				\"stock_code\": \"009280\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01205329\",\r\n" + 
				"				\"corp_name\": \"크라운제과\",\r\n" + 
				"				\"stock_code\": \"264900\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01042711\",\r\n" + 
				"				\"corp_name\": \"글로벌텍스프리\",\r\n" + 
				"				\"stock_code\": \"204620\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00242934\",\r\n" + 
				"				\"corp_name\": \"케이엠\",\r\n" + 
				"				\"stock_code\": \"083550\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01109937\",\r\n" + 
				"				\"corp_name\": \"티앤알바이오팹\",\r\n" + 
				"				\"stock_code\": \"246710\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01098792\",\r\n" + 
				"				\"corp_name\": \"본느\",\r\n" + 
				"				\"stock_code\": \"226340\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00384948\",\r\n" + 
				"				\"corp_name\": \"대유\",\r\n" + 
				"				\"stock_code\": \"290380\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00363510\",\r\n" + 
				"				\"corp_name\": \"이그잭스\",\r\n" + 
				"				\"stock_code\": \"060230\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00409681\",\r\n" + 
				"				\"corp_name\": \"아스트\",\r\n" + 
				"				\"stock_code\": \"067390\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00411905\",\r\n" + 
				"				\"corp_name\": \"테라셈\",\r\n" + 
				"				\"stock_code\": \"182690\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00360674\",\r\n" + 
				"				\"corp_name\": \"코위버\",\r\n" + 
				"				\"stock_code\": \"056360\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00203315\",\r\n" + 
				"				\"corp_name\": \"제이콘텐트리\",\r\n" + 
				"				\"stock_code\": \"036420\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129642\",\r\n" + 
				"				\"corp_name\": \"상신브레이크\",\r\n" + 
				"				\"stock_code\": \"041650\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00340096\",\r\n" + 
				"				\"corp_name\": \"미래에셋벤처투자\",\r\n" + 
				"				\"stock_code\": \"100790\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01414361\",\r\n" + 
				"				\"corp_name\": \"SK5호스팩\",\r\n" + 
				"				\"stock_code\": \"337450\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158112\",\r\n" + 
				"				\"corp_name\": \"한국수출포장공업\",\r\n" + 
				"				\"stock_code\": \"002200\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160843\",\r\n" + 
				"				\"corp_name\": \"DB하이텍\",\r\n" + 
				"				\"stock_code\": \"000990\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01350638\",\r\n" + 
				"				\"corp_name\": \"티티씨디펜스\",\r\n" + 
				"				\"stock_code\": \"309900\",\r\n" + 
				"				\"modify_date\": \"20210208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255141\",\r\n" + 
				"				\"corp_name\": \"글로앤웰\",\r\n" + 
				"				\"stock_code\": \"035480\",\r\n" + 
				"				\"modify_date\": \"20210208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00241005\",\r\n" + 
				"				\"corp_name\": \"코오롱플라스틱\",\r\n" + 
				"				\"stock_code\": \"138490\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350312\",\r\n" + 
				"				\"corp_name\": \"HDC아이콘트롤스\",\r\n" + 
				"				\"stock_code\": \"039570\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00346966\",\r\n" + 
				"				\"corp_name\": \"에코솔루션\",\r\n" + 
				"				\"stock_code\": \"052510\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154055\",\r\n" + 
				"				\"corp_name\": \"태원물산\",\r\n" + 
				"				\"stock_code\": \"001420\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00414601\",\r\n" + 
				"				\"corp_name\": \"유니퀘스트\",\r\n" + 
				"				\"stock_code\": \"077500\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01250374\",\r\n" + 
				"				\"corp_name\": \"에스에스알\",\r\n" + 
				"				\"stock_code\": \"275630\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00838005\",\r\n" + 
				"				\"corp_name\": \"서진시스템\",\r\n" + 
				"				\"stock_code\": \"178320\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00852087\",\r\n" + 
				"				\"corp_name\": \"시디즈\",\r\n" + 
				"				\"stock_code\": \"134790\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145686\",\r\n" + 
				"				\"corp_name\": \"이화산업\",\r\n" + 
				"				\"stock_code\": \"000760\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01119651\",\r\n" + 
				"				\"corp_name\": \"엘리비젼\",\r\n" + 
				"				\"stock_code\": \"276240\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00209780\",\r\n" + 
				"				\"corp_name\": \"케이씨\",\r\n" + 
				"				\"stock_code\": \"029460\",\r\n" + 
				"				\"modify_date\": \"20201209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00612294\",\r\n" + 
				"				\"corp_name\": \"피엔티\",\r\n" + 
				"				\"stock_code\": \"137400\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00167192\",\r\n" + 
				"				\"corp_name\": \"넥센\",\r\n" + 
				"				\"stock_code\": \"005720\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00876166\",\r\n" + 
				"				\"corp_name\": \"한국바이오젠\",\r\n" + 
				"				\"stock_code\": \"318000\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361381\",\r\n" + 
				"				\"corp_name\": \"제이브이엠\",\r\n" + 
				"				\"stock_code\": \"054950\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01428249\",\r\n" + 
				"				\"corp_name\": \"케이프이에스제4호\",\r\n" + 
				"				\"stock_code\": \"347140\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00219097\",\r\n" + 
				"				\"corp_name\": \"BGF\",\r\n" + 
				"				\"stock_code\": \"027410\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00385363\",\r\n" + 
				"				\"corp_name\": \"빅텍\",\r\n" + 
				"				\"stock_code\": \"065450\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104722\",\r\n" + 
				"				\"corp_name\": \"국제약품\",\r\n" + 
				"				\"stock_code\": \"002720\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161116\",\r\n" + 
				"				\"corp_name\": \"한라\",\r\n" + 
				"				\"stock_code\": \"014790\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00520887\",\r\n" + 
				"				\"corp_name\": \"비상교육\",\r\n" + 
				"				\"stock_code\": \"100220\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01116344\",\r\n" + 
				"				\"corp_name\": \"이비테크\",\r\n" + 
				"				\"stock_code\": \"208850\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00962393\",\r\n" + 
				"				\"corp_name\": \"포인트모바일\",\r\n" + 
				"				\"stock_code\": \"318020\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01493535\",\r\n" + 
				"				\"corp_name\": \"하나금융17호스팩\",\r\n" + 
				"				\"stock_code\": \"363260\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231044\",\r\n" + 
				"				\"corp_name\": \"우리기술\",\r\n" + 
				"				\"stock_code\": \"032820\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00416654\",\r\n" + 
				"				\"corp_name\": \"유엔젤\",\r\n" + 
				"				\"stock_code\": \"072130\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01366000\",\r\n" + 
				"				\"corp_name\": \"신영스팩5호\",\r\n" + 
				"				\"stock_code\": \"323280\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540641\",\r\n" + 
				"				\"corp_name\": \"동양고속\",\r\n" + 
				"				\"stock_code\": \"084670\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00198697\",\r\n" + 
				"				\"corp_name\": \"일진디스플\",\r\n" + 
				"				\"stock_code\": \"020760\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00791209\",\r\n" + 
				"				\"corp_name\": \"우리들휴브레인\",\r\n" + 
				"				\"stock_code\": \"118000\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00157636\",\r\n" + 
				"				\"corp_name\": \"케이피에프\",\r\n" + 
				"				\"stock_code\": \"024880\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129509\",\r\n" + 
				"				\"corp_name\": \"한익스프레스\",\r\n" + 
				"				\"stock_code\": \"014130\",\r\n" + 
				"				\"modify_date\": \"20201210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161383\",\r\n" + 
				"				\"corp_name\": \"한미반도체\",\r\n" + 
				"				\"stock_code\": \"042700\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00362238\",\r\n" + 
				"				\"corp_name\": \"휴비스\",\r\n" + 
				"				\"stock_code\": \"079980\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00488989\",\r\n" + 
				"				\"corp_name\": \"한양디지텍\",\r\n" + 
				"				\"stock_code\": \"078350\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01247918\",\r\n" + 
				"				\"corp_name\": \"한화에이스기업인수목적4호\",\r\n" + 
				"				\"stock_code\": \"279410\",\r\n" + 
				"				\"modify_date\": \"20200703\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136086\",\r\n" + 
				"				\"corp_name\": \"무림페이퍼\",\r\n" + 
				"				\"stock_code\": \"009200\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01365825\",\r\n" + 
				"				\"corp_name\": \"피에스케이\",\r\n" + 
				"				\"stock_code\": \"319660\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113207\",\r\n" + 
				"				\"corp_name\": \"대한전선\",\r\n" + 
				"				\"stock_code\": \"001440\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01118281\",\r\n" + 
				"				\"corp_name\": \"피플바이오\",\r\n" + 
				"				\"stock_code\": \"304840\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01419986\",\r\n" + 
				"				\"corp_name\": \"신영스팩6호\",\r\n" + 
				"				\"stock_code\": \"344050\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00833064\",\r\n" + 
				"				\"corp_name\": \"엠플러스\",\r\n" + 
				"				\"stock_code\": \"259630\",\r\n" + 
				"				\"modify_date\": \"20201106\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118284\",\r\n" + 
				"				\"corp_name\": \"동일금속\",\r\n" + 
				"				\"stock_code\": \"109860\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01246034\",\r\n" + 
				"				\"corp_name\": \"네오펙트\",\r\n" + 
				"				\"stock_code\": \"290660\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00652007\",\r\n" + 
				"				\"corp_name\": \"메카로\",\r\n" + 
				"				\"stock_code\": \"241770\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01061558\",\r\n" + 
				"				\"corp_name\": \"덕산네오룩스\",\r\n" + 
				"				\"stock_code\": \"213420\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01257526\",\r\n" + 
				"				\"corp_name\": \"한국제6호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"281410\",\r\n" + 
				"				\"modify_date\": \"20200727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00665676\",\r\n" + 
				"				\"corp_name\": \"아시아경제\",\r\n" + 
				"				\"stock_code\": \"127710\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00875237\",\r\n" + 
				"				\"corp_name\": \"씨앤투스성진\",\r\n" + 
				"				\"stock_code\": \"352700\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01074862\",\r\n" + 
				"				\"corp_name\": \"메가스터디교육\",\r\n" + 
				"				\"stock_code\": \"215200\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01078178\",\r\n" + 
				"				\"corp_name\": \"RFHIC\",\r\n" + 
				"				\"stock_code\": \"218410\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01080252\",\r\n" + 
				"				\"corp_name\": \"넥스틴\",\r\n" + 
				"				\"stock_code\": \"348210\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00989619\",\r\n" + 
				"				\"corp_name\": \"알테오젠\",\r\n" + 
				"				\"stock_code\": \"196170\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01021666\",\r\n" + 
				"				\"corp_name\": \"덕산테코피아\",\r\n" + 
				"				\"stock_code\": \"317330\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109453\",\r\n" + 
				"				\"corp_name\": \"STX조선해양\",\r\n" + 
				"				\"stock_code\": \"067250\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160861\",\r\n" + 
				"				\"corp_name\": \"한농화성\",\r\n" + 
				"				\"stock_code\": \"011500\",\r\n" + 
				"				\"modify_date\": \"20201112\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00813389\",\r\n" + 
				"				\"corp_name\": \"베셀\",\r\n" + 
				"				\"stock_code\": \"177350\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00877819\",\r\n" + 
				"				\"corp_name\": \"데이타솔루션\",\r\n" + 
				"				\"stock_code\": \"263800\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00484682\",\r\n" + 
				"				\"corp_name\": \"엘오티베큠\",\r\n" + 
				"				\"stock_code\": \"083310\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00427483\",\r\n" + 
				"				\"corp_name\": \"대웅제약\",\r\n" + 
				"				\"stock_code\": \"069620\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00925295\",\r\n" + 
				"				\"corp_name\": \"에프엔씨엔터\",\r\n" + 
				"				\"stock_code\": \"173940\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00966168\",\r\n" + 
				"				\"corp_name\": \"디알젬\",\r\n" + 
				"				\"stock_code\": \"263690\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01028164\",\r\n" + 
				"				\"corp_name\": \"광주은행\",\r\n" + 
				"				\"stock_code\": \"192530\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01231786\",\r\n" + 
				"				\"corp_name\": \"슈프리마아이디\",\r\n" + 
				"				\"stock_code\": \"317770\",\r\n" + 
				"				\"modify_date\": \"20210217\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01037214\",\r\n" + 
				"				\"corp_name\": \"케이피에스\",\r\n" + 
				"				\"stock_code\": \"256940\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118275\",\r\n" + 
				"				\"corp_name\": \"디아이\",\r\n" + 
				"				\"stock_code\": \"003160\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00157399\",\r\n" + 
				"				\"corp_name\": \"한솔테크닉스\",\r\n" + 
				"				\"stock_code\": \"004710\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00612489\",\r\n" + 
				"				\"corp_name\": \"아이쓰리시스템\",\r\n" + 
				"				\"stock_code\": \"214430\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00579999\",\r\n" + 
				"				\"corp_name\": \"고영\",\r\n" + 
				"				\"stock_code\": \"098460\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01405390\",\r\n" + 
				"				\"corp_name\": \"핌스\",\r\n" + 
				"				\"stock_code\": \"347770\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00372253\",\r\n" + 
				"				\"corp_name\": \"연우\",\r\n" + 
				"				\"stock_code\": \"115960\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01060814\",\r\n" + 
				"				\"corp_name\": \"삼양패키징\",\r\n" + 
				"				\"stock_code\": \"272550\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106119\",\r\n" + 
				"				\"corp_name\": \"금양\",\r\n" + 
				"				\"stock_code\": \"001570\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109718\",\r\n" + 
				"				\"corp_name\": \"사조대림\",\r\n" + 
				"				\"stock_code\": \"003960\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359395\",\r\n" + 
				"				\"corp_name\": \"헬릭스미스\",\r\n" + 
				"				\"stock_code\": \"084990\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01309795\",\r\n" + 
				"				\"corp_name\": \"알로이스\",\r\n" + 
				"				\"stock_code\": \"297570\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00867849\",\r\n" + 
				"				\"corp_name\": \"오파스넷\",\r\n" + 
				"				\"stock_code\": \"173130\",\r\n" + 
				"				\"modify_date\": \"20201117\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123772\",\r\n" + 
				"				\"corp_name\": \"부국증권\",\r\n" + 
				"				\"stock_code\": \"001270\",\r\n" + 
				"				\"modify_date\": \"20210208\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00459871\",\r\n" + 
				"				\"corp_name\": \"농심홀딩스\",\r\n" + 
				"				\"stock_code\": \"072710\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359474\",\r\n" + 
				"				\"corp_name\": \"제이웨이\",\r\n" + 
				"				\"stock_code\": \"058420\",\r\n" + 
				"				\"modify_date\": \"20201229\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00143314\",\r\n" + 
				"				\"corp_name\": \"에이엔피\",\r\n" + 
				"				\"stock_code\": \"015260\",\r\n" + 
				"				\"modify_date\": \"20201229\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00303217\",\r\n" + 
				"				\"corp_name\": \"우진플라임\",\r\n" + 
				"				\"stock_code\": \"049800\",\r\n" + 
				"				\"modify_date\": \"20201224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102140\",\r\n" + 
				"				\"corp_name\": \"경인전자\",\r\n" + 
				"				\"stock_code\": \"009140\",\r\n" + 
				"				\"modify_date\": \"20201224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149345\",\r\n" + 
				"				\"corp_name\": \"조흥\",\r\n" + 
				"				\"stock_code\": \"002600\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131692\",\r\n" + 
				"				\"corp_name\": \"서흥\",\r\n" + 
				"				\"stock_code\": \"008490\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108001\",\r\n" + 
				"				\"corp_name\": \"남화토건\",\r\n" + 
				"				\"stock_code\": \"091590\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166528\",\r\n" + 
				"				\"corp_name\": \"서암기계공업\",\r\n" + 
				"				\"stock_code\": \"100660\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267942\",\r\n" + 
				"				\"corp_name\": \"큐캐피탈\",\r\n" + 
				"				\"stock_code\": \"016600\",\r\n" + 
				"				\"modify_date\": \"20201230\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00415628\",\r\n" + 
				"				\"corp_name\": \"세진중공업\",\r\n" + 
				"				\"stock_code\": \"075580\",\r\n" + 
				"				\"modify_date\": \"20201231\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00983271\",\r\n" + 
				"				\"corp_name\": \"엔에이치엔\",\r\n" + 
				"				\"stock_code\": \"181710\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01416457\",\r\n" + 
				"				\"corp_name\": \"하나금융15호스팩\",\r\n" + 
				"				\"stock_code\": \"341160\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00816544\",\r\n" + 
				"				\"corp_name\": \"토니모리\",\r\n" + 
				"				\"stock_code\": \"214420\",\r\n" + 
				"				\"modify_date\": \"20201117\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01115044\",\r\n" + 
				"				\"corp_name\": \"안지오랩\",\r\n" + 
				"				\"stock_code\": \"251280\",\r\n" + 
				"				\"modify_date\": \"20210105\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155382\",\r\n" + 
				"				\"corp_name\": \"바이오빌\",\r\n" + 
				"				\"stock_code\": \"065940\",\r\n" + 
				"				\"modify_date\": \"20210115\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01186404\",\r\n" + 
				"				\"corp_name\": \"디앤씨미디어\",\r\n" + 
				"				\"stock_code\": \"263720\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00366793\",\r\n" + 
				"				\"corp_name\": \"에스제이케이\",\r\n" + 
				"				\"stock_code\": \"080440\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152437\",\r\n" + 
				"				\"corp_name\": \"케이프\",\r\n" + 
				"				\"stock_code\": \"064820\",\r\n" + 
				"				\"modify_date\": \"20210202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00494218\",\r\n" + 
				"				\"corp_name\": \"엘엠에스\",\r\n" + 
				"				\"stock_code\": \"073110\",\r\n" + 
				"				\"modify_date\": \"20210202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00332927\",\r\n" + 
				"				\"corp_name\": \"제이에스코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"194370\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00761059\",\r\n" + 
				"				\"corp_name\": \"펌텍코리아\",\r\n" + 
				"				\"stock_code\": \"251970\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132637\",\r\n" + 
				"				\"corp_name\": \"동원시스템즈\",\r\n" + 
				"				\"stock_code\": \"014820\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00603348\",\r\n" + 
				"				\"corp_name\": \"케이아이엔엑스\",\r\n" + 
				"				\"stock_code\": \"093320\",\r\n" + 
				"				\"modify_date\": \"20210125\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173944\",\r\n" + 
				"				\"corp_name\": \"우진\",\r\n" + 
				"				\"stock_code\": \"105840\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00578130\",\r\n" + 
				"				\"corp_name\": \"아퓨어스\",\r\n" + 
				"				\"stock_code\": \"149300\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00755739\",\r\n" + 
				"				\"corp_name\": \"파인테크닉스\",\r\n" + 
				"				\"stock_code\": \"106240\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159698\",\r\n" + 
				"				\"corp_name\": \"지역난방공사\",\r\n" + 
				"				\"stock_code\": \"071320\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117267\",\r\n" + 
				"				\"corp_name\": \"동양생명\",\r\n" + 
				"				\"stock_code\": \"082640\",\r\n" + 
				"				\"modify_date\": \"20210127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00816696\",\r\n" + 
				"				\"corp_name\": \"큐엠씨\",\r\n" + 
				"				\"stock_code\": \"136660\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156600\",\r\n" + 
				"				\"corp_name\": \"한주금속\",\r\n" + 
				"				\"stock_code\": \"198940\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00860730\",\r\n" + 
				"				\"corp_name\": \"에이리츠\",\r\n" + 
				"				\"stock_code\": \"140910\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01160512\",\r\n" + 
				"				\"corp_name\": \"헝셩그룹\",\r\n" + 
				"				\"stock_code\": \"900270\",\r\n" + 
				"				\"modify_date\": \"20200707\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00876643\",\r\n" + 
				"				\"corp_name\": \"엔피디\",\r\n" + 
				"				\"stock_code\": \"198080\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01158632\",\r\n" + 
				"				\"corp_name\": \"진코스텍\",\r\n" + 
				"				\"stock_code\": \"250030\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00606293\",\r\n" + 
				"				\"corp_name\": \"나이스디앤비\",\r\n" + 
				"				\"stock_code\": \"130580\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00812362\",\r\n" + 
				"				\"corp_name\": \"포티스\",\r\n" + 
				"				\"stock_code\": \"141020\",\r\n" + 
				"				\"modify_date\": \"20201231\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00142883\",\r\n" + 
				"				\"corp_name\": \"우신시스템\",\r\n" + 
				"				\"stock_code\": \"017370\",\r\n" + 
				"				\"modify_date\": \"20210202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00915508\",\r\n" + 
				"				\"corp_name\": \"알엔투테크놀로지\",\r\n" + 
				"				\"stock_code\": \"148250\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01124680\",\r\n" + 
				"				\"corp_name\": \"보라티알\",\r\n" + 
				"				\"stock_code\": \"250000\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160010\",\r\n" + 
				"				\"corp_name\": \"한국큐빅\",\r\n" + 
				"				\"stock_code\": \"021650\",\r\n" + 
				"				\"modify_date\": \"20210118\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00547583\",\r\n" + 
				"				\"corp_name\": \"하나금융지주\",\r\n" + 
				"				\"stock_code\": \"086790\",\r\n" + 
				"				\"modify_date\": \"20210128\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00936787\",\r\n" + 
				"				\"corp_name\": \"애경유화\",\r\n" + 
				"				\"stock_code\": \"161000\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00363927\",\r\n" + 
				"				\"corp_name\": \"NE능률\",\r\n" + 
				"				\"stock_code\": \"053290\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01335578\",\r\n" + 
				"				\"corp_name\": \"애니플러스\",\r\n" + 
				"				\"stock_code\": \"310200\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01170865\",\r\n" + 
				"				\"corp_name\": \"네오셈\",\r\n" + 
				"				\"stock_code\": \"253590\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01397903\",\r\n" + 
				"				\"corp_name\": \"엔젠바이오\",\r\n" + 
				"				\"stock_code\": \"354200\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00276834\",\r\n" + 
				"				\"corp_name\": \"KMH하이텍\",\r\n" + 
				"				\"stock_code\": \"052900\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01337017\",\r\n" + 
				"				\"corp_name\": \"이앤에치\",\r\n" + 
				"				\"stock_code\": \"341310\",\r\n" + 
				"				\"modify_date\": \"20210210\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01259311\",\r\n" + 
				"				\"corp_name\": \"푸드나무\",\r\n" + 
				"				\"stock_code\": \"290720\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133991\",\r\n" + 
				"				\"corp_name\": \"세아특수강\",\r\n" + 
				"				\"stock_code\": \"019440\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442154\",\r\n" + 
				"				\"corp_name\": \"제이엔케이히터\",\r\n" + 
				"				\"stock_code\": \"126880\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00409672\",\r\n" + 
				"				\"corp_name\": \"티비에이치글로벌\",\r\n" + 
				"				\"stock_code\": \"084870\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00296263\",\r\n" + 
				"				\"corp_name\": \"YW\",\r\n" + 
				"				\"stock_code\": \"051390\",\r\n" + 
				"				\"modify_date\": \"20210104\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00616962\",\r\n" + 
				"				\"corp_name\": \"린드먼아시아\",\r\n" + 
				"				\"stock_code\": \"277070\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110307\",\r\n" + 
				"				\"corp_name\": \"대선조선\",\r\n" + 
				"				\"stock_code\": \"031990\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00616290\",\r\n" + 
				"				\"corp_name\": \"이엠넷\",\r\n" + 
				"				\"stock_code\": \"123570\",\r\n" + 
				"				\"modify_date\": \"20210215\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00757816\",\r\n" + 
				"				\"corp_name\": \"모다\",\r\n" + 
				"				\"stock_code\": \"149940\",\r\n" + 
				"				\"modify_date\": \"20200710\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00409140\",\r\n" + 
				"				\"corp_name\": \"이원컴포텍\",\r\n" + 
				"				\"stock_code\": \"088290\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00309831\",\r\n" + 
				"				\"corp_name\": \"알에프텍\",\r\n" + 
				"				\"stock_code\": \"061040\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01118139\",\r\n" + 
				"				\"corp_name\": \"이도바이오\",\r\n" + 
				"				\"stock_code\": \"336040\",\r\n" + 
				"				\"modify_date\": \"20201124\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367844\",\r\n" + 
				"				\"corp_name\": \"자이에스앤디\",\r\n" + 
				"				\"stock_code\": \"317400\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00977650\",\r\n" + 
				"				\"corp_name\": \"엔케이맥스\",\r\n" + 
				"				\"stock_code\": \"182400\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00370255\",\r\n" + 
				"				\"corp_name\": \"바른전자\",\r\n" + 
				"				\"stock_code\": \"064520\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144021\",\r\n" + 
				"				\"corp_name\": \"원풍물산\",\r\n" + 
				"				\"stock_code\": \"008290\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01236532\",\r\n" + 
				"				\"corp_name\": \"와이즈버즈\",\r\n" + 
				"				\"stock_code\": \"273060\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00614593\",\r\n" + 
				"				\"corp_name\": \"넥스트아이\",\r\n" + 
				"				\"stock_code\": \"137940\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00599887\",\r\n" + 
				"				\"corp_name\": \"신텍\",\r\n" + 
				"				\"stock_code\": \"099660\",\r\n" + 
				"				\"modify_date\": \"20200720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111810\",\r\n" + 
				"				\"corp_name\": \"대웅\",\r\n" + 
				"				\"stock_code\": \"003090\",\r\n" + 
				"				\"modify_date\": \"20210216\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00601641\",\r\n" + 
				"				\"corp_name\": \"리드\",\r\n" + 
				"				\"stock_code\": \"197210\",\r\n" + 
				"				\"modify_date\": \"20201126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00201788\",\r\n" + 
				"				\"corp_name\": \"제낙스\",\r\n" + 
				"				\"stock_code\": \"065620\",\r\n" + 
				"				\"modify_date\": \"20201126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00385415\",\r\n" + 
				"				\"corp_name\": \"일신바이오\",\r\n" + 
				"				\"stock_code\": \"068330\",\r\n" + 
				"				\"modify_date\": \"20201126\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101664\",\r\n" + 
				"				\"corp_name\": \"경보제약\",\r\n" + 
				"				\"stock_code\": \"214390\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01011562\",\r\n" + 
				"				\"corp_name\": \"우성아이비\",\r\n" + 
				"				\"stock_code\": \"194610\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00541349\",\r\n" + 
				"				\"corp_name\": \"셀트리온제약\",\r\n" + 
				"				\"stock_code\": \"068760\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00486875\",\r\n" + 
				"				\"corp_name\": \"우양\",\r\n" + 
				"				\"stock_code\": \"103840\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129420\",\r\n" + 
				"				\"corp_name\": \"까뮤이앤씨\",\r\n" + 
				"				\"stock_code\": \"013700\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00297448\",\r\n" + 
				"				\"corp_name\": \"젬백스지오\",\r\n" + 
				"				\"stock_code\": \"041590\",\r\n" + 
				"				\"modify_date\": \"20201111\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132868\",\r\n" + 
				"				\"corp_name\": \"성안\",\r\n" + 
				"				\"stock_code\": \"011300\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00560122\",\r\n" + 
				"				\"corp_name\": \"텔레필드\",\r\n" + 
				"				\"stock_code\": \"091440\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148443\",\r\n" + 
				"				\"corp_name\": \"제일파마홀딩스\",\r\n" + 
				"				\"stock_code\": \"002620\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00369213\",\r\n" + 
				"				\"corp_name\": \"리노스\",\r\n" + 
				"				\"stock_code\": \"039980\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01042359\",\r\n" + 
				"				\"corp_name\": \"지엘팜텍\",\r\n" + 
				"				\"stock_code\": \"204840\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129615\",\r\n" + 
				"				\"corp_name\": \"상보\",\r\n" + 
				"				\"stock_code\": \"027580\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00378628\",\r\n" + 
				"				\"corp_name\": \"KH바텍\",\r\n" + 
				"				\"stock_code\": \"060720\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01042429\",\r\n" + 
				"				\"corp_name\": \"액션스퀘어\",\r\n" + 
				"				\"stock_code\": \"205500\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526696\",\r\n" + 
				"				\"corp_name\": \"웨이브일렉트로\",\r\n" + 
				"				\"stock_code\": \"095270\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00256380\",\r\n" + 
				"				\"corp_name\": \"유아이엘\",\r\n" + 
				"				\"stock_code\": \"049520\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00528515\",\r\n" + 
				"				\"corp_name\": \"한라IMS\",\r\n" + 
				"				\"stock_code\": \"092460\",\r\n" + 
				"				\"modify_date\": \"20201202\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161693\",\r\n" + 
				"				\"corp_name\": \"한샘\",\r\n" + 
				"				\"stock_code\": \"009240\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01110678\",\r\n" + 
				"				\"corp_name\": \"유틸렉스\",\r\n" + 
				"				\"stock_code\": \"263050\",\r\n" + 
				"				\"modify_date\": \"20210218\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136776\",\r\n" + 
				"				\"corp_name\": \"제이준코스메틱\",\r\n" + 
				"				\"stock_code\": \"025620\",\r\n" + 
				"				\"modify_date\": \"20201119\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00666064\",\r\n" + 
				"				\"corp_name\": \"셀바스AI\",\r\n" + 
				"				\"stock_code\": \"108860\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00666204\",\r\n" + 
				"				\"corp_name\": \"제너셈\",\r\n" + 
				"				\"stock_code\": \"217190\",\r\n" + 
				"				\"modify_date\": \"20201127\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00306454\",\r\n" + 
				"				\"corp_name\": \"한국정보인증\",\r\n" + 
				"				\"stock_code\": \"053300\",\r\n" + 
				"				\"modify_date\": \"20201223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00330044\",\r\n" + 
				"				\"corp_name\": \"캠시스\",\r\n" + 
				"				\"stock_code\": \"050110\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00293886\",\r\n" + 
				"				\"corp_name\": \"위닉스\",\r\n" + 
				"				\"stock_code\": \"044340\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259934\",\r\n" + 
				"				\"corp_name\": \"예림당\",\r\n" + 
				"				\"stock_code\": \"036000\",\r\n" + 
				"				\"modify_date\": \"20201119\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00142661\",\r\n" + 
				"				\"corp_name\": \"우성사료\",\r\n" + 
				"				\"stock_code\": \"006980\",\r\n" + 
				"				\"modify_date\": \"20201124\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00530413\",\r\n" + 
				"				\"corp_name\": \"코디엠\",\r\n" + 
				"				\"stock_code\": \"224060\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01046203\",\r\n" + 
				"				\"corp_name\": \"스튜디오산타클로스\",\r\n" + 
				"				\"stock_code\": \"204630\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01085442\",\r\n" + 
				"				\"corp_name\": \"휴벡셀\",\r\n" + 
				"				\"stock_code\": \"212310\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102751\",\r\n" + 
				"				\"corp_name\": \"고려산업\",\r\n" + 
				"				\"stock_code\": \"002140\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00974927\",\r\n" + 
				"				\"corp_name\": \"NEW\",\r\n" + 
				"				\"stock_code\": \"160550\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01222867\",\r\n" + 
				"				\"corp_name\": \"제테마\",\r\n" + 
				"				\"stock_code\": \"216080\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125743\",\r\n" + 
				"				\"corp_name\": \"현대비앤지스틸\",\r\n" + 
				"				\"stock_code\": \"004560\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106395\",\r\n" + 
				"				\"corp_name\": \"금호전기\",\r\n" + 
				"				\"stock_code\": \"001210\",\r\n" + 
				"				\"modify_date\": \"20201204\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133511\",\r\n" + 
				"				\"corp_name\": \"SG세계물산\",\r\n" + 
				"				\"stock_code\": \"004060\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00506294\",\r\n" + 
				"				\"corp_name\": \"가비아\",\r\n" + 
				"				\"stock_code\": \"079940\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00492353\",\r\n" + 
				"				\"corp_name\": \"파이오링크\",\r\n" + 
				"				\"stock_code\": \"170790\",\r\n" + 
				"				\"modify_date\": \"20210222\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149947\",\r\n" + 
				"				\"corp_name\": \"JW중외제약\",\r\n" + 
				"				\"stock_code\": \"001060\",\r\n" + 
				"				\"modify_date\": \"20210209\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140061\",\r\n" + 
				"				\"corp_name\": \"정산애강\",\r\n" + 
				"				\"stock_code\": \"022220\",\r\n" + 
				"				\"modify_date\": \"20210219\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00598198\",\r\n" + 
				"				\"corp_name\": \"컴퍼니케이\",\r\n" + 
				"				\"stock_code\": \"307930\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00530121\",\r\n" + 
				"				\"corp_name\": \"디에스케이\",\r\n" + 
				"				\"stock_code\": \"109740\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01182578\",\r\n" + 
				"				\"corp_name\": \"대유에이피\",\r\n" + 
				"				\"stock_code\": \"290120\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00318316\",\r\n" + 
				"				\"corp_name\": \"대아티아이\",\r\n" + 
				"				\"stock_code\": \"045390\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00363486\",\r\n" + 
				"				\"corp_name\": \"로체시스템즈\",\r\n" + 
				"				\"stock_code\": \"071280\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01384477\",\r\n" + 
				"				\"corp_name\": \"엠에프엠코리아\",\r\n" + 
				"				\"stock_code\": \"323230\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122472\",\r\n" + 
				"				\"corp_name\": \"백광산업\",\r\n" + 
				"				\"stock_code\": \"001340\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00371740\",\r\n" + 
				"				\"corp_name\": \"디스플레이텍\",\r\n" + 
				"				\"stock_code\": \"066670\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00532129\",\r\n" + 
				"				\"corp_name\": \"영림원소프트랩\",\r\n" + 
				"				\"stock_code\": \"060850\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01179617\",\r\n" + 
				"				\"corp_name\": \"한국비엔씨\",\r\n" + 
				"				\"stock_code\": \"256840\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00867973\",\r\n" + 
				"				\"corp_name\": \"서남\",\r\n" + 
				"				\"stock_code\": \"294630\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00438036\",\r\n" + 
				"				\"corp_name\": \"팅크웨어\",\r\n" + 
				"				\"stock_code\": \"084730\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261735\",\r\n" + 
				"				\"corp_name\": \"위노바\",\r\n" + 
				"				\"stock_code\": \"039790\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00195229\",\r\n" + 
				"				\"corp_name\": \"휠라홀딩스\",\r\n" + 
				"				\"stock_code\": \"081660\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00177199\",\r\n" + 
				"				\"corp_name\": \"디씨엠\",\r\n" + 
				"				\"stock_code\": \"024090\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154392\",\r\n" + 
				"				\"corp_name\": \"에스트라\",\r\n" + 
				"				\"stock_code\": \"016570\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146269\",\r\n" + 
				"				\"corp_name\": \"일신방직\",\r\n" + 
				"				\"stock_code\": \"003200\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00567222\",\r\n" + 
				"				\"corp_name\": \"우림기계\",\r\n" + 
				"				\"stock_code\": \"101170\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00541862\",\r\n" + 
				"				\"corp_name\": \"판도라티비\",\r\n" + 
				"				\"stock_code\": \"202960\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113614\",\r\n" + 
				"				\"corp_name\": \"대현\",\r\n" + 
				"				\"stock_code\": \"016090\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00917861\",\r\n" + 
				"				\"corp_name\": \"슈피겐코리아\",\r\n" + 
				"				\"stock_code\": \"192440\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00608316\",\r\n" + 
				"				\"corp_name\": \"대한과학\",\r\n" + 
				"				\"stock_code\": \"131220\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01405585\",\r\n" + 
				"				\"corp_name\": \"IBKS제12호스팩\",\r\n" + 
				"				\"stock_code\": \"335870\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01326792\",\r\n" + 
				"				\"corp_name\": \"상상인이안1호스팩\",\r\n" + 
				"				\"stock_code\": \"307870\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00991225\",\r\n" + 
				"				\"corp_name\": \"더콘텐츠온\",\r\n" + 
				"				\"stock_code\": \"302920\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00929778\",\r\n" + 
				"				\"corp_name\": \"세기리텍\",\r\n" + 
				"				\"stock_code\": \"199870\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00864338\",\r\n" + 
				"				\"corp_name\": \"웹스\",\r\n" + 
				"				\"stock_code\": \"196700\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00670340\",\r\n" + 
				"				\"corp_name\": \"씨에스윈드\",\r\n" + 
				"				\"stock_code\": \"112610\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104999\",\r\n" + 
				"				\"corp_name\": \"윌비스\",\r\n" + 
				"				\"stock_code\": \"008600\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00675594\",\r\n" + 
				"				\"corp_name\": \"디티앤씨\",\r\n" + 
				"				\"stock_code\": \"187220\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01336373\",\r\n" + 
				"				\"corp_name\": \"메드팩토\",\r\n" + 
				"				\"stock_code\": \"235980\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138206\",\r\n" + 
				"				\"corp_name\": \"쌍용건설\",\r\n" + 
				"				\"stock_code\": \"012650\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00544452\",\r\n" + 
				"				\"corp_name\": \"이리츠코크렙\",\r\n" + 
				"				\"stock_code\": \"088260\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01062867\",\r\n" + 
				"				\"corp_name\": \"디알텍\",\r\n" + 
				"				\"stock_code\": \"214680\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01390876\",\r\n" + 
				"				\"corp_name\": \"상상인이안제2호스팩\",\r\n" + 
				"				\"stock_code\": \"329560\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01163050\",\r\n" + 
				"				\"corp_name\": \"다이오진\",\r\n" + 
				"				\"stock_code\": \"271850\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00797364\",\r\n" + 
				"				\"corp_name\": \"KC코트렐\",\r\n" + 
				"				\"stock_code\": \"119650\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00599489\",\r\n" + 
				"				\"corp_name\": \"청광건설\",\r\n" + 
				"				\"stock_code\": \"140290\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121686\",\r\n" + 
				"				\"corp_name\": \"엠케이전자\",\r\n" + 
				"				\"stock_code\": \"033160\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122481\",\r\n" + 
				"				\"corp_name\": \"태경비케이\",\r\n" + 
				"				\"stock_code\": \"014580\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364740\",\r\n" + 
				"				\"corp_name\": \"머큐리\",\r\n" + 
				"				\"stock_code\": \"100590\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156956\",\r\n" + 
				"				\"corp_name\": \"한국기업평가\",\r\n" + 
				"				\"stock_code\": \"034950\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133706\",\r\n" + 
				"				\"corp_name\": \"세하\",\r\n" + 
				"				\"stock_code\": \"027970\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00370918\",\r\n" + 
				"				\"corp_name\": \"케이디켐\",\r\n" + 
				"				\"stock_code\": \"221980\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146649\",\r\n" + 
				"				\"corp_name\": \"일진홀딩스\",\r\n" + 
				"				\"stock_code\": \"015860\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110060\",\r\n" + 
				"				\"corp_name\": \"대백저축은행\",\r\n" + 
				"				\"stock_code\": \"026970\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00543107\",\r\n" + 
				"				\"corp_name\": \"오킨스전자\",\r\n" + 
				"				\"stock_code\": \"080580\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00353762\",\r\n" + 
				"				\"corp_name\": \"키이스트\",\r\n" + 
				"				\"stock_code\": \"054780\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00870481\",\r\n" + 
				"				\"corp_name\": \"에코캡\",\r\n" + 
				"				\"stock_code\": \"128540\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00242712\",\r\n" + 
				"				\"corp_name\": \"엘컴텍\",\r\n" + 
				"				\"stock_code\": \"037950\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00398808\",\r\n" + 
				"				\"corp_name\": \"디지털대성\",\r\n" + 
				"				\"stock_code\": \"068930\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00203290\",\r\n" + 
				"				\"corp_name\": \"한국콜마홀딩스\",\r\n" + 
				"				\"stock_code\": \"024720\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00317681\",\r\n" + 
				"				\"corp_name\": \"메타바이오메드\",\r\n" + 
				"				\"stock_code\": \"059210\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00562245\",\r\n" + 
				"				\"corp_name\": \"태웅로직스\",\r\n" + 
				"				\"stock_code\": \"124560\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132725\",\r\n" + 
				"				\"corp_name\": \"성보화학\",\r\n" + 
				"				\"stock_code\": \"003080\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124577\",\r\n" + 
				"				\"corp_name\": \"엠소닉\",\r\n" + 
				"				\"stock_code\": \"008120\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00670085\",\r\n" + 
				"				\"corp_name\": \"엘아이에스\",\r\n" + 
				"				\"stock_code\": \"138690\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00676122\",\r\n" + 
				"				\"corp_name\": \"지디\",\r\n" + 
				"				\"stock_code\": \"155960\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138598\",\r\n" + 
				"				\"corp_name\": \"아비코전자\",\r\n" + 
				"				\"stock_code\": \"036010\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00602172\",\r\n" + 
				"				\"corp_name\": \"와이엠티\",\r\n" + 
				"				\"stock_code\": \"251370\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00248053\",\r\n" + 
				"				\"corp_name\": \"지에스엔텍\",\r\n" + 
				"				\"stock_code\": \"037640\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01110182\",\r\n" + 
				"				\"corp_name\": \"이노테라피\",\r\n" + 
				"				\"stock_code\": \"246960\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124780\",\r\n" + 
				"				\"corp_name\": \"사조씨푸드\",\r\n" + 
				"				\"stock_code\": \"014710\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00100957\",\r\n" + 
				"				\"corp_name\": \"건영\",\r\n" + 
				"				\"stock_code\": \"012720\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00904672\",\r\n" + 
				"				\"corp_name\": \"넷마블\",\r\n" + 
				"				\"stock_code\": \"251270\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00386937\",\r\n" + 
				"				\"corp_name\": \"국민은행\",\r\n" + 
				"				\"stock_code\": \"060000\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01031502\",\r\n" + 
				"				\"corp_name\": \"코아시아옵틱스\",\r\n" + 
				"				\"stock_code\": \"196450\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01344202\",\r\n" + 
				"				\"corp_name\": \"뷰노\",\r\n" + 
				"				\"stock_code\": \"338220\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165103\",\r\n" + 
				"				\"corp_name\": \"푸드웰\",\r\n" + 
				"				\"stock_code\": \"005670\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359076\",\r\n" + 
				"				\"corp_name\": \"브리지텍\",\r\n" + 
				"				\"stock_code\": \"064480\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01221947\",\r\n" + 
				"				\"corp_name\": \"비엔에프코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"271780\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00221728\",\r\n" + 
				"				\"corp_name\": \"하츠\",\r\n" + 
				"				\"stock_code\": \"066130\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159795\",\r\n" + 
				"				\"corp_name\": \"한국카본\",\r\n" + 
				"				\"stock_code\": \"017960\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00216027\",\r\n" + 
				"				\"corp_name\": \"바이넥스\",\r\n" + 
				"				\"stock_code\": \"053030\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115287\",\r\n" + 
				"				\"corp_name\": \"동방\",\r\n" + 
				"				\"stock_code\": \"004140\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122898\",\r\n" + 
				"				\"corp_name\": \"벽산\",\r\n" + 
				"				\"stock_code\": \"007210\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108746\",\r\n" + 
				"				\"corp_name\": \"큐로\",\r\n" + 
				"				\"stock_code\": \"015590\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00229021\",\r\n" + 
				"				\"corp_name\": \"인성정보\",\r\n" + 
				"				\"stock_code\": \"033230\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01344752\",\r\n" + 
				"				\"corp_name\": \"케어룸의료산업\",\r\n" + 
				"				\"stock_code\": \"327970\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173698\",\r\n" + 
				"				\"corp_name\": \"신일전자\",\r\n" + 
				"				\"stock_code\": \"002700\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00557508\",\r\n" + 
				"				\"corp_name\": \"GKL\",\r\n" + 
				"				\"stock_code\": \"114090\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00899556\",\r\n" + 
				"				\"corp_name\": \"제룡산업\",\r\n" + 
				"				\"stock_code\": \"147830\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00486370\",\r\n" + 
				"				\"corp_name\": \"성창오토텍\",\r\n" + 
				"				\"stock_code\": \"080470\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01276327\",\r\n" + 
				"				\"corp_name\": \"위지윅스튜디오\",\r\n" + 
				"				\"stock_code\": \"299900\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01343735\",\r\n" + 
				"				\"corp_name\": \"데이드림엔터\",\r\n" + 
				"				\"stock_code\": \"348840\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00614089\",\r\n" + 
				"				\"corp_name\": \"에이원알폼\",\r\n" + 
				"				\"stock_code\": \"234070\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01351114\",\r\n" + 
				"				\"corp_name\": \"케이비17호스팩\",\r\n" + 
				"				\"stock_code\": \"317030\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01139497\",\r\n" + 
				"				\"corp_name\": \"에스제이켐\",\r\n" + 
				"				\"stock_code\": \"217910\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00486097\",\r\n" + 
				"				\"corp_name\": \"나스미디어\",\r\n" + 
				"				\"stock_code\": \"089600\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00219848\",\r\n" + 
				"				\"corp_name\": \"서희건설\",\r\n" + 
				"				\"stock_code\": \"035890\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01023318\",\r\n" + 
				"				\"corp_name\": \"센코\",\r\n" + 
				"				\"stock_code\": \"347000\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01181515\",\r\n" + 
				"				\"corp_name\": \"엘앤씨바이오\",\r\n" + 
				"				\"stock_code\": \"290650\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00143794\",\r\n" + 
				"				\"corp_name\": \"원림\",\r\n" + 
				"				\"stock_code\": \"005820\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121288\",\r\n" + 
				"				\"corp_name\": \"모나미\",\r\n" + 
				"				\"stock_code\": \"005360\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00913689\",\r\n" + 
				"				\"corp_name\": \"세경하이테크\",\r\n" + 
				"				\"stock_code\": \"148150\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117276\",\r\n" + 
				"				\"corp_name\": \"네이처셀\",\r\n" + 
				"				\"stock_code\": \"007390\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01020524\",\r\n" + 
				"				\"corp_name\": \"자이글\",\r\n" + 
				"				\"stock_code\": \"234920\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146232\",\r\n" + 
				"				\"corp_name\": \"일성건설\",\r\n" + 
				"				\"stock_code\": \"013360\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01262023\",\r\n" + 
				"				\"corp_name\": \"루트락\",\r\n" + 
				"				\"stock_code\": \"253610\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01371312\",\r\n" + 
				"				\"corp_name\": \"케이비제18호스팩\",\r\n" + 
				"				\"stock_code\": \"323940\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151447\",\r\n" + 
				"				\"corp_name\": \"천지산업\",\r\n" + 
				"				\"stock_code\": \"001490\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146454\",\r\n" + 
				"				\"corp_name\": \"일양약품\",\r\n" + 
				"				\"stock_code\": \"007570\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260408\",\r\n" + 
				"				\"corp_name\": \"팜스코\",\r\n" + 
				"				\"stock_code\": \"036580\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00303192\",\r\n" + 
				"				\"corp_name\": \"디에이피\",\r\n" + 
				"				\"stock_code\": \"066900\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162911\",\r\n" + 
				"				\"corp_name\": \"한일사료\",\r\n" + 
				"				\"stock_code\": \"005860\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00963976\",\r\n" + 
				"				\"corp_name\": \"SG\",\r\n" + 
				"				\"stock_code\": \"255220\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140955\",\r\n" + 
				"				\"corp_name\": \"한솔케미칼\",\r\n" + 
				"				\"stock_code\": \"014680\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01082348\",\r\n" + 
				"				\"corp_name\": \"오스테오닉\",\r\n" + 
				"				\"stock_code\": \"226400\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01029394\",\r\n" + 
				"				\"corp_name\": \"에코마케팅\",\r\n" + 
				"				\"stock_code\": \"230360\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231442\",\r\n" + 
				"				\"corp_name\": \"디지틀조선\",\r\n" + 
				"				\"stock_code\": \"033130\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00411446\",\r\n" + 
				"				\"corp_name\": \"큐에스아이\",\r\n" + 
				"				\"stock_code\": \"066310\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01207716\",\r\n" + 
				"				\"corp_name\": \"앱코\",\r\n" + 
				"				\"stock_code\": \"129890\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442631\",\r\n" + 
				"				\"corp_name\": \"태양기계\",\r\n" + 
				"				\"stock_code\": \"116100\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00531865\",\r\n" + 
				"				\"corp_name\": \"유니테크노\",\r\n" + 
				"				\"stock_code\": \"241690\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01169267\",\r\n" + 
				"				\"corp_name\": \"세화피앤씨\",\r\n" + 
				"				\"stock_code\": \"252500\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00693651\",\r\n" + 
				"				\"corp_name\": \"비덴트\",\r\n" + 
				"				\"stock_code\": \"121800\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146214\",\r\n" + 
				"				\"corp_name\": \"일성신약\",\r\n" + 
				"				\"stock_code\": \"003120\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155258\",\r\n" + 
				"				\"corp_name\": \"포스코강판\",\r\n" + 
				"				\"stock_code\": \"058430\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00258102\",\r\n" + 
				"				\"corp_name\": \"지엔코\",\r\n" + 
				"				\"stock_code\": \"065060\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00971726\",\r\n" + 
				"				\"corp_name\": \"옵티팜\",\r\n" + 
				"				\"stock_code\": \"153710\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00234412\",\r\n" + 
				"				\"corp_name\": \"신세계인터내셔날\",\r\n" + 
				"				\"stock_code\": \"031430\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00411385\",\r\n" + 
				"				\"corp_name\": \"유비쿼스홀딩스\",\r\n" + 
				"				\"stock_code\": \"078070\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00167031\",\r\n" + 
				"				\"corp_name\": \"흥국\",\r\n" + 
				"				\"stock_code\": \"010240\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122056\",\r\n" + 
				"				\"corp_name\": \"미창석유공업\",\r\n" + 
				"				\"stock_code\": \"003650\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01390399\",\r\n" + 
				"				\"corp_name\": \"미래에셋대우스팩3호\",\r\n" + 
				"				\"stock_code\": \"328380\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122694\",\r\n" + 
				"				\"corp_name\": \"범양건영\",\r\n" + 
				"				\"stock_code\": \"002410\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113243\",\r\n" + 
				"				\"corp_name\": \"대한제분\",\r\n" + 
				"				\"stock_code\": \"001130\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00203209\",\r\n" + 
				"				\"corp_name\": \"에쎈테크\",\r\n" + 
				"				\"stock_code\": \"043340\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01021949\",\r\n" + 
				"				\"corp_name\": \"덱스터\",\r\n" + 
				"				\"stock_code\": \"206560\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01187494\",\r\n" + 
				"				\"corp_name\": \"덴티스\",\r\n" + 
				"				\"stock_code\": \"261200\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00225706\",\r\n" + 
				"				\"corp_name\": \"JW생명과학\",\r\n" + 
				"				\"stock_code\": \"234080\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00975290\",\r\n" + 
				"				\"corp_name\": \"에이스토리\",\r\n" + 
				"				\"stock_code\": \"241840\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00568461\",\r\n" + 
				"				\"corp_name\": \"보광산업\",\r\n" + 
				"				\"stock_code\": \"225530\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361725\",\r\n" + 
				"				\"corp_name\": \"에스케이커뮤니케이션즈\",\r\n" + 
				"				\"stock_code\": \"066270\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112004\",\r\n" + 
				"				\"corp_name\": \"알바이오\",\r\n" + 
				"				\"stock_code\": \"003190\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00530185\",\r\n" + 
				"				\"corp_name\": \"이엔에프테크놀로지\",\r\n" + 
				"				\"stock_code\": \"102710\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00664181\",\r\n" + 
				"				\"corp_name\": \"인텔리안테크\",\r\n" + 
				"				\"stock_code\": \"189300\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01135941\",\r\n" + 
				"				\"corp_name\": \"원익IPS\",\r\n" + 
				"				\"stock_code\": \"240810\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01109070\",\r\n" + 
				"				\"corp_name\": \"비피도\",\r\n" + 
				"				\"stock_code\": \"238200\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109754\",\r\n" + 
				"				\"corp_name\": \"대림비앤코\",\r\n" + 
				"				\"stock_code\": \"005750\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00879020\",\r\n" + 
				"				\"corp_name\": \"유니트론텍\",\r\n" + 
				"				\"stock_code\": \"142210\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131197\",\r\n" + 
				"				\"corp_name\": \"서원\",\r\n" + 
				"				\"stock_code\": \"021050\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00491336\",\r\n" + 
				"				\"corp_name\": \"잘만테크\",\r\n" + 
				"				\"stock_code\": \"090120\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01071041\",\r\n" + 
				"				\"corp_name\": \"천랩\",\r\n" + 
				"				\"stock_code\": \"311690\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00991298\",\r\n" + 
				"				\"corp_name\": \"씨이랩\",\r\n" + 
				"				\"stock_code\": \"189330\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447760\",\r\n" + 
				"				\"corp_name\": \"미래컴퍼니\",\r\n" + 
				"				\"stock_code\": \"049950\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00545114\",\r\n" + 
				"				\"corp_name\": \"랩지노믹스\",\r\n" + 
				"				\"stock_code\": \"084650\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00481223\",\r\n" + 
				"				\"corp_name\": \"넥스피안\",\r\n" + 
				"				\"stock_code\": \"079560\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00671376\",\r\n" + 
				"				\"corp_name\": \"티웨이항공\",\r\n" + 
				"				\"stock_code\": \"091810\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00667425\",\r\n" + 
				"				\"corp_name\": \"에이팩트\",\r\n" + 
				"				\"stock_code\": \"200470\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163691\",\r\n" + 
				"				\"corp_name\": \"유수홀딩스\",\r\n" + 
				"				\"stock_code\": \"000700\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00357430\",\r\n" + 
				"				\"corp_name\": \"쎌바이오텍\",\r\n" + 
				"				\"stock_code\": \"049960\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00624749\",\r\n" + 
				"				\"corp_name\": \"에스피시스템스\",\r\n" + 
				"				\"stock_code\": \"317830\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125646\",\r\n" + 
				"				\"corp_name\": \"삼목에스폼\",\r\n" + 
				"				\"stock_code\": \"018310\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132488\",\r\n" + 
				"				\"corp_name\": \"신세계톰보이\",\r\n" + 
				"				\"stock_code\": \"012580\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00226316\",\r\n" + 
				"				\"corp_name\": \"호전실업\",\r\n" + 
				"				\"stock_code\": \"111110\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00632304\",\r\n" + 
				"				\"corp_name\": \"JW홀딩스\",\r\n" + 
				"				\"stock_code\": \"096760\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00678096\",\r\n" + 
				"				\"corp_name\": \"맥스로텍\",\r\n" + 
				"				\"stock_code\": \"141070\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00327396\",\r\n" + 
				"				\"corp_name\": \"옵트론텍\",\r\n" + 
				"				\"stock_code\": \"082210\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00927558\",\r\n" + 
				"				\"corp_name\": \"유바이오로직스\",\r\n" + 
				"				\"stock_code\": \"206650\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162072\",\r\n" + 
				"				\"corp_name\": \"한신기계공업\",\r\n" + 
				"				\"stock_code\": \"011700\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139083\",\r\n" + 
				"				\"corp_name\": \"아진산업\",\r\n" + 
				"				\"stock_code\": \"013310\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00295370\",\r\n" + 
				"				\"corp_name\": \"에이아이비트\",\r\n" + 
				"				\"stock_code\": \"039230\",\r\n" + 
				"				\"modify_date\": \"20210312\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134477\",\r\n" + 
				"				\"corp_name\": \"SNT중공업\",\r\n" + 
				"				\"stock_code\": \"003570\",\r\n" + 
				"				\"modify_date\": \"20210312\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00923792\",\r\n" + 
				"				\"corp_name\": \"내츄럴엔도텍\",\r\n" + 
				"				\"stock_code\": \"168330\",\r\n" + 
				"				\"modify_date\": \"20210312\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00398792\",\r\n" + 
				"				\"corp_name\": \"SNT모티브\",\r\n" + 
				"				\"stock_code\": \"064960\",\r\n" + 
				"				\"modify_date\": \"20210312\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00648721\",\r\n" + 
				"				\"corp_name\": \"SNT에너지\",\r\n" + 
				"				\"stock_code\": \"100840\",\r\n" + 
				"				\"modify_date\": \"20210312\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267881\",\r\n" + 
				"				\"corp_name\": \"보성파워텍\",\r\n" + 
				"				\"stock_code\": \"006910\",\r\n" + 
				"				\"modify_date\": \"20210323\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163512\",\r\n" + 
				"				\"corp_name\": \"한진\",\r\n" + 
				"				\"stock_code\": \"002320\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01046391\",\r\n" + 
				"				\"corp_name\": \"싸이토젠\",\r\n" + 
				"				\"stock_code\": \"217330\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00989327\",\r\n" + 
				"				\"corp_name\": \"엘피케이로보틱스\",\r\n" + 
				"				\"stock_code\": \"183350\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00414540\",\r\n" + 
				"				\"corp_name\": \"대주이엔티\",\r\n" + 
				"				\"stock_code\": \"114920\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00170877\",\r\n" + 
				"				\"corp_name\": \"진로발효\",\r\n" + 
				"				\"stock_code\": \"018120\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00445869\",\r\n" + 
				"				\"corp_name\": \"유니포인트\",\r\n" + 
				"				\"stock_code\": \"121060\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01035289\",\r\n" + 
				"				\"corp_name\": \"모두투어리츠\",\r\n" + 
				"				\"stock_code\": \"204210\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155586\",\r\n" + 
				"				\"corp_name\": \"피에스엠씨\",\r\n" + 
				"				\"stock_code\": \"024850\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115612\",\r\n" + 
				"				\"corp_name\": \"동부건설\",\r\n" + 
				"				\"stock_code\": \"005960\",\r\n" + 
				"				\"modify_date\": \"20210312\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00665630\",\r\n" + 
				"				\"corp_name\": \"테라텍\",\r\n" + 
				"				\"stock_code\": \"151750\",\r\n" + 
				"				\"modify_date\": \"20210323\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01363924\",\r\n" + 
				"				\"corp_name\": \"한국미라클피플사\",\r\n" + 
				"				\"stock_code\": \"331660\",\r\n" + 
				"				\"modify_date\": \"20210323\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00389998\",\r\n" + 
				"				\"corp_name\": \"이엔코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"066980\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447007\",\r\n" + 
				"				\"corp_name\": \"알리코제약\",\r\n" + 
				"				\"stock_code\": \"260660\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162063\",\r\n" + 
				"				\"corp_name\": \"한신공영\",\r\n" + 
				"				\"stock_code\": \"004960\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00921916\",\r\n" + 
				"				\"corp_name\": \"석경에이티\",\r\n" + 
				"				\"stock_code\": \"357550\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00186452\",\r\n" + 
				"				\"corp_name\": \"릭스솔루션\",\r\n" + 
				"				\"stock_code\": \"029480\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00787376\",\r\n" + 
				"				\"corp_name\": \"대성에너지\",\r\n" + 
				"				\"stock_code\": \"117580\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00795135\",\r\n" + 
				"				\"corp_name\": \"코오롱인더\",\r\n" + 
				"				\"stock_code\": \"120110\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367455\",\r\n" + 
				"				\"corp_name\": \"현우산업\",\r\n" + 
				"				\"stock_code\": \"092300\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01258710\",\r\n" + 
				"				\"corp_name\": \"이노메트리\",\r\n" + 
				"				\"stock_code\": \"302430\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00365457\",\r\n" + 
				"				\"corp_name\": \"제이티\",\r\n" + 
				"				\"stock_code\": \"089790\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00607797\",\r\n" + 
				"				\"corp_name\": \"엄지하우스\",\r\n" + 
				"				\"stock_code\": \"224810\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01188730\",\r\n" + 
				"				\"corp_name\": \"시그넷이브이\",\r\n" + 
				"				\"stock_code\": \"260870\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00965813\",\r\n" + 
				"				\"corp_name\": \"미투온\",\r\n" + 
				"				\"stock_code\": \"201490\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01168684\",\r\n" + 
				"				\"corp_name\": \"스튜디오드래곤\",\r\n" + 
				"				\"stock_code\": \"253450\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153278\",\r\n" + 
				"				\"corp_name\": \"서연탑메탈\",\r\n" + 
				"				\"stock_code\": \"019770\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161408\",\r\n" + 
				"				\"corp_name\": \"케이비캐피탈\",\r\n" + 
				"				\"stock_code\": \"021960\",\r\n" + 
				"				\"modify_date\": \"20210315\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00478900\",\r\n" + 
				"				\"corp_name\": \"빅솔론\",\r\n" + 
				"				\"stock_code\": \"093190\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01258507\",\r\n" + 
				"				\"corp_name\": \"롯데제과\",\r\n" + 
				"				\"stock_code\": \"280360\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00664853\",\r\n" + 
				"				\"corp_name\": \"제이씨케미칼\",\r\n" + 
				"				\"stock_code\": \"137950\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01032583\",\r\n" + 
				"				\"corp_name\": \"고려시멘트\",\r\n" + 
				"				\"stock_code\": \"198440\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01124653\",\r\n" + 
				"				\"corp_name\": \"슈프리마\",\r\n" + 
				"				\"stock_code\": \"236200\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01014718\",\r\n" + 
				"				\"corp_name\": \"제노코\",\r\n" + 
				"				\"stock_code\": \"361390\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00369107\",\r\n" + 
				"				\"corp_name\": \"우리바이오\",\r\n" + 
				"				\"stock_code\": \"082850\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00664288\",\r\n" + 
				"				\"corp_name\": \"스페이스솔루션\",\r\n" + 
				"				\"stock_code\": \"245030\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00428321\",\r\n" + 
				"				\"corp_name\": \"해태제과식품\",\r\n" + 
				"				\"stock_code\": \"101530\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01203507\",\r\n" + 
				"				\"corp_name\": \"에스엠비나\",\r\n" + 
				"				\"stock_code\": \"299670\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00563518\",\r\n" + 
				"				\"corp_name\": \"비나텍\",\r\n" + 
				"				\"stock_code\": \"126340\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00226547\",\r\n" + 
				"				\"corp_name\": \"오상자이엘\",\r\n" + 
				"				\"stock_code\": \"053980\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364254\",\r\n" + 
				"				\"corp_name\": \"알티캐스트\",\r\n" + 
				"				\"stock_code\": \"085810\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137368\",\r\n" + 
				"				\"corp_name\": \"신풍제지\",\r\n" + 
				"				\"stock_code\": \"002870\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01514528\",\r\n" + 
				"				\"corp_name\": \"신한제7호스팩\",\r\n" + 
				"				\"stock_code\": \"366330\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351807\",\r\n" + 
				"				\"corp_name\": \"대원미디어\",\r\n" + 
				"				\"stock_code\": \"048910\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00303794\",\r\n" + 
				"				\"corp_name\": \"쇼박스\",\r\n" + 
				"				\"stock_code\": \"086980\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00767628\",\r\n" + 
				"				\"corp_name\": \"나이벡\",\r\n" + 
				"				\"stock_code\": \"138610\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00273420\",\r\n" + 
				"				\"corp_name\": \"이스트소프트\",\r\n" + 
				"				\"stock_code\": \"047560\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361594\",\r\n" + 
				"				\"corp_name\": \"DMS\",\r\n" + 
				"				\"stock_code\": \"068790\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442048\",\r\n" + 
				"				\"corp_name\": \"아바텍\",\r\n" + 
				"				\"stock_code\": \"149950\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01114559\",\r\n" + 
				"				\"corp_name\": \"씨엔티드림\",\r\n" + 
				"				\"stock_code\": \"286000\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137252\",\r\n" + 
				"				\"corp_name\": \"사조동아원\",\r\n" + 
				"				\"stock_code\": \"008040\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01236897\",\r\n" + 
				"				\"corp_name\": \"제일약품\",\r\n" + 
				"				\"stock_code\": \"271980\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01205842\",\r\n" + 
				"				\"corp_name\": \"현대건설기계\",\r\n" + 
				"				\"stock_code\": \"267270\",\r\n" + 
				"				\"modify_date\": \"20210303\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00218052\",\r\n" + 
				"				\"corp_name\": \"국제엘렉트릭코리아\",\r\n" + 
				"				\"stock_code\": \"053740\",\r\n" + 
				"				\"modify_date\": \"20210304\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00857727\",\r\n" + 
				"				\"corp_name\": \"하림\",\r\n" + 
				"				\"stock_code\": \"136480\",\r\n" + 
				"				\"modify_date\": \"20210310\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00201432\",\r\n" + 
				"				\"corp_name\": \"비츠로시스\",\r\n" + 
				"				\"stock_code\": \"054220\",\r\n" + 
				"				\"modify_date\": \"20210310\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01336762\",\r\n" + 
				"				\"corp_name\": \"라이프시맨틱스\",\r\n" + 
				"				\"stock_code\": \"347700\",\r\n" + 
				"				\"modify_date\": \"20210324\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123541\",\r\n" + 
				"				\"corp_name\": \"보해양조\",\r\n" + 
				"				\"stock_code\": \"000890\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00455981\",\r\n" + 
				"				\"corp_name\": \"에스엔유\",\r\n" + 
				"				\"stock_code\": \"080000\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00595191\",\r\n" + 
				"				\"corp_name\": \"후성\",\r\n" + 
				"				\"stock_code\": \"093370\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00684802\",\r\n" + 
				"				\"corp_name\": \"에이플러스에셋\",\r\n" + 
				"				\"stock_code\": \"244920\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00535746\",\r\n" + 
				"				\"corp_name\": \"게임빌\",\r\n" + 
				"				\"stock_code\": \"063080\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00604815\",\r\n" + 
				"				\"corp_name\": \"에스디시스템\",\r\n" + 
				"				\"stock_code\": \"121890\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01109122\",\r\n" + 
				"				\"corp_name\": \"스템랩\",\r\n" + 
				"				\"stock_code\": \"258540\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00815095\",\r\n" + 
				"				\"corp_name\": \"우리이앤엘\",\r\n" + 
				"				\"stock_code\": \"153490\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00407771\",\r\n" + 
				"				\"corp_name\": \"듀오백\",\r\n" + 
				"				\"stock_code\": \"073190\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01336443\",\r\n" + 
				"				\"corp_name\": \"한국제8호스팩\",\r\n" + 
				"				\"stock_code\": \"310870\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113128\",\r\n" + 
				"				\"corp_name\": \"대한약품\",\r\n" + 
				"				\"stock_code\": \"023910\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116806\",\r\n" + 
				"				\"corp_name\": \"동아\",\r\n" + 
				"				\"stock_code\": \"012760\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01388631\",\r\n" + 
				"				\"corp_name\": \"오션스톤\",\r\n" + 
				"				\"stock_code\": \"329020\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01316245\",\r\n" + 
				"				\"corp_name\": \"효성중공업\",\r\n" + 
				"				\"stock_code\": \"298040\",\r\n" + 
				"				\"modify_date\": \"20210304\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138260\",\r\n" + 
				"				\"corp_name\": \"SIMPAC\",\r\n" + 
				"				\"stock_code\": \"009160\",\r\n" + 
				"				\"modify_date\": \"20210304\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101433\",\r\n" + 
				"				\"corp_name\": \"경농\",\r\n" + 
				"				\"stock_code\": \"002100\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107224\",\r\n" + 
				"				\"corp_name\": \"남선알미늄\",\r\n" + 
				"				\"stock_code\": \"008350\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00176835\",\r\n" + 
				"				\"corp_name\": \"농우바이오\",\r\n" + 
				"				\"stock_code\": \"054050\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112378\",\r\n" + 
				"				\"corp_name\": \"KR모터스\",\r\n" + 
				"				\"stock_code\": \"000040\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00186799\",\r\n" + 
				"				\"corp_name\": \"태웅\",\r\n" + 
				"				\"stock_code\": \"044490\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115977\",\r\n" + 
				"				\"corp_name\": \"아이에스동서\",\r\n" + 
				"				\"stock_code\": \"010780\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125150\",\r\n" + 
				"				\"corp_name\": \"SGC에너지\",\r\n" + 
				"				\"stock_code\": \"005090\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00246620\",\r\n" + 
				"				\"corp_name\": \"케이엘넷\",\r\n" + 
				"				\"stock_code\": \"039420\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127200\",\r\n" + 
				"				\"corp_name\": \"삼영전자공업\",\r\n" + 
				"				\"stock_code\": \"005680\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00249441\",\r\n" + 
				"				\"corp_name\": \"씨씨에스\",\r\n" + 
				"				\"stock_code\": \"066790\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136457\",\r\n" + 
				"				\"corp_name\": \"SH에너지화학\",\r\n" + 
				"				\"stock_code\": \"002360\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00265324\",\r\n" + 
				"				\"corp_name\": \"CJ ENM\",\r\n" + 
				"				\"stock_code\": \"035760\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144164\",\r\n" + 
				"				\"corp_name\": \"SK가스\",\r\n" + 
				"				\"stock_code\": \"018670\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140946\",\r\n" + 
				"				\"corp_name\": \"한솔로지스틱스\",\r\n" + 
				"				\"stock_code\": \"009180\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00874803\",\r\n" + 
				"				\"corp_name\": \"AP위성\",\r\n" + 
				"				\"stock_code\": \"211270\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162081\",\r\n" + 
				"				\"corp_name\": \"한국투자파트너스\",\r\n" + 
				"				\"stock_code\": \"019560\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220622\",\r\n" + 
				"				\"corp_name\": \"서호전기\",\r\n" + 
				"				\"stock_code\": \"065710\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01407909\",\r\n" + 
				"				\"corp_name\": \"대신밸런스제8호스팩\",\r\n" + 
				"				\"stock_code\": \"336570\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00659161\",\r\n" + 
				"				\"corp_name\": \"싸이맥스\",\r\n" + 
				"				\"stock_code\": \"160980\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00415868\",\r\n" + 
				"				\"corp_name\": \"펩트론\",\r\n" + 
				"				\"stock_code\": \"087010\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127042\",\r\n" + 
				"				\"corp_name\": \"삼양통상\",\r\n" + 
				"				\"stock_code\": \"002170\",\r\n" + 
				"				\"modify_date\": \"20210304\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01326279\",\r\n" + 
				"				\"corp_name\": \"아이엘사이언스\",\r\n" + 
				"				\"stock_code\": \"307180\",\r\n" + 
				"				\"modify_date\": \"20210304\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01513404\",\r\n" + 
				"				\"corp_name\": \"하나머스트7호스팩\",\r\n" + 
				"				\"stock_code\": \"372290\",\r\n" + 
				"				\"modify_date\": \"20210305\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00498001\",\r\n" + 
				"				\"corp_name\": \"모베이스\",\r\n" + 
				"				\"stock_code\": \"101330\",\r\n" + 
				"				\"modify_date\": \"20210317\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01077577\",\r\n" + 
				"				\"corp_name\": \"우리산업\",\r\n" + 
				"				\"stock_code\": \"215360\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00369170\",\r\n" + 
				"				\"corp_name\": \"인터플렉스\",\r\n" + 
				"				\"stock_code\": \"051370\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00373447\",\r\n" + 
				"				\"corp_name\": \"서린바이오\",\r\n" + 
				"				\"stock_code\": \"038070\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00493510\",\r\n" + 
				"				\"corp_name\": \"뉴프렉스\",\r\n" + 
				"				\"stock_code\": \"085670\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00530556\",\r\n" + 
				"				\"corp_name\": \"예스티\",\r\n" + 
				"				\"stock_code\": \"122640\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00537337\",\r\n" + 
				"				\"corp_name\": \"앤씨앤\",\r\n" + 
				"				\"stock_code\": \"092600\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00545929\",\r\n" + 
				"				\"corp_name\": \"제넥신\",\r\n" + 
				"				\"stock_code\": \"095700\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00587457\",\r\n" + 
				"				\"corp_name\": \"갤럭시아머니트리\",\r\n" + 
				"				\"stock_code\": \"094480\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00624509\",\r\n" + 
				"				\"corp_name\": \"디바이스이엔지\",\r\n" + 
				"				\"stock_code\": \"187870\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00875307\",\r\n" + 
				"				\"corp_name\": \"야스\",\r\n" + 
				"				\"stock_code\": \"255440\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01038693\",\r\n" + 
				"				\"corp_name\": \"드림시큐리티\",\r\n" + 
				"				\"stock_code\": \"203650\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01068658\",\r\n" + 
				"				\"corp_name\": \"디딤\",\r\n" + 
				"				\"stock_code\": \"217620\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01102095\",\r\n" + 
				"				\"corp_name\": \"쿠첸\",\r\n" + 
				"				\"stock_code\": \"225650\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01196313\",\r\n" + 
				"				\"corp_name\": \"유에스티\",\r\n" + 
				"				\"stock_code\": \"263770\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00454399\",\r\n" + 
				"				\"corp_name\": \"이상네트웍스\",\r\n" + 
				"				\"stock_code\": \"080010\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00961774\",\r\n" + 
				"				\"corp_name\": \"유티아이\",\r\n" + 
				"				\"stock_code\": \"179900\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117577\",\r\n" + 
				"				\"corp_name\": \"오리온홀딩스\",\r\n" + 
				"				\"stock_code\": \"001800\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00303703\",\r\n" + 
				"				\"corp_name\": \"CS\",\r\n" + 
				"				\"stock_code\": \"065770\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00239514\",\r\n" + 
				"				\"corp_name\": \"삼진엘앤디\",\r\n" + 
				"				\"stock_code\": \"054090\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00172291\",\r\n" + 
				"				\"corp_name\": \"더존비즈온\",\r\n" + 
				"				\"stock_code\": \"012510\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00408266\",\r\n" + 
				"				\"corp_name\": \"유니온커뮤니티\",\r\n" + 
				"				\"stock_code\": \"203450\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00358271\",\r\n" + 
				"				\"corp_name\": \"에스에프에이\",\r\n" + 
				"				\"stock_code\": \"056190\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141626\",\r\n" + 
				"				\"corp_name\": \"오리엔트바이오\",\r\n" + 
				"				\"stock_code\": \"002630\",\r\n" + 
				"				\"modify_date\": \"20210305\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122339\",\r\n" + 
				"				\"corp_name\": \"이매진아시아\",\r\n" + 
				"				\"stock_code\": \"036260\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01257872\",\r\n" + 
				"				\"corp_name\": \"에스퓨얼셀\",\r\n" + 
				"				\"stock_code\": \"288620\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01489648\",\r\n" + 
				"				\"corp_name\": \"솔브레인\",\r\n" + 
				"				\"stock_code\": \"357780\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117072\",\r\n" + 
				"				\"corp_name\": \"동양건설산업\",\r\n" + 
				"				\"stock_code\": \"005900\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267906\",\r\n" + 
				"				\"corp_name\": \"베뉴지\",\r\n" + 
				"				\"stock_code\": \"019010\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148948\",\r\n" + 
				"				\"corp_name\": \"조비\",\r\n" + 
				"				\"stock_code\": \"001550\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159616\",\r\n" + 
				"				\"corp_name\": \"두산중공업\",\r\n" + 
				"				\"stock_code\": \"034020\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00365624\",\r\n" + 
				"				\"corp_name\": \"광진윈텍\",\r\n" + 
				"				\"stock_code\": \"090150\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01015726\",\r\n" + 
				"				\"corp_name\": \"미래테크놀로지\",\r\n" + 
				"				\"stock_code\": \"213090\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01359815\",\r\n" + 
				"				\"corp_name\": \"윈텍\",\r\n" + 
				"				\"stock_code\": \"320000\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540447\",\r\n" + 
				"				\"corp_name\": \"유니테스트\",\r\n" + 
				"				\"stock_code\": \"086390\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156354\",\r\n" + 
				"				\"corp_name\": \"지엠비코리아\",\r\n" + 
				"				\"stock_code\": \"013870\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01337220\",\r\n" + 
				"				\"corp_name\": \"키움제5호스팩\",\r\n" + 
				"				\"stock_code\": \"311270\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00579980\",\r\n" + 
				"				\"corp_name\": \"아이티엠반도체\",\r\n" + 
				"				\"stock_code\": \"084850\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00983916\",\r\n" + 
				"				\"corp_name\": \"제노포커스\",\r\n" + 
				"				\"stock_code\": \"187420\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150633\",\r\n" + 
				"				\"corp_name\": \"지누스\",\r\n" + 
				"				\"stock_code\": \"013890\",\r\n" + 
				"				\"modify_date\": \"20210317\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112059\",\r\n" + 
				"				\"corp_name\": \"상상인증권\",\r\n" + 
				"				\"stock_code\": \"001290\",\r\n" + 
				"				\"modify_date\": \"20210309\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00352499\",\r\n" + 
				"				\"corp_name\": \"링네트\",\r\n" + 
				"				\"stock_code\": \"042500\",\r\n" + 
				"				\"modify_date\": \"20210309\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00660459\",\r\n" + 
				"				\"corp_name\": \"나노씨엠에스\",\r\n" + 
				"				\"stock_code\": \"247660\",\r\n" + 
				"				\"modify_date\": \"20210309\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00400060\",\r\n" + 
				"				\"corp_name\": \"이씨에스\",\r\n" + 
				"				\"stock_code\": \"067010\",\r\n" + 
				"				\"modify_date\": \"20210309\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00990396\",\r\n" + 
				"				\"corp_name\": \"뿌리깊은나무들\",\r\n" + 
				"				\"stock_code\": \"266170\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136226\",\r\n" + 
				"				\"corp_name\": \"신성델타테크\",\r\n" + 
				"				\"stock_code\": \"065350\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00374020\",\r\n" + 
				"				\"corp_name\": \"이엘피\",\r\n" + 
				"				\"stock_code\": \"063760\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268002\",\r\n" + 
				"				\"corp_name\": \"세종텔레콤\",\r\n" + 
				"				\"stock_code\": \"036630\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01335453\",\r\n" + 
				"				\"corp_name\": \"오하임아이엔티\",\r\n" + 
				"				\"stock_code\": \"309930\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00218575\",\r\n" + 
				"				\"corp_name\": \"황금에스티\",\r\n" + 
				"				\"stock_code\": \"032560\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00563147\",\r\n" + 
				"				\"corp_name\": \"에스에이티이엔지\",\r\n" + 
				"				\"stock_code\": \"158300\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163318\",\r\n" + 
				"				\"corp_name\": \"모헨즈\",\r\n" + 
				"				\"stock_code\": \"006920\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00208134\",\r\n" + 
				"				\"corp_name\": \"KNN\",\r\n" + 
				"				\"stock_code\": \"058400\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00234227\",\r\n" + 
				"				\"corp_name\": \"유진로봇\",\r\n" + 
				"				\"stock_code\": \"056080\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154426\",\r\n" + 
				"				\"corp_name\": \"아이에이치큐\",\r\n" + 
				"				\"stock_code\": \"003560\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01510489\",\r\n" + 
				"				\"corp_name\": \"프레스티지바이오파마\",\r\n" + 
				"				\"stock_code\": \"950210\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01010642\",\r\n" + 
				"				\"corp_name\": \"녹십자랩셀\",\r\n" + 
				"				\"stock_code\": \"144510\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00531014\",\r\n" + 
				"				\"corp_name\": \"유진테크\",\r\n" + 
				"				\"stock_code\": \"084370\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133715\",\r\n" + 
				"				\"corp_name\": \"대주코레스\",\r\n" + 
				"				\"stock_code\": \"008340\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00495086\",\r\n" + 
				"				\"corp_name\": \"픽셀플러스\",\r\n" + 
				"				\"stock_code\": \"087600\",\r\n" + 
				"				\"modify_date\": \"20210305\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00983934\",\r\n" + 
				"				\"corp_name\": \"아이스크림에듀\",\r\n" + 
				"				\"stock_code\": \"289010\",\r\n" + 
				"				\"modify_date\": \"20210317\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01157235\",\r\n" + 
				"				\"corp_name\": \"아스타\",\r\n" + 
				"				\"stock_code\": \"246720\",\r\n" + 
				"				\"modify_date\": \"20210317\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00398701\",\r\n" + 
				"				\"corp_name\": \"엘앤에프\",\r\n" + 
				"				\"stock_code\": \"066970\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126186\",\r\n" + 
				"				\"corp_name\": \"삼성에스디에스\",\r\n" + 
				"				\"stock_code\": \"018260\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135795\",\r\n" + 
				"				\"corp_name\": \"신도리코\",\r\n" + 
				"				\"stock_code\": \"029530\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00425351\",\r\n" + 
				"				\"corp_name\": \"멀티캠퍼스\",\r\n" + 
				"				\"stock_code\": \"067280\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159573\",\r\n" + 
				"				\"corp_name\": \"한국주철관공업\",\r\n" + 
				"				\"stock_code\": \"000970\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00379016\",\r\n" + 
				"				\"corp_name\": \"이엘케이\",\r\n" + 
				"				\"stock_code\": \"094190\",\r\n" + 
				"				\"modify_date\": \"20210316\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00334624\",\r\n" + 
				"				\"corp_name\": \"팍스넷\",\r\n" + 
				"				\"stock_code\": \"038160\",\r\n" + 
				"				\"modify_date\": \"20210317\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01117413\",\r\n" + 
				"				\"corp_name\": \"바이오다인\",\r\n" + 
				"				\"stock_code\": \"314930\",\r\n" + 
				"				\"modify_date\": \"20210317\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111193\",\r\n" + 
				"				\"corp_name\": \"대양전기공업\",\r\n" + 
				"				\"stock_code\": \"108380\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131018\",\r\n" + 
				"				\"corp_name\": \"서울제약\",\r\n" + 
				"				\"stock_code\": \"018680\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102618\",\r\n" + 
				"				\"corp_name\": \"계양전기\",\r\n" + 
				"				\"stock_code\": \"012200\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107066\",\r\n" + 
				"				\"corp_name\": \"남광토건\",\r\n" + 
				"				\"stock_code\": \"001260\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158015\",\r\n" + 
				"				\"corp_name\": \"한국선재\",\r\n" + 
				"				\"stock_code\": \"025550\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111458\",\r\n" + 
				"				\"corp_name\": \"대영포장\",\r\n" + 
				"				\"stock_code\": \"014160\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00391197\",\r\n" + 
				"				\"corp_name\": \"메디프론\",\r\n" + 
				"				\"stock_code\": \"065650\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00393469\",\r\n" + 
				"				\"corp_name\": \"녹원씨엔아이\",\r\n" + 
				"				\"stock_code\": \"065560\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00372882\",\r\n" + 
				"				\"corp_name\": \"KTcs\",\r\n" + 
				"				\"stock_code\": \"058850\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447575\",\r\n" + 
				"				\"corp_name\": \"제이앤티씨\",\r\n" + 
				"				\"stock_code\": \"204270\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526599\",\r\n" + 
				"				\"corp_name\": \"덴티움\",\r\n" + 
				"				\"stock_code\": \"145720\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00243757\",\r\n" + 
				"				\"corp_name\": \"인포뱅크\",\r\n" + 
				"				\"stock_code\": \"039290\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117966\",\r\n" + 
				"				\"corp_name\": \"동원개발\",\r\n" + 
				"				\"stock_code\": \"013120\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01018617\",\r\n" + 
				"				\"corp_name\": \"메디쎄이\",\r\n" + 
				"				\"stock_code\": \"200580\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00890388\",\r\n" + 
				"				\"corp_name\": \"지성이씨에스\",\r\n" + 
				"				\"stock_code\": \"138290\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00604268\",\r\n" + 
				"				\"corp_name\": \"에이프로\",\r\n" + 
				"				\"stock_code\": \"262260\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00876865\",\r\n" + 
				"				\"corp_name\": \"네오오토\",\r\n" + 
				"				\"stock_code\": \"212560\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165680\",\r\n" + 
				"				\"corp_name\": \"호텔신라\",\r\n" + 
				"				\"stock_code\": \"008770\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00862853\",\r\n" + 
				"				\"corp_name\": \"플레이디\",\r\n" + 
				"				\"stock_code\": \"237820\",\r\n" + 
				"				\"modify_date\": \"20210308\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00353230\",\r\n" + 
				"				\"corp_name\": \"프리젠\",\r\n" + 
				"				\"stock_code\": \"060910\",\r\n" + 
				"				\"modify_date\": \"20210308\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00762377\",\r\n" + 
				"				\"corp_name\": \"씨앗\",\r\n" + 
				"				\"stock_code\": \"103660\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128980\",\r\n" + 
				"				\"corp_name\": \"삼호개발\",\r\n" + 
				"				\"stock_code\": \"010960\",\r\n" + 
				"				\"modify_date\": \"20210319\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150439\",\r\n" + 
				"				\"corp_name\": \"진양산업\",\r\n" + 
				"				\"stock_code\": \"003780\",\r\n" + 
				"				\"modify_date\": \"20210319\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00171265\",\r\n" + 
				"				\"corp_name\": \"파라다이스\",\r\n" + 
				"				\"stock_code\": \"034230\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111847\",\r\n" + 
				"				\"corp_name\": \"대원강업\",\r\n" + 
				"				\"stock_code\": \"000430\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00198192\",\r\n" + 
				"				\"corp_name\": \"한국팩키지\",\r\n" + 
				"				\"stock_code\": \"037230\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00219361\",\r\n" + 
				"				\"corp_name\": \"해성산업\",\r\n" + 
				"				\"stock_code\": \"034810\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124197\",\r\n" + 
				"				\"corp_name\": \"세아제강지주\",\r\n" + 
				"				\"stock_code\": \"003030\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00263371\",\r\n" + 
				"				\"corp_name\": \"한국경제TV\",\r\n" + 
				"				\"stock_code\": \"039340\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00360577\",\r\n" + 
				"				\"corp_name\": \"엑사이엔씨\",\r\n" + 
				"				\"stock_code\": \"054940\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128412\",\r\n" + 
				"				\"corp_name\": \"삼진제약\",\r\n" + 
				"				\"stock_code\": \"005500\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00366845\",\r\n" + 
				"				\"corp_name\": \"탑엔지니어링\",\r\n" + 
				"				\"stock_code\": \"065130\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129387\",\r\n" + 
				"				\"corp_name\": \"삼화페인트공업\",\r\n" + 
				"				\"stock_code\": \"000390\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00405278\",\r\n" + 
				"				\"corp_name\": \"KG모빌리언스\",\r\n" + 
				"				\"stock_code\": \"046440\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135777\",\r\n" + 
				"				\"corp_name\": \"신대양제지\",\r\n" + 
				"				\"stock_code\": \"016590\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00410997\",\r\n" + 
				"				\"corp_name\": \"누리플랜\",\r\n" + 
				"				\"stock_code\": \"069140\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135962\",\r\n" + 
				"				\"corp_name\": \"신라교역\",\r\n" + 
				"				\"stock_code\": \"004970\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141529\",\r\n" + 
				"				\"corp_name\": \"오뚜기\",\r\n" + 
				"				\"stock_code\": \"007310\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00490179\",\r\n" + 
				"				\"corp_name\": \"플랜티넷\",\r\n" + 
				"				\"stock_code\": \"075130\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146083\",\r\n" + 
				"				\"corp_name\": \"일동홀딩스\",\r\n" + 
				"				\"stock_code\": \"000230\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00384887\",\r\n" + 
				"				\"corp_name\": \"에이테크솔루션\",\r\n" + 
				"				\"stock_code\": \"071670\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01182444\",\r\n" + 
				"				\"corp_name\": \"셀리버리\",\r\n" + 
				"				\"stock_code\": \"268600\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00390903\",\r\n" + 
				"				\"corp_name\": \"우주일렉트로\",\r\n" + 
				"				\"stock_code\": \"065680\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138516\",\r\n" + 
				"				\"corp_name\": \"아남전자\",\r\n" + 
				"				\"stock_code\": \"008700\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00373571\",\r\n" + 
				"				\"corp_name\": \"룽투코리아\",\r\n" + 
				"				\"stock_code\": \"060240\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00561866\",\r\n" + 
				"				\"corp_name\": \"락앤락\",\r\n" + 
				"				\"stock_code\": \"115390\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137289\",\r\n" + 
				"				\"corp_name\": \"이라이콤\",\r\n" + 
				"				\"stock_code\": \"041520\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01259418\",\r\n" + 
				"				\"corp_name\": \"대보마그네틱\",\r\n" + 
				"				\"stock_code\": \"290670\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00413523\",\r\n" + 
				"				\"corp_name\": \"한미글로벌\",\r\n" + 
				"				\"stock_code\": \"053690\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00178754\",\r\n" + 
				"				\"corp_name\": \"동아지질\",\r\n" + 
				"				\"stock_code\": \"028100\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00450010\",\r\n" + 
				"				\"corp_name\": \"센트랄모텍\",\r\n" + 
				"				\"stock_code\": \"308170\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01142400\",\r\n" + 
				"				\"corp_name\": \"이루다\",\r\n" + 
				"				\"stock_code\": \"164060\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00965062\",\r\n" + 
				"				\"corp_name\": \"코셋\",\r\n" + 
				"				\"stock_code\": \"189350\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00989664\",\r\n" + 
				"				\"corp_name\": \"코아스템\",\r\n" + 
				"				\"stock_code\": \"166480\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364111\",\r\n" + 
				"				\"corp_name\": \"다이노나\",\r\n" + 
				"				\"stock_code\": \"086080\",\r\n" + 
				"				\"modify_date\": \"20210319\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00525882\",\r\n" + 
				"				\"corp_name\": \"청담러닝\",\r\n" + 
				"				\"stock_code\": \"096240\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150828\",\r\n" + 
				"				\"corp_name\": \"진흥기업\",\r\n" + 
				"				\"stock_code\": \"002780\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00536523\",\r\n" + 
				"				\"corp_name\": \"로보스타\",\r\n" + 
				"				\"stock_code\": \"090360\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153393\",\r\n" + 
				"				\"corp_name\": \"태광산업\",\r\n" + 
				"				\"stock_code\": \"003240\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00659684\",\r\n" + 
				"				\"corp_name\": \"장원테크\",\r\n" + 
				"				\"stock_code\": \"174880\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155531\",\r\n" + 
				"				\"corp_name\": \"풍산홀딩스\",\r\n" + 
				"				\"stock_code\": \"005810\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00763473\",\r\n" + 
				"				\"corp_name\": \"코스메카코리아\",\r\n" + 
				"				\"stock_code\": \"241710\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00819374\",\r\n" + 
				"				\"corp_name\": \"나무가\",\r\n" + 
				"				\"stock_code\": \"190510\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161709\",\r\n" + 
				"				\"corp_name\": \"퍼시스\",\r\n" + 
				"				\"stock_code\": \"016800\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00872452\",\r\n" + 
				"				\"corp_name\": \"에이치엔티\",\r\n" + 
				"				\"stock_code\": \"176440\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162586\",\r\n" + 
				"				\"corp_name\": \"한올바이오파마\",\r\n" + 
				"				\"stock_code\": \"009420\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01113754\",\r\n" + 
				"				\"corp_name\": \"오션브릿지\",\r\n" + 
				"				\"stock_code\": \"241790\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00219574\",\r\n" + 
				"				\"corp_name\": \"코스맥스비티아이\",\r\n" + 
				"				\"stock_code\": \"044820\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01165739\",\r\n" + 
				"				\"corp_name\": \"잉글우드랩\",\r\n" + 
				"				\"stock_code\": \"950140\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01416572\",\r\n" + 
				"				\"corp_name\": \"한화플러스제1호스팩\",\r\n" + 
				"				\"stock_code\": \"340440\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113410\",\r\n" + 
				"				\"corp_name\": \"CJ대한통운\",\r\n" + 
				"				\"stock_code\": \"000120\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103644\",\r\n" + 
				"				\"corp_name\": \"비츠로테크\",\r\n" + 
				"				\"stock_code\": \"042370\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121039\",\r\n" + 
				"				\"corp_name\": \"명문제약\",\r\n" + 
				"				\"stock_code\": \"017180\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127954\",\r\n" + 
				"				\"corp_name\": \"CJ프레시웨이\",\r\n" + 
				"				\"stock_code\": \"051500\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121969\",\r\n" + 
				"				\"corp_name\": \"에쓰씨엔지니어링\",\r\n" + 
				"				\"stock_code\": \"023960\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131504\",\r\n" + 
				"				\"corp_name\": \"서한\",\r\n" + 
				"				\"stock_code\": \"011370\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139153\",\r\n" + 
				"				\"corp_name\": \"에코플라스틱\",\r\n" + 
				"				\"stock_code\": \"038110\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152862\",\r\n" + 
				"				\"corp_name\": \"코오롱\",\r\n" + 
				"				\"stock_code\": \"002020\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140566\",\r\n" + 
				"				\"corp_name\": \"한탑\",\r\n" + 
				"				\"stock_code\": \"002680\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145738\",\r\n" + 
				"				\"corp_name\": \"이화전기\",\r\n" + 
				"				\"stock_code\": \"024810\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00168331\",\r\n" + 
				"				\"corp_name\": \"국동\",\r\n" + 
				"				\"stock_code\": \"005320\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155735\",\r\n" + 
				"				\"corp_name\": \"피제이전자\",\r\n" + 
				"				\"stock_code\": \"006140\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00303873\",\r\n" + 
				"				\"corp_name\": \"CJ CGV\",\r\n" + 
				"				\"stock_code\": \"079160\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158219\",\r\n" + 
				"				\"corp_name\": \"시그네틱스\",\r\n" + 
				"				\"stock_code\": \"033170\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00453284\",\r\n" + 
				"				\"corp_name\": \"교촌에프앤비\",\r\n" + 
				"				\"stock_code\": \"339770\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00172680\",\r\n" + 
				"				\"corp_name\": \"동국산업\",\r\n" + 
				"				\"stock_code\": \"005160\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00557933\",\r\n" + 
				"				\"corp_name\": \"진도\",\r\n" + 
				"				\"stock_code\": \"088790\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00706715\",\r\n" + 
				"				\"corp_name\": \"미원홀딩스\",\r\n" + 
				"				\"stock_code\": \"107590\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00876209\",\r\n" + 
				"				\"corp_name\": \"미래엔에듀파트너\",\r\n" + 
				"				\"stock_code\": \"208890\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01168383\",\r\n" + 
				"				\"corp_name\": \"일동제약\",\r\n" + 
				"				\"stock_code\": \"249420\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00407975\",\r\n" + 
				"				\"corp_name\": \"엔터미디어\",\r\n" + 
				"				\"stock_code\": \"068420\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137058\",\r\n" + 
				"				\"corp_name\": \"신일제약\",\r\n" + 
				"				\"stock_code\": \"012790\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105244\",\r\n" + 
				"				\"corp_name\": \"알보젠코리아\",\r\n" + 
				"				\"stock_code\": \"002250\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163761\",\r\n" + 
				"				\"corp_name\": \"한창제지\",\r\n" + 
				"				\"stock_code\": \"009460\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00210740\",\r\n" + 
				"				\"corp_name\": \"대화제약\",\r\n" + 
				"				\"stock_code\": \"067080\",\r\n" + 
				"				\"modify_date\": \"20210309\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155498\",\r\n" + 
				"				\"corp_name\": \"풍림산업\",\r\n" + 
				"				\"stock_code\": \"001310\",\r\n" + 
				"				\"modify_date\": \"20210319\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173078\",\r\n" + 
				"				\"corp_name\": \"명신산업\",\r\n" + 
				"				\"stock_code\": \"009900\",\r\n" + 
				"				\"modify_date\": \"20210319\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148531\",\r\n" + 
				"				\"corp_name\": \"제일제강\",\r\n" + 
				"				\"stock_code\": \"023440\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114552\",\r\n" + 
				"				\"corp_name\": \"도화엔지니어링\",\r\n" + 
				"				\"stock_code\": \"002150\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115676\",\r\n" + 
				"				\"corp_name\": \"KG동부제철\",\r\n" + 
				"				\"stock_code\": \"016380\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00541163\",\r\n" + 
				"				\"corp_name\": \"이엠텍\",\r\n" + 
				"				\"stock_code\": \"091120\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126478\",\r\n" + 
				"				\"corp_name\": \"삼성중공업\",\r\n" + 
				"				\"stock_code\": \"010140\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01246742\",\r\n" + 
				"				\"corp_name\": \"테크트랜스\",\r\n" + 
				"				\"stock_code\": \"258050\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01235296\",\r\n" + 
				"				\"corp_name\": \"셀리드\",\r\n" + 
				"				\"stock_code\": \"299660\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01182408\",\r\n" + 
				"				\"corp_name\": \"소프트캠프\",\r\n" + 
				"				\"stock_code\": \"258790\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00450339\",\r\n" + 
				"				\"corp_name\": \"에스에프씨\",\r\n" + 
				"				\"stock_code\": \"112240\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00660291\",\r\n" + 
				"				\"corp_name\": \"옵티시스\",\r\n" + 
				"				\"stock_code\": \"109080\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00441304\",\r\n" + 
				"				\"corp_name\": \"가온미디어\",\r\n" + 
				"				\"stock_code\": \"078890\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00411048\",\r\n" + 
				"				\"corp_name\": \"에스앤에스텍\",\r\n" + 
				"				\"stock_code\": \"101490\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00548519\",\r\n" + 
				"				\"corp_name\": \"에스엔피제네틱스\",\r\n" + 
				"				\"stock_code\": \"086460\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00766106\",\r\n" + 
				"				\"corp_name\": \"트루윈\",\r\n" + 
				"				\"stock_code\": \"105550\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117188\",\r\n" + 
				"				\"corp_name\": \"효성\",\r\n" + 
				"				\"stock_code\": \"004800\",\r\n" + 
				"				\"modify_date\": \"20210309\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00978075\",\r\n" + 
				"				\"corp_name\": \"렌딩머신\",\r\n" + 
				"				\"stock_code\": \"179720\",\r\n" + 
				"				\"modify_date\": \"20210310\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155355\",\r\n" + 
				"				\"corp_name\": \"풀무원\",\r\n" + 
				"				\"stock_code\": \"017810\",\r\n" + 
				"				\"modify_date\": \"20210310\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128032\",\r\n" + 
				"				\"corp_name\": \"삼일제약\",\r\n" + 
				"				\"stock_code\": \"000520\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145109\",\r\n" + 
				"				\"corp_name\": \"유한양행\",\r\n" + 
				"				\"stock_code\": \"000100\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149655\",\r\n" + 
				"				\"corp_name\": \"삼성물산\",\r\n" + 
				"				\"stock_code\": \"028260\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231363\",\r\n" + 
				"				\"corp_name\": \"LG유플러스\",\r\n" + 
				"				\"stock_code\": \"032640\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260383\",\r\n" + 
				"				\"corp_name\": \"대한유화\",\r\n" + 
				"				\"stock_code\": \"006650\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01042775\",\r\n" + 
				"				\"corp_name\": \"만도\",\r\n" + 
				"				\"stock_code\": \"204320\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00990563\",\r\n" + 
				"				\"corp_name\": \"피엔아이컴퍼니\",\r\n" + 
				"				\"stock_code\": \"242350\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01415892\",\r\n" + 
				"				\"corp_name\": \"제이알글로벌리츠\",\r\n" + 
				"				\"stock_code\": \"348950\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00143262\",\r\n" + 
				"				\"corp_name\": \"우진아이엔에스\",\r\n" + 
				"				\"stock_code\": \"010400\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156691\",\r\n" + 
				"				\"corp_name\": \"한국공항\",\r\n" + 
				"				\"stock_code\": \"005430\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00914040\",\r\n" + 
				"				\"corp_name\": \"씨엠에스에듀\",\r\n" + 
				"				\"stock_code\": \"225330\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350738\",\r\n" + 
				"				\"corp_name\": \"제네시스디벨롭먼트홀딩스\",\r\n" + 
				"				\"stock_code\": \"053320\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01223219\",\r\n" + 
				"				\"corp_name\": \"에이에프더블류\",\r\n" + 
				"				\"stock_code\": \"312610\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00191588\",\r\n" + 
				"				\"corp_name\": \"삼원강재\",\r\n" + 
				"				\"stock_code\": \"023000\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109693\",\r\n" + 
				"				\"corp_name\": \"DL\",\r\n" + 
				"				\"stock_code\": \"000210\",\r\n" + 
				"				\"modify_date\": \"20210322\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00362441\",\r\n" + 
				"				\"corp_name\": \"현대오토에버\",\r\n" + 
				"				\"stock_code\": \"307950\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00593032\",\r\n" + 
				"				\"corp_name\": \"LF\",\r\n" + 
				"				\"stock_code\": \"093050\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00635134\",\r\n" + 
				"				\"corp_name\": \"CJ제일제당\",\r\n" + 
				"				\"stock_code\": \"097950\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01101041\",\r\n" + 
				"				\"corp_name\": \"패션플랫폼\",\r\n" + 
				"				\"stock_code\": \"225590\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01101722\",\r\n" + 
				"				\"corp_name\": \"한송네오텍\",\r\n" + 
				"				\"stock_code\": \"226440\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01014657\",\r\n" + 
				"				\"corp_name\": \"비즈니스온\",\r\n" + 
				"				\"stock_code\": \"138580\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00976615\",\r\n" + 
				"				\"corp_name\": \"틸론\",\r\n" + 
				"				\"stock_code\": \"217880\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133238\",\r\n" + 
				"				\"corp_name\": \"성지건설\",\r\n" + 
				"				\"stock_code\": \"005980\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126779\",\r\n" + 
				"				\"corp_name\": \"삼아알미늄\",\r\n" + 
				"				\"stock_code\": \"006110\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00167004\",\r\n" + 
				"				\"corp_name\": \"흥구석유\",\r\n" + 
				"				\"stock_code\": \"024060\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364306\",\r\n" + 
				"				\"corp_name\": \"성우전자\",\r\n" + 
				"				\"stock_code\": \"081580\",\r\n" + 
				"				\"modify_date\": \"20210323\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00911955\",\r\n" + 
				"				\"corp_name\": \"잇츠한불\",\r\n" + 
				"				\"stock_code\": \"226320\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01009789\",\r\n" + 
				"				\"corp_name\": \"코스맥스\",\r\n" + 
				"				\"stock_code\": \"192820\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01036446\",\r\n" + 
				"				\"corp_name\": \"서연이화\",\r\n" + 
				"				\"stock_code\": \"200880\",\r\n" + 
				"				\"modify_date\": \"20210329\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261373\",\r\n" + 
				"				\"corp_name\": \"마크로젠\",\r\n" + 
				"				\"stock_code\": \"038290\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00172936\",\r\n" + 
				"				\"corp_name\": \"동일산업\",\r\n" + 
				"				\"stock_code\": \"004890\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01513440\",\r\n" + 
				"				\"corp_name\": \"한국9호스팩\",\r\n" + 
				"				\"stock_code\": \"368770\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101488\",\r\n" + 
				"				\"corp_name\": \"경동나비엔\",\r\n" + 
				"				\"stock_code\": \"009450\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00519252\",\r\n" + 
				"				\"corp_name\": \"THE E&M\",\r\n" + 
				"				\"stock_code\": \"089230\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00209443\",\r\n" + 
				"				\"corp_name\": \"우리금융캐피탈\",\r\n" + 
				"				\"stock_code\": \"033660\",\r\n" + 
				"				\"modify_date\": \"20210420\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109806\",\r\n" + 
				"				\"corp_name\": \"삼일씨엔에스\",\r\n" + 
				"				\"stock_code\": \"004440\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00142591\",\r\n" + 
				"				\"corp_name\": \"셰프라인\",\r\n" + 
				"				\"stock_code\": \"012250\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01504910\",\r\n" + 
				"				\"corp_name\": \"유안타제8호스팩\",\r\n" + 
				"				\"stock_code\": \"367480\",\r\n" + 
				"				\"modify_date\": \"20210406\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00256955\",\r\n" + 
				"				\"corp_name\": \"테이팩스\",\r\n" + 
				"				\"stock_code\": \"055490\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00990165\",\r\n" + 
				"				\"corp_name\": \"아세아시멘트\",\r\n" + 
				"				\"stock_code\": \"183190\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00874937\",\r\n" + 
				"				\"corp_name\": \"탑선\",\r\n" + 
				"				\"stock_code\": \"180060\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01117246\",\r\n" + 
				"				\"corp_name\": \"EMB\",\r\n" + 
				"				\"stock_code\": \"278990\",\r\n" + 
				"				\"modify_date\": \"20210412\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269852\",\r\n" + 
				"				\"corp_name\": \"폴라리스오피스\",\r\n" + 
				"				\"stock_code\": \"041020\",\r\n" + 
				"				\"modify_date\": \"20210412\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01011395\",\r\n" + 
				"				\"corp_name\": \"레몬\",\r\n" + 
				"				\"stock_code\": \"294140\",\r\n" + 
				"				\"modify_date\": \"20210412\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00599106\",\r\n" + 
				"				\"corp_name\": \"네오리진\",\r\n" + 
				"				\"stock_code\": \"094860\",\r\n" + 
				"				\"modify_date\": \"20210423\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00525864\",\r\n" + 
				"				\"corp_name\": \"피앤씨테크\",\r\n" + 
				"				\"stock_code\": \"237750\",\r\n" + 
				"				\"modify_date\": \"20210428\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120526\",\r\n" + 
				"				\"corp_name\": \"롯데쇼핑\",\r\n" + 
				"				\"stock_code\": \"023530\",\r\n" + 
				"				\"modify_date\": \"20210428\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00609324\",\r\n" + 
				"				\"corp_name\": \"뷰웍스\",\r\n" + 
				"				\"stock_code\": \"100120\",\r\n" + 
				"				\"modify_date\": \"20210428\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01311055\",\r\n" + 
				"				\"corp_name\": \"쿠콘\",\r\n" + 
				"				\"stock_code\": \"294570\",\r\n" + 
				"				\"modify_date\": \"20210428\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01118643\",\r\n" + 
				"				\"corp_name\": \"로보쓰리\",\r\n" + 
				"				\"stock_code\": \"238500\",\r\n" + 
				"				\"modify_date\": \"20210428\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00365989\",\r\n" + 
				"				\"corp_name\": \"용평리조트\",\r\n" + 
				"				\"stock_code\": \"070960\",\r\n" + 
				"				\"modify_date\": \"20210420\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00878696\",\r\n" + 
				"				\"corp_name\": \"에스케이바이오팜\",\r\n" + 
				"				\"stock_code\": \"326030\",\r\n" + 
				"				\"modify_date\": \"20210408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120906\",\r\n" + 
				"				\"corp_name\": \"에스아이리소스\",\r\n" + 
				"				\"stock_code\": \"065420\",\r\n" + 
				"				\"modify_date\": \"20210412\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00304915\",\r\n" + 
				"				\"corp_name\": \"코리아에셋투자증권\",\r\n" + 
				"				\"stock_code\": \"190650\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136721\",\r\n" + 
				"				\"corp_name\": \"신영증권\",\r\n" + 
				"				\"stock_code\": \"001720\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124106\",\r\n" + 
				"				\"corp_name\": \"부산은행\",\r\n" + 
				"				\"stock_code\": \"005280\",\r\n" + 
				"				\"modify_date\": \"20210423\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00340917\",\r\n" + 
				"				\"corp_name\": \"동원F&B\",\r\n" + 
				"				\"stock_code\": \"049770\",\r\n" + 
				"				\"modify_date\": \"20210303\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166333\",\r\n" + 
				"				\"corp_name\": \"이노와이즈\",\r\n" + 
				"				\"stock_code\": \"086250\",\r\n" + 
				"				\"modify_date\": \"20210303\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152729\",\r\n" + 
				"				\"corp_name\": \"광전자\",\r\n" + 
				"				\"stock_code\": \"017900\",\r\n" + 
				"				\"modify_date\": \"20210408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125965\",\r\n" + 
				"				\"corp_name\": \"KH 일렉트론\",\r\n" + 
				"				\"stock_code\": \"111870\",\r\n" + 
				"				\"modify_date\": \"20210427\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00611286\",\r\n" + 
				"				\"corp_name\": \"블루탑\",\r\n" + 
				"				\"stock_code\": \"191600\",\r\n" + 
				"				\"modify_date\": \"20210427\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00861720\",\r\n" + 
				"				\"corp_name\": \"이즈미디어\",\r\n" + 
				"				\"stock_code\": \"181340\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01047707\",\r\n" + 
				"				\"corp_name\": \"바이오로그디바이스\",\r\n" + 
				"				\"stock_code\": \"208710\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01188378\",\r\n" + 
				"				\"corp_name\": \"시스웍\",\r\n" + 
				"				\"stock_code\": \"269620\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01366365\",\r\n" + 
				"				\"corp_name\": \"이베스트이안스팩1호\",\r\n" + 
				"				\"stock_code\": \"323210\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01436336\",\r\n" + 
				"				\"corp_name\": \"이베스트스팩5호\",\r\n" + 
				"				\"stock_code\": \"349720\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00763701\",\r\n" + 
				"				\"corp_name\": \"세틀뱅크\",\r\n" + 
				"				\"stock_code\": \"234340\",\r\n" + 
				"				\"modify_date\": \"20210305\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00549891\",\r\n" + 
				"				\"corp_name\": \"케어젠\",\r\n" + 
				"				\"stock_code\": \"214370\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135111\",\r\n" + 
				"				\"corp_name\": \"수산중공업\",\r\n" + 
				"				\"stock_code\": \"017550\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00396925\",\r\n" + 
				"				\"corp_name\": \"엠로\",\r\n" + 
				"				\"stock_code\": \"058970\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113562\",\r\n" + 
				"				\"corp_name\": \"롯데손해보험\",\r\n" + 
				"				\"stock_code\": \"000400\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125822\",\r\n" + 
				"				\"corp_name\": \"삼보산업\",\r\n" + 
				"				\"stock_code\": \"009620\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127699\",\r\n" + 
				"				\"corp_name\": \"에코마이스터\",\r\n" + 
				"				\"stock_code\": \"064510\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113997\",\r\n" + 
				"				\"corp_name\": \"일진머티리얼즈\",\r\n" + 
				"				\"stock_code\": \"020150\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137234\",\r\n" + 
				"				\"corp_name\": \"모베이스전자\",\r\n" + 
				"				\"stock_code\": \"012860\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158565\",\r\n" + 
				"				\"corp_name\": \"한국알콜\",\r\n" + 
				"				\"stock_code\": \"017890\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00194275\",\r\n" + 
				"				\"corp_name\": \"코너스톤네트웍스\",\r\n" + 
				"				\"stock_code\": \"033110\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138792\",\r\n" + 
				"				\"corp_name\": \"아시아나항공\",\r\n" + 
				"				\"stock_code\": \"020560\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00143527\",\r\n" + 
				"				\"corp_name\": \"경동인베스트\",\r\n" + 
				"				\"stock_code\": \"012320\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148461\",\r\n" + 
				"				\"corp_name\": \"제일연마\",\r\n" + 
				"				\"stock_code\": \"001560\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00245472\",\r\n" + 
				"				\"corp_name\": \"티씨케이\",\r\n" + 
				"				\"stock_code\": \"064760\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00361266\",\r\n" + 
				"				\"corp_name\": \"COWON\",\r\n" + 
				"				\"stock_code\": \"056000\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160205\",\r\n" + 
				"				\"corp_name\": \"한국내화\",\r\n" + 
				"				\"stock_code\": \"010040\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00219486\",\r\n" + 
				"				\"corp_name\": \"신세계I&C\",\r\n" + 
				"				\"stock_code\": \"035510\",\r\n" + 
				"				\"modify_date\": \"20210412\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00416414\",\r\n" + 
				"				\"corp_name\": \"넥스턴바이오\",\r\n" + 
				"				\"stock_code\": \"089140\",\r\n" + 
				"				\"modify_date\": \"20210421\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00100939\",\r\n" + 
				"				\"corp_name\": \"강남제비스코\",\r\n" + 
				"				\"stock_code\": \"000860\",\r\n" + 
				"				\"modify_date\": \"20210421\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145437\",\r\n" + 
				"				\"corp_name\": \"아센디오\",\r\n" + 
				"				\"stock_code\": \"012170\",\r\n" + 
				"				\"modify_date\": \"20210421\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01211232\",\r\n" + 
				"				\"corp_name\": \"코윈테크\",\r\n" + 
				"				\"stock_code\": \"282880\",\r\n" + 
				"				\"modify_date\": \"20210421\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01135640\",\r\n" + 
				"				\"corp_name\": \"이삭엔지니어링\",\r\n" + 
				"				\"stock_code\": \"351330\",\r\n" + 
				"				\"modify_date\": \"20210421\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00453442\",\r\n" + 
				"				\"corp_name\": \"해성티피씨\",\r\n" + 
				"				\"stock_code\": \"059270\",\r\n" + 
				"				\"modify_date\": \"20210421\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113492\",\r\n" + 
				"				\"corp_name\": \"깨끗한나라\",\r\n" + 
				"				\"stock_code\": \"004540\",\r\n" + 
				"				\"modify_date\": \"20210427\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131832\",\r\n" + 
				"				\"corp_name\": \"SK디스커버리\",\r\n" + 
				"				\"stock_code\": \"006120\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00280688\",\r\n" + 
				"				\"corp_name\": \"SBS콘텐츠허브\",\r\n" + 
				"				\"stock_code\": \"046140\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104768\",\r\n" + 
				"				\"corp_name\": \"가온전선\",\r\n" + 
				"				\"stock_code\": \"000500\",\r\n" + 
				"				\"modify_date\": \"20210419\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01293953\",\r\n" + 
				"				\"corp_name\": \"싸이버원\",\r\n" + 
				"				\"stock_code\": \"356890\",\r\n" + 
				"				\"modify_date\": \"20210311\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01258428\",\r\n" + 
				"				\"corp_name\": \"프레스티지바이오로직스\",\r\n" + 
				"				\"stock_code\": \"334970\",\r\n" + 
				"				\"modify_date\": \"20210311\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00634728\",\r\n" + 
				"				\"corp_name\": \"이크레더블\",\r\n" + 
				"				\"stock_code\": \"092130\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126089\",\r\n" + 
				"				\"corp_name\": \"대유플러스\",\r\n" + 
				"				\"stock_code\": \"000300\",\r\n" + 
				"				\"modify_date\": \"20210412\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00962922\",\r\n" + 
				"				\"corp_name\": \"팬젠\",\r\n" + 
				"				\"stock_code\": \"222110\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00458234\",\r\n" + 
				"				\"corp_name\": \"아시아나IDT\",\r\n" + 
				"				\"stock_code\": \"267850\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00589127\",\r\n" + 
				"				\"corp_name\": \"KEC\",\r\n" + 
				"				\"stock_code\": \"092220\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00488402\",\r\n" + 
				"				\"corp_name\": \"서울바이오시스\",\r\n" + 
				"				\"stock_code\": \"092190\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00651901\",\r\n" + 
				"				\"corp_name\": \"에어부산\",\r\n" + 
				"				\"stock_code\": \"298690\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00493185\",\r\n" + 
				"				\"corp_name\": \"제이스텍\",\r\n" + 
				"				\"stock_code\": \"090470\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00535481\",\r\n" + 
				"				\"corp_name\": \"에스와이\",\r\n" + 
				"				\"stock_code\": \"109610\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00321204\",\r\n" + 
				"				\"corp_name\": \"관악산업\",\r\n" + 
				"				\"stock_code\": \"076340\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00641171\",\r\n" + 
				"				\"corp_name\": \"모바일리더\",\r\n" + 
				"				\"stock_code\": \"100030\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00669450\",\r\n" + 
				"				\"corp_name\": \"바이오프로테크\",\r\n" + 
				"				\"stock_code\": \"199290\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00641393\",\r\n" + 
				"				\"corp_name\": \"엔시트론\",\r\n" + 
				"				\"stock_code\": \"101400\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00866594\",\r\n" + 
				"				\"corp_name\": \"미애부\",\r\n" + 
				"				\"stock_code\": \"225850\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00990819\",\r\n" + 
				"				\"corp_name\": \"래몽래인\",\r\n" + 
				"				\"stock_code\": \"200350\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01116274\",\r\n" + 
				"				\"corp_name\": \"엠앤씨생명과학\",\r\n" + 
				"				\"stock_code\": \"225860\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00645089\",\r\n" + 
				"				\"corp_name\": \"NHN벅스\",\r\n" + 
				"				\"stock_code\": \"104200\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01051472\",\r\n" + 
				"				\"corp_name\": \"젠큐릭스\",\r\n" + 
				"				\"stock_code\": \"229000\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111865\",\r\n" + 
				"				\"corp_name\": \"미래SCI\",\r\n" + 
				"				\"stock_code\": \"028040\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156910\",\r\n" + 
				"				\"corp_name\": \"SBI인베스트먼트\",\r\n" + 
				"				\"stock_code\": \"019550\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00971090\",\r\n" + 
				"				\"corp_name\": \"샘코\",\r\n" + 
				"				\"stock_code\": \"263540\",\r\n" + 
				"				\"modify_date\": \"20210422\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155319\",\r\n" + 
				"				\"corp_name\": \"포스코\",\r\n" + 
				"				\"stock_code\": \"005490\",\r\n" + 
				"				\"modify_date\": \"20210315\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00553025\",\r\n" + 
				"				\"corp_name\": \"데이터스트림즈\",\r\n" + 
				"				\"stock_code\": \"199150\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00628189\",\r\n" + 
				"				\"corp_name\": \"웅진씽크빅\",\r\n" + 
				"				\"stock_code\": \"095720\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128111\",\r\n" + 
				"				\"corp_name\": \"포스코엠텍\",\r\n" + 
				"				\"stock_code\": \"009520\",\r\n" + 
				"				\"modify_date\": \"20210316\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00119195\",\r\n" + 
				"				\"corp_name\": \"동화약품\",\r\n" + 
				"				\"stock_code\": \"000020\",\r\n" + 
				"				\"modify_date\": \"20210316\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01511558\",\r\n" + 
				"				\"corp_name\": \"네오이뮨텍\",\r\n" + 
				"				\"stock_code\": \"950220\",\r\n" + 
				"				\"modify_date\": \"20210316\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01353024\",\r\n" + 
				"				\"corp_name\": \"TS트릴리온\",\r\n" + 
				"				\"stock_code\": \"317240\",\r\n" + 
				"				\"modify_date\": \"20210316\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140052\",\r\n" + 
				"				\"corp_name\": \"에이스침대\",\r\n" + 
				"				\"stock_code\": \"003800\",\r\n" + 
				"				\"modify_date\": \"20210317\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01208849\",\r\n" + 
				"				\"corp_name\": \"나인테크\",\r\n" + 
				"				\"stock_code\": \"267320\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01259056\",\r\n" + 
				"				\"corp_name\": \"베스파\",\r\n" + 
				"				\"stock_code\": \"299910\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108940\",\r\n" + 
				"				\"corp_name\": \"대성홀딩스\",\r\n" + 
				"				\"stock_code\": \"016710\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01514698\",\r\n" + 
				"				\"corp_name\": \"IBKS제15호스팩\",\r\n" + 
				"				\"stock_code\": \"373200\",\r\n" + 
				"				\"modify_date\": \"20210426\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113526\",\r\n" + 
				"				\"corp_name\": \"대한항공\",\r\n" + 
				"				\"stock_code\": \"003490\",\r\n" + 
				"				\"modify_date\": \"20210422\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01053540\",\r\n" + 
				"				\"corp_name\": \"퓨쳐켐\",\r\n" + 
				"				\"stock_code\": \"220100\",\r\n" + 
				"				\"modify_date\": \"20210315\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01358463\",\r\n" + 
				"				\"corp_name\": \"현대무벡스\",\r\n" + 
				"				\"stock_code\": \"319400\",\r\n" + 
				"				\"modify_date\": \"20210319\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01076550\",\r\n" + 
				"				\"corp_name\": \"주노콜렉션\",\r\n" + 
				"				\"stock_code\": \"221670\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103042\",\r\n" + 
				"				\"corp_name\": \"케이씨티시\",\r\n" + 
				"				\"stock_code\": \"009070\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01137295\",\r\n" + 
				"				\"corp_name\": \"프리시젼바이오\",\r\n" + 
				"				\"stock_code\": \"335810\",\r\n" + 
				"				\"modify_date\": \"20210317\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00147222\",\r\n" + 
				"				\"corp_name\": \"전방\",\r\n" + 
				"				\"stock_code\": \"000950\",\r\n" + 
				"				\"modify_date\": \"20210415\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00585219\",\r\n" + 
				"				\"corp_name\": \"세원이앤씨\",\r\n" + 
				"				\"stock_code\": \"091090\",\r\n" + 
				"				\"modify_date\": \"20210421\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220561\",\r\n" + 
				"				\"corp_name\": \"광주신세계\",\r\n" + 
				"				\"stock_code\": \"037710\",\r\n" + 
				"				\"modify_date\": \"20210415\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01217829\",\r\n" + 
				"				\"corp_name\": \"엔에프씨\",\r\n" + 
				"				\"stock_code\": \"265740\",\r\n" + 
				"				\"modify_date\": \"20210319\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00503668\",\r\n" + 
				"				\"corp_name\": \"LIG넥스원\",\r\n" + 
				"				\"stock_code\": \"079550\",\r\n" + 
				"				\"modify_date\": \"20210323\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110051\",\r\n" + 
				"				\"corp_name\": \"SK머티리얼즈\",\r\n" + 
				"				\"stock_code\": \"036490\",\r\n" + 
				"				\"modify_date\": \"20210420\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01116502\",\r\n" + 
				"				\"corp_name\": \"와이더플래닛\",\r\n" + 
				"				\"stock_code\": \"321820\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01089378\",\r\n" + 
				"				\"corp_name\": \"자안코스메틱\",\r\n" + 
				"				\"stock_code\": \"219550\",\r\n" + 
				"				\"modify_date\": \"20210419\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00299358\",\r\n" + 
				"				\"corp_name\": \"에이치디\",\r\n" + 
				"				\"stock_code\": \"102210\",\r\n" + 
				"				\"modify_date\": \"20210419\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159290\",\r\n" + 
				"				\"corp_name\": \"한국아트라스비엑스\",\r\n" + 
				"				\"stock_code\": \"023890\",\r\n" + 
				"				\"modify_date\": \"20210419\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01031229\",\r\n" + 
				"				\"corp_name\": \"지티지웰니스\",\r\n" + 
				"				\"stock_code\": \"219750\",\r\n" + 
				"				\"modify_date\": \"20210419\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01199550\",\r\n" + 
				"				\"corp_name\": \"현대에너지솔루션\",\r\n" + 
				"				\"stock_code\": \"322000\",\r\n" + 
				"				\"modify_date\": \"20210421\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00415646\",\r\n" + 
				"				\"corp_name\": \"드림텍\",\r\n" + 
				"				\"stock_code\": \"192650\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118451\",\r\n" + 
				"				\"corp_name\": \"동일제강\",\r\n" + 
				"				\"stock_code\": \"002690\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145260\",\r\n" + 
				"				\"corp_name\": \"율촌화학\",\r\n" + 
				"				\"stock_code\": \"008730\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173449\",\r\n" + 
				"				\"corp_name\": \"블루베리 NFT\",\r\n" + 
				"				\"stock_code\": \"044480\",\r\n" + 
				"				\"modify_date\": \"20210416\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00679314\",\r\n" + 
				"				\"corp_name\": \"동성케미컬\",\r\n" + 
				"				\"stock_code\": \"102260\",\r\n" + 
				"				\"modify_date\": \"20210416\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00226352\",\r\n" + 
				"				\"corp_name\": \"케이엠더블유\",\r\n" + 
				"				\"stock_code\": \"032500\",\r\n" + 
				"				\"modify_date\": \"20210416\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116356\",\r\n" + 
				"				\"corp_name\": \"동성화학\",\r\n" + 
				"				\"stock_code\": \"005190\",\r\n" + 
				"				\"modify_date\": \"20210416\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00239639\",\r\n" + 
				"				\"corp_name\": \"삼표시멘트\",\r\n" + 
				"				\"stock_code\": \"038500\",\r\n" + 
				"				\"modify_date\": \"20210416\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00596260\",\r\n" + 
				"				\"corp_name\": \"투비소프트\",\r\n" + 
				"				\"stock_code\": \"079970\",\r\n" + 
				"				\"modify_date\": \"20210416\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00785475\",\r\n" + 
				"				\"corp_name\": \"원익피앤이\",\r\n" + 
				"				\"stock_code\": \"131390\",\r\n" + 
				"				\"modify_date\": \"20210416\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112679\",\r\n" + 
				"				\"corp_name\": \"대창단조\",\r\n" + 
				"				\"stock_code\": \"015230\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173731\",\r\n" + 
				"				\"corp_name\": \"씨앤에스자산관리\",\r\n" + 
				"				\"stock_code\": \"032040\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128175\",\r\n" + 
				"				\"corp_name\": \"원익큐브\",\r\n" + 
				"				\"stock_code\": \"014190\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00537221\",\r\n" + 
				"				\"corp_name\": \"인바이츠바이오코아\",\r\n" + 
				"				\"stock_code\": \"216400\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00249502\",\r\n" + 
				"				\"corp_name\": \"골드앤에스\",\r\n" + 
				"				\"stock_code\": \"035290\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00656951\",\r\n" + 
				"				\"corp_name\": \"현대이지웰\",\r\n" + 
				"				\"stock_code\": \"090850\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01097906\",\r\n" + 
				"				\"corp_name\": \"KH E&T\",\r\n" + 
				"				\"stock_code\": \"226360\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00764807\",\r\n" + 
				"				\"corp_name\": \"골프존데카\",\r\n" + 
				"				\"stock_code\": \"183410\",\r\n" + 
				"				\"modify_date\": \"20210407\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102432\",\r\n" + 
				"				\"corp_name\": \"계룡건설산업\",\r\n" + 
				"				\"stock_code\": \"013580\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01290381\",\r\n" + 
				"				\"corp_name\": \"피엔케이피부임상연구센타\",\r\n" + 
				"				\"stock_code\": \"347740\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103635\",\r\n" + 
				"				\"corp_name\": \"광림\",\r\n" + 
				"				\"stock_code\": \"014200\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124799\",\r\n" + 
				"				\"corp_name\": \"사조산업\",\r\n" + 
				"				\"stock_code\": \"007160\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164618\",\r\n" + 
				"				\"corp_name\": \"현대사료\",\r\n" + 
				"				\"stock_code\": \"016790\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268118\",\r\n" + 
				"				\"corp_name\": \"코맥스\",\r\n" + 
				"				\"stock_code\": \"036690\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00403793\",\r\n" + 
				"				\"corp_name\": \"바이브컴퍼니\",\r\n" + 
				"				\"stock_code\": \"301300\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01063954\",\r\n" + 
				"				\"corp_name\": \"수젠텍\",\r\n" + 
				"				\"stock_code\": \"253840\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01393299\",\r\n" + 
				"				\"corp_name\": \"케이비제19호스팩\",\r\n" + 
				"				\"stock_code\": \"330990\",\r\n" + 
				"				\"modify_date\": \"20210407\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138224\",\r\n" + 
				"				\"corp_name\": \"쌍용씨앤이\",\r\n" + 
				"				\"stock_code\": \"003410\",\r\n" + 
				"				\"modify_date\": \"20210407\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164812\",\r\n" + 
				"				\"corp_name\": \"현대코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"011760\",\r\n" + 
				"				\"modify_date\": \"20210407\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126362\",\r\n" + 
				"				\"corp_name\": \"삼성SDI\",\r\n" + 
				"				\"stock_code\": \"006400\",\r\n" + 
				"				\"modify_date\": \"20210309\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01065679\",\r\n" + 
				"				\"corp_name\": \"이노인스트루먼트\",\r\n" + 
				"				\"stock_code\": \"215790\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00355548\",\r\n" + 
				"				\"corp_name\": \"한국테크놀로지\",\r\n" + 
				"				\"stock_code\": \"053590\",\r\n" + 
				"				\"modify_date\": \"20210405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00555740\",\r\n" + 
				"				\"corp_name\": \"툴코리아\",\r\n" + 
				"				\"stock_code\": \"110660\",\r\n" + 
				"				\"modify_date\": \"20210405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00238153\",\r\n" + 
				"				\"corp_name\": \"파세코\",\r\n" + 
				"				\"stock_code\": \"037070\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00300405\",\r\n" + 
				"				\"corp_name\": \"오리엔트정공\",\r\n" + 
				"				\"stock_code\": \"065500\",\r\n" + 
				"				\"modify_date\": \"20210407\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144395\",\r\n" + 
				"				\"corp_name\": \"동서\",\r\n" + 
				"				\"stock_code\": \"026960\",\r\n" + 
				"				\"modify_date\": \"20210405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117744\",\r\n" + 
				"				\"corp_name\": \"메리츠화재\",\r\n" + 
				"				\"stock_code\": \"000060\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00860332\",\r\n" + 
				"				\"corp_name\": \"메리츠금융지주\",\r\n" + 
				"				\"stock_code\": \"138040\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162993\",\r\n" + 
				"				\"corp_name\": \"한일홀딩스\",\r\n" + 
				"				\"stock_code\": \"003300\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00329093\",\r\n" + 
				"				\"corp_name\": \"코데즈컴바인\",\r\n" + 
				"				\"stock_code\": \"047770\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00243988\",\r\n" + 
				"				\"corp_name\": \"에스케이브로드밴드\",\r\n" + 
				"				\"stock_code\": \"033630\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00228536\",\r\n" + 
				"				\"corp_name\": \"현대에버다임\",\r\n" + 
				"				\"stock_code\": \"041440\",\r\n" + 
				"				\"modify_date\": \"20210415\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00493431\",\r\n" + 
				"				\"corp_name\": \"자안바이오\",\r\n" + 
				"				\"stock_code\": \"221610\",\r\n" + 
				"				\"modify_date\": \"20210415\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118266\",\r\n" + 
				"				\"corp_name\": \"DRB동일\",\r\n" + 
				"				\"stock_code\": \"004840\",\r\n" + 
				"				\"modify_date\": \"20210415\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00372873\",\r\n" + 
				"				\"corp_name\": \"KTis\",\r\n" + 
				"				\"stock_code\": \"058860\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146296\",\r\n" + 
				"				\"corp_name\": \"일신석재\",\r\n" + 
				"				\"stock_code\": \"007110\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00569691\",\r\n" + 
				"				\"corp_name\": \"디엔에프\",\r\n" + 
				"				\"stock_code\": \"092070\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117230\",\r\n" + 
				"				\"corp_name\": \"TYM\",\r\n" + 
				"				\"stock_code\": \"002900\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155151\",\r\n" + 
				"				\"corp_name\": \"피에이치에이\",\r\n" + 
				"				\"stock_code\": \"043370\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00243979\",\r\n" + 
				"				\"corp_name\": \"수성이노베이션\",\r\n" + 
				"				\"stock_code\": \"084180\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00447982\",\r\n" + 
				"				\"corp_name\": \"에스피엠씨\",\r\n" + 
				"				\"stock_code\": \"074000\",\r\n" + 
				"				\"modify_date\": \"20210405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00317089\",\r\n" + 
				"				\"corp_name\": \"한국애보트진단\",\r\n" + 
				"				\"stock_code\": \"066930\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01524093\",\r\n" + 
				"				\"corp_name\": \"DL이앤씨\",\r\n" + 
				"				\"stock_code\": \"375500\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01049167\",\r\n" + 
				"				\"corp_name\": \"미코바이오메드\",\r\n" + 
				"				\"stock_code\": \"214610\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01264438\",\r\n" + 
				"				\"corp_name\": \"자이언트스텝\",\r\n" + 
				"				\"stock_code\": \"289220\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00199252\",\r\n" + 
				"				\"corp_name\": \"에이치엘비\",\r\n" + 
				"				\"stock_code\": \"028300\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00610490\",\r\n" + 
				"				\"corp_name\": \"비디아이\",\r\n" + 
				"				\"stock_code\": \"148140\",\r\n" + 
				"				\"modify_date\": \"20210415\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00547510\",\r\n" + 
				"				\"corp_name\": \"툴젠\",\r\n" + 
				"				\"stock_code\": \"199800\",\r\n" + 
				"				\"modify_date\": \"20210401\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128971\",\r\n" + 
				"				\"corp_name\": \"DL건설\",\r\n" + 
				"				\"stock_code\": \"001880\",\r\n" + 
				"				\"modify_date\": \"20210408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00299464\",\r\n" + 
				"				\"corp_name\": \"초록뱀미디어\",\r\n" + 
				"				\"stock_code\": \"047820\",\r\n" + 
				"				\"modify_date\": \"20210408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01405451\",\r\n" + 
				"				\"corp_name\": \"알체라\",\r\n" + 
				"				\"stock_code\": \"347860\",\r\n" + 
				"				\"modify_date\": \"20210408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01514519\",\r\n" + 
				"				\"corp_name\": \"유진스팩6호\",\r\n" + 
				"				\"stock_code\": \"373340\",\r\n" + 
				"				\"modify_date\": \"20210408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00356370\",\r\n" + 
				"				\"corp_name\": \"LG생활건강\",\r\n" + 
				"				\"stock_code\": \"051900\",\r\n" + 
				"				\"modify_date\": \"20210406\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01201970\",\r\n" + 
				"				\"corp_name\": \"클리노믹스\",\r\n" + 
				"				\"stock_code\": \"352770\",\r\n" + 
				"				\"modify_date\": \"20210402\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106641\",\r\n" + 
				"				\"corp_name\": \"기아\",\r\n" + 
				"				\"stock_code\": \"000270\",\r\n" + 
				"				\"modify_date\": \"20210405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118044\",\r\n" + 
				"				\"corp_name\": \"동원수산\",\r\n" + 
				"				\"stock_code\": \"030720\",\r\n" + 
				"				\"modify_date\": \"20210405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00216762\",\r\n" + 
				"				\"corp_name\": \"한양이엔지\",\r\n" + 
				"				\"stock_code\": \"045100\",\r\n" + 
				"				\"modify_date\": \"20210405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144720\",\r\n" + 
				"				\"corp_name\": \"유양디앤유\",\r\n" + 
				"				\"stock_code\": \"011690\",\r\n" + 
				"				\"modify_date\": \"20210405\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01060735\",\r\n" + 
				"				\"corp_name\": \"아이피몬스터\",\r\n" + 
				"				\"stock_code\": \"223220\",\r\n" + 
				"				\"modify_date\": \"20210419\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255044\",\r\n" + 
				"				\"corp_name\": \"현대에이치티\",\r\n" + 
				"				\"stock_code\": \"039010\",\r\n" + 
				"				\"modify_date\": \"20210419\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00349811\",\r\n" + 
				"				\"corp_name\": \"초록뱀컴퍼니\",\r\n" + 
				"				\"stock_code\": \"052300\",\r\n" + 
				"				\"modify_date\": \"20210419\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01205709\",\r\n" + 
				"				\"corp_name\": \"현대중공업지주\",\r\n" + 
				"				\"stock_code\": \"267250\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01343665\",\r\n" + 
				"				\"corp_name\": \"RF머트리얼즈\",\r\n" + 
				"				\"stock_code\": \"327260\",\r\n" + 
				"				\"modify_date\": \"20210414\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00181934\",\r\n" + 
				"				\"corp_name\": \"포스코플랜텍\",\r\n" + 
				"				\"stock_code\": \"051310\",\r\n" + 
				"				\"modify_date\": \"20210415\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106313\",\r\n" + 
				"				\"corp_name\": \"금호건설\",\r\n" + 
				"				\"stock_code\": \"002990\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01093007\",\r\n" + 
				"				\"corp_name\": \"LS전선아시아\",\r\n" + 
				"				\"stock_code\": \"229640\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00308559\",\r\n" + 
				"				\"corp_name\": \"코디\",\r\n" + 
				"				\"stock_code\": \"080530\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01337114\",\r\n" + 
				"				\"corp_name\": \"구스앤홈\",\r\n" + 
				"				\"stock_code\": \"329050\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00366517\",\r\n" + 
				"				\"corp_name\": \"KC산업\",\r\n" + 
				"				\"stock_code\": \"112190\",\r\n" + 
				"				\"modify_date\": \"20210422\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00657756\",\r\n" + 
				"				\"corp_name\": \"지오씨\",\r\n" + 
				"				\"stock_code\": \"135160\",\r\n" + 
				"				\"modify_date\": \"20210422\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00157681\",\r\n" + 
				"				\"corp_name\": \"롯데정밀화학\",\r\n" + 
				"				\"stock_code\": \"004000\",\r\n" + 
				"				\"modify_date\": \"20210406\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00646732\",\r\n" + 
				"				\"corp_name\": \"진양홀딩스\",\r\n" + 
				"				\"stock_code\": \"100250\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129271\",\r\n" + 
				"				\"corp_name\": \"삼화전기\",\r\n" + 
				"				\"stock_code\": \"009470\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138242\",\r\n" + 
				"				\"corp_name\": \"쌍용자동차\",\r\n" + 
				"				\"stock_code\": \"003620\",\r\n" + 
				"				\"modify_date\": \"20210311\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00920379\",\r\n" + 
				"				\"corp_name\": \"티엘비\",\r\n" + 
				"				\"stock_code\": \"356860\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00430089\",\r\n" + 
				"				\"corp_name\": \"삼보오토\",\r\n" + 
				"				\"stock_code\": \"070080\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109286\",\r\n" + 
				"				\"corp_name\": \"대동\",\r\n" + 
				"				\"stock_code\": \"000490\",\r\n" + 
				"				\"modify_date\": \"20210423\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136101\",\r\n" + 
				"				\"corp_name\": \"메이슨캐피탈\",\r\n" + 
				"				\"stock_code\": \"021880\",\r\n" + 
				"				\"modify_date\": \"20210423\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00193009\",\r\n" + 
				"				\"corp_name\": \"KH 필룩스\",\r\n" + 
				"				\"stock_code\": \"033180\",\r\n" + 
				"				\"modify_date\": \"20210423\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102858\",\r\n" + 
				"				\"corp_name\": \"고려아연\",\r\n" + 
				"				\"stock_code\": \"010130\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113261\",\r\n" + 
				"				\"corp_name\": \"대한광통신\",\r\n" + 
				"				\"stock_code\": \"010170\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139719\",\r\n" + 
				"				\"corp_name\": \"와이지-원\",\r\n" + 
				"				\"stock_code\": \"019210\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106623\",\r\n" + 
				"				\"corp_name\": \"현대위아\",\r\n" + 
				"				\"stock_code\": \"011210\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113359\",\r\n" + 
				"				\"corp_name\": \"교보증권\",\r\n" + 
				"				\"stock_code\": \"030610\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164672\",\r\n" + 
				"				\"corp_name\": \"한일현대시멘트\",\r\n" + 
				"				\"stock_code\": \"006390\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00445841\",\r\n" + 
				"				\"corp_name\": \"한컴MDS\",\r\n" + 
				"				\"stock_code\": \"086960\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00470829\",\r\n" + 
				"				\"corp_name\": \"한솔인티큐브\",\r\n" + 
				"				\"stock_code\": \"070590\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164788\",\r\n" + 
				"				\"corp_name\": \"현대모비스\",\r\n" + 
				"				\"stock_code\": \"012330\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00480048\",\r\n" + 
				"				\"corp_name\": \"모다이노칩\",\r\n" + 
				"				\"stock_code\": \"080420\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00605124\",\r\n" + 
				"				\"corp_name\": \"알파홀딩스\",\r\n" + 
				"				\"stock_code\": \"117670\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00201450\",\r\n" + 
				"				\"corp_name\": \"SK렌터카\",\r\n" + 
				"				\"stock_code\": \"068400\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01135057\",\r\n" + 
				"				\"corp_name\": \"녹십자웰빙\",\r\n" + 
				"				\"stock_code\": \"234690\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00225159\",\r\n" + 
				"				\"corp_name\": \"SNT홀딩스\",\r\n" + 
				"				\"stock_code\": \"036530\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00963000\",\r\n" + 
				"				\"corp_name\": \"썬테크\",\r\n" + 
				"				\"stock_code\": \"217320\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164308\",\r\n" + 
				"				\"corp_name\": \"이마트에브리데이\",\r\n" + 
				"				\"stock_code\": \"010090\",\r\n" + 
				"				\"modify_date\": \"20210331\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580065\",\r\n" + 
				"				\"corp_name\": \"월덱스\",\r\n" + 
				"				\"stock_code\": \"101160\",\r\n" + 
				"				\"modify_date\": \"20210408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00580056\",\r\n" + 
				"				\"corp_name\": \"스맥\",\r\n" + 
				"				\"stock_code\": \"099440\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01505469\",\r\n" + 
				"				\"corp_name\": \"DB금융스팩9호\",\r\n" + 
				"				\"stock_code\": \"367360\",\r\n" + 
				"				\"modify_date\": \"20210407\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138190\",\r\n" + 
				"				\"corp_name\": \"GS글로벌\",\r\n" + 
				"				\"stock_code\": \"001250\",\r\n" + 
				"				\"modify_date\": \"20210310\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00205003\",\r\n" + 
				"				\"corp_name\": \"좋은사람들\",\r\n" + 
				"				\"stock_code\": \"033340\",\r\n" + 
				"				\"modify_date\": \"20210423\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269889\",\r\n" + 
				"				\"corp_name\": \"누리플렉스\",\r\n" + 
				"				\"stock_code\": \"040160\",\r\n" + 
				"				\"modify_date\": \"20210423\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01487446\",\r\n" + 
				"				\"corp_name\": \"엔에이치스팩17호\",\r\n" + 
				"				\"stock_code\": \"359090\",\r\n" + 
				"				\"modify_date\": \"20210423\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00273615\",\r\n" + 
				"				\"corp_name\": \"비케이탑스\",\r\n" + 
				"				\"stock_code\": \"030790\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00956930\",\r\n" + 
				"				\"corp_name\": \"동아에스티\",\r\n" + 
				"				\"stock_code\": \"170900\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01065785\",\r\n" + 
				"				\"corp_name\": \"노브메타파마\",\r\n" + 
				"				\"stock_code\": \"229500\",\r\n" + 
				"				\"modify_date\": \"20210325\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105855\",\r\n" + 
				"				\"corp_name\": \"엘에스일렉트릭\",\r\n" + 
				"				\"stock_code\": \"010120\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104573\",\r\n" + 
				"				\"corp_name\": \"국일제지\",\r\n" + 
				"				\"stock_code\": \"078130\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136448\",\r\n" + 
				"				\"corp_name\": \"신신제약\",\r\n" + 
				"				\"stock_code\": \"002800\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00203847\",\r\n" + 
				"				\"corp_name\": \"국일신동\",\r\n" + 
				"				\"stock_code\": \"060480\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117498\",\r\n" + 
				"				\"corp_name\": \"디피씨\",\r\n" + 
				"				\"stock_code\": \"026890\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133618\",\r\n" + 
				"				\"corp_name\": \"세기상사\",\r\n" + 
				"				\"stock_code\": \"002420\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00236863\",\r\n" + 
				"				\"corp_name\": \"희림\",\r\n" + 
				"				\"stock_code\": \"037440\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139764\",\r\n" + 
				"				\"corp_name\": \"에넥스\",\r\n" + 
				"				\"stock_code\": \"011090\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00269612\",\r\n" + 
				"				\"corp_name\": \"파워로직스\",\r\n" + 
				"				\"stock_code\": \"047310\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146861\",\r\n" + 
				"				\"corp_name\": \"자화전자\",\r\n" + 
				"				\"stock_code\": \"033240\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148522\",\r\n" + 
				"				\"corp_name\": \"퍼스텍\",\r\n" + 
				"				\"stock_code\": \"010820\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173795\",\r\n" + 
				"				\"corp_name\": \"신흥\",\r\n" + 
				"				\"stock_code\": \"004080\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00493501\",\r\n" + 
				"				\"corp_name\": \"씨디네트웍스\",\r\n" + 
				"				\"stock_code\": \"073710\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00659976\",\r\n" + 
				"				\"corp_name\": \"영화테크\",\r\n" + 
				"				\"stock_code\": \"265560\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101628\",\r\n" + 
				"				\"corp_name\": \"경방\",\r\n" + 
				"				\"stock_code\": \"000050\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00203582\",\r\n" + 
				"				\"corp_name\": \"한솔홈데코\",\r\n" + 
				"				\"stock_code\": \"025750\",\r\n" + 
				"				\"modify_date\": \"20210408\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00347877\",\r\n" + 
				"				\"corp_name\": \"이에스에이\",\r\n" + 
				"				\"stock_code\": \"052190\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156859\",\r\n" + 
				"				\"corp_name\": \"KTB투자증권\",\r\n" + 
				"				\"stock_code\": \"030210\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00384717\",\r\n" + 
				"				\"corp_name\": \"넥스트BT\",\r\n" + 
				"				\"stock_code\": \"065170\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00455875\",\r\n" + 
				"				\"corp_name\": \"와토스코리아\",\r\n" + 
				"				\"stock_code\": \"079000\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00472890\",\r\n" + 
				"				\"corp_name\": \"동국알앤에스\",\r\n" + 
				"				\"stock_code\": \"075970\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00527464\",\r\n" + 
				"				\"corp_name\": \"에이치시티\",\r\n" + 
				"				\"stock_code\": \"072990\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00896285\",\r\n" + 
				"				\"corp_name\": \"삼양사\",\r\n" + 
				"				\"stock_code\": \"145990\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00602136\",\r\n" + 
				"				\"corp_name\": \"디와이피엔에프\",\r\n" + 
				"				\"stock_code\": \"104460\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00617314\",\r\n" + 
				"				\"corp_name\": \"타이거일렉\",\r\n" + 
				"				\"stock_code\": \"219130\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00628860\",\r\n" + 
				"				\"corp_name\": \"네오위즈\",\r\n" + 
				"				\"stock_code\": \"095660\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01413371\",\r\n" + 
				"				\"corp_name\": \"단디바이오\",\r\n" + 
				"				\"stock_code\": \"343090\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01025644\",\r\n" + 
				"				\"corp_name\": \"강스템바이오텍\",\r\n" + 
				"				\"stock_code\": \"217730\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01228515\",\r\n" + 
				"				\"corp_name\": \"지엔원에너지\",\r\n" + 
				"				\"stock_code\": \"270520\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01179608\",\r\n" + 
				"				\"corp_name\": \"포인트엔지니어링\",\r\n" + 
				"				\"stock_code\": \"256630\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01267222\",\r\n" + 
				"				\"corp_name\": \"캐리소프트\",\r\n" + 
				"				\"stock_code\": \"317530\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124090\",\r\n" + 
				"				\"corp_name\": \"한국특강\",\r\n" + 
				"				\"stock_code\": \"007280\",\r\n" + 
				"				\"modify_date\": \"20210426\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01108099\",\r\n" + 
				"				\"corp_name\": \"현대코퍼레이션홀딩스\",\r\n" + 
				"				\"stock_code\": \"227840\",\r\n" + 
				"				\"modify_date\": \"20210426\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140168\",\r\n" + 
				"				\"corp_name\": \"지투알\",\r\n" + 
				"				\"stock_code\": \"035000\",\r\n" + 
				"				\"modify_date\": \"20210413\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118965\",\r\n" + 
				"				\"corp_name\": \"티에이치엔\",\r\n" + 
				"				\"stock_code\": \"019180\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00228712\",\r\n" + 
				"				\"corp_name\": \"동우팜투테이블\",\r\n" + 
				"				\"stock_code\": \"088910\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01010110\",\r\n" + 
				"				\"corp_name\": \"더블유게임즈\",\r\n" + 
				"				\"stock_code\": \"192080\",\r\n" + 
				"				\"modify_date\": \"20210407\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01011438\",\r\n" + 
				"				\"corp_name\": \"에이치엘사이언스\",\r\n" + 
				"				\"stock_code\": \"239610\",\r\n" + 
				"				\"modify_date\": \"20210315\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00491415\",\r\n" + 
				"				\"corp_name\": \"인포바인\",\r\n" + 
				"				\"stock_code\": \"115310\",\r\n" + 
				"				\"modify_date\": \"20210318\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260745\",\r\n" + 
				"				\"corp_name\": \"SCI평가정보\",\r\n" + 
				"				\"stock_code\": \"036120\",\r\n" + 
				"				\"modify_date\": \"20210409\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01368354\",\r\n" + 
				"				\"corp_name\": \"네패스아크\",\r\n" + 
				"				\"stock_code\": \"330860\",\r\n" + 
				"				\"modify_date\": \"20210326\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01412725\",\r\n" + 
				"				\"corp_name\": \"두산퓨얼셀\",\r\n" + 
				"				\"stock_code\": \"336260\",\r\n" + 
				"				\"modify_date\": \"20210330\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01109955\",\r\n" + 
				"				\"corp_name\": \"링크제니시스\",\r\n" + 
				"				\"stock_code\": \"219420\",\r\n" + 
				"				\"modify_date\": \"20210302\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00412597\",\r\n" + 
				"				\"corp_name\": \"현대홈쇼핑\",\r\n" + 
				"				\"stock_code\": \"057050\",\r\n" + 
				"				\"modify_date\": \"20210315\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159254\",\r\n" + 
				"				\"corp_name\": \"한국전자홀딩스\",\r\n" + 
				"				\"stock_code\": \"006200\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154718\",\r\n" + 
				"				\"corp_name\": \"비츠로셀\",\r\n" + 
				"				\"stock_code\": \"082920\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00323868\",\r\n" + 
				"				\"corp_name\": \"웹케시\",\r\n" + 
				"				\"stock_code\": \"053580\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148470\",\r\n" + 
				"				\"corp_name\": \"제일전기공업\",\r\n" + 
				"				\"stock_code\": \"199820\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00972293\",\r\n" + 
				"				\"corp_name\": \"파멥신\",\r\n" + 
				"				\"stock_code\": \"208340\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00181299\",\r\n" + 
				"				\"corp_name\": \"상아프론테크\",\r\n" + 
				"				\"stock_code\": \"089980\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00788773\",\r\n" + 
				"				\"corp_name\": \"씨젠\",\r\n" + 
				"				\"stock_code\": \"096530\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115065\",\r\n" + 
				"				\"corp_name\": \"동남합성\",\r\n" + 
				"				\"stock_code\": \"023450\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00803425\",\r\n" + 
				"				\"corp_name\": \"코리아에프티\",\r\n" + 
				"				\"stock_code\": \"123410\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01014055\",\r\n" + 
				"				\"corp_name\": \"에스트래픽\",\r\n" + 
				"				\"stock_code\": \"234300\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00521433\",\r\n" + 
				"				\"corp_name\": \"엔지브이아이\",\r\n" + 
				"				\"stock_code\": \"093510\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00551920\",\r\n" + 
				"				\"corp_name\": \"네오팜\",\r\n" + 
				"				\"stock_code\": \"092730\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00298377\",\r\n" + 
				"				\"corp_name\": \"아이씨디\",\r\n" + 
				"				\"stock_code\": \"040910\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00297989\",\r\n" + 
				"				\"corp_name\": \"오르비텍\",\r\n" + 
				"				\"stock_code\": \"046120\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00390514\",\r\n" + 
				"				\"corp_name\": \"이루온\",\r\n" + 
				"				\"stock_code\": \"065440\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01274310\",\r\n" + 
				"				\"corp_name\": \"이오플로우\",\r\n" + 
				"				\"stock_code\": \"294090\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156895\",\r\n" + 
				"				\"corp_name\": \"아주IB투자\",\r\n" + 
				"				\"stock_code\": \"027360\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01199189\",\r\n" + 
				"				\"corp_name\": \"이랜시스\",\r\n" + 
				"				\"stock_code\": \"264850\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00226866\",\r\n" + 
				"				\"corp_name\": \"인탑스\",\r\n" + 
				"				\"stock_code\": \"049070\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00535676\",\r\n" + 
				"				\"corp_name\": \"테크윙\",\r\n" + 
				"				\"stock_code\": \"089030\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00357607\",\r\n" + 
				"				\"corp_name\": \"케이피티유\",\r\n" + 
				"				\"stock_code\": \"054410\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01335930\",\r\n" + 
				"				\"corp_name\": \"티움바이오\",\r\n" + 
				"				\"stock_code\": \"321550\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00823429\",\r\n" + 
				"				\"corp_name\": \"한국화장품\",\r\n" + 
				"				\"stock_code\": \"123690\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00337296\",\r\n" + 
				"				\"corp_name\": \"원포유\",\r\n" + 
				"				\"stock_code\": \"122830\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112457\",\r\n" + 
				"				\"corp_name\": \"대주산업\",\r\n" + 
				"				\"stock_code\": \"003310\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01412938\",\r\n" + 
				"				\"corp_name\": \"에이스캠퍼\",\r\n" + 
				"				\"stock_code\": \"322190\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00770312\",\r\n" + 
				"				\"corp_name\": \"마니커에프앤지\",\r\n" + 
				"				\"stock_code\": \"195500\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00480783\",\r\n" + 
				"				\"corp_name\": \"상신이디피\",\r\n" + 
				"				\"stock_code\": \"091580\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166573\",\r\n" + 
				"				\"corp_name\": \"환인제약\",\r\n" + 
				"				\"stock_code\": \"016580\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137207\",\r\n" + 
				"				\"corp_name\": \"유니켐\",\r\n" + 
				"				\"stock_code\": \"011330\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00606886\",\r\n" + 
				"				\"corp_name\": \"엔지켐생명과학\",\r\n" + 
				"				\"stock_code\": \"183490\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01183407\",\r\n" + 
				"				\"corp_name\": \"이십일스토어\",\r\n" + 
				"				\"stock_code\": \"270020\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00366942\",\r\n" + 
				"				\"corp_name\": \"미코\",\r\n" + 
				"				\"stock_code\": \"059090\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103662\",\r\n" + 
				"				\"corp_name\": \"광명전기\",\r\n" + 
				"				\"stock_code\": \"017040\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00407814\",\r\n" + 
				"				\"corp_name\": \"크리스탈지노믹스\",\r\n" + 
				"				\"stock_code\": \"083790\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00259545\",\r\n" + 
				"				\"corp_name\": \"엠에스오토텍\",\r\n" + 
				"				\"stock_code\": \"123040\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00650629\",\r\n" + 
				"				\"corp_name\": \"SBS미디어홀딩스\",\r\n" + 
				"				\"stock_code\": \"101060\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01070857\",\r\n" + 
				"				\"corp_name\": \"켐온\",\r\n" + 
				"				\"stock_code\": \"217600\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01108248\",\r\n" + 
				"				\"corp_name\": \"지노믹트리\",\r\n" + 
				"				\"stock_code\": \"228760\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101336\",\r\n" + 
				"				\"corp_name\": \"경남에너지\",\r\n" + 
				"				\"stock_code\": \"008020\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00867034\",\r\n" + 
				"				\"corp_name\": \"듀켐바이오\",\r\n" + 
				"				\"stock_code\": \"176750\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00807555\",\r\n" + 
				"				\"corp_name\": \"메가엠디\",\r\n" + 
				"				\"stock_code\": \"133750\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161046\",\r\n" + 
				"				\"corp_name\": \"한독\",\r\n" + 
				"				\"stock_code\": \"002390\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130091\",\r\n" + 
				"				\"corp_name\": \"샘표\",\r\n" + 
				"				\"stock_code\": \"007540\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01259232\",\r\n" + 
				"				\"corp_name\": \"노바텍\",\r\n" + 
				"				\"stock_code\": \"285490\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01394669\",\r\n" + 
				"				\"corp_name\": \"대신밸런스제7호스팩\",\r\n" + 
				"				\"stock_code\": \"332290\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125530\",\r\n" + 
				"				\"corp_name\": \"SPC삼립\",\r\n" + 
				"				\"stock_code\": \"005610\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01062177\",\r\n" + 
				"				\"corp_name\": \"제놀루션\",\r\n" + 
				"				\"stock_code\": \"225220\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00471068\",\r\n" + 
				"				\"corp_name\": \"덕산하이메탈\",\r\n" + 
				"				\"stock_code\": \"077360\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121932\",\r\n" + 
				"				\"corp_name\": \"미원상사\",\r\n" + 
				"				\"stock_code\": \"002840\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00487546\",\r\n" + 
				"				\"corp_name\": \"웰크론한텍\",\r\n" + 
				"				\"stock_code\": \"076080\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01440153\",\r\n" + 
				"				\"corp_name\": \"IBKS제14호스팩\",\r\n" + 
				"				\"stock_code\": \"351320\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128227\",\r\n" + 
				"				\"corp_name\": \"삼정펄프\",\r\n" + 
				"				\"stock_code\": \"009770\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00604426\",\r\n" + 
				"				\"corp_name\": \"인터로조\",\r\n" + 
				"				\"stock_code\": \"119610\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00897752\",\r\n" + 
				"				\"corp_name\": \"천보\",\r\n" + 
				"				\"stock_code\": \"278280\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00476036\",\r\n" + 
				"				\"corp_name\": \"에프엔에스테크\",\r\n" + 
				"				\"stock_code\": \"083500\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01265251\",\r\n" + 
				"				\"corp_name\": \"압타머사이언스\",\r\n" + 
				"				\"stock_code\": \"291650\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00252269\",\r\n" + 
				"				\"corp_name\": \"아이에이\",\r\n" + 
				"				\"stock_code\": \"038880\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01167056\",\r\n" + 
				"				\"corp_name\": \"샘표식품\",\r\n" + 
				"				\"stock_code\": \"248170\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127857\",\r\n" + 
				"				\"corp_name\": \"삼익악기\",\r\n" + 
				"				\"stock_code\": \"002450\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107303\",\r\n" + 
				"				\"corp_name\": \"피엔에스커튼월\",\r\n" + 
				"				\"stock_code\": \"033220\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01344336\",\r\n" + 
				"				\"corp_name\": \"신테카바이오\",\r\n" + 
				"				\"stock_code\": \"226330\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00198378\",\r\n" + 
				"				\"corp_name\": \"녹십자셀\",\r\n" + 
				"				\"stock_code\": \"031390\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00684714\",\r\n" + 
				"				\"corp_name\": \"풍산\",\r\n" + 
				"				\"stock_code\": \"103140\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00302582\",\r\n" + 
				"				\"corp_name\": \"캐스텍코리아\",\r\n" + 
				"				\"stock_code\": \"071850\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109781\",\r\n" + 
				"				\"corp_name\": \"대림제지\",\r\n" + 
				"				\"stock_code\": \"017650\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145464\",\r\n" + 
				"				\"corp_name\": \"이구산업\",\r\n" + 
				"				\"stock_code\": \"025820\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141282\",\r\n" + 
				"				\"corp_name\": \"에이치디씨영창\",\r\n" + 
				"				\"stock_code\": \"001890\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01042979\",\r\n" + 
				"				\"corp_name\": \"휴마시스\",\r\n" + 
				"				\"stock_code\": \"205470\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115472\",\r\n" + 
				"				\"corp_name\": \"미주제강\",\r\n" + 
				"				\"stock_code\": \"002670\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01309388\",\r\n" + 
				"				\"corp_name\": \"티라유텍\",\r\n" + 
				"				\"stock_code\": \"322180\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00115384\",\r\n" + 
				"				\"corp_name\": \"동방아그로\",\r\n" + 
				"				\"stock_code\": \"007590\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00450931\",\r\n" + 
				"				\"corp_name\": \"우양에이치씨\",\r\n" + 
				"				\"stock_code\": \"101970\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163716\",\r\n" + 
				"				\"corp_name\": \"한창\",\r\n" + 
				"				\"stock_code\": \"005110\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00765851\",\r\n" + 
				"				\"corp_name\": \"위더스제약\",\r\n" + 
				"				\"stock_code\": \"330350\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01262032\",\r\n" + 
				"				\"corp_name\": \"롯데정보통신\",\r\n" + 
				"				\"stock_code\": \"286940\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01073678\",\r\n" + 
				"				\"corp_name\": \"얼라인드\",\r\n" + 
				"				\"stock_code\": \"238120\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00181943\",\r\n" + 
				"				\"corp_name\": \"에스제이엠홀딩스\",\r\n" + 
				"				\"stock_code\": \"025530\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01146822\",\r\n" + 
				"				\"corp_name\": \"아이퀘스트\",\r\n" + 
				"				\"stock_code\": \"262840\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00659815\",\r\n" + 
				"				\"corp_name\": \"금오하이텍\",\r\n" + 
				"				\"stock_code\": \"165270\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01020843\",\r\n" + 
				"				\"corp_name\": \"엔에스\",\r\n" + 
				"				\"stock_code\": \"217820\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133089\",\r\n" + 
				"				\"corp_name\": \"성원\",\r\n" + 
				"				\"stock_code\": \"015200\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01325429\",\r\n" + 
				"				\"corp_name\": \"네온테크\",\r\n" + 
				"				\"stock_code\": \"306620\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138701\",\r\n" + 
				"				\"corp_name\": \"아세아\",\r\n" + 
				"				\"stock_code\": \"002030\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00384762\",\r\n" + 
				"				\"corp_name\": \"파커스\",\r\n" + 
				"				\"stock_code\": \"065690\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00341916\",\r\n" + 
				"				\"corp_name\": \"오스템임플란트\",\r\n" + 
				"				\"stock_code\": \"048260\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01222432\",\r\n" + 
				"				\"corp_name\": \"에스제이그룹\",\r\n" + 
				"				\"stock_code\": \"306040\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01234297\",\r\n" + 
				"				\"corp_name\": \"미원에스씨\",\r\n" + 
				"				\"stock_code\": \"268280\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00450995\",\r\n" + 
				"				\"corp_name\": \"대모\",\r\n" + 
				"				\"stock_code\": \"317850\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00474588\",\r\n" + 
				"				\"corp_name\": \"한중엔시에스\",\r\n" + 
				"				\"stock_code\": \"107640\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01318261\",\r\n" + 
				"				\"corp_name\": \"더블유에스아이\",\r\n" + 
				"				\"stock_code\": \"299170\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00183215\",\r\n" + 
				"				\"corp_name\": \"케이디지엠텍\",\r\n" + 
				"				\"stock_code\": \"032290\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00990262\",\r\n" + 
				"				\"corp_name\": \"피노텍\",\r\n" + 
				"				\"stock_code\": \"150440\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00964595\",\r\n" + 
				"				\"corp_name\": \"엔바이오니아\",\r\n" + 
				"				\"stock_code\": \"317870\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01058101\",\r\n" + 
				"				\"corp_name\": \"라파스\",\r\n" + 
				"				\"stock_code\": \"214260\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00769158\",\r\n" + 
				"				\"corp_name\": \"케이엔제이\",\r\n" + 
				"				\"stock_code\": \"272110\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00190756\",\r\n" + 
				"				\"corp_name\": \"와이엔텍\",\r\n" + 
				"				\"stock_code\": \"067900\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01099861\",\r\n" + 
				"				\"corp_name\": \"에이텍티앤\",\r\n" + 
				"				\"stock_code\": \"224110\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00776820\",\r\n" + 
				"				\"corp_name\": \"영원무역\",\r\n" + 
				"				\"stock_code\": \"111770\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00892526\",\r\n" + 
				"				\"corp_name\": \"디케이앤디\",\r\n" + 
				"				\"stock_code\": \"263020\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01276901\",\r\n" + 
				"				\"corp_name\": \"삼성스팩2호\",\r\n" + 
				"				\"stock_code\": \"291230\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01255652\",\r\n" + 
				"				\"corp_name\": \"레이크머티리얼즈\",\r\n" + 
				"				\"stock_code\": \"281740\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111999\",\r\n" + 
				"				\"corp_name\": \"대원제약\",\r\n" + 
				"				\"stock_code\": \"003220\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00608440\",\r\n" + 
				"				\"corp_name\": \"티앤엘\",\r\n" + 
				"				\"stock_code\": \"340570\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220686\",\r\n" + 
				"				\"corp_name\": \"에스피지\",\r\n" + 
				"				\"stock_code\": \"058610\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00362159\",\r\n" + 
				"				\"corp_name\": \"웰크론\",\r\n" + 
				"				\"stock_code\": \"065950\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00577016\",\r\n" + 
				"				\"corp_name\": \"수산아이앤티\",\r\n" + 
				"				\"stock_code\": \"050960\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00524421\",\r\n" + 
				"				\"corp_name\": \"테스\",\r\n" + 
				"				\"stock_code\": \"095610\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00143226\",\r\n" + 
				"				\"corp_name\": \"엠투엔\",\r\n" + 
				"				\"stock_code\": \"033310\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00375931\",\r\n" + 
				"				\"corp_name\": \"인선이엔티\",\r\n" + 
				"				\"stock_code\": \"060150\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00591441\",\r\n" + 
				"				\"corp_name\": \"어보브반도체\",\r\n" + 
				"				\"stock_code\": \"102120\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00398668\",\r\n" + 
				"				\"corp_name\": \"휴비츠\",\r\n" + 
				"				\"stock_code\": \"065510\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00606664\",\r\n" + 
				"				\"corp_name\": \"케이엔더블유\",\r\n" + 
				"				\"stock_code\": \"105330\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01071944\",\r\n" + 
				"				\"corp_name\": \"미래생명자원\",\r\n" + 
				"				\"stock_code\": \"218150\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00765462\",\r\n" + 
				"				\"corp_name\": \"씨에스베어링\",\r\n" + 
				"				\"stock_code\": \"297090\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156488\",\r\n" + 
				"				\"corp_name\": \"휴스틸\",\r\n" + 
				"				\"stock_code\": \"005010\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01188749\",\r\n" + 
				"				\"corp_name\": \"지앤이헬스케어\",\r\n" + 
				"				\"stock_code\": \"299480\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00307189\",\r\n" + 
				"				\"corp_name\": \"에스케이씨솔믹스\",\r\n" + 
				"				\"stock_code\": \"057500\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00605522\",\r\n" + 
				"				\"corp_name\": \"소룩스\",\r\n" + 
				"				\"stock_code\": \"290690\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00571298\",\r\n" + 
				"				\"corp_name\": \"덕우전자\",\r\n" + 
				"				\"stock_code\": \"263600\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154329\",\r\n" + 
				"				\"corp_name\": \"태평양물산\",\r\n" + 
				"				\"stock_code\": \"007980\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540571\",\r\n" + 
				"				\"corp_name\": \"엘디티\",\r\n" + 
				"				\"stock_code\": \"096870\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00407036\",\r\n" + 
				"				\"corp_name\": \"선바이오\",\r\n" + 
				"				\"stock_code\": \"067370\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00466428\",\r\n" + 
				"				\"corp_name\": \"아미노로직스\",\r\n" + 
				"				\"stock_code\": \"074430\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00441447\",\r\n" + 
				"				\"corp_name\": \"케이씨티\",\r\n" + 
				"				\"stock_code\": \"089150\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112651\",\r\n" + 
				"				\"corp_name\": \"대창\",\r\n" + 
				"				\"stock_code\": \"012800\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00352000\",\r\n" + 
				"				\"corp_name\": \"하우리\",\r\n" + 
				"				\"stock_code\": \"049130\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00578325\",\r\n" + 
				"				\"corp_name\": \"럭스피아\",\r\n" + 
				"				\"stock_code\": \"092590\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00838962\",\r\n" + 
				"				\"corp_name\": \"알서포트\",\r\n" + 
				"				\"stock_code\": \"131370\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01256864\",\r\n" + 
				"				\"corp_name\": \"에이비엘바이오\",\r\n" + 
				"				\"stock_code\": \"298380\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00301112\",\r\n" + 
				"				\"corp_name\": \"삼화네트웍스\",\r\n" + 
				"				\"stock_code\": \"046390\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00610083\",\r\n" + 
				"				\"corp_name\": \"비아트론\",\r\n" + 
				"				\"stock_code\": \"141000\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00916516\",\r\n" + 
				"				\"corp_name\": \"흥국에프엔비\",\r\n" + 
				"				\"stock_code\": \"189980\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00536286\",\r\n" + 
				"				\"corp_name\": \"윈팩\",\r\n" + 
				"				\"stock_code\": \"097800\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01063556\",\r\n" + 
				"				\"corp_name\": \"질경이\",\r\n" + 
				"				\"stock_code\": \"233990\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117337\",\r\n" + 
				"				\"corp_name\": \"동양\",\r\n" + 
				"				\"stock_code\": \"001520\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130879\",\r\n" + 
				"				\"corp_name\": \"서울식품공업\",\r\n" + 
				"				\"stock_code\": \"004410\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00602279\",\r\n" + 
				"				\"corp_name\": \"그린플러스\",\r\n" + 
				"				\"stock_code\": \"186230\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00413417\",\r\n" + 
				"				\"corp_name\": \"우리손에프앤지\",\r\n" + 
				"				\"stock_code\": \"073560\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01016479\",\r\n" + 
				"				\"corp_name\": \"오로스테크놀로지\",\r\n" + 
				"				\"stock_code\": \"322310\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01046708\",\r\n" + 
				"				\"corp_name\": \"바디텍메드\",\r\n" + 
				"				\"stock_code\": \"206640\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00129411\",\r\n" + 
				"				\"corp_name\": \"삼환기업\",\r\n" + 
				"				\"stock_code\": \"000360\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01363818\",\r\n" + 
				"				\"corp_name\": \"롯데리츠\",\r\n" + 
				"				\"stock_code\": \"330590\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00531829\",\r\n" + 
				"				\"corp_name\": \"엠아이텍\",\r\n" + 
				"				\"stock_code\": \"179290\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00445054\",\r\n" + 
				"				\"corp_name\": \"하나마이크론\",\r\n" + 
				"				\"stock_code\": \"067310\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141149\",\r\n" + 
				"				\"corp_name\": \"영진약품\",\r\n" + 
				"				\"stock_code\": \"003520\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00560849\",\r\n" + 
				"				\"corp_name\": \"에스앤디\",\r\n" + 
				"				\"stock_code\": \"260970\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01267684\",\r\n" + 
				"				\"corp_name\": \"쿠쿠홈시스\",\r\n" + 
				"				\"stock_code\": \"284740\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159874\",\r\n" + 
				"				\"corp_name\": \"한국컴퓨터지주\",\r\n" + 
				"				\"stock_code\": \"009760\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01210190\",\r\n" + 
				"				\"corp_name\": \"모비릭스\",\r\n" + 
				"				\"stock_code\": \"348030\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105280\",\r\n" + 
				"				\"corp_name\": \"현대그린푸드\",\r\n" + 
				"				\"stock_code\": \"005440\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00446479\",\r\n" + 
				"				\"corp_name\": \"신비앤텍\",\r\n" + 
				"				\"stock_code\": \"070480\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01195828\",\r\n" + 
				"				\"corp_name\": \"대원모방\",\r\n" + 
				"				\"stock_code\": \"311840\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00184667\",\r\n" + 
				"				\"corp_name\": \"유진기업\",\r\n" + 
				"				\"stock_code\": \"023410\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01190124\",\r\n" + 
				"				\"corp_name\": \"미디어젠\",\r\n" + 
				"				\"stock_code\": \"279600\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00326731\",\r\n" + 
				"				\"corp_name\": \"바이오니아\",\r\n" + 
				"				\"stock_code\": \"064550\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231105\",\r\n" + 
				"				\"corp_name\": \"동성화인텍\",\r\n" + 
				"				\"stock_code\": \"033500\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00577380\",\r\n" + 
				"				\"corp_name\": \"신진에스엠\",\r\n" + 
				"				\"stock_code\": \"138070\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00497631\",\r\n" + 
				"				\"corp_name\": \"티플랙스\",\r\n" + 
				"				\"stock_code\": \"081150\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00556712\",\r\n" + 
				"				\"corp_name\": \"힘스\",\r\n" + 
				"				\"stock_code\": \"238490\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104388\",\r\n" + 
				"				\"corp_name\": \"국도화학\",\r\n" + 
				"				\"stock_code\": \"007690\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162416\",\r\n" + 
				"				\"corp_name\": \"한양증권\",\r\n" + 
				"				\"stock_code\": \"001750\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01214248\",\r\n" + 
				"				\"corp_name\": \"뉴트리\",\r\n" + 
				"				\"stock_code\": \"270870\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01085187\",\r\n" + 
				"				\"corp_name\": \"씨알푸드\",\r\n" + 
				"				\"stock_code\": \"236030\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00905316\",\r\n" + 
				"				\"corp_name\": \"하이골드3호\",\r\n" + 
				"				\"stock_code\": \"153360\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123648\",\r\n" + 
				"				\"corp_name\": \"심팩인더스트리\",\r\n" + 
				"				\"stock_code\": \"005350\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01238169\",\r\n" + 
				"				\"corp_name\": \"오리온\",\r\n" + 
				"				\"stock_code\": \"271560\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00945457\",\r\n" + 
				"				\"corp_name\": \"아이진\",\r\n" + 
				"				\"stock_code\": \"185490\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00861100\",\r\n" + 
				"				\"corp_name\": \"아이케이세미콘\",\r\n" + 
				"				\"stock_code\": \"149010\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125488\",\r\n" + 
				"				\"corp_name\": \"삼륭물산\",\r\n" + 
				"				\"stock_code\": \"014970\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162832\",\r\n" + 
				"				\"corp_name\": \"한일단조\",\r\n" + 
				"				\"stock_code\": \"024740\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01408999\",\r\n" + 
				"				\"corp_name\": \"유안타제5호스팩\",\r\n" + 
				"				\"stock_code\": \"336060\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01416642\",\r\n" + 
				"				\"corp_name\": \"유안타제6호스팩\",\r\n" + 
				"				\"stock_code\": \"340360\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01504804\",\r\n" + 
				"				\"corp_name\": \"유안타제7호스팩\",\r\n" + 
				"				\"stock_code\": \"367460\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00595182\",\r\n" + 
				"				\"corp_name\": \"아톤\",\r\n" + 
				"				\"stock_code\": \"158430\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148920\",\r\n" + 
				"				\"corp_name\": \"조광페인트\",\r\n" + 
				"				\"stock_code\": \"004910\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00327819\",\r\n" + 
				"				\"corp_name\": \"선익시스템\",\r\n" + 
				"				\"stock_code\": \"171090\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01203376\",\r\n" + 
				"				\"corp_name\": \"유비쿼스\",\r\n" + 
				"				\"stock_code\": \"264450\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00489243\",\r\n" + 
				"				\"corp_name\": \"동아엘텍\",\r\n" + 
				"				\"stock_code\": \"088130\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00681373\",\r\n" + 
				"				\"corp_name\": \"디지캡\",\r\n" + 
				"				\"stock_code\": \"197140\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00631837\",\r\n" + 
				"				\"corp_name\": \"안트로젠\",\r\n" + 
				"				\"stock_code\": \"065660\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526872\",\r\n" + 
				"				\"corp_name\": \"이수앱지스\",\r\n" + 
				"				\"stock_code\": \"086890\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01099667\",\r\n" + 
				"				\"corp_name\": \"에스디생명공학\",\r\n" + 
				"				\"stock_code\": \"217480\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01117918\",\r\n" + 
				"				\"corp_name\": \"셀젠텍\",\r\n" + 
				"				\"stock_code\": \"258250\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00815369\",\r\n" + 
				"				\"corp_name\": \"에스제이엠\",\r\n" + 
				"				\"stock_code\": \"123700\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01047415\",\r\n" + 
				"				\"corp_name\": \"정다운\",\r\n" + 
				"				\"stock_code\": \"208140\",\r\n" + 
				"				\"modify_date\": \"20210226\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00485177\",\r\n" + 
				"				\"corp_name\": \"일진파워\",\r\n" + 
				"				\"stock_code\": \"094820\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00371485\",\r\n" + 
				"				\"corp_name\": \"켐트로닉스\",\r\n" + 
				"				\"stock_code\": \"089010\",\r\n" + 
				"				\"modify_date\": \"20210224\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00348292\",\r\n" + 
				"				\"corp_name\": \"한빛소프트\",\r\n" + 
				"				\"stock_code\": \"047080\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00363246\",\r\n" + 
				"				\"corp_name\": \"우원개발\",\r\n" + 
				"				\"stock_code\": \"046940\",\r\n" + 
				"				\"modify_date\": \"20210225\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01450105\",\r\n" + 
				"				\"corp_name\": \"미래에셋대우스팩 5호\",\r\n" + 
				"				\"stock_code\": \"353490\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01047840\",\r\n" + 
				"				\"corp_name\": \"미스터블루\",\r\n" + 
				"				\"stock_code\": \"207760\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00867098\",\r\n" + 
				"				\"corp_name\": \"티로보틱스\",\r\n" + 
				"				\"stock_code\": \"117730\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105156\",\r\n" + 
				"				\"corp_name\": \"극동유화\",\r\n" + 
				"				\"stock_code\": \"014530\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00291231\",\r\n" + 
				"				\"corp_name\": \"우전\",\r\n" + 
				"				\"stock_code\": \"052270\",\r\n" + 
				"				\"modify_date\": \"20210223\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126788\",\r\n" + 
				"				\"corp_name\": \"삼아제약\",\r\n" + 
				"				\"stock_code\": \"009300\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00382199\",\r\n" + 
				"				\"corp_name\": \"신한지주\",\r\n" + 
				"				\"stock_code\": \"055550\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00123967\",\r\n" + 
				"				\"corp_name\": \"부산도시가스\",\r\n" + 
				"				\"stock_code\": \"015350\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101257\",\r\n" + 
				"				\"corp_name\": \"경남기업\",\r\n" + 
				"				\"stock_code\": \"000800\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00238977\",\r\n" + 
				"				\"corp_name\": \"에스엠화진\",\r\n" + 
				"				\"stock_code\": \"134780\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01276594\",\r\n" + 
				"				\"corp_name\": \"신한알파리츠\",\r\n" + 
				"				\"stock_code\": \"293940\",\r\n" + 
				"				\"modify_date\": \"20210526\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00578538\",\r\n" + 
				"				\"corp_name\": \"티피씨글로벌\",\r\n" + 
				"				\"stock_code\": \"130740\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134316\",\r\n" + 
				"				\"corp_name\": \"세원정공\",\r\n" + 
				"				\"stock_code\": \"021820\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00576789\",\r\n" + 
				"				\"corp_name\": \"디젠스\",\r\n" + 
				"				\"stock_code\": \"113810\",\r\n" + 
				"				\"modify_date\": \"20210609\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00310156\",\r\n" + 
				"				\"corp_name\": \"셀루메드\",\r\n" + 
				"				\"stock_code\": \"049180\",\r\n" + 
				"				\"modify_date\": \"20210610\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00587466\",\r\n" + 
				"				\"corp_name\": \"KPX홀딩스\",\r\n" + 
				"				\"stock_code\": \"092230\",\r\n" + 
				"				\"modify_date\": \"20210526\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145914\",\r\n" + 
				"				\"corp_name\": \"인터엠\",\r\n" + 
				"				\"stock_code\": \"017250\",\r\n" + 
				"				\"modify_date\": \"20210712\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00180795\",\r\n" + 
				"				\"corp_name\": \"인팩\",\r\n" + 
				"				\"stock_code\": \"023810\",\r\n" + 
				"				\"modify_date\": \"20210712\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01275665\",\r\n" + 
				"				\"corp_name\": \"리메드\",\r\n" + 
				"				\"stock_code\": \"302550\",\r\n" + 
				"				\"modify_date\": \"20210712\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01113949\",\r\n" + 
				"				\"corp_name\": \"퓨전\",\r\n" + 
				"				\"stock_code\": \"195440\",\r\n" + 
				"				\"modify_date\": \"20210610\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01336391\",\r\n" + 
				"				\"corp_name\": \"엔에이치스팩13호\",\r\n" + 
				"				\"stock_code\": \"310840\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01345724\",\r\n" + 
				"				\"corp_name\": \"타임기술\",\r\n" + 
				"				\"stock_code\": \"318660\",\r\n" + 
				"				\"modify_date\": \"20210624\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01406618\",\r\n" + 
				"				\"corp_name\": \"비올\",\r\n" + 
				"				\"stock_code\": \"335890\",\r\n" + 
				"				\"modify_date\": \"20210624\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00937324\",\r\n" + 
				"				\"corp_name\": \"한국타이어앤테크놀로지\",\r\n" + 
				"				\"stock_code\": \"161390\",\r\n" + 
				"				\"modify_date\": \"20210624\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00276083\",\r\n" + 
				"				\"corp_name\": \"스카이문스테크놀로지\",\r\n" + 
				"				\"stock_code\": \"033790\",\r\n" + 
				"				\"modify_date\": \"20210629\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01067242\",\r\n" + 
				"				\"corp_name\": \"티씨엠생명과학\",\r\n" + 
				"				\"stock_code\": \"228180\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00415327\",\r\n" + 
				"				\"corp_name\": \"중앙백신\",\r\n" + 
				"				\"stock_code\": \"072020\",\r\n" + 
				"				\"modify_date\": \"20210721\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165343\",\r\n" + 
				"				\"corp_name\": \"혜인\",\r\n" + 
				"				\"stock_code\": \"003010\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117382\",\r\n" + 
				"				\"corp_name\": \"디와이홀딩스\",\r\n" + 
				"				\"stock_code\": \"004510\",\r\n" + 
				"				\"modify_date\": \"20210527\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00490090\",\r\n" + 
				"				\"corp_name\": \"이지케어텍\",\r\n" + 
				"				\"stock_code\": \"099750\",\r\n" + 
				"				\"modify_date\": \"20210528\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00318662\",\r\n" + 
				"				\"corp_name\": \"CNT85\",\r\n" + 
				"				\"stock_code\": \"056730\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244561\",\r\n" + 
				"				\"corp_name\": \"인터파크\",\r\n" + 
				"				\"stock_code\": \"035080\",\r\n" + 
				"				\"modify_date\": \"20210527\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117212\",\r\n" + 
				"				\"corp_name\": \"두산\",\r\n" + 
				"				\"stock_code\": \"000150\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110875\",\r\n" + 
				"				\"corp_name\": \"대신정보통신\",\r\n" + 
				"				\"stock_code\": \"020180\",\r\n" + 
				"				\"modify_date\": \"20210604\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01011872\",\r\n" + 
				"				\"corp_name\": \"엔에스엠\",\r\n" + 
				"				\"stock_code\": \"238170\",\r\n" + 
				"				\"modify_date\": \"20210609\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00449254\",\r\n" + 
				"				\"corp_name\": \"쎄트렉아이\",\r\n" + 
				"				\"stock_code\": \"099320\",\r\n" + 
				"				\"modify_date\": \"20210609\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00175650\",\r\n" + 
				"				\"corp_name\": \"케이씨더블류\",\r\n" + 
				"				\"stock_code\": \"068060\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00428729\",\r\n" + 
				"				\"corp_name\": \"대호에이엘\",\r\n" + 
				"				\"stock_code\": \"069460\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00187415\",\r\n" + 
				"				\"corp_name\": \"코미팜\",\r\n" + 
				"				\"stock_code\": \"041960\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165060\",\r\n" + 
				"				\"corp_name\": \"하이록코리아\",\r\n" + 
				"				\"stock_code\": \"013030\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01089350\",\r\n" + 
				"				\"corp_name\": \"켐트로스\",\r\n" + 
				"				\"stock_code\": \"220260\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01267550\",\r\n" + 
				"				\"corp_name\": \"나라소프트\",\r\n" + 
				"				\"stock_code\": \"288490\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00172945\",\r\n" + 
				"				\"corp_name\": \"동일철강\",\r\n" + 
				"				\"stock_code\": \"023790\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00190321\",\r\n" + 
				"				\"corp_name\": \"케이티\",\r\n" + 
				"				\"stock_code\": \"030200\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00223762\",\r\n" + 
				"				\"corp_name\": \"지니뮤직\",\r\n" + 
				"				\"stock_code\": \"043610\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00225742\",\r\n" + 
				"				\"corp_name\": \"KT서브마린\",\r\n" + 
				"				\"stock_code\": \"060370\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00426068\",\r\n" + 
				"				\"corp_name\": \"아이에스이커머스\",\r\n" + 
				"				\"stock_code\": \"069920\",\r\n" + 
				"				\"modify_date\": \"20210722\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00753643\",\r\n" + 
				"				\"corp_name\": \"컨버즈\",\r\n" + 
				"				\"stock_code\": \"109070\",\r\n" + 
				"				\"modify_date\": \"20210723\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00614478\",\r\n" + 
				"				\"corp_name\": \"휴메딕스\",\r\n" + 
				"				\"stock_code\": \"200670\",\r\n" + 
				"				\"modify_date\": \"20210723\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00134176\",\r\n" + 
				"				\"corp_name\": \"세우글로벌\",\r\n" + 
				"				\"stock_code\": \"013000\",\r\n" + 
				"				\"modify_date\": \"20210723\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00197759\",\r\n" + 
				"				\"corp_name\": \"미래산업\",\r\n" + 
				"				\"stock_code\": \"025560\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00828761\",\r\n" + 
				"				\"corp_name\": \"레이\",\r\n" + 
				"				\"stock_code\": \"228670\",\r\n" + 
				"				\"modify_date\": \"20210719\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00756163\",\r\n" + 
				"				\"corp_name\": \"볼빅\",\r\n" + 
				"				\"stock_code\": \"206950\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00241236\",\r\n" + 
				"				\"corp_name\": \"씨엘인터내셔널\",\r\n" + 
				"				\"stock_code\": \"037340\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148595\",\r\n" + 
				"				\"corp_name\": \"제일테크노스\",\r\n" + 
				"				\"stock_code\": \"038010\",\r\n" + 
				"				\"modify_date\": \"20210528\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130684\",\r\n" + 
				"				\"corp_name\": \"서울도시가스\",\r\n" + 
				"				\"stock_code\": \"017390\",\r\n" + 
				"				\"modify_date\": \"20210528\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00814786\",\r\n" + 
				"				\"corp_name\": \"스카이이앤엠\",\r\n" + 
				"				\"stock_code\": \"131100\",\r\n" + 
				"				\"modify_date\": \"20210528\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260958\",\r\n" + 
				"				\"corp_name\": \"케이티알파\",\r\n" + 
				"				\"stock_code\": \"036030\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00495554\",\r\n" + 
				"				\"corp_name\": \"연이비앤티\",\r\n" + 
				"				\"stock_code\": \"090740\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00673976\",\r\n" + 
				"				\"corp_name\": \"지스마트글로벌\",\r\n" + 
				"				\"stock_code\": \"114570\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00674498\",\r\n" + 
				"				\"corp_name\": \"골프존뉴딘홀딩스\",\r\n" + 
				"				\"stock_code\": \"121440\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131328\",\r\n" + 
				"				\"corp_name\": \"서주산업개발\",\r\n" + 
				"				\"stock_code\": \"016140\",\r\n" + 
				"				\"modify_date\": \"20210604\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00942131\",\r\n" + 
				"				\"corp_name\": \"앤디포스\",\r\n" + 
				"				\"stock_code\": \"238090\",\r\n" + 
				"				\"modify_date\": \"20210614\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00786331\",\r\n" + 
				"				\"corp_name\": \"에스앤씨엔진그룹리미티드\",\r\n" + 
				"				\"stock_code\": \"900080\",\r\n" + 
				"				\"modify_date\": \"20210614\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00896753\",\r\n" + 
				"				\"corp_name\": \"스킨앤스킨\",\r\n" + 
				"				\"stock_code\": \"159910\",\r\n" + 
				"				\"modify_date\": \"20210723\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161462\",\r\n" + 
				"				\"corp_name\": \"에이티넘인베스트\",\r\n" + 
				"				\"stock_code\": \"021080\",\r\n" + 
				"				\"modify_date\": \"20210723\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00397058\",\r\n" + 
				"				\"corp_name\": \"엠게임\",\r\n" + 
				"				\"stock_code\": \"058630\",\r\n" + 
				"				\"modify_date\": \"20210531\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00522007\",\r\n" + 
				"				\"corp_name\": \"크리스에프앤씨\",\r\n" + 
				"				\"stock_code\": \"110790\",\r\n" + 
				"				\"modify_date\": \"20210531\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00560982\",\r\n" + 
				"				\"corp_name\": \"바이오솔루션\",\r\n" + 
				"				\"stock_code\": \"086820\",\r\n" + 
				"				\"modify_date\": \"20210531\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01186671\",\r\n" + 
				"				\"corp_name\": \"바이오시네틱스\",\r\n" + 
				"				\"stock_code\": \"281310\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00256715\",\r\n" + 
				"				\"corp_name\": \"국순당\",\r\n" + 
				"				\"stock_code\": \"043650\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148276\",\r\n" + 
				"				\"corp_name\": \"제일기획\",\r\n" + 
				"				\"stock_code\": \"030000\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126371\",\r\n" + 
				"				\"corp_name\": \"삼성전기\",\r\n" + 
				"				\"stock_code\": \"009150\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01109690\",\r\n" + 
				"				\"corp_name\": \"도부마스크\",\r\n" + 
				"				\"stock_code\": \"227420\",\r\n" + 
				"				\"modify_date\": \"20210625\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110750\",\r\n" + 
				"				\"corp_name\": \"리더스 기술투자\",\r\n" + 
				"				\"stock_code\": \"019570\",\r\n" + 
				"				\"modify_date\": \"20210628\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159218\",\r\n" + 
				"				\"corp_name\": \"한전KPS\",\r\n" + 
				"				\"stock_code\": \"051600\",\r\n" + 
				"				\"modify_date\": \"20210628\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00615723\",\r\n" + 
				"				\"corp_name\": \"폴라리스웍스\",\r\n" + 
				"				\"stock_code\": \"123010\",\r\n" + 
				"				\"modify_date\": \"20210705\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01105621\",\r\n" + 
				"				\"corp_name\": \"엔투텍\",\r\n" + 
				"				\"stock_code\": \"227950\",\r\n" + 
				"				\"modify_date\": \"20210614\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00479705\",\r\n" + 
				"				\"corp_name\": \"EMW\",\r\n" + 
				"				\"stock_code\": \"079190\",\r\n" + 
				"				\"modify_date\": \"20210615\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136341\",\r\n" + 
				"				\"corp_name\": \"신성통상\",\r\n" + 
				"				\"stock_code\": \"005390\",\r\n" + 
				"				\"modify_date\": \"20210615\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01022902\",\r\n" + 
				"				\"corp_name\": \"애드바이오텍\",\r\n" + 
				"				\"stock_code\": \"179530\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00426086\",\r\n" + 
				"				\"corp_name\": \"휴켐스\",\r\n" + 
				"				\"stock_code\": \"069260\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00632793\",\r\n" + 
				"				\"corp_name\": \"전진바이오팜\",\r\n" + 
				"				\"stock_code\": \"110020\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126201\",\r\n" + 
				"				\"corp_name\": \"삼성공조\",\r\n" + 
				"				\"stock_code\": \"006660\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00366137\",\r\n" + 
				"				\"corp_name\": \"KG ETS\",\r\n" + 
				"				\"stock_code\": \"151860\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01070149\",\r\n" + 
				"				\"corp_name\": \"올리패스\",\r\n" + 
				"				\"stock_code\": \"244460\",\r\n" + 
				"				\"modify_date\": \"20210719\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01437186\",\r\n" + 
				"				\"corp_name\": \"ESR켄달스퀘어리츠\",\r\n" + 
				"				\"stock_code\": \"365550\",\r\n" + 
				"				\"modify_date\": \"20210719\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00599285\",\r\n" + 
				"				\"corp_name\": \"서플러스글로벌\",\r\n" + 
				"				\"stock_code\": \"140070\",\r\n" + 
				"				\"modify_date\": \"20210719\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00660750\",\r\n" + 
				"				\"corp_name\": \"하나머티리얼즈\",\r\n" + 
				"				\"stock_code\": \"166090\",\r\n" + 
				"				\"modify_date\": \"20210719\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00888347\",\r\n" + 
				"				\"corp_name\": \"휴젤\",\r\n" + 
				"				\"stock_code\": \"145020\",\r\n" + 
				"				\"modify_date\": \"20210721\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148984\",\r\n" + 
				"				\"corp_name\": \"조선내화\",\r\n" + 
				"				\"stock_code\": \"000480\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00414850\",\r\n" + 
				"				\"corp_name\": \"효성 ITX\",\r\n" + 
				"				\"stock_code\": \"094280\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122737\",\r\n" + 
				"				\"corp_name\": \"팬오션\",\r\n" + 
				"				\"stock_code\": \"028670\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159005\",\r\n" + 
				"				\"corp_name\": \"생고뱅코리아홀딩스\",\r\n" + 
				"				\"stock_code\": \"002000\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120076\",\r\n" + 
				"				\"corp_name\": \"LX인터내셔널\",\r\n" + 
				"				\"stock_code\": \"001120\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00759513\",\r\n" + 
				"				\"corp_name\": \"LX하우시스\",\r\n" + 
				"				\"stock_code\": \"108670\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00150165\",\r\n" + 
				"				\"corp_name\": \"브이티지엠피\",\r\n" + 
				"				\"stock_code\": \"018290\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00985686\",\r\n" + 
				"				\"corp_name\": \"큐브엔터\",\r\n" + 
				"				\"stock_code\": \"182360\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00681249\",\r\n" + 
				"				\"corp_name\": \"씨유메디칼\",\r\n" + 
				"				\"stock_code\": \"115480\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146719\",\r\n" + 
				"				\"corp_name\": \"일화모직공업\",\r\n" + 
				"				\"stock_code\": \"001590\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01440481\",\r\n" + 
				"				\"corp_name\": \"IBKS제13호스팩\",\r\n" + 
				"				\"stock_code\": \"351340\",\r\n" + 
				"				\"modify_date\": \"20210603\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01263527\",\r\n" + 
				"				\"corp_name\": \"카이노스메드\",\r\n" + 
				"				\"stock_code\": \"284620\",\r\n" + 
				"				\"modify_date\": \"20210603\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110547\",\r\n" + 
				"				\"corp_name\": \"넥상스코리아\",\r\n" + 
				"				\"stock_code\": \"003050\",\r\n" + 
				"				\"modify_date\": \"20210603\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01428203\",\r\n" + 
				"				\"corp_name\": \"케이씨씨글라스\",\r\n" + 
				"				\"stock_code\": \"344820\",\r\n" + 
				"				\"modify_date\": \"20210603\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126937\",\r\n" + 
				"				\"corp_name\": \"삼양홀딩스\",\r\n" + 
				"				\"stock_code\": \"000070\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00170558\",\r\n" + 
				"				\"corp_name\": \"코웨이\",\r\n" + 
				"				\"stock_code\": \"021240\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00336817\",\r\n" + 
				"				\"corp_name\": \"에이치엘비제약\",\r\n" + 
				"				\"stock_code\": \"047920\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00402989\",\r\n" + 
				"				\"corp_name\": \"코스온\",\r\n" + 
				"				\"stock_code\": \"069110\",\r\n" + 
				"				\"modify_date\": \"20210624\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00141875\",\r\n" + 
				"				\"corp_name\": \"사조오양\",\r\n" + 
				"				\"stock_code\": \"006090\",\r\n" + 
				"				\"modify_date\": \"20210624\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01182550\",\r\n" + 
				"				\"corp_name\": \"EDGC\",\r\n" + 
				"				\"stock_code\": \"245620\",\r\n" + 
				"				\"modify_date\": \"20210625\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01267602\",\r\n" + 
				"				\"corp_name\": \"제이시스메디칼\",\r\n" + 
				"				\"stock_code\": \"287410\",\r\n" + 
				"				\"modify_date\": \"20210625\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158149\",\r\n" + 
				"				\"corp_name\": \"한국쉘석유\",\r\n" + 
				"				\"stock_code\": \"002960\",\r\n" + 
				"				\"modify_date\": \"20210604\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00235147\",\r\n" + 
				"				\"corp_name\": \"에이팸\",\r\n" + 
				"				\"stock_code\": \"073070\",\r\n" + 
				"				\"modify_date\": \"20210604\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01365384\",\r\n" + 
				"				\"corp_name\": \"이성씨엔아이\",\r\n" + 
				"				\"stock_code\": \"379390\",\r\n" + 
				"				\"modify_date\": \"20210604\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00563545\",\r\n" + 
				"				\"corp_name\": \"테스나\",\r\n" + 
				"				\"stock_code\": \"131970\",\r\n" + 
				"				\"modify_date\": \"20210507\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164636\",\r\n" + 
				"				\"corp_name\": \"HDC\",\r\n" + 
				"				\"stock_code\": \"012630\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00357935\",\r\n" + 
				"				\"corp_name\": \"HDC현대EP\",\r\n" + 
				"				\"stock_code\": \"089470\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01060744\",\r\n" + 
				"				\"corp_name\": \"한솔제지\",\r\n" + 
				"				\"stock_code\": \"213500\",\r\n" + 
				"				\"modify_date\": \"20210506\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00267979\",\r\n" + 
				"				\"corp_name\": \"한일화학\",\r\n" + 
				"				\"stock_code\": \"007770\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00406392\",\r\n" + 
				"				\"corp_name\": \"엔에스쇼핑\",\r\n" + 
				"				\"stock_code\": \"138250\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00317210\",\r\n" + 
				"				\"corp_name\": \"성호전자\",\r\n" + 
				"				\"stock_code\": \"043260\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00359261\",\r\n" + 
				"				\"corp_name\": \"빛샘전자\",\r\n" + 
				"				\"stock_code\": \"072950\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00405719\",\r\n" + 
				"				\"corp_name\": \"아이크래프트\",\r\n" + 
				"				\"stock_code\": \"052460\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01003040\",\r\n" + 
				"				\"corp_name\": \"케이사인\",\r\n" + 
				"				\"stock_code\": \"192250\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00923899\",\r\n" + 
				"				\"corp_name\": \"스타모빌리티\",\r\n" + 
				"				\"stock_code\": \"158310\",\r\n" + 
				"				\"modify_date\": \"20210429\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00103015\",\r\n" + 
				"				\"corp_name\": \"고려제약\",\r\n" + 
				"				\"stock_code\": \"014570\",\r\n" + 
				"				\"modify_date\": \"20210610\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00552992\",\r\n" + 
				"				\"corp_name\": \"진매트릭스\",\r\n" + 
				"				\"stock_code\": \"109820\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00871833\",\r\n" + 
				"				\"corp_name\": \"에스티팜\",\r\n" + 
				"				\"stock_code\": \"237690\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01018802\",\r\n" + 
				"				\"corp_name\": \"엔솔바이오사이언스\",\r\n" + 
				"				\"stock_code\": \"140610\",\r\n" + 
				"				\"modify_date\": \"20210611\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106368\",\r\n" + 
				"				\"corp_name\": \"금호석유화학\",\r\n" + 
				"				\"stock_code\": \"011780\",\r\n" + 
				"				\"modify_date\": \"20210616\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01409022\",\r\n" + 
				"				\"corp_name\": \"에이디엠코리아\",\r\n" + 
				"				\"stock_code\": \"187660\",\r\n" + 
				"				\"modify_date\": \"20210616\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173069\",\r\n" + 
				"				\"corp_name\": \"아진카인텍\",\r\n" + 
				"				\"stock_code\": \"011400\",\r\n" + 
				"				\"modify_date\": \"20210616\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113544\",\r\n" + 
				"				\"corp_name\": \"대한화섬\",\r\n" + 
				"				\"stock_code\": \"003830\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133663\",\r\n" + 
				"				\"corp_name\": \"세동\",\r\n" + 
				"				\"stock_code\": \"053060\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111111\",\r\n" + 
				"				\"corp_name\": \"대양금속\",\r\n" + 
				"				\"stock_code\": \"009190\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00815767\",\r\n" + 
				"				\"corp_name\": \"선데이토즈\",\r\n" + 
				"				\"stock_code\": \"123420\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00403766\",\r\n" + 
				"				\"corp_name\": \"피피아이\",\r\n" + 
				"				\"stock_code\": \"062970\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00245694\",\r\n" + 
				"				\"corp_name\": \"남화산업\",\r\n" + 
				"				\"stock_code\": \"111710\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00444329\",\r\n" + 
				"				\"corp_name\": \"위메이드\",\r\n" + 
				"				\"stock_code\": \"112040\",\r\n" + 
				"				\"modify_date\": \"20210507\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00369569\",\r\n" + 
				"				\"corp_name\": \"휘닉스소재\",\r\n" + 
				"				\"stock_code\": \"050090\",\r\n" + 
				"				\"modify_date\": \"20210520\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00157104\",\r\n" + 
				"				\"corp_name\": \"대동전자\",\r\n" + 
				"				\"stock_code\": \"008110\",\r\n" + 
				"				\"modify_date\": \"20210520\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540605\",\r\n" + 
				"				\"corp_name\": \"이월드\",\r\n" + 
				"				\"stock_code\": \"084680\",\r\n" + 
				"				\"modify_date\": \"20210520\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00624518\",\r\n" + 
				"				\"corp_name\": \"솔루에타\",\r\n" + 
				"				\"stock_code\": \"154040\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00583424\",\r\n" + 
				"				\"corp_name\": \"아모레퍼시픽\",\r\n" + 
				"				\"stock_code\": \"090430\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00154462\",\r\n" + 
				"				\"corp_name\": \"아모레퍼시픽그룹\",\r\n" + 
				"				\"stock_code\": \"002790\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161125\",\r\n" + 
				"				\"corp_name\": \"한온시스템\",\r\n" + 
				"				\"stock_code\": \"018880\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144252\",\r\n" + 
				"				\"corp_name\": \"유니온\",\r\n" + 
				"				\"stock_code\": \"000910\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00372226\",\r\n" + 
				"				\"corp_name\": \"티에스이\",\r\n" + 
				"				\"stock_code\": \"131290\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00793155\",\r\n" + 
				"				\"corp_name\": \"핸디소프트\",\r\n" + 
				"				\"stock_code\": \"220180\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00347062\",\r\n" + 
				"				\"corp_name\": \"현대바이오랜드\",\r\n" + 
				"				\"stock_code\": \"052260\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00344287\",\r\n" + 
				"				\"corp_name\": \"두산인프라코어\",\r\n" + 
				"				\"stock_code\": \"042670\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00188089\",\r\n" + 
				"				\"corp_name\": \"한섬\",\r\n" + 
				"				\"stock_code\": \"020000\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00957568\",\r\n" + 
				"				\"corp_name\": \"에스엘바이오닉스\",\r\n" + 
				"				\"stock_code\": \"214310\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145880\",\r\n" + 
				"				\"corp_name\": \"현대제철\",\r\n" + 
				"				\"stock_code\": \"004020\",\r\n" + 
				"				\"modify_date\": \"20210507\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124027\",\r\n" + 
				"				\"corp_name\": \"부산산업\",\r\n" + 
				"				\"stock_code\": \"011390\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01153293\",\r\n" + 
				"				\"corp_name\": \"제이엘케이\",\r\n" + 
				"				\"stock_code\": \"322510\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159209\",\r\n" + 
				"				\"corp_name\": \"한전기술\",\r\n" + 
				"				\"stock_code\": \"052690\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01526949\",\r\n" + 
				"				\"corp_name\": \"하이제6호스팩\",\r\n" + 
				"				\"stock_code\": \"377400\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121507\",\r\n" + 
				"				\"corp_name\": \"무림SP\",\r\n" + 
				"				\"stock_code\": \"001810\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00128607\",\r\n" + 
				"				\"corp_name\": \"삼천리자전거\",\r\n" + 
				"				\"stock_code\": \"024950\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00369833\",\r\n" + 
				"				\"corp_name\": \"유니온머티리얼\",\r\n" + 
				"				\"stock_code\": \"047400\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117601\",\r\n" + 
				"				\"corp_name\": \"유안타증권\",\r\n" + 
				"				\"stock_code\": \"003470\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00356361\",\r\n" + 
				"				\"corp_name\": \"LG화학\",\r\n" + 
				"				\"stock_code\": \"051910\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364403\",\r\n" + 
				"				\"corp_name\": \"쏠리드\",\r\n" + 
				"				\"stock_code\": \"050890\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00653024\",\r\n" + 
				"				\"corp_name\": \"진에어\",\r\n" + 
				"				\"stock_code\": \"272450\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00403632\",\r\n" + 
				"				\"corp_name\": \"현대퓨처넷\",\r\n" + 
				"				\"stock_code\": \"126560\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00153621\",\r\n" + 
				"				\"corp_name\": \"참엔지니어링\",\r\n" + 
				"				\"stock_code\": \"009310\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125725\",\r\n" + 
				"				\"corp_name\": \"인피니티엔티\",\r\n" + 
				"				\"stock_code\": \"016670\",\r\n" + 
				"				\"modify_date\": \"20210520\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00205687\",\r\n" + 
				"				\"corp_name\": \"휴먼엔\",\r\n" + 
				"				\"stock_code\": \"032860\",\r\n" + 
				"				\"modify_date\": \"20210525\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01391033\",\r\n" + 
				"				\"corp_name\": \"NH프라임리츠\",\r\n" + 
				"				\"stock_code\": \"338100\",\r\n" + 
				"				\"modify_date\": \"20210525\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00204642\",\r\n" + 
				"				\"corp_name\": \"티비씨\",\r\n" + 
				"				\"stock_code\": \"033830\",\r\n" + 
				"				\"modify_date\": \"20210525\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107598\",\r\n" + 
				"				\"corp_name\": \"남양유업\",\r\n" + 
				"				\"stock_code\": \"003920\",\r\n" + 
				"				\"modify_date\": \"20210525\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165583\",\r\n" + 
				"				\"corp_name\": \"E1\",\r\n" + 
				"				\"stock_code\": \"017940\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00525642\",\r\n" + 
				"				\"corp_name\": \"코오롱생명과학\",\r\n" + 
				"				\"stock_code\": \"102940\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00728638\",\r\n" + 
				"				\"corp_name\": \"한세실업\",\r\n" + 
				"				\"stock_code\": \"105630\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161976\",\r\n" + 
				"				\"corp_name\": \"한세예스24홀딩스\",\r\n" + 
				"				\"stock_code\": \"016450\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126566\",\r\n" + 
				"				\"corp_name\": \"한화에어로스페이스\",\r\n" + 
				"				\"stock_code\": \"012450\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00811372\",\r\n" + 
				"				\"corp_name\": \"노바렉스\",\r\n" + 
				"				\"stock_code\": \"194700\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164478\",\r\n" + 
				"				\"corp_name\": \"현대건설\",\r\n" + 
				"				\"stock_code\": \"000720\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127255\",\r\n" + 
				"				\"corp_name\": \"삼영화학공업\",\r\n" + 
				"				\"stock_code\": \"003720\",\r\n" + 
				"				\"modify_date\": \"20210506\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268011\",\r\n" + 
				"				\"corp_name\": \"일레덱스홀딩스\",\r\n" + 
				"				\"stock_code\": \"033550\",\r\n" + 
				"				\"modify_date\": \"20210506\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01096341\",\r\n" + 
				"				\"corp_name\": \"넷게임즈\",\r\n" + 
				"				\"stock_code\": \"225570\",\r\n" + 
				"				\"modify_date\": \"20210507\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00397289\",\r\n" + 
				"				\"corp_name\": \"오텍\",\r\n" + 
				"				\"stock_code\": \"067170\",\r\n" + 
				"				\"modify_date\": \"20210507\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173740\",\r\n" + 
				"				\"corp_name\": \"신한\",\r\n" + 
				"				\"stock_code\": \"005450\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00422284\",\r\n" + 
				"				\"corp_name\": \"메가스터디\",\r\n" + 
				"				\"stock_code\": \"072870\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00632845\",\r\n" + 
				"				\"corp_name\": \"노랑풍선\",\r\n" + 
				"				\"stock_code\": \"104620\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00992871\",\r\n" + 
				"				\"corp_name\": \"종근당\",\r\n" + 
				"				\"stock_code\": \"185750\",\r\n" + 
				"				\"modify_date\": \"20210525\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00124540\",\r\n" + 
				"				\"corp_name\": \"대우건설\",\r\n" + 
				"				\"stock_code\": \"047040\",\r\n" + 
				"				\"modify_date\": \"20210608\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00397252\",\r\n" + 
				"				\"corp_name\": \"조이시티\",\r\n" + 
				"				\"stock_code\": \"067000\",\r\n" + 
				"				\"modify_date\": \"20210531\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00480455\",\r\n" + 
				"				\"corp_name\": \"STX엔진\",\r\n" + 
				"				\"stock_code\": \"077970\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00544577\",\r\n" + 
				"				\"corp_name\": \"에이피티씨\",\r\n" + 
				"				\"stock_code\": \"089970\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01032486\",\r\n" + 
				"				\"corp_name\": \"두산밥캣\",\r\n" + 
				"				\"stock_code\": \"241560\",\r\n" + 
				"				\"modify_date\": \"20210608\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01310773\",\r\n" + 
				"				\"corp_name\": \"엔시스\",\r\n" + 
				"				\"stock_code\": \"333620\",\r\n" + 
				"				\"modify_date\": \"20210531\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112907\",\r\n" + 
				"				\"corp_name\": \"코원에너지서비스\",\r\n" + 
				"				\"stock_code\": \"026870\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00253985\",\r\n" + 
				"				\"corp_name\": \"국보디자인\",\r\n" + 
				"				\"stock_code\": \"066620\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00606770\",\r\n" + 
				"				\"corp_name\": \"참좋은여행\",\r\n" + 
				"				\"stock_code\": \"094850\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165361\",\r\n" + 
				"				\"corp_name\": \"휴코드홀딩스\",\r\n" + 
				"				\"stock_code\": \"036840\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01068737\",\r\n" + 
				"				\"corp_name\": \"에이치피오\",\r\n" + 
				"				\"stock_code\": \"357230\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112970\",\r\n" + 
				"				\"corp_name\": \"대한방직\",\r\n" + 
				"				\"stock_code\": \"001070\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00101549\",\r\n" + 
				"				\"corp_name\": \"경동제약\",\r\n" + 
				"				\"stock_code\": \"011040\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122579\",\r\n" + 
				"				\"corp_name\": \"BYC\",\r\n" + 
				"				\"stock_code\": \"001460\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166272\",\r\n" + 
				"				\"corp_name\": \"화승코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"013520\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138747\",\r\n" + 
				"				\"corp_name\": \"아세아텍\",\r\n" + 
				"				\"stock_code\": \"050860\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00172185\",\r\n" + 
				"				\"corp_name\": \"남성\",\r\n" + 
				"				\"stock_code\": \"004270\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00476498\",\r\n" + 
				"				\"corp_name\": \"컴투스\",\r\n" + 
				"				\"stock_code\": \"078340\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01032404\",\r\n" + 
				"				\"corp_name\": \"콜마비앤에이치\",\r\n" + 
				"				\"stock_code\": \"200130\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00181712\",\r\n" + 
				"				\"corp_name\": \"SK\",\r\n" + 
				"				\"stock_code\": \"034730\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00886792\",\r\n" + 
				"				\"corp_name\": \"루켄테크놀러지스\",\r\n" + 
				"				\"stock_code\": \"162120\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00406329\",\r\n" + 
				"				\"corp_name\": \"루멘스\",\r\n" + 
				"				\"stock_code\": \"038060\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00550082\",\r\n" + 
				"				\"corp_name\": \"빅텐츠\",\r\n" + 
				"				\"stock_code\": \"210120\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00200910\",\r\n" + 
				"				\"corp_name\": \"아이즈비전\",\r\n" + 
				"				\"stock_code\": \"031310\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160588\",\r\n" + 
				"				\"corp_name\": \"한화\",\r\n" + 
				"				\"stock_code\": \"000880\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00556907\",\r\n" + 
				"				\"corp_name\": \"에이스테크\",\r\n" + 
				"				\"stock_code\": \"088800\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00169048\",\r\n" + 
				"				\"corp_name\": \"넥스트사이언스\",\r\n" + 
				"				\"stock_code\": \"003580\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00306162\",\r\n" + 
				"				\"corp_name\": \"상상인\",\r\n" + 
				"				\"stock_code\": \"038540\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102760\",\r\n" + 
				"				\"corp_name\": \"두산건설\",\r\n" + 
				"				\"stock_code\": \"011160\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01128622\",\r\n" + 
				"				\"corp_name\": \"줌인터넷\",\r\n" + 
				"				\"stock_code\": \"239340\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00481454\",\r\n" + 
				"				\"corp_name\": \"금호타이어\",\r\n" + 
				"				\"stock_code\": \"073240\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126487\",\r\n" + 
				"				\"corp_name\": \"F&F 홀딩스\",\r\n" + 
				"				\"stock_code\": \"007700\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00180865\",\r\n" + 
				"				\"corp_name\": \"엔에스엔\",\r\n" + 
				"				\"stock_code\": \"031860\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01568413\",\r\n" + 
				"				\"corp_name\": \"F&F\",\r\n" + 
				"				\"stock_code\": \"383220\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01368637\",\r\n" + 
				"				\"corp_name\": \"유일에너테크\",\r\n" + 
				"				\"stock_code\": \"340930\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231691\",\r\n" + 
				"				\"corp_name\": \"판타지오\",\r\n" + 
				"				\"stock_code\": \"032800\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160418\",\r\n" + 
				"				\"corp_name\": \"한국프랜지공업\",\r\n" + 
				"				\"stock_code\": \"010100\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01430475\",\r\n" + 
				"				\"corp_name\": \"코람코에너지리츠\",\r\n" + 
				"				\"stock_code\": \"357120\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00540863\",\r\n" + 
				"				\"corp_name\": \"GST\",\r\n" + 
				"				\"stock_code\": \"083450\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01535257\",\r\n" + 
				"				\"corp_name\": \"엔에이치스팩19호\",\r\n" + 
				"				\"stock_code\": \"380440\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01528530\",\r\n" + 
				"				\"corp_name\": \"삼성스팩4호\",\r\n" + 
				"				\"stock_code\": \"377630\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00405506\",\r\n" + 
				"				\"corp_name\": \"삼영에스앤씨\",\r\n" + 
				"				\"stock_code\": \"361670\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146560\",\r\n" + 
				"				\"corp_name\": \"일지테크\",\r\n" + 
				"				\"stock_code\": \"019540\",\r\n" + 
				"				\"modify_date\": \"20210531\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155212\",\r\n" + 
				"				\"corp_name\": \"포스코 ICT\",\r\n" + 
				"				\"stock_code\": \"022100\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01012987\",\r\n" + 
				"				\"corp_name\": \"아모센스\",\r\n" + 
				"				\"stock_code\": \"357580\",\r\n" + 
				"				\"modify_date\": \"20210714\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151863\",\r\n" + 
				"				\"corp_name\": \"센트럴인사이트\",\r\n" + 
				"				\"stock_code\": \"012600\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00215976\",\r\n" + 
				"				\"corp_name\": \"UCI\",\r\n" + 
				"				\"stock_code\": \"038340\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00346911\",\r\n" + 
				"				\"corp_name\": \"아이톡시\",\r\n" + 
				"				\"stock_code\": \"052770\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00919966\",\r\n" + 
				"				\"corp_name\": \"신라젠\",\r\n" + 
				"				\"stock_code\": \"215600\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260611\",\r\n" + 
				"				\"corp_name\": \"크로바하이텍\",\r\n" + 
				"				\"stock_code\": \"043590\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00619640\",\r\n" + 
				"				\"corp_name\": \"이엔드디\",\r\n" + 
				"				\"stock_code\": \"101360\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255619\",\r\n" + 
				"				\"corp_name\": \"강원랜드\",\r\n" + 
				"				\"stock_code\": \"035250\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01165155\",\r\n" + 
				"				\"corp_name\": \"모비스\",\r\n" + 
				"				\"stock_code\": \"250060\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264255\",\r\n" + 
				"				\"corp_name\": \"바텍\",\r\n" + 
				"				\"stock_code\": \"043150\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00899459\",\r\n" + 
				"				\"corp_name\": \"레이언스\",\r\n" + 
				"				\"stock_code\": \"228850\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01226410\",\r\n" + 
				"				\"corp_name\": \"씨앤씨인터내셔널\",\r\n" + 
				"				\"stock_code\": \"352480\",\r\n" + 
				"				\"modify_date\": \"20210622\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00339391\",\r\n" + 
				"				\"corp_name\": \"한화시스템\",\r\n" + 
				"				\"stock_code\": \"272210\",\r\n" + 
				"				\"modify_date\": \"20210616\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367482\",\r\n" + 
				"				\"corp_name\": \"라이트론\",\r\n" + 
				"				\"stock_code\": \"069540\",\r\n" + 
				"				\"modify_date\": \"20210630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00367385\",\r\n" + 
				"				\"corp_name\": \"효성오앤비\",\r\n" + 
				"				\"stock_code\": \"097870\",\r\n" + 
				"				\"modify_date\": \"20210707\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01562589\",\r\n" + 
				"				\"corp_name\": \"LX홀딩스\",\r\n" + 
				"				\"stock_code\": \"383800\",\r\n" + 
				"				\"modify_date\": \"20210708\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00612115\",\r\n" + 
				"				\"corp_name\": \"유디피\",\r\n" + 
				"				\"stock_code\": \"091270\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00480367\",\r\n" + 
				"				\"corp_name\": \"삼강엠앤티\",\r\n" + 
				"				\"stock_code\": \"100090\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00828497\",\r\n" + 
				"				\"corp_name\": \"한미약품\",\r\n" + 
				"				\"stock_code\": \"128940\",\r\n" + 
				"				\"modify_date\": \"20210630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00161426\",\r\n" + 
				"				\"corp_name\": \"한미사이언스\",\r\n" + 
				"				\"stock_code\": \"008930\",\r\n" + 
				"				\"modify_date\": \"20210630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01199727\",\r\n" + 
				"				\"corp_name\": \"샘씨엔에스\",\r\n" + 
				"				\"stock_code\": \"252990\",\r\n" + 
				"				\"modify_date\": \"20210722\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01532603\",\r\n" + 
				"				\"corp_name\": \"화승알앤에이\",\r\n" + 
				"				\"stock_code\": \"378850\",\r\n" + 
				"				\"modify_date\": \"20210429\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00169215\",\r\n" + 
				"				\"corp_name\": \"에너토크\",\r\n" + 
				"				\"stock_code\": \"019990\",\r\n" + 
				"				\"modify_date\": \"20210429\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00523936\",\r\n" + 
				"				\"corp_name\": \"HB솔루션\",\r\n" + 
				"				\"stock_code\": \"297890\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00525934\",\r\n" + 
				"				\"corp_name\": \"LX세미콘\",\r\n" + 
				"				\"stock_code\": \"108320\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01144028\",\r\n" + 
				"				\"corp_name\": \"씨티케이\",\r\n" + 
				"				\"stock_code\": \"260930\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00297961\",\r\n" + 
				"				\"corp_name\": \"케이맥\",\r\n" + 
				"				\"stock_code\": \"043290\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01397772\",\r\n" + 
				"				\"corp_name\": \"큐라클\",\r\n" + 
				"				\"stock_code\": \"365270\",\r\n" + 
				"				\"modify_date\": \"20210722\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01137897\",\r\n" + 
				"				\"corp_name\": \"에스지에이클라우드서비스\",\r\n" + 
				"				\"stock_code\": \"224880\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00372688\",\r\n" + 
				"				\"corp_name\": \"티사이언티픽\",\r\n" + 
				"				\"stock_code\": \"057680\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260930\",\r\n" + 
				"				\"corp_name\": \"에스엠\",\r\n" + 
				"				\"stock_code\": \"041510\",\r\n" + 
				"				\"modify_date\": \"20210708\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00347716\",\r\n" + 
				"				\"corp_name\": \"중앙디앤엠\",\r\n" + 
				"				\"stock_code\": \"051980\",\r\n" + 
				"				\"modify_date\": \"20210708\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00390860\",\r\n" + 
				"				\"corp_name\": \"엠피대산\",\r\n" + 
				"				\"stock_code\": \"065150\",\r\n" + 
				"				\"modify_date\": \"20210708\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01326260\",\r\n" + 
				"				\"corp_name\": \"하나머스트제6호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"307160\",\r\n" + 
				"				\"modify_date\": \"20210708\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00673301\",\r\n" + 
				"				\"corp_name\": \"전우정밀\",\r\n" + 
				"				\"stock_code\": \"120780\",\r\n" + 
				"				\"modify_date\": \"20210506\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00274933\",\r\n" + 
				"				\"corp_name\": \"신세계푸드\",\r\n" + 
				"				\"stock_code\": \"031440\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00206659\",\r\n" + 
				"				\"corp_name\": \"이랜텍\",\r\n" + 
				"				\"stock_code\": \"054210\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01187865\",\r\n" + 
				"				\"corp_name\": \"앙츠\",\r\n" + 
				"				\"stock_code\": \"267810\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00993931\",\r\n" + 
				"				\"corp_name\": \"동양파일\",\r\n" + 
				"				\"stock_code\": \"228340\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00201733\",\r\n" + 
				"				\"corp_name\": \"TJ미디어\",\r\n" + 
				"				\"stock_code\": \"032540\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00346610\",\r\n" + 
				"				\"corp_name\": \"유앤아이\",\r\n" + 
				"				\"stock_code\": \"056090\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00626464\",\r\n" + 
				"				\"corp_name\": \"지엔씨에너지\",\r\n" + 
				"				\"stock_code\": \"119850\",\r\n" + 
				"				\"modify_date\": \"20210723\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00809429\",\r\n" + 
				"				\"corp_name\": \"한일진공\",\r\n" + 
				"				\"stock_code\": \"123840\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00176914\",\r\n" + 
				"				\"corp_name\": \"다우기술\",\r\n" + 
				"				\"stock_code\": \"023590\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00238782\",\r\n" + 
				"				\"corp_name\": \"다우데이타\",\r\n" + 
				"				\"stock_code\": \"032190\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01016886\",\r\n" + 
				"				\"corp_name\": \"테크엔\",\r\n" + 
				"				\"stock_code\": \"308700\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01042085\",\r\n" + 
				"				\"corp_name\": \"엑셈\",\r\n" + 
				"				\"stock_code\": \"205100\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118008\",\r\n" + 
				"				\"corp_name\": \"동원금속\",\r\n" + 
				"				\"stock_code\": \"018500\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00353610\",\r\n" + 
				"				\"corp_name\": \"이니텍\",\r\n" + 
				"				\"stock_code\": \"053350\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158909\",\r\n" + 
				"				\"corp_name\": \"하나은행\",\r\n" + 
				"				\"stock_code\": \"004940\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00350020\",\r\n" + 
				"				\"corp_name\": \"파인디앤씨\",\r\n" + 
				"				\"stock_code\": \"049120\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152039\",\r\n" + 
				"				\"corp_name\": \"SG글로벌\",\r\n" + 
				"				\"stock_code\": \"001380\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00663289\",\r\n" + 
				"				\"corp_name\": \"위월드\",\r\n" + 
				"				\"stock_code\": \"140660\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00187770\",\r\n" + 
				"				\"corp_name\": \"한국파마\",\r\n" + 
				"				\"stock_code\": \"032300\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117179\",\r\n" + 
				"				\"corp_name\": \"디와이\",\r\n" + 
				"				\"stock_code\": \"013570\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00127909\",\r\n" + 
				"				\"corp_name\": \"삼일\",\r\n" + 
				"				\"stock_code\": \"032280\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00109310\",\r\n" + 
				"				\"corp_name\": \"대동기어\",\r\n" + 
				"				\"stock_code\": \"008830\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00217743\",\r\n" + 
				"				\"corp_name\": \"화성밸브\",\r\n" + 
				"				\"stock_code\": \"039610\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00957735\",\r\n" + 
				"				\"corp_name\": \"클리오\",\r\n" + 
				"				\"stock_code\": \"237880\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125080\",\r\n" + 
				"				\"corp_name\": \"AK홀딩스\",\r\n" + 
				"				\"stock_code\": \"006840\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148939\",\r\n" + 
				"				\"corp_name\": \"조광피혁\",\r\n" + 
				"				\"stock_code\": \"004700\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00216434\",\r\n" + 
				"				\"corp_name\": \"체리부로\",\r\n" + 
				"				\"stock_code\": \"066360\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00555874\",\r\n" + 
				"				\"corp_name\": \"제주항공\",\r\n" + 
				"				\"stock_code\": \"089590\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138303\",\r\n" + 
				"				\"corp_name\": \"쌍용정보통신\",\r\n" + 
				"				\"stock_code\": \"010280\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00520610\",\r\n" + 
				"				\"corp_name\": \"씨큐브\",\r\n" + 
				"				\"stock_code\": \"101240\",\r\n" + 
				"				\"modify_date\": \"20210430\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148610\",\r\n" + 
				"				\"corp_name\": \"한화투자증권\",\r\n" + 
				"				\"stock_code\": \"003530\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110893\",\r\n" + 
				"				\"corp_name\": \"대신증권\",\r\n" + 
				"				\"stock_code\": \"003540\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121154\",\r\n" + 
				"				\"corp_name\": \"엠에스씨\",\r\n" + 
				"				\"stock_code\": \"009780\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01318933\",\r\n" + 
				"				\"corp_name\": \"지니틱스\",\r\n" + 
				"				\"stock_code\": \"303030\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01505186\",\r\n" + 
				"				\"corp_name\": \"엔에이치스팩18호\",\r\n" + 
				"				\"stock_code\": \"365590\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00188715\",\r\n" + 
				"				\"corp_name\": \"현진소재\",\r\n" + 
				"				\"stock_code\": \"053660\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111227\",\r\n" + 
				"				\"corp_name\": \"대양제지\",\r\n" + 
				"				\"stock_code\": \"006580\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00410739\",\r\n" + 
				"				\"corp_name\": \"피에이치씨\",\r\n" + 
				"				\"stock_code\": \"057880\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00868705\",\r\n" + 
				"				\"corp_name\": \"윈스\",\r\n" + 
				"				\"stock_code\": \"136540\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00370200\",\r\n" + 
				"				\"corp_name\": \"와이오엠\",\r\n" + 
				"				\"stock_code\": \"066430\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00260657\",\r\n" + 
				"				\"corp_name\": \"오상헬스케어\",\r\n" + 
				"				\"stock_code\": \"036220\",\r\n" + 
				"				\"modify_date\": \"20210429\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01316236\",\r\n" + 
				"				\"corp_name\": \"효성화학\",\r\n" + 
				"				\"stock_code\": \"298000\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120571\",\r\n" + 
				"				\"corp_name\": \"롯데칠성음료\",\r\n" + 
				"				\"stock_code\": \"005300\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01137383\",\r\n" + 
				"				\"corp_name\": \"카카오게임즈\",\r\n" + 
				"				\"stock_code\": \"293490\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00258689\",\r\n" + 
				"				\"corp_name\": \"JYP Ent.\",\r\n" + 
				"				\"stock_code\": \"035900\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00571483\",\r\n" + 
				"				\"corp_name\": \"오이솔루션\",\r\n" + 
				"				\"stock_code\": \"138080\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164502\",\r\n" + 
				"				\"corp_name\": \"현대공업\",\r\n" + 
				"				\"stock_code\": \"170030\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111704\",\r\n" + 
				"				\"corp_name\": \"대우조선해양\",\r\n" + 
				"				\"stock_code\": \"042660\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116824\",\r\n" + 
				"				\"corp_name\": \"동아쏘시오홀딩스\",\r\n" + 
				"				\"stock_code\": \"000640\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00980043\",\r\n" + 
				"				\"corp_name\": \"비플라이소프트\",\r\n" + 
				"				\"stock_code\": \"148780\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135999\",\r\n" + 
				"				\"corp_name\": \"신라섬유\",\r\n" + 
				"				\"stock_code\": \"001000\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164779\",\r\n" + 
				"				\"corp_name\": \"SK하이닉스\",\r\n" + 
				"				\"stock_code\": \"000660\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00238199\",\r\n" + 
				"				\"corp_name\": \"로지시스\",\r\n" + 
				"				\"stock_code\": \"067730\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01316227\",\r\n" + 
				"				\"corp_name\": \"효성티앤씨\",\r\n" + 
				"				\"stock_code\": \"298020\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00787057\",\r\n" + 
				"				\"corp_name\": \"휴맥스\",\r\n" + 
				"				\"stock_code\": \"115160\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00219440\",\r\n" + 
				"				\"corp_name\": \"휴맥스홀딩스\",\r\n" + 
				"				\"stock_code\": \"028080\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00305668\",\r\n" + 
				"				\"corp_name\": \"새론오토모티브\",\r\n" + 
				"				\"stock_code\": \"075180\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00145862\",\r\n" + 
				"				\"corp_name\": \"인천도시가스\",\r\n" + 
				"				\"stock_code\": \"034590\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00252135\",\r\n" + 
				"				\"corp_name\": \"주성엔지니어링\",\r\n" + 
				"				\"stock_code\": \"036930\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00400857\",\r\n" + 
				"				\"corp_name\": \"에이블씨엔씨\",\r\n" + 
				"				\"stock_code\": \"078520\",\r\n" + 
				"				\"modify_date\": \"20210622\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00142713\",\r\n" + 
				"				\"corp_name\": \"형지I&C\",\r\n" + 
				"				\"stock_code\": \"011080\",\r\n" + 
				"				\"modify_date\": \"20210622\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00818472\",\r\n" + 
				"				\"corp_name\": \"이큐셀\",\r\n" + 
				"				\"stock_code\": \"160600\",\r\n" + 
				"				\"modify_date\": \"20210622\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118460\",\r\n" + 
				"				\"corp_name\": \"태림페이퍼\",\r\n" + 
				"				\"stock_code\": \"019300\",\r\n" + 
				"				\"modify_date\": \"20210622\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00627029\",\r\n" + 
				"				\"corp_name\": \"ITX-AI\",\r\n" + 
				"				\"stock_code\": \"099520\",\r\n" + 
				"				\"modify_date\": \"20210622\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00222532\",\r\n" + 
				"				\"corp_name\": \"LG헬로비전\",\r\n" + 
				"				\"stock_code\": \"037560\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120021\",\r\n" + 
				"				\"corp_name\": \"LG\",\r\n" + 
				"				\"stock_code\": \"003550\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00599151\",\r\n" + 
				"				\"corp_name\": \"SV인베스트먼트\",\r\n" + 
				"				\"stock_code\": \"289080\",\r\n" + 
				"				\"modify_date\": \"20210520\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00527011\",\r\n" + 
				"				\"corp_name\": \"엘비루셈\",\r\n" + 
				"				\"stock_code\": \"376190\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01343920\",\r\n" + 
				"				\"corp_name\": \"유안타제4호스팩\",\r\n" + 
				"				\"stock_code\": \"313750\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01566248\",\r\n" + 
				"				\"corp_name\": \"에코프로에이치엔\",\r\n" + 
				"				\"stock_code\": \"383310\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01089855\",\r\n" + 
				"				\"corp_name\": \"맘스터치\",\r\n" + 
				"				\"stock_code\": \"220630\",\r\n" + 
				"				\"modify_date\": \"20210707\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01169434\",\r\n" + 
				"				\"corp_name\": \"오가닉티코스메틱\",\r\n" + 
				"				\"stock_code\": \"900300\",\r\n" + 
				"				\"modify_date\": \"20210707\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00110583\",\r\n" + 
				"				\"corp_name\": \"대성엘텍\",\r\n" + 
				"				\"stock_code\": \"025440\",\r\n" + 
				"				\"modify_date\": \"20210707\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00140177\",\r\n" + 
				"				\"corp_name\": \"GS리테일\",\r\n" + 
				"				\"stock_code\": \"007070\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01061497\",\r\n" + 
				"				\"corp_name\": \"퓨쳐스트림네트웍스\",\r\n" + 
				"				\"stock_code\": \"214270\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00983040\",\r\n" + 
				"				\"corp_name\": \"한진칼\",\r\n" + 
				"				\"stock_code\": \"180640\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01204056\",\r\n" + 
				"				\"corp_name\": \"하이브\",\r\n" + 
				"				\"stock_code\": \"352820\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01418260\",\r\n" + 
				"				\"corp_name\": \"폭스소프트\",\r\n" + 
				"				\"stock_code\": \"354230\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01067516\",\r\n" + 
				"				\"corp_name\": \"골프존\",\r\n" + 
				"				\"stock_code\": \"215000\",\r\n" + 
				"				\"modify_date\": \"20210524\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00165413\",\r\n" + 
				"				\"corp_name\": \"롯데케미칼\",\r\n" + 
				"				\"stock_code\": \"011170\",\r\n" + 
				"				\"modify_date\": \"20210524\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118521\",\r\n" + 
				"				\"corp_name\": \"진원생명과학\",\r\n" + 
				"				\"stock_code\": \"011000\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00226228\",\r\n" + 
				"				\"corp_name\": \"한프\",\r\n" + 
				"				\"stock_code\": \"066110\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00298687\",\r\n" + 
				"				\"corp_name\": \"스포츠서울\",\r\n" + 
				"				\"stock_code\": \"039670\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00620558\",\r\n" + 
				"				\"corp_name\": \"에이비프로바이오\",\r\n" + 
				"				\"stock_code\": \"195990\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01396676\",\r\n" + 
				"				\"corp_name\": \"일승\",\r\n" + 
				"				\"stock_code\": \"333430\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00311270\",\r\n" + 
				"				\"corp_name\": \"원텍\",\r\n" + 
				"				\"stock_code\": \"216280\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163682\",\r\n" + 
				"				\"corp_name\": \"메리츠증권\",\r\n" + 
				"				\"stock_code\": \"008560\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00609485\",\r\n" + 
				"				\"corp_name\": \"웅진에너지\",\r\n" + 
				"				\"stock_code\": \"103130\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00151605\",\r\n" + 
				"				\"corp_name\": \"CBI\",\r\n" + 
				"				\"stock_code\": \"013720\",\r\n" + 
				"				\"modify_date\": \"20210712\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01264234\",\r\n" + 
				"				\"corp_name\": \"엘에이티\",\r\n" + 
				"				\"stock_code\": \"311060\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01117592\",\r\n" + 
				"				\"corp_name\": \"인터코스\",\r\n" + 
				"				\"stock_code\": \"240340\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00307897\",\r\n" + 
				"				\"corp_name\": \"신한카드\",\r\n" + 
				"				\"stock_code\": \"032710\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159342\",\r\n" + 
				"				\"corp_name\": \"한국정보통신\",\r\n" + 
				"				\"stock_code\": \"025770\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131939\",\r\n" + 
				"				\"corp_name\": \"선도전기\",\r\n" + 
				"				\"stock_code\": \"007610\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00406046\",\r\n" + 
				"				\"corp_name\": \"STX중공업\",\r\n" + 
				"				\"stock_code\": \"071970\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00660033\",\r\n" + 
				"				\"corp_name\": \"씨엔플러스\",\r\n" + 
				"				\"stock_code\": \"115530\",\r\n" + 
				"				\"modify_date\": \"20210616\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00249247\",\r\n" + 
				"				\"corp_name\": \"YG PLUS\",\r\n" + 
				"				\"stock_code\": \"037270\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01329957\",\r\n" + 
				"				\"corp_name\": \"국전약품\",\r\n" + 
				"				\"stock_code\": \"307750\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00613318\",\r\n" + 
				"				\"corp_name\": \"와이지엔터테인먼트\",\r\n" + 
				"				\"stock_code\": \"122870\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00454946\",\r\n" + 
				"				\"corp_name\": \"그린케미칼\",\r\n" + 
				"				\"stock_code\": \"083420\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00663669\",\r\n" + 
				"				\"corp_name\": \"폴라리스우노\",\r\n" + 
				"				\"stock_code\": \"114630\",\r\n" + 
				"				\"modify_date\": \"20210617\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01534522\",\r\n" + 
				"				\"corp_name\": \"삼성머스트스팩5호\",\r\n" + 
				"				\"stock_code\": \"380320\",\r\n" + 
				"				\"modify_date\": \"20210617\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00911229\",\r\n" + 
				"				\"corp_name\": \"라온테크\",\r\n" + 
				"				\"stock_code\": \"232680\",\r\n" + 
				"				\"modify_date\": \"20210617\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00689418\",\r\n" + 
				"				\"corp_name\": \"지유온\",\r\n" + 
				"				\"stock_code\": \"111820\",\r\n" + 
				"				\"modify_date\": \"20210629\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00135050\",\r\n" + 
				"				\"corp_name\": \"팜젠사이언스\",\r\n" + 
				"				\"stock_code\": \"004720\",\r\n" + 
				"				\"modify_date\": \"20210629\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00378363\",\r\n" + 
				"				\"corp_name\": \"3S\",\r\n" + 
				"				\"stock_code\": \"060310\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00830447\",\r\n" + 
				"				\"corp_name\": \"수프로\",\r\n" + 
				"				\"stock_code\": \"185190\",\r\n" + 
				"				\"modify_date\": \"20210521\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00453488\",\r\n" + 
				"				\"corp_name\": \"세화아이엠씨\",\r\n" + 
				"				\"stock_code\": \"145210\",\r\n" + 
				"				\"modify_date\": \"20210721\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00652423\",\r\n" + 
				"				\"corp_name\": \"인바이오젠\",\r\n" + 
				"				\"stock_code\": \"101140\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00228059\",\r\n" + 
				"				\"corp_name\": \"휴온스글로벌\",\r\n" + 
				"				\"stock_code\": \"084110\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00693554\",\r\n" + 
				"				\"corp_name\": \"티케이케미칼\",\r\n" + 
				"				\"stock_code\": \"104480\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00763358\",\r\n" + 
				"				\"corp_name\": \"쎄미시스코\",\r\n" + 
				"				\"stock_code\": \"136510\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00808068\",\r\n" + 
				"				\"corp_name\": \"에이씨티\",\r\n" + 
				"				\"stock_code\": \"138360\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01159853\",\r\n" + 
				"				\"corp_name\": \"휴온스\",\r\n" + 
				"				\"stock_code\": \"243070\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01182240\",\r\n" + 
				"				\"corp_name\": \"배럴\",\r\n" + 
				"				\"stock_code\": \"267790\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255433\",\r\n" + 
				"				\"corp_name\": \"라온시큐어\",\r\n" + 
				"				\"stock_code\": \"042510\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01148909\",\r\n" + 
				"				\"corp_name\": \"휴럼\",\r\n" + 
				"				\"stock_code\": \"284420\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104810\",\r\n" + 
				"				\"corp_name\": \"대명소노시즌\",\r\n" + 
				"				\"stock_code\": \"007720\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00695969\",\r\n" + 
				"				\"corp_name\": \"동운아나텍\",\r\n" + 
				"				\"stock_code\": \"094170\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00564562\",\r\n" + 
				"				\"corp_name\": \"엠씨넥스\",\r\n" + 
				"				\"stock_code\": \"097520\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00106614\",\r\n" + 
				"				\"corp_name\": \"기신정기\",\r\n" + 
				"				\"stock_code\": \"092440\",\r\n" + 
				"				\"modify_date\": \"20210527\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01181807\",\r\n" + 
				"				\"corp_name\": \"까스텔바작\",\r\n" + 
				"				\"stock_code\": \"308100\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00152385\",\r\n" + 
				"				\"corp_name\": \"에이프로젠 MED\",\r\n" + 
				"				\"stock_code\": \"007460\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00133858\",\r\n" + 
				"				\"corp_name\": \"세방전지\",\r\n" + 
				"				\"stock_code\": \"004490\",\r\n" + 
				"				\"modify_date\": \"20210524\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01407158\",\r\n" + 
				"				\"corp_name\": \"신한제6호스팩\",\r\n" + 
				"				\"stock_code\": \"333050\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01453670\",\r\n" + 
				"				\"corp_name\": \"휴럼\",\r\n" + 
				"				\"stock_code\": \"353190\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01409095\",\r\n" + 
				"				\"corp_name\": \"맥스트\",\r\n" + 
				"				\"stock_code\": \"377030\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00631518\",\r\n" + 
				"				\"corp_name\": \"SK이노베이션\",\r\n" + 
				"				\"stock_code\": \"096770\",\r\n" + 
				"				\"modify_date\": \"20210727\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244455\",\r\n" + 
				"				\"corp_name\": \"케이티앤지\",\r\n" + 
				"				\"stock_code\": \"033780\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104102\",\r\n" + 
				"				\"corp_name\": \"우리종금\",\r\n" + 
				"				\"stock_code\": \"010050\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137997\",\r\n" + 
				"				\"corp_name\": \"현대차증권\",\r\n" + 
				"				\"stock_code\": \"001500\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111722\",\r\n" + 
				"				\"corp_name\": \"미래에셋증권\",\r\n" + 
				"				\"stock_code\": \"006800\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00112332\",\r\n" + 
				"				\"corp_name\": \"미래에셋생명\",\r\n" + 
				"				\"stock_code\": \"085620\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120182\",\r\n" + 
				"				\"corp_name\": \"NH투자증권\",\r\n" + 
				"				\"stock_code\": \"005940\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00131054\",\r\n" + 
				"				\"corp_name\": \"유진증권\",\r\n" + 
				"				\"stock_code\": \"001200\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00113058\",\r\n" + 
				"				\"corp_name\": \"한화생명\",\r\n" + 
				"				\"stock_code\": \"088350\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01043853\",\r\n" + 
				"				\"corp_name\": \"베노홀딩스\",\r\n" + 
				"				\"stock_code\": \"206400\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00146542\",\r\n" + 
				"				\"corp_name\": \"일정실업\",\r\n" + 
				"				\"stock_code\": \"008500\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00435312\",\r\n" + 
				"				\"corp_name\": \"하이스틸\",\r\n" + 
				"				\"stock_code\": \"071090\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00977641\",\r\n" + 
				"				\"corp_name\": \"하이로닉\",\r\n" + 
				"				\"stock_code\": \"149980\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163196\",\r\n" + 
				"				\"corp_name\": \"한일철강\",\r\n" + 
				"				\"stock_code\": \"002220\",\r\n" + 
				"				\"modify_date\": \"20210706\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01264872\",\r\n" + 
				"				\"corp_name\": \"이노뎁\",\r\n" + 
				"				\"stock_code\": \"303530\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00301422\",\r\n" + 
				"				\"corp_name\": \"우수AMS\",\r\n" + 
				"				\"stock_code\": \"066590\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00307222\",\r\n" + 
				"				\"corp_name\": \"YBM넷\",\r\n" + 
				"				\"stock_code\": \"057030\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158316\",\r\n" + 
				"				\"corp_name\": \"NICE\",\r\n" + 
				"				\"stock_code\": \"034310\",\r\n" + 
				"				\"modify_date\": \"20210624\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00264945\",\r\n" + 
				"				\"corp_name\": \"나이스정보통신\",\r\n" + 
				"				\"stock_code\": \"036800\",\r\n" + 
				"				\"modify_date\": \"20210624\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00220057\",\r\n" + 
				"				\"corp_name\": \"유비케어\",\r\n" + 
				"				\"stock_code\": \"032620\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126308\",\r\n" + 
				"				\"corp_name\": \"삼성엔지니어링\",\r\n" + 
				"				\"stock_code\": \"028050\",\r\n" + 
				"				\"modify_date\": \"20210625\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00475718\",\r\n" + 
				"				\"corp_name\": \"이엠앤아이\",\r\n" + 
				"				\"stock_code\": \"083470\",\r\n" + 
				"				\"modify_date\": \"20210628\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00625942\",\r\n" + 
				"				\"corp_name\": \"아이원스\",\r\n" + 
				"				\"stock_code\": \"114810\",\r\n" + 
				"				\"modify_date\": \"20210701\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00923826\",\r\n" + 
				"				\"corp_name\": \"유테크\",\r\n" + 
				"				\"stock_code\": \"178780\",\r\n" + 
				"				\"modify_date\": \"20210525\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116949\",\r\n" + 
				"				\"corp_name\": \"디티알오토모티브\",\r\n" + 
				"				\"stock_code\": \"007340\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00163345\",\r\n" + 
				"				\"corp_name\": \"DB\",\r\n" + 
				"				\"stock_code\": \"012030\",\r\n" + 
				"				\"modify_date\": \"20210702\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00961570\",\r\n" + 
				"				\"corp_name\": \"신도기연\",\r\n" + 
				"				\"stock_code\": \"290520\",\r\n" + 
				"				\"modify_date\": \"20210705\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00118804\",\r\n" + 
				"				\"corp_name\": \"동진쎄미켐\",\r\n" + 
				"				\"stock_code\": \"005290\",\r\n" + 
				"				\"modify_date\": \"20210705\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00104519\",\r\n" + 
				"				\"corp_name\": \"국보\",\r\n" + 
				"				\"stock_code\": \"001140\",\r\n" + 
				"				\"modify_date\": \"20210429\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00532059\",\r\n" + 
				"				\"corp_name\": \"KPX생명과학\",\r\n" + 
				"				\"stock_code\": \"114450\",\r\n" + 
				"				\"modify_date\": \"20210526\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01437858\",\r\n" + 
				"				\"corp_name\": \"진시스템\",\r\n" + 
				"				\"stock_code\": \"363250\",\r\n" + 
				"				\"modify_date\": \"20210526\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114686\",\r\n" + 
				"				\"corp_name\": \"동구바이오제약\",\r\n" + 
				"				\"stock_code\": \"006620\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00119140\",\r\n" + 
				"				\"corp_name\": \"핸즈코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"143210\",\r\n" + 
				"				\"modify_date\": \"20210715\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00422895\",\r\n" + 
				"				\"corp_name\": \"세이브존I&C\",\r\n" + 
				"				\"stock_code\": \"067830\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00405959\",\r\n" + 
				"				\"corp_name\": \"스타플렉스\",\r\n" + 
				"				\"stock_code\": \"115570\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00684732\",\r\n" + 
				"				\"corp_name\": \"풀무원식품\",\r\n" + 
				"				\"stock_code\": \"103160\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00938721\",\r\n" + 
				"				\"corp_name\": \"필옵틱스\",\r\n" + 
				"				\"stock_code\": \"161580\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162780\",\r\n" + 
				"				\"corp_name\": \"한일건설\",\r\n" + 
				"				\"stock_code\": \"006440\",\r\n" + 
				"				\"modify_date\": \"20210722\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00255275\",\r\n" + 
				"				\"corp_name\": \"HB테크놀러지\",\r\n" + 
				"				\"stock_code\": \"078150\",\r\n" + 
				"				\"modify_date\": \"20210722\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00829380\",\r\n" + 
				"				\"corp_name\": \"피제이메탈\",\r\n" + 
				"				\"stock_code\": \"128660\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149354\",\r\n" + 
				"				\"corp_name\": \"종근당홀딩스\",\r\n" + 
				"				\"stock_code\": \"001630\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00390055\",\r\n" + 
				"				\"corp_name\": \"종근당바이오\",\r\n" + 
				"				\"stock_code\": \"063160\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01032413\",\r\n" + 
				"				\"corp_name\": \"해성디에스\",\r\n" + 
				"				\"stock_code\": \"195870\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351579\",\r\n" + 
				"				\"corp_name\": \"SGA\",\r\n" + 
				"				\"stock_code\": \"049470\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00177816\",\r\n" + 
				"				\"corp_name\": \"대주전자재료\",\r\n" + 
				"				\"stock_code\": \"078600\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00303396\",\r\n" + 
				"				\"corp_name\": \"한국컴퓨터\",\r\n" + 
				"				\"stock_code\": \"054040\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116426\",\r\n" + 
				"				\"corp_name\": \"코센\",\r\n" + 
				"				\"stock_code\": \"009730\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00147860\",\r\n" + 
				"				\"corp_name\": \"지코\",\r\n" + 
				"				\"stock_code\": \"010580\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00156150\",\r\n" + 
				"				\"corp_name\": \"하이트론씨스템즈\",\r\n" + 
				"				\"stock_code\": \"019490\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00207755\",\r\n" + 
				"				\"corp_name\": \"지에스홈쇼핑\",\r\n" + 
				"				\"stock_code\": \"028150\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00854997\",\r\n" + 
				"				\"corp_name\": \"에스디바이오센서\",\r\n" + 
				"				\"stock_code\": \"137310\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164362\",\r\n" + 
				"				\"corp_name\": \"행남사\",\r\n" + 
				"				\"stock_code\": \"008800\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00626011\",\r\n" + 
				"				\"corp_name\": \"아이텍\",\r\n" + 
				"				\"stock_code\": \"119830\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00531078\",\r\n" + 
				"				\"corp_name\": \"유비온\",\r\n" + 
				"				\"stock_code\": \"084440\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173351\",\r\n" + 
				"				\"corp_name\": \"삼진\",\r\n" + 
				"				\"stock_code\": \"032750\",\r\n" + 
				"				\"modify_date\": \"20210527\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01130885\",\r\n" + 
				"				\"corp_name\": \"바이오인프라생명과학\",\r\n" + 
				"				\"stock_code\": \"266470\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00130763\",\r\n" + 
				"				\"corp_name\": \"서울반도체\",\r\n" + 
				"				\"stock_code\": \"046890\",\r\n" + 
				"				\"modify_date\": \"20210504\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00536329\",\r\n" + 
				"				\"corp_name\": \"디지탈옵틱\",\r\n" + 
				"				\"stock_code\": \"106520\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00250137\",\r\n" + 
				"				\"corp_name\": \"와이어블\",\r\n" + 
				"				\"stock_code\": \"065530\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00291860\",\r\n" + 
				"				\"corp_name\": \"조광ILI\",\r\n" + 
				"				\"stock_code\": \"044060\",\r\n" + 
				"				\"modify_date\": \"20210607\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00533924\",\r\n" + 
				"				\"corp_name\": \"이브이첨단소재\",\r\n" + 
				"				\"stock_code\": \"131400\",\r\n" + 
				"				\"modify_date\": \"20210607\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00799070\",\r\n" + 
				"				\"corp_name\": \"이스트아시아홀딩스\",\r\n" + 
				"				\"stock_code\": \"900110\",\r\n" + 
				"				\"modify_date\": \"20210607\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01230255\",\r\n" + 
				"				\"corp_name\": \"제주맥주\",\r\n" + 
				"				\"stock_code\": \"276730\",\r\n" + 
				"				\"modify_date\": \"20210607\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00623184\",\r\n" + 
				"				\"corp_name\": \"THQ\",\r\n" + 
				"				\"stock_code\": \"192410\",\r\n" + 
				"				\"modify_date\": \"20210607\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01108442\",\r\n" + 
				"				\"corp_name\": \"에치에프알\",\r\n" + 
				"				\"stock_code\": \"230240\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125521\",\r\n" + 
				"				\"corp_name\": \"에스엘\",\r\n" + 
				"				\"stock_code\": \"005850\",\r\n" + 
				"				\"modify_date\": \"20210517\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00916826\",\r\n" + 
				"				\"corp_name\": \"드림씨아이에스\",\r\n" + 
				"				\"stock_code\": \"223250\",\r\n" + 
				"				\"modify_date\": \"20210531\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00125576\",\r\n" + 
				"				\"corp_name\": \"체시스\",\r\n" + 
				"				\"stock_code\": \"033250\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160047\",\r\n" + 
				"				\"corp_name\": \"한국앤컴퍼니\",\r\n" + 
				"				\"stock_code\": \"000240\",\r\n" + 
				"				\"modify_date\": \"20210603\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01114586\",\r\n" + 
				"				\"corp_name\": \"셀레믹스\",\r\n" + 
				"				\"stock_code\": \"331920\",\r\n" + 
				"				\"modify_date\": \"20210607\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01160363\",\r\n" + 
				"				\"corp_name\": \"에코프로비엠\",\r\n" + 
				"				\"stock_code\": \"247540\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108241\",\r\n" + 
				"				\"corp_name\": \"농심\",\r\n" + 
				"				\"stock_code\": \"004370\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01037542\",\r\n" + 
				"				\"corp_name\": \"바이옵트로\",\r\n" + 
				"				\"stock_code\": \"222160\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00105475\",\r\n" + 
				"				\"corp_name\": \"금강철강\",\r\n" + 
				"				\"stock_code\": \"053260\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01350869\",\r\n" + 
				"				\"corp_name\": \"우리금융지주\",\r\n" + 
				"				\"stock_code\": \"316140\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00254045\",\r\n" + 
				"				\"corp_name\": \"우리은행\",\r\n" + 
				"				\"stock_code\": \"000030\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138729\",\r\n" + 
				"				\"corp_name\": \"아세아제지\",\r\n" + 
				"				\"stock_code\": \"002310\",\r\n" + 
				"				\"modify_date\": \"20210609\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00360142\",\r\n" + 
				"				\"corp_name\": \"아이마켓코리아\",\r\n" + 
				"				\"stock_code\": \"122900\",\r\n" + 
				"				\"modify_date\": \"20210610\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126380\",\r\n" + 
				"				\"corp_name\": \"삼성전자\",\r\n" + 
				"				\"stock_code\": \"005930\",\r\n" + 
				"				\"modify_date\": \"20210610\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01319899\",\r\n" + 
				"				\"corp_name\": \"SK바이오사이언스\",\r\n" + 
				"				\"stock_code\": \"302440\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00781202\",\r\n" + 
				"				\"corp_name\": \"애머릿지\",\r\n" + 
				"				\"stock_code\": \"900100\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00980122\",\r\n" + 
				"				\"corp_name\": \"JB금융지주\",\r\n" + 
				"				\"stock_code\": \"175330\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00300548\",\r\n" + 
				"				\"corp_name\": \"현대리바트\",\r\n" + 
				"				\"stock_code\": \"079430\",\r\n" + 
				"				\"modify_date\": \"20210518\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00643656\",\r\n" + 
				"				\"corp_name\": \"위메이드맥스\",\r\n" + 
				"				\"stock_code\": \"101730\",\r\n" + 
				"				\"modify_date\": \"20210615\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01059605\",\r\n" + 
				"				\"corp_name\": \"디와이파워\",\r\n" + 
				"				\"stock_code\": \"210540\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01316254\",\r\n" + 
				"				\"corp_name\": \"효성첨단소재\",\r\n" + 
				"				\"stock_code\": \"298050\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00175623\",\r\n" + 
				"				\"corp_name\": \"ES큐브\",\r\n" + 
				"				\"stock_code\": \"050120\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00121941\",\r\n" + 
				"				\"corp_name\": \"대상\",\r\n" + 
				"				\"stock_code\": \"001680\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442570\",\r\n" + 
				"				\"corp_name\": \"제우스\",\r\n" + 
				"				\"stock_code\": \"079370\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136095\",\r\n" + 
				"				\"corp_name\": \"조은저축은행\",\r\n" + 
				"				\"stock_code\": \"031920\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00119672\",\r\n" + 
				"				\"corp_name\": \"두올\",\r\n" + 
				"				\"stock_code\": \"016740\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00807379\",\r\n" + 
				"				\"corp_name\": \"신흥에스이씨\",\r\n" + 
				"				\"stock_code\": \"243840\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00565154\",\r\n" + 
				"				\"corp_name\": \"이노션\",\r\n" + 
				"				\"stock_code\": \"214320\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01261893\",\r\n" + 
				"				\"corp_name\": \"케이씨텍\",\r\n" + 
				"				\"stock_code\": \"281820\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164742\",\r\n" + 
				"				\"corp_name\": \"현대자동차\",\r\n" + 
				"				\"stock_code\": \"005380\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00656289\",\r\n" + 
				"				\"corp_name\": \"코스맥스엔비티\",\r\n" + 
				"				\"stock_code\": \"222040\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00299002\",\r\n" + 
				"				\"corp_name\": \"한라홀딩스\",\r\n" + 
				"				\"stock_code\": \"060980\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01203808\",\r\n" + 
				"				\"corp_name\": \"AP시스템\",\r\n" + 
				"				\"stock_code\": \"265520\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00304076\",\r\n" + 
				"				\"corp_name\": \"원방테크\",\r\n" + 
				"				\"stock_code\": \"053080\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01208885\",\r\n" + 
				"				\"corp_name\": \"경동도시가스\",\r\n" + 
				"				\"stock_code\": \"267290\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00351630\",\r\n" + 
				"				\"corp_name\": \"세코닉스\",\r\n" + 
				"				\"stock_code\": \"053450\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00565215\",\r\n" + 
				"				\"corp_name\": \"굿센\",\r\n" + 
				"				\"stock_code\": \"243870\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00402110\",\r\n" + 
				"				\"corp_name\": \"시큐브\",\r\n" + 
				"				\"stock_code\": \"131090\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01113499\",\r\n" + 
				"				\"corp_name\": \"시큐센\",\r\n" + 
				"				\"stock_code\": \"232830\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00861997\",\r\n" + 
				"				\"corp_name\": \"인포마크\",\r\n" + 
				"				\"stock_code\": \"175140\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00271501\",\r\n" + 
				"				\"corp_name\": \"코아시아\",\r\n" + 
				"				\"stock_code\": \"045970\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00266961\",\r\n" + 
				"				\"corp_name\": \"NAVER\",\r\n" + 
				"				\"stock_code\": \"035420\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164724\",\r\n" + 
				"				\"corp_name\": \"현대엘리베이터\",\r\n" + 
				"				\"stock_code\": \"017800\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00167208\",\r\n" + 
				"				\"corp_name\": \"흥아해운\",\r\n" + 
				"				\"stock_code\": \"003280\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00334615\",\r\n" + 
				"				\"corp_name\": \"콜마파마\",\r\n" + 
				"				\"stock_code\": \"038710\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00309503\",\r\n" + 
				"				\"corp_name\": \"한국항공우주\",\r\n" + 
				"				\"stock_code\": \"047810\",\r\n" + 
				"				\"modify_date\": \"20210514\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164609\",\r\n" + 
				"				\"corp_name\": \"현대미포조선\",\r\n" + 
				"				\"stock_code\": \"010620\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00136378\",\r\n" + 
				"				\"corp_name\": \"신세계\",\r\n" + 
				"				\"stock_code\": \"004170\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00508344\",\r\n" + 
				"				\"corp_name\": \"SK디앤디\",\r\n" + 
				"				\"stock_code\": \"210980\",\r\n" + 
				"				\"modify_date\": \"20210531\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00147295\",\r\n" + 
				"				\"corp_name\": \"전북은행\",\r\n" + 
				"				\"stock_code\": \"006350\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00149293\",\r\n" + 
				"				\"corp_name\": \"신한은행\",\r\n" + 
				"				\"stock_code\": \"000010\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138321\",\r\n" + 
				"				\"corp_name\": \"신한금융투자\",\r\n" + 
				"				\"stock_code\": \"008670\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00116073\",\r\n" + 
				"				\"corp_name\": \"그린기술투자\",\r\n" + 
				"				\"stock_code\": \"025340\",\r\n" + 
				"				\"modify_date\": \"20210630\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00883980\",\r\n" + 
				"				\"corp_name\": \"아이디스\",\r\n" + 
				"				\"stock_code\": \"143160\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00122205\",\r\n" + 
				"				\"corp_name\": \"바른손\",\r\n" + 
				"				\"stock_code\": \"018700\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138057\",\r\n" + 
				"				\"corp_name\": \"써니전자\",\r\n" + 
				"				\"stock_code\": \"004770\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00155692\",\r\n" + 
				"				\"corp_name\": \"우리조명\",\r\n" + 
				"				\"stock_code\": \"037400\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00216647\",\r\n" + 
				"				\"corp_name\": \"원익홀딩스\",\r\n" + 
				"				\"stock_code\": \"030530\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01072518\",\r\n" + 
				"				\"corp_name\": \"디피코\",\r\n" + 
				"				\"stock_code\": \"163430\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00247975\",\r\n" + 
				"				\"corp_name\": \"솔브레인홀딩스\",\r\n" + 
				"				\"stock_code\": \"036830\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261054\",\r\n" + 
				"				\"corp_name\": \"EG\",\r\n" + 
				"				\"stock_code\": \"037370\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00296324\",\r\n" + 
				"				\"corp_name\": \"큐로홀딩스\",\r\n" + 
				"				\"stock_code\": \"051780\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00317487\",\r\n" + 
				"				\"corp_name\": \"에이치엘비파워\",\r\n" + 
				"				\"stock_code\": \"043220\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00363769\",\r\n" + 
				"				\"corp_name\": \"한국전자금융\",\r\n" + 
				"				\"stock_code\": \"063570\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364467\",\r\n" + 
				"				\"corp_name\": \"드림어스컴퍼니\",\r\n" + 
				"				\"stock_code\": \"060570\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00408956\",\r\n" + 
				"				\"corp_name\": \"제넨바이오\",\r\n" + 
				"				\"stock_code\": \"072520\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00440712\",\r\n" + 
				"				\"corp_name\": \"WI\",\r\n" + 
				"				\"stock_code\": \"073570\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00442455\",\r\n" + 
				"				\"corp_name\": \"코스나인\",\r\n" + 
				"				\"stock_code\": \"082660\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00579971\",\r\n" + 
				"				\"corp_name\": \"칩스앤미디어\",\r\n" + 
				"				\"stock_code\": \"094360\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00820389\",\r\n" + 
				"				\"corp_name\": \"뉴지랩파마\",\r\n" + 
				"				\"stock_code\": \"214870\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00970453\",\r\n" + 
				"				\"corp_name\": \"파마리서치\",\r\n" + 
				"				\"stock_code\": \"214450\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01214743\",\r\n" + 
				"				\"corp_name\": \"더네이쳐홀딩스\",\r\n" + 
				"				\"stock_code\": \"298540\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00977696\",\r\n" + 
				"				\"corp_name\": \"넥스쳐\",\r\n" + 
				"				\"stock_code\": \"194510\",\r\n" + 
				"				\"modify_date\": \"20210726\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00117258\",\r\n" + 
				"				\"corp_name\": \"한화갤러리아타임월드\",\r\n" + 
				"				\"stock_code\": \"027390\",\r\n" + 
				"				\"modify_date\": \"20210623\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00166175\",\r\n" + 
				"				\"corp_name\": \"대호특수강\",\r\n" + 
				"				\"stock_code\": \"021040\",\r\n" + 
				"				\"modify_date\": \"20210623\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01213586\",\r\n" + 
				"				\"corp_name\": \"아이디피\",\r\n" + 
				"				\"stock_code\": \"332370\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00173661\",\r\n" + 
				"				\"corp_name\": \"에스지신성건설\",\r\n" + 
				"				\"stock_code\": \"001970\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00102353\",\r\n" + 
				"				\"corp_name\": \"경창산업\",\r\n" + 
				"				\"stock_code\": \"024910\",\r\n" + 
				"				\"modify_date\": \"20210709\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132804\",\r\n" + 
				"				\"corp_name\": \"성신양회\",\r\n" + 
				"				\"stock_code\": \"004980\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01336285\",\r\n" + 
				"				\"corp_name\": \"에스케이에이씨피씨제4호기업인수목적\",\r\n" + 
				"				\"stock_code\": \"307070\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00494546\",\r\n" + 
				"				\"corp_name\": \"오비고\",\r\n" + 
				"				\"stock_code\": \"352910\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00138695\",\r\n" + 
				"				\"corp_name\": \"뉴아세아조인트\",\r\n" + 
				"				\"stock_code\": \"013340\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00365934\",\r\n" + 
				"				\"corp_name\": \"코세스\",\r\n" + 
				"				\"stock_code\": \"089890\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00409964\",\r\n" + 
				"				\"corp_name\": \"하이텍팜\",\r\n" + 
				"				\"stock_code\": \"106190\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01391103\",\r\n" + 
				"				\"corp_name\": \"브랜드엑스코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"337930\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111014\",\r\n" + 
				"				\"corp_name\": \"애큐온저축은행\",\r\n" + 
				"				\"stock_code\": \"007640\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00176792\",\r\n" + 
				"				\"corp_name\": \"오렌지라이프생명보험\",\r\n" + 
				"				\"stock_code\": \"079440\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00107987\",\r\n" + 
				"				\"corp_name\": \"남해화학\",\r\n" + 
				"				\"stock_code\": \"025860\",\r\n" + 
				"				\"modify_date\": \"20210621\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00126955\",\r\n" + 
				"				\"corp_name\": \"삼양식품\",\r\n" + 
				"				\"stock_code\": \"003230\",\r\n" + 
				"				\"modify_date\": \"20210621\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00872984\",\r\n" + 
				"				\"corp_name\": \"이마트\",\r\n" + 
				"				\"stock_code\": \"139480\",\r\n" + 
				"				\"modify_date\": \"20210621\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00477257\",\r\n" + 
				"				\"corp_name\": \"지나인제약\",\r\n" + 
				"				\"stock_code\": \"078650\",\r\n" + 
				"				\"modify_date\": \"20210621\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00609634\",\r\n" + 
				"				\"corp_name\": \"아이엠\",\r\n" + 
				"				\"stock_code\": \"101390\",\r\n" + 
				"				\"modify_date\": \"20210621\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00806972\",\r\n" + 
				"				\"corp_name\": \"매직마이크로\",\r\n" + 
				"				\"stock_code\": \"127160\",\r\n" + 
				"				\"modify_date\": \"20210621\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00349732\",\r\n" + 
				"				\"corp_name\": \"코나아이\",\r\n" + 
				"				\"stock_code\": \"052400\",\r\n" + 
				"				\"modify_date\": \"20210722\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00601191\",\r\n" + 
				"				\"corp_name\": \"하나기술\",\r\n" + 
				"				\"stock_code\": \"299030\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00380429\",\r\n" + 
				"				\"corp_name\": \"CMG제약\",\r\n" + 
				"				\"stock_code\": \"058820\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00525679\",\r\n" + 
				"				\"corp_name\": \"차바이오텍\",\r\n" + 
				"				\"stock_code\": \"085660\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00132211\",\r\n" + 
				"				\"corp_name\": \"SUN&L\",\r\n" + 
				"				\"stock_code\": \"002820\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00526951\",\r\n" + 
				"				\"corp_name\": \"이엠코리아\",\r\n" + 
				"				\"stock_code\": \"095190\",\r\n" + 
				"				\"modify_date\": \"20210713\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00139214\",\r\n" + 
				"				\"corp_name\": \"삼성화재해상보험\",\r\n" + 
				"				\"stock_code\": \"000810\",\r\n" + 
				"				\"modify_date\": \"20210510\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00231664\",\r\n" + 
				"				\"corp_name\": \"우리기술투자\",\r\n" + 
				"				\"stock_code\": \"041190\",\r\n" + 
				"				\"modify_date\": \"20210527\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00144818\",\r\n" + 
				"				\"corp_name\": \"유유제약\",\r\n" + 
				"				\"stock_code\": \"000220\",\r\n" + 
				"				\"modify_date\": \"20210527\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00576798\",\r\n" + 
				"				\"corp_name\": \"디아이티\",\r\n" + 
				"				\"stock_code\": \"110990\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00572905\",\r\n" + 
				"				\"corp_name\": \"ISC\",\r\n" + 
				"				\"stock_code\": \"095340\",\r\n" + 
				"				\"modify_date\": \"20210705\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00657002\",\r\n" + 
				"				\"corp_name\": \"에이디테크놀로지\",\r\n" + 
				"				\"stock_code\": \"200710\",\r\n" + 
				"				\"modify_date\": \"20210705\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01136348\",\r\n" + 
				"				\"corp_name\": \"나무기술\",\r\n" + 
				"				\"stock_code\": \"242040\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00298270\",\r\n" + 
				"				\"corp_name\": \"안랩\",\r\n" + 
				"				\"stock_code\": \"053800\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00364795\",\r\n" + 
				"				\"corp_name\": \"레드로버\",\r\n" + 
				"				\"stock_code\": \"060300\",\r\n" + 
				"				\"modify_date\": \"20210625\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00378220\",\r\n" + 
				"				\"corp_name\": \"버킷스튜디오\",\r\n" + 
				"				\"stock_code\": \"066410\",\r\n" + 
				"				\"modify_date\": \"20210625\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00961507\",\r\n" + 
				"				\"corp_name\": \"이더블유케이\",\r\n" + 
				"				\"stock_code\": \"258610\",\r\n" + 
				"				\"modify_date\": \"20210625\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00137809\",\r\n" + 
				"				\"corp_name\": \"SHD\",\r\n" + 
				"				\"stock_code\": \"001770\",\r\n" + 
				"				\"modify_date\": \"20210721\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01063884\",\r\n" + 
				"				\"corp_name\": \"이디티\",\r\n" + 
				"				\"stock_code\": \"215090\",\r\n" + 
				"				\"modify_date\": \"20210721\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00469799\",\r\n" + 
				"				\"corp_name\": \"이엔플러스\",\r\n" + 
				"				\"stock_code\": \"074610\",\r\n" + 
				"				\"modify_date\": \"20210721\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01319808\",\r\n" + 
				"				\"corp_name\": \"한일시멘트\",\r\n" + 
				"				\"stock_code\": \"300720\",\r\n" + 
				"				\"modify_date\": \"20210527\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120508\",\r\n" + 
				"				\"corp_name\": \"롯데푸드\",\r\n" + 
				"				\"stock_code\": \"002270\",\r\n" + 
				"				\"modify_date\": \"20210527\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00296005\",\r\n" + 
				"				\"corp_name\": \"우리로\",\r\n" + 
				"				\"stock_code\": \"046970\",\r\n" + 
				"				\"modify_date\": \"20210607\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00877059\",\r\n" + 
				"				\"corp_name\": \"삼성바이오로직스\",\r\n" + 
				"				\"stock_code\": \"207940\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01185566\",\r\n" + 
				"				\"corp_name\": \"휴온스블러썸\",\r\n" + 
				"				\"stock_code\": \"263920\",\r\n" + 
				"				\"modify_date\": \"20210705\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00261009\",\r\n" + 
				"				\"corp_name\": \"감성코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"036620\",\r\n" + 
				"				\"modify_date\": \"20210712\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158501\",\r\n" + 
				"				\"corp_name\": \"에스원\",\r\n" + 
				"				\"stock_code\": \"012750\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01386916\",\r\n" + 
				"				\"corp_name\": \"SK아이이테크놀로지\",\r\n" + 
				"				\"stock_code\": \"361610\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00857480\",\r\n" + 
				"				\"corp_name\": \"사람인에이치알\",\r\n" + 
				"				\"stock_code\": \"143240\",\r\n" + 
				"				\"modify_date\": \"20210716\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00180263\",\r\n" + 
				"				\"corp_name\": \"리더스코스메틱\",\r\n" + 
				"				\"stock_code\": \"016100\",\r\n" + 
				"				\"modify_date\": \"20210712\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01414370\",\r\n" + 
				"				\"corp_name\": \"하이제5호스팩\",\r\n" + 
				"				\"stock_code\": \"340120\",\r\n" + 
				"				\"modify_date\": \"20210720\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00244747\",\r\n" + 
				"				\"corp_name\": \"파크시스템스\",\r\n" + 
				"				\"stock_code\": \"140860\",\r\n" + 
				"				\"modify_date\": \"20210617\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01328170\",\r\n" + 
				"				\"corp_name\": \"노드메이슨\",\r\n" + 
				"				\"stock_code\": \"317860\",\r\n" + 
				"				\"modify_date\": \"20210721\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01144569\",\r\n" + 
				"				\"corp_name\": \"명성티엔에스\",\r\n" + 
				"				\"stock_code\": \"257370\",\r\n" + 
				"				\"modify_date\": \"20210723\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00550994\",\r\n" + 
				"				\"corp_name\": \"아이센스\",\r\n" + 
				"				\"stock_code\": \"099190\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00268251\",\r\n" + 
				"				\"corp_name\": \"다산네트웍스\",\r\n" + 
				"				\"stock_code\": \"039560\",\r\n" + 
				"				\"modify_date\": \"20210511\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00108913\",\r\n" + 
				"				\"corp_name\": \"대교\",\r\n" + 
				"				\"stock_code\": \"019680\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00114792\",\r\n" + 
				"				\"corp_name\": \"동국제강\",\r\n" + 
				"				\"stock_code\": \"001230\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00241209\",\r\n" + 
				"				\"corp_name\": \"모아텍\",\r\n" + 
				"				\"stock_code\": \"033200\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00441128\",\r\n" + 
				"				\"corp_name\": \"아리온\",\r\n" + 
				"				\"stock_code\": \"058220\",\r\n" + 
				"				\"modify_date\": \"20210611\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00455112\",\r\n" + 
				"				\"corp_name\": \"GV\",\r\n" + 
				"				\"stock_code\": \"045890\",\r\n" + 
				"				\"modify_date\": \"20210611\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00988364\",\r\n" + 
				"				\"corp_name\": \"SGA솔루션즈\",\r\n" + 
				"				\"stock_code\": \"184230\",\r\n" + 
				"				\"modify_date\": \"20210611\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00809517\",\r\n" + 
				"				\"corp_name\": \"아이엠텍\",\r\n" + 
				"				\"stock_code\": \"226350\",\r\n" + 
				"				\"modify_date\": \"20210611\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00162461\",\r\n" + 
				"				\"corp_name\": \"한화솔루션\",\r\n" + 
				"				\"stock_code\": \"009830\",\r\n" + 
				"				\"modify_date\": \"20210503\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"01412822\",\r\n" + 
				"				\"corp_name\": \"솔루스첨단소재\",\r\n" + 
				"				\"stock_code\": \"336370\",\r\n" + 
				"				\"modify_date\": \"20210618\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00164830\",\r\n" + 
				"				\"corp_name\": \"한국조선해양\",\r\n" + 
				"				\"stock_code\": \"009540\",\r\n" + 
				"				\"modify_date\": \"20210506\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00389387\",\r\n" + 
				"				\"corp_name\": \"라임\",\r\n" + 
				"				\"stock_code\": \"065160\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00148832\",\r\n" + 
				"				\"corp_name\": \"제주은행\",\r\n" + 
				"				\"stock_code\": \"006220\",\r\n" + 
				"				\"modify_date\": \"20210512\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00111838\",\r\n" + 
				"				\"corp_name\": \"대원\",\r\n" + 
				"				\"stock_code\": \"007680\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00223513\",\r\n" + 
				"				\"corp_name\": \"제이씨현시스템\",\r\n" + 
				"				\"stock_code\": \"033320\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00171636\",\r\n" + 
				"				\"corp_name\": \"한솔홀딩스\",\r\n" + 
				"				\"stock_code\": \"004150\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00330424\",\r\n" + 
				"				\"corp_name\": \"이베스트투자증권\",\r\n" + 
				"				\"stock_code\": \"078020\",\r\n" + 
				"				\"modify_date\": \"20210601\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00158307\",\r\n" + 
				"				\"corp_name\": \"롯데하이마트\",\r\n" + 
				"				\"stock_code\": \"071840\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00185046\",\r\n" + 
				"				\"corp_name\": \"SM C&C\",\r\n" + 
				"				\"stock_code\": \"048550\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00159193\",\r\n" + 
				"				\"corp_name\": \"한국전력공사\",\r\n" + 
				"				\"stock_code\": \"015760\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00232007\",\r\n" + 
				"				\"corp_name\": \"상지카일룸\",\r\n" + 
				"				\"stock_code\": \"042940\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00365387\",\r\n" + 
				"				\"corp_name\": \"AJ네트웍스\",\r\n" + 
				"				\"stock_code\": \"095570\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00302078\",\r\n" + 
				"				\"corp_name\": \"한국코퍼레이션\",\r\n" + 
				"				\"stock_code\": \"050540\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00120216\",\r\n" + 
				"				\"corp_name\": \"KB손해보험\",\r\n" + 
				"				\"stock_code\": \"002550\",\r\n" + 
				"				\"modify_date\": \"20210513\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00304401\",\r\n" + 
				"				\"corp_name\": \"텔라움\",\r\n" + 
				"				\"stock_code\": \"047730\",\r\n" + 
				"				\"modify_date\": \"20210506\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00521390\",\r\n" + 
				"				\"corp_name\": \"뉴파워프라즈마\",\r\n" + 
				"				\"stock_code\": \"144960\",\r\n" + 
				"				\"modify_date\": \"20210602\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00838500\",\r\n" + 
				"				\"corp_name\": \"엘브이엠씨\",\r\n" + 
				"				\"stock_code\": \"900140\",\r\n" + 
				"				\"modify_date\": \"20210611\"\r\n" + 
				"			},\r\n" + 
				"			{\r\n" + 
				"				\"corp_code\": \"00160232\",\r\n" + 
				"				\"corp_name\": \"KSS해운\",\r\n" + 
				"				\"stock_code\": \"044450\",\r\n" + 
				"				\"modify_date\": \"20210628\"\r\n" + 
				"			}\r\n" + 
				"		]\r\n" + 
				"	\r\n" + 
				"}";
	}

}
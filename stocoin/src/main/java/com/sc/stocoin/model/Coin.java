package com.sc.stocoin.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Coin {

	List<Map<String, String>> coinNameKo;

	public List<Map<String, String>> getCoinNameKo() {
		List<Map<String, String>> coinNameKo = new ArrayList<>();

		String en[] = {"NMR", "ETH", "BTC", "DOT", "CVT", "XLM", "UNI", "BNB", "XRP", "MSB",
				"LTC", "DOGE", "KLAY","QTCON", "ETC", "ASM", "DVI", "LF", "CON", "BTG", "XNO",
				"EOS", "ANW", "BCHA", "TMTG", "VRA", "MVC", "ADA", "BCH", "APIX", "RAI", "SAND",
				"QTUM", "ALICE", "FLETA", "LINK", "REP", "PUNDIX", "CYCLUB", "BTT", "LUNA",
				"BCD", "SOC", "VET", "TRX", "ANV", "HIVE", "YFI", "ADP", "BSV", "MTL", "XPR",
				"SXP", "MANA", "ANKR", "STRAX", "ENJ", "BIOT", "MLK", "TEMCO", "WIKEN", "ELF",
				"BURGER", "XEM", "STEEM", "RLC", "AERGO", "ORC", "FIT", "XTZ", "LOOM", "EM",
				"XVS", "SNX", "CHZ", "WAXP", "POWR", "SSX", "TFUEL", "SRM", "BORA", "POLA",
				"SNT", "OMG", "META", "HIBS", "SUN", "EL", "AQT", "THETA", "AWO", "CHR", "FCT",
				"GHX","ICX", "ONG", "LPT", "COMP", "MAP", "AMO", "ORBS", "PCI", "MBL", "MM", 
				"UMA", "WAVES", "BOA", "ONT", "WEMIX", "KNC", "CKB", "TRUE", "ATOM", "DAC", 
				"ZIL", "QKC", "ARW", "BLY", "GOM2", "EGG", "CTK", "CAKE", "IOST", "ALGO", "ZRX",
				"LINA", "KSM", "BAT", "MATIC", "BASIC", "XYM", "WICC", "SUSHI", "GRT", "JST",
				"COS", "CTXC", "OBSR", "CENNZ", "VALOR", "VSYS", "AAVE", "RSR", "GLM", "IPX",
				"TRV", "RINGX", "MIX", "MKR", "GXC", "EVZ", "OCEAN", "ARPA", "AION", "HDAC",
				"DAI", "CRO", "OXT", "BAKE", "WTC", "CTSI", "WOM", "MXC", "NU", "APM", "FX",
				"LRC", "RLY", "MIR", "REN", "WOZX", "BAL", "CELR", "BNT", "BEL", "DAD", "COLA" };
		
		String ko[] = {"뉴메레르", "이더리움", "비트코인", "폴카닷", "사이버베인", "스텔라루멘", "유니스왑", "바이낸스코인", "리플", "미스블록",
				"라이트코인", "도지코인", "클레이튼", "퀴즈톡", "이더리움 클래식", "어셈블프로토콜", "디비전", "링크플로우", "코넌", "비트코인 골드", "제노토큰",
				"이오스", "앵커뉴럴월드", "비트코인 캐시 에이비씨", "더마이다스터치 골드", "베라시티", "마일벌스", "에이다", "비트코인 캐시", "아픽스", "라이파이낸스", "샌드박스",
				"퀀텀", "마이네이버앨리스", "플레타", "체인링크", "어거", "펀디엑스", "싸이클럽", "비트토렌트", "루나",
				"비트코인 다이아몬드", "소다코인", "비체인", "트론", "애니버스", "하이브", "연파이낸스", "어댑터 토큰", "비트코인에스브이", "메탈", "프로톤",
				"스와이프", "디센트럴랜드", "앵커", "스트라티스", "엔진코인", "바이오패스포트", "밀크", "템코", "위드", "엘프",
				"버거스왑", "넴", "스팀", "아이젝", "아르고", "오르빗 체인", "300피트 네트워크", "테조스", "룸네트워크", "이마이너",
				"비너스", "신세틱스", "칠리즈", "왁스", "파워렛저", "썸씽", "쎄타퓨엘", "세럼", "보라", "폴라리스 쉐어",
				"스테이터스네트 워크토큰", "오미세고", "메타디움", "힙스", "썬", "엘리시아", "알파쿼크", "쎄타토큰", "에이아이워크", "크로미아", "피르마체인",
				"게이머코인", "아이콘", "온톨로지가스", "라이브피어", "컴파운드", "맵프로토콜", "아모코인", "오브스", "페이코인", "무비블록", "밀리미터토큰",
				"우마", "웨이브", "보아", "온톨로지", "위믹스", "카이버 네트워크", "너보스", "트루체인", "코스모스", "다빈치",
				"질리카", "쿼크체인", "아로와나토큰", "블로서리", "고머니2", "네스트리", "써틱", "팬케이크스왑", "이오스트", "알고랜드", "제로엑스",
				"리니어파이낸스", "쿠사마", "베이직어텐션토큰", "폴리곤", "베이직", "심볼", "웨이키체인", "스시스왑", "더그래프", "저스트",
				"콘텐토스", "코르텍스", "옵저버", "센트럴리티", "밸러토큰", "브이시스템즈", "에이브", "리저브라이트", "골렘", "타키온프로토콜",
				"트러스트버스", "링엑스", "믹스마블", "메이커", "지엑스체인", "이브이지", "오션프로토콜", "알파체인", "아이온", "에이치닥",
				"다이", "크립토닷컴체인", "오키드", "베이커리토큰", "월튼체인", "카르테시", "왐토큰", "머신익스체인지 코인", "누사이퍼", "에이피엠 코인", "펑션엑스",
				"루프링", "랠리", "미러 프로토콜", "렌", "이포스", "밸런서", "셀러네트워크", "뱅코르", "벨라프로토콜", "다드", "콜라토큰"};

		for (int i = 0; i < en.length; i++) {
			Map<String, String> map = new HashMap<>();
			map.put("en", en[i]);
			map.put("ko", ko[i]);
			
			coinNameKo.add(map);
		}

		return coinNameKo;
	}

}

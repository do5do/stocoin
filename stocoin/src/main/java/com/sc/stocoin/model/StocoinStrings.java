package com.sc.stocoin.model;

import java.net.InetAddress;

public class StocoinStrings {
	public String IP;

	public StocoinStrings() {
		try {
			IP = InetAddress.getLocalHost().getHostAddress() + ":8080";
		} catch (Exception e) {
			// TODO: handle exception
			IP = "";
		}
	}

	public void setIP(String IP) {
		this.IP = IP;
	}

	public String getIP() {
		return IP;
	}

}
package com.hx.demo1;

/**
 * @author jxlgcmh
 * @date 2019-07-17 22:58
 */
public class Gate {
	private int counter = 0;
	private String name = "Nobody";
	private String address = "Nowhere";
	
	public void pass(String name, String address) {
		this.counter ++;
		this.name = name;
		this.address = address;
		check();
		
	}
	
	@Override
	public String toString() {
		return "NO." +
				+counter +
				":" + name +
				"," + address;
	}
	
	private void check() {
		if (name.charAt(0) != address.charAt(0)) {
			System.out.println("BROKEN"+this.toString());
		}
	}
}

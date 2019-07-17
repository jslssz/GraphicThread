package com.hx.demo1;

/**
 * @author jxlgcmh
 * @date 2019-07-17 23:09
 */
public class Main {
	public static void main(String[] args) {
		Gate gate = new Gate();
		new UserThread(gate,"A","AA").start();
		new UserThread(gate,"B","BB").start();
		new UserThread(gate,"C","CC").start();
	}
}

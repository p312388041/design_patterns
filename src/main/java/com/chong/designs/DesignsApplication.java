package com.chong.designs;

public class DesignsApplication {

	public static void main(String[] args) {
		Worker worker = Company.createProxy(new Chongge());
		worker.work(new Job("coding", 10000));
	}
}

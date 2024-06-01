package com.chong;

import com.chong.designs.Chongge;
import com.chong.designs.Job;
import com.chong.designs.cglib.CglibCompany; 

public class DesignsApplication {

	public static void main(String[] args) {
		// Worker worker = JdkCompany.createProxy(new Chongge());
		// worker.work(new Job("coding", 10000));


		Chongge chongge =(Chongge) CglibCompany.createProxy(new CglibCompany());
		chongge.work(new Job("coding", 10000));
	}
}

package com.chong;

import com.chong.designs.single.Person; 

public class DesignsApplication {

	public static void main(String[] args) {
		// Worker worker = JdkCompany.createProxy(new Chongge());
		// worker.work(new Job("coding", 10000));


		// Chongge chongge =(Chongge) CglibCompany.createProxy(new CglibCompany());
		// chongge.work(new Job("coding", 10000));
		Person person = Person.getInstance();
		System.out.println(person);
	}
}

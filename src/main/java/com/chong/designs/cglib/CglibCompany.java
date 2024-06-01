package com.chong.designs.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.chong.designs.Chongge;
import com.chong.designs.Job;

public class CglibCompany implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Job job = (Job) args[0];
        System.out.println("Company recive work : " + job.getName());
        System.out.println("Company recive money : " + job.getPrice());
        System.out.println("Company beg chongge work");
        job = new Job(job.getName(), job.getPrice() / 10);
        Object result = proxy.invokeSuper(obj, new Object[] { job });
        return result;
    }

    public static Object createProxy(CglibCompany company) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Chongge.class);
        enhancer.setCallback(company);
        return enhancer.create();
    }
}

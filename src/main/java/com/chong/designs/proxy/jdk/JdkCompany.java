package com.chong.designs.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.chong.designs.Chongge;
import com.chong.designs.Job;
import com.chong.designs.Worker;

public class JdkCompany implements InvocationHandler {
    private Object target;

    public JdkCompany(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Job job = (Job) args[0];
        System.out.println("Company recive work : " + job.getName());
        System.out.println("Company recive money : " + job.getPrice());
        System.out.println("Company beg chongge work");
        job = new Job(job.getName(), job.getPrice() / 10);
        Object result = method.invoke(target, job);
        return result;
    }

    public static Worker createProxy(Chongge chongge) {
        Worker worker = (Worker) Proxy.newProxyInstance(Worker.class.getClassLoader(),
                new Class[] { Worker.class }, new JdkCompany(chongge));
        return worker;
    }
}

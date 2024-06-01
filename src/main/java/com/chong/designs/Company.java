package com.chong.designs;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Company implements InvocationHandler {
    private Object target;

    public Company(Object target) {
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
                new Class[] { Worker.class }, new Company(chongge));
        return worker;
    }
}

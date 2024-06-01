package com.chong.designs;

public class Chongge implements Worker {

    @Override
    public void work(Job job) {
        System.out.println("Chongge recive work : " + job.getName());
        System.out.println("Chongge work for : " + job.getName());
        System.out.println("Chongge work finish : " + job.getName());
        System.out.println("Chongge recive money : " + job.getPrice());
    }
}

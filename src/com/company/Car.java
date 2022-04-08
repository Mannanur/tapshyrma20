package com.company;

public class Car implements AutoCloseable{


   public static void cloce() throws Exception{
        System.out.println("Mashina jabylyp jatat");
    }


    @Override
    public void close() throws Exception {

    }
}

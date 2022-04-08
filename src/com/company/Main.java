package com.company;

public class Main {

    public static void main(String[] args) {
    try  {
        drive();
    } catch (Exception e) {
        e.printStackTrace();
    }
    try  {
       Car.close();
    } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void drive() throws Exception {
        System.out.println("mashina jurup jatat");
    }
}

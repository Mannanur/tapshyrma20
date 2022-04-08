package com.company;

public class Main {

    public static void main(String[] args) {
    try  {
        drive();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    try (Car car = new Car()) {
       Car.cloce();
    } catch (Exception e) {
        System.out.println(e.getMessage());
        }


    }
    public static void drive() throws Exception {
        System.out.println("mashina jurup jatat");
    }
}

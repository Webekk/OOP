package com.oop;

class Car{
    private int price;
    private String model;
    public void start(){
        System.out.println("The car just started");
    }
    public void stop(){
        System.out.println("The car just stopped");
    }
    public void move(){
        System.out.println("The car just moved");
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
}

class Driver {
    private String name;
    private int age;

    public void drive(){
        System.out.println("Driver drives a car pretty fast");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
        System.out.println("Driver's age is "+ age);
    }

}
public class Main {

    public static void main(String[] args) {
    Car startEngine = new Car();
    Car isMoving = new Car();
    Car stops = new Car();
    Driver drivingStyle = new Driver();
    Driver age = new Driver();
    startEngine.start();
    drivingStyle.drive();
    isMoving.move();
    stops.stop();
    age.setAge(20);
    }
}

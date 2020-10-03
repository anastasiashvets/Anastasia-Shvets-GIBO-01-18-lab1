package ru.mirea.shvets.lab1;

public class DemoCircle {
    public static void main(String[] args) {
         Circle c1 = new Circle(4.5, "red");
         System.out.println(c1);
         c1.setColor("pink");
         c1.setRadius(21.1);
         System.out.println(c1);
    }
}

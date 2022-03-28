package ru.tn.courses.ofefelov.v1.task1.subtask2;

public class Subtask_1 {
    public static void main(String[] args) {
        Computer computer = new Computer("Comp1", "intel", "1000", "kingston", 2000, Type.DESKTOP);
        OnlineShop onlineShop = new OnlineShop();
        System.out.println(onlineShop.sellComputer(computer));
    }
}

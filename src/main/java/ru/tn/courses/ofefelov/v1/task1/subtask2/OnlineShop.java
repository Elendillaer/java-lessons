package ru.tn.courses.ofefelov.v1.task1.subtask2;

public class OnlineShop implements PriceCalculator{
    private int percent = 20;
    public String sellComputer(Computer comToSell){
        return "Computer " + comToSell.getType() + " is selling for " + calculatePrice(percent, comToSell);
    }
    @Override
    public double calculatePrice(int percent, Computer comp) {
        double priceToSell = comp.getPrice() + comp.getPrice() / 100 * percent;
        return priceToSell;
    }
}

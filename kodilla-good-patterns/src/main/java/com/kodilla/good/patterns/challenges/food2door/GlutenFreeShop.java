package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements ProviderProcess {

    private String name;
    private String residenceAddress;

    public GlutenFreeShop(String name, String residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }

    @Override
    public void process(Product product, int volumeOfPurchase) {
        System.out.print("Towar: " + product.getName() + " jest przygotowywany do wysyłki");
    }

    public String getName() {
        return name;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    @Override
    public String toString() {
        return "Nazwa producenta " + name +
                " siedziba " + residenceAddress;
    }
}

package com.kodilla.good.patterns.challenges.food2door;

public class MailInformation implements SaleInformation {
    @Override
    public void inform(Order order, boolean isSold) {
        if (isSold) {
            System.out.println("\n Drogi " + order.getUser().getFirstName() + " " + order.getUser().getLastName()
                    + " twoje zamówienie jest w trakcie przygotowania");
            System.out.println("Zamówione produkty: " + order.getProduct().getName() + " cena: " + order.getProduct().getPrice() + "zł");
            System.out.println("Ilość: " + order.getVolumeOfPurchase());
            System.out.println("Adres do wysyłki: " + order.getUser().getAdress());
            System.out.println("Data zamówienia " + order.getDateOfSale());

        } else {
            System.out.println("Twoje zamówienie nie zostanie zrealizowane.");
            System.out.println("Zamówione produkty: " + order.getProduct().getName() + " nie są aktualnie dostępne.");
        }
    }
}

package com.kodilla.good.patterns.challenges;

public class OrderApplication {
    public static void main(String[] args) {
        User user = new User("John", "Wekl");
        Product product = new Product("Warcraft");
        Address address = new Address("example@op.pl");

        ProductOrderService process = new ProductOrderService(new MailService(), new BlizzardOrderService(), new BlizzardOrderRepository());
        process.process(new OrderRequest(user, product, address));

    }
}

package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class AddData {
    public void addData() {

        ProviderProcess producerHealthyShop = new HealthyShop("HealthyShop",
                "Warszawa ul. Warty 43");

        Product product = new Product("Mleko", 2.49, 50);
        Product product2 = new Product("Ser pleśniowy", 2.49, 35);
        Product product3 = new Product("Masło", 6.99, 80);
        Product product4 = new Product("Kefir", 1.99, 50);


        RegisterProduct productsOfHealthyShopProducer = new RegisterProduct();

        productsOfHealthyShopProducer.addNewProduct(product);
        productsOfHealthyShopProducer.addNewProduct(product2);
        productsOfHealthyShopProducer.addNewProduct(product3);


        RegisterProducers registerProducers = new RegisterProducers();

        registerProducers.addNewProducer(producerHealthyShop, productsOfHealthyShopProducer);

        Order order = new Order(new User("Karol", "Stefanides",
                 "Katowice ul. Cicha 8", "email@example.pl")
                , LocalDate.of(2020, 10, 15), product, 2);

        Processor processor = new Processor(new MailInformation(), registerProducers);
        processor.process(order);

    }
}

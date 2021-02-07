package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class AddData {
    public void addData() {

        ProviderProcess producerHealthyShop = new HealthyShop("HealthyShop",
                "Warszawa ul. Warty 43");
        ProviderProcess producerGlutenFreeShop = new GlutenFreeShop("GlutenFreeShop",
                "Gdynia ul. Lakoniczna 4");
        ProviderProcess producerFastFoodShop = new FastFoodShop("FastFoodShop",
                "Katowice ul. Spokojna 15");

        Product product = new Product("Mleko", 2.49, 50);
        Product product1 = new Product("Ser owczy", 1.49, 85);
        Product product2 = new Product("Ser pleśniowy", 2.49, 35);
        Product product3 = new Product("Masło", 6.99, 80);
        Product product4 = new Product("Mleko bez laktozy", 4.99, 250);
        Product product5 = new Product("Kefir", 1.99, 50);
        Product product6 = new Product("Maślanka", 2.50, 750);
        Product product7 = new Product("Oscypek", 4.99, 150);
        Product product8 = new Product("Masło osełkowe", 14.99, 50);
        Product product9 = new Product("Kefir wiejski", 3.99, 100);
        Product product10 = new Product("Serek wiejski", 64.99, 40);


        RegisterProduct productsOfFastFoodShop = new RegisterProduct();
        RegisterProduct productsOfHealthyShopProducer = new RegisterProduct();
        RegisterProduct productsOfGlutenFreeShopProducer = new RegisterProduct();

        productsOfFastFoodShop.addNewProduct(product);
        productsOfFastFoodShop.addNewProduct(product1);
        productsOfFastFoodShop.addNewProduct(product2);
        productsOfFastFoodShop.addNewProduct(product3);
        productsOfFastFoodShop.addNewProduct(product4);

        productsOfHealthyShopProducer.addNewProduct(product5);
        productsOfHealthyShopProducer.addNewProduct(product6);
        productsOfHealthyShopProducer.addNewProduct(product7);

        productsOfGlutenFreeShopProducer.addNewProduct(product8);
        productsOfGlutenFreeShopProducer.addNewProduct(product9);
        productsOfGlutenFreeShopProducer.addNewProduct(product10);


        RegisterProducers registerProducers = new RegisterProducers();

        registerProducers.addNewProducer(producerFastFoodShop, productsOfFastFoodShop);
        registerProducers.addNewProducer(producerHealthyShop, productsOfHealthyShopProducer);
        registerProducers.addNewProducer(producerGlutenFreeShop, productsOfGlutenFreeShopProducer);

        Order order = new Order(new User("Karol", "Stefanides",
                 "Katowice ul. Cicha 8", "email@example.pl")
                , LocalDate.of(2020, 10, 15), product, 2);
        Order order2 = new Order(new User("Karol", "Stefanides",
                "Katowice ul. Cicha 8", "email@example.pl")
                , LocalDate.of(2020, 10, 15), product4, 200);
        Order order3 = new Order(new User("Karol", "Stefanides",
                "Katowice ul. Cicha 8", "email@example.pl")
                , LocalDate.of(2020, 10, 15), product9, 20);
        Order order4 = new Order(new User("Karol", "Stefanides",
                "Katowice ul. Cicha 8", "email@example.pl")
                , LocalDate.of(2020, 10, 15), product6, 10);

        Processor processor = new Processor(new MailInformation(), registerProducers);
        processor.process(order);
        processor.process(order2);
        processor.process(order3);
        processor.process(order4);

    }
}

package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class RegisterProduct {
    private List<Product> listOfProducts = new ArrayList<Product>();

    public boolean addNewProduct(Product product) {
        if (listOfProducts.contains(product)) {
            System.out.println("Błąd, produkt tego producenta już znajduje się na liście.");
            return false;
        } else {
            listOfProducts.add(product);
            return true;
        }
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public Product getProductFromListOfProducts(Product product) {
        return listOfProducts.get(listOfProducts.indexOf(product));
    }
}

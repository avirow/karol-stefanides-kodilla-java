package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class RegisterProducers {
    Map<ProviderProcess, RegisterProduct> registerProducers = new HashMap<ProviderProcess, RegisterProduct>();

    public void addNewProducer(ProviderProcess producer, RegisterProduct registrerProducts) {
        registerProducers.put(producer, registrerProducts);
    }

    public void showAllAvailableProducts() {
        for (Map.Entry<ProviderProcess, RegisterProduct> current : registerProducers.entrySet()) {
            System.out.println(current.getKey());
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.getQuantity() > 0)
                    System.out.println(currentProduct.toString());
            }
        }
    }

    public boolean isAvailableProduct(Product product, int volumeOfPurchase) {
        for (Map.Entry<ProviderProcess, RegisterProduct> current : registerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.equals(product) && currentProduct.getQuantity() > volumeOfPurchase) {
                    product.setQuantityAfterSale(volumeOfPurchase);
                    return true;
                }
            }
        }
        return false;
    }

    public ProviderProcess getProducerOfSpecyficProduct(Product product) {
        for (Map.Entry<ProviderProcess, RegisterProduct> current : registerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.equals(product)) {
                    return current.getKey();
                }
            }
        }
        return null;
    }
}

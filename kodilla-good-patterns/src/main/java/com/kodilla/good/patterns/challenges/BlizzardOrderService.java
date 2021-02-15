package com.kodilla.good.patterns.challenges;

public class BlizzardOrderService implements  OrderService{
    public boolean order(User user, Product product){
        System.out.println("Creating order");
        if(product != null){
            System.out.println(user.toString() + " your order have been crated, you pick: " + product.toString());
            return true;
        }
        else{
            System.out.println("You don't pick product");
            return false;
        }
    }
}

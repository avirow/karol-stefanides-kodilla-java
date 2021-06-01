package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicOrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String desc = theOrder.getDescription();
        //Then
        assertEquals("Basic Pizza", desc);
    }

    @Test
    public void testOrderWithAllIngredientGetCost(){
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new BBQSauce(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(27.5), theCost);
    }

    @Test
    public void testOrderWithAllIngredientGetDescription(){
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new BBQSauce(theOrder);
        //when
        String theDesc = theOrder.getDescription();
        //then
        assertEquals("Basic Pizza + cheese + onion + pepperoni + bbq sauce", theDesc);
    }
}

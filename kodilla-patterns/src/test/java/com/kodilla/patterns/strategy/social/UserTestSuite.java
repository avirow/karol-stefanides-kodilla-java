package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User karol = new Millenials("Karol");
        User maciek = new YGeneration("Maciek");
        User marek = new ZGeneration("Marek");

        //When
        String karolUse = karol.sharePost();
        System.out.println("Karol " + karolUse);
        String maciekUse = maciek.sharePost();
        System.out.println("Maciek " + maciekUse);
        String marekUse = marek.sharePost();
        System.out.println("Marek " + marekUse);

        //Then
        assertEquals("Using Snapchat", karolUse);
        assertEquals("Using Facebook", maciekUse);
        assertEquals("Using Twitter", marekUse);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User karol = new Millenials("Karol");

        //When
        String karolUse = karol.sharePost();
        System.out.println("Karol " + karolUse);
        karol.setSocialPublisher(new FacebookPublisher());
        karolUse = karol.sharePost();
        System.out.println("Karol " + karolUse);

        //Then
        assertEquals("Using Facebook", karolUse);

    }
}

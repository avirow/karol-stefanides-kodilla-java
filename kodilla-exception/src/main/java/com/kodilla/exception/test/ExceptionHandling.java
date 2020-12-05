package com.kodilla.exception.test;

public class ExceptionHandling {

    SecondChallenge secondChallenge = new SecondChallenge();
    String result;

    public void handling(double x, double y) throws SecondChallengeExeption
    {
        try {
            result = secondChallenge.probablyIWillThrowException(x, y);
            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error:" + e);
            throw new SecondChallengeExeption();
        }
    }

}

package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionHandling {

    SecondChallenge secondChallenge = new SecondChallenge();
    String result;

    public void handling(double x, double y) throws SecondChallengeExeption {
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

    public static void main(String[] args)  {

        String result;
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            result = secondChallenge.probablyIWillThrowException(3, 1.5);
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Error:" + e);
            //throw new SecondChallengeExeption();
        }
        finally {
            System.out.println("Done !");
        }
    }


}

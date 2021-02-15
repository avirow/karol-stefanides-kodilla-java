package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    public void inform(User user,Address adress){
         System.out.println("Sending mail to " + user.toString() + " on this mail adress: " + adress.toString());
   }
}

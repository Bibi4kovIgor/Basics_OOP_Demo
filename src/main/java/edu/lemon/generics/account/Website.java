package edu.lemon.generics.account;

import java.util.zip.GZIPInputStream;

public class Website {
    public static void main(String[] args) {
        Account<Integer, String> gitAccount = new Account<>();
        MicrosoftAccount<String> microsoftAccount = new MicrosoftAccount<>();
        Accountable<String> googleAccount = new GoogleAccount<>();


        gitAccount.setId(123456789);
        gitAccount.setPassword("PASSWORD");
        System.out.println(gitAccount.getId());
        System.out.println(gitAccount);

        microsoftAccount.setId("Ihor");
        microsoftAccount.setPassword("PASSWORD");
        System.out.println(microsoftAccount.getId());
        System.out.println(microsoftAccount);
        microsoftAccount.printToken("secret");

    }
}

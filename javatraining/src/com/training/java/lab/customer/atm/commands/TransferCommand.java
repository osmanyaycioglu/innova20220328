package com.training.java.lab.customer.atm.commands;

import java.util.Scanner;

import com.training.java.lab.customer.Customer;
import com.training.java.lab.customer.CustomerManager;

public class TransferCommand implements IATMCommand {

    @Override
    public void executeCommand(final Customer customerParam,
                               final Scanner scannerParam,
                               final CustomerManager customerManagerParam) {
        System.out.println("Para göndereceğiniz hesap no : ");
        Long accountNumber = scannerParam.nextLong();
        Customer toCustomerLoc = customerManagerParam.getCustomerByAccountNumber(accountNumber);
        if (toCustomerLoc == null) {
            System.out.println("Böyle bir hesap bulunmuyor");
            return;
        }
        System.out.println("Göndereceğiniz miktar : ");
        int nextIntLoc = scannerParam.nextInt();
        if (nextIntLoc > customerParam.getAmount()) {
            System.out.println("hesabınızdaki paradan daha fazla çekemezsiniz");
            return;
        }
        customerParam.setAmount(customerParam.getAmount() - nextIntLoc);
        toCustomerLoc.setAmount(toCustomerLoc.getAmount() + nextIntLoc);
        System.out.println("para transferiniz başarı ile tamamlandı");
    }

    @Override
    public String getDesc() {
        return "Para transferi";
    }

}

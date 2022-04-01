package com.training.java.lab.customer.atm.commands;

import java.util.Scanner;

import com.training.java.lab.customer.Customer;
import com.training.java.lab.customer.CustomerManager;

public class WithdrawCommand implements IATMCommand {

    @Override
    public void executeCommand(final Customer customerParam,
                               final Scanner scannerParam,
                               final CustomerManager customerManagerParam) {
        System.out.println("Çekeceğiniz miktar : ");
        int nextIntLoc = scannerParam.nextInt();
        if (nextIntLoc > customerParam.getAmount()) {
            System.out.println("hesabınızdaki paradan daha fazla çekemezsiniz");
            return;
        }
        customerParam.setAmount(customerParam.getAmount() - nextIntLoc);
    }

    @Override
    public String getDesc() {
        return "Para çek";
    }

}

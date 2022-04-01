package com.training.java.lab.customer.atm.commands;

import java.util.Scanner;

import com.training.java.lab.customer.Customer;
import com.training.java.lab.customer.CustomerManager;

public class DepositCommand implements IATMCommand {

    @Override
    public void executeCommand(final Customer customerParam,
                               final Scanner scannerParam,
                               final CustomerManager customerManagerParam) {
        System.out.println("Yatıracağınız miktar : ");
        int nextIntLoc = scannerParam.nextInt();
        customerParam.setAmount(customerParam.getAmount() + nextIntLoc);
    }

    @Override
    public String getDesc() {
        return "Para yatır";
    }

}

package com.training.java.lab.customer.atm.commands;

import java.util.Scanner;

import com.training.java.lab.customer.Customer;
import com.training.java.lab.customer.CustomerManager;

public class ShowAccount implements IATMCommand {

    @Override
    public void executeCommand(final Customer customerParam,
                               final Scanner scannerParam,
                               final CustomerManager customerManagerParam) {
        System.out.println(customerParam.getAccountNumber()
                           + " nolu hesabınızda  "
                           + customerParam.getAmount()
                           + " TL para var");
    }

    @Override
    public String getDesc() {
        return "Hesabı görüntüle";
    }

}

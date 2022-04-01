package com.training.java.lab.customer.atm.commands;

import java.util.Scanner;

import com.training.java.lab.customer.Customer;
import com.training.java.lab.customer.CustomerManager;

public interface IATMCommand {

    void executeCommand(Customer customerParam,
                        Scanner scannerParam,
                        CustomerManager customerManagerParam);

    String getDesc();
}

package com.training.java.lab.customer;

import java.util.ArrayList;
import java.util.List;

import com.training.java.lab.customer.atm.commands.DepositCommand;
import com.training.java.lab.customer.atm.commands.IATMCommand;
import com.training.java.lab.customer.atm.commands.ShowAccount;
import com.training.java.lab.customer.atm.commands.TransferCommand;
import com.training.java.lab.customer.atm.commands.WithdrawCommand;

public class ATMCommandFactory {

    public static List<IATMCommand> getATMCommandsForCustomer(final Customer customerParam) {
        List<IATMCommand> commandsLoc = new ArrayList<>();
        switch (customerParam.getCustomerType()) {
            case PLANTINUIM:
                commandsLoc.add(new TransferCommand());
                commandsLoc.add(new WithdrawCommand());
            case GOLD:
                commandsLoc.add(new DepositCommand());
            case SILVER:
            default:
                commandsLoc.add(new ShowAccount());
                break;
        }
        return commandsLoc;
    }
}

package com.training.java.lab.customer;

import java.util.List;
import java.util.Scanner;

import com.training.java.lab.customer.atm.commands.IATMCommand;

public class ATM {

    public void runATM() {
        CustomerManager customerManagerLoc = new CustomerManager();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("username : ");
            String usernameLoc = scanner.nextLine();
            System.out.println("password : ");
            String passwordLoc = scanner.nextLine();
            Customer loginCustomerLoc = customerManagerLoc.login(usernameLoc,
                                                                 passwordLoc);
            if (loginCustomerLoc != null) {
                List<IATMCommand> atmCommandsLoc = ATMCommandFactory.getATMCommandsForCustomer(loginCustomerLoc);
                while (true) {
                    int iLoc = 0;
                    for (iLoc = 0; iLoc < atmCommandsLoc.size(); iLoc++) {
                        System.out.println((iLoc + 1)
                                           + "-"
                                           + atmCommandsLoc.get(iLoc)
                                                           .getDesc());
                    }
                    System.out.println((iLoc + 1) + "-Çıkış");
                    System.out.println("Seçiminiz : ");
                    int nextIntLoc = scanner.nextInt();
                    if ((nextIntLoc - 1) < atmCommandsLoc.size()) {
                        IATMCommand iatmCommandLoc = atmCommandsLoc.get(nextIntLoc - 1);
                        iatmCommandLoc.executeCommand(loginCustomerLoc,
                                                      scanner,
                                                      customerManagerLoc);
                    } else {
                        return;
                    }
                }
            } else {
                System.out.println("Login hatası");
            }
        } catch (Exception eLoc) {
            // TODO: handle exception
        }
    }
}

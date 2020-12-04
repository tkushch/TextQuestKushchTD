package com.company;

import com.sun.jdi.IntegerValue;

import java.sql.Struct;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    Scanner inp = new Scanner(System.in);

    public void showLocation(Location loc) {
        System.out.println("\n" + "You are at " + loc.name);
        System.out.println("Choose:");
        for (int i = 0; i < loc.actions.length; i++) {
            System.out.println(String.valueOf(i + 1) + ". " + loc.actions[i].getText());
        }
    }

    public int getChoice(Location loc) {
        boolean ok1 = false, ok2 = false;
        int choice = 0;
        while (!ok1 || !ok2) {
            ok1 = false;
            ok2 = false;
            try {
                choice = inp.nextInt() - 1;
                ok1 = true;
            }
            catch (InputMismatchException e){
                inp.next();
                System.out.println("incorrect value");

            }
            if (ok1) {
                if (0 <= choice && choice < loc.actions.length) {
                    ok2 = true;
                } else {
                    System.out.println("incorrect value");
                }
            }
        }
        return choice;
    }
}

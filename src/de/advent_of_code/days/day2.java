package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.List;

public class day2 {

    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        List list;
        list = ReadFile.readFile("/home/juha/Downloads/AdventCode/ressource/day1");

        int zahlEins = 0;
        int zahlZwei = 0;
        int result = 0;


        for (int i = 0; i < list.size(); i++) {

            for (int j = 1; j < list.size(); j++) {

                zahlEins = Integer.parseInt((String) list.get(i));
                zahlZwei = Integer.parseInt((String) list.get(j));
//                System.out.print(zahlZwei + zahlEins + "\n");

                if ((zahlEins + zahlZwei) == 2020) {
                    result = zahlEins + zahlZwei;
                    System.out.print("Resultat = " + (zahlEins*zahlZwei) + "\n");
                    System.out.print("ZahlEins = " + zahlEins + "\n");
                    System.out.print("ZahlZwei = " + zahlZwei + "\n");
                    break;
                }
            }
        }

        System.out.print("Nothing found");

    }

}

package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.List;

public class day1 {

    public static void main(String[] args) {

        List<String> list;
        list = ReadFile.readFile("/home/juha/Downloads/AdventCode/resource/data/day1");

        int zahlEins,zahlZwei;

        for (int i = 0; i < list.size(); i++) {

            for (int j = 1; j < list.size(); j++) {

                zahlEins = Integer.parseInt(list.get(i));
                zahlZwei = Integer.parseInt(list.get(j));

                if ((zahlEins + zahlZwei) == 2020) {
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

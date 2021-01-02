package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.List;

public class day8 {


    public static void main(String[] args) {


        List<String> list = ReadFile.readFile("/home/juha/Downloads/AdventCode/resource/data/day8");

        int accumulator = 0;

        for (int i = 0; i < list.size(); i++) {

            System.out.println("--- Iteration " + i + "---");
            System.out.println(list.get(i));

            if (list.get(i).contains("flag")) {
                break;
            } else {
                //flag line
                list.set(i, list.get(i) + " flag");
            }

            if (list.get(i).contains("jmp")) {

                String[] parts = list.get(i).split(" ");

                i += Integer.parseInt(parts[1]) - 1;

            } else if (list.get(i).contains("acc")) {

                String[] parts = list.get(i).split(" ");

                accumulator += Integer.parseInt(parts[1]);

            }
            System.out.println(accumulator);

        }

        System.out.println(accumulator);

    }

}

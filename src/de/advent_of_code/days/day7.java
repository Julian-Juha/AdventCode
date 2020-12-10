package de.advent_of_code.days;

import java.util.Arrays;
import java.util.List;

public class day7 {

    public static void main(String[] args) {

           /*
           1 wo steht shiny an 2ter oder dritter stelle
           -> dann weiß ich in welche bag noch nen shiny gold reinpasst
              + ignore contain no other bag, überlegen wie ich das sauber löschen kann ohne leerzeilen
              + nach jedem "." neues array[i]

           2 da wo shiny drin ist, ersten beiden bangs aufzählen

           3 das total von 2 ist das result

         */


        System.out.println("Start");
        List<String> array;

        array = Arrays.asList(
                "light red bags contain 1 bright white bag, 2 muted yellow bags.",
                        "dark orange bags contain 3 bright white bags, 4 muted yellow bags.",
                        "bright white bags contain 1 shiny gold bag.",
                        "muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.",
                        "shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.",
                        "dark olive bags contain 3 faded blue bags, 4 dotted black bags.",
                        "vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.",
                        "faded blue bags contain no other bags.",
                        "dotted black bags contain no other bags.");

        // clean data
        for (int i = 1; i<array.size()-1;i++) {

            if (array.get(i-1).contains("no other bags.")){
//                System.out.println("\nNO OTHER BAGS");
                array.remove(i-1);
            }
        }


        for (String s :array) {
            System.out.println(s);
        }



    }

    public static void getArray(List<String> list) {

    }
}

package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.List;

public class day3 {

    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        List<String> lines;
        lines = ReadFile.readFile("/home/juha/Downloads/AdventCode/resource/data/day3");

        int trees = 0;
        int horizonPos = 0;
        for( int i = 1; i < lines.size(); i++){
            horizonPos += 3;
            if( horizonPos > lines.get(i).length()-1) {
                horizonPos = horizonPos-lines.get(i).length();
            }
            if( lines.get(i).charAt(horizonPos) == '#' ){
                trees++;
            }
        }
        System.out.println(trees);
    }

//        int treesHit = 0;
//        int i = 0;
//
//
//        for (int j = 1; j < list.size(); j++) {
//
//            if (i <= list.get(1).length()) {
//
//                System.out.print(list.get(j) + "\n" + "Char at: " + i + " is " + list.get(j).charAt(i) + "\n");
//
//                if (list.get(j).charAt(i) == '#') {
//                    treesHit++;
//                }
//
//                i += 3;
//            }
//        }
//        System.out.print("Trees hit: " + treesHit);
    }
//}


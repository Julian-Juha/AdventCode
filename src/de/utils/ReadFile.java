package de.utils;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {

    public ReadFile() {
    }

    public static List<String> readFile(String path) {

        List<String> list=new ArrayList<String>();

        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return list;
    }

}

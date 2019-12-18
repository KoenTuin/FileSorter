//Created by Koen van der Tuin
package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileSort {
    public static void main(String[] args) {
        //File dir should be inserted via a fxml window by user
        File dir = new File("D:\\Foto's\\29-5-2019");
        String configL = "C:\\Users\\koenv\\Desktop\\Hobby projecten\\FileSorter\\src\\sample\\config.txt";

        //For multimedia folders

        String[] list = readArray(configL);
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {

//      //basic = String dirF = dir + "\\" + name from array;Ø
            String dirR = dir + "\\" + list[i].toUpperCase();

//        //Create an Array from the files in the directory
            File[] files = dir.listFiles();

            File directoryR = new File(dirR);

            //Loop through the files in the given directory
            for (File file : files) {
                String fileName = file.getName();
                //make .jpg a variable so it can be used for multiple types
                if (fileName.toLowerCase().endsWith("." + list[i])) {
                    //Create folder if it does not exist
                    if (!directoryR.exists()) {

                        directoryR.mkdir();
                    }
                    file = new File(dir + "\\" + fileName);
                    file.renameTo(new File(dirR + "\\" + fileName));

                }
            }
        }
    }

    public static String[] readArray(String file) {
        int count = 0;
        try {
            Scanner s = new Scanner(new File(file));
            while (s.hasNextLine()) {
                count = count + 1;
                s.next();
            }
            String[] fileTypes = new String[count];
            Scanner s2 = new Scanner(new File(file));
            for (int i = 0; i < count; i++) {
                fileTypes[i] = s2.next();
            }
            return fileTypes;

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e);
        }
        return null;
    }
}



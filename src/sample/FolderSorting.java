package sample;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;

public class FolderSorting {
    public static void main(String[] args) {

        String dir = "D:\\1-2-2018";

        //Declare paths
        String dirJpg = "D:\\1-2-2018\\JPG";
        String dirJpgc = "D:\\1-2-2018\\*.JPG";

        //Declare directory
        File directory = new File(dirJpg);

        //Create an array of the files inside the directory
        File[] files = directory.listFiles();

        //Create new JPG folder if not existing
        if(!directory.exists()){
            directory.mkdir();
        }

        //Move files from parent directory into the JPG directory

        }

        }

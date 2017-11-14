package com.example.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by admin on 2017/8/15.
 */
public class WriteToFileExample {
    public static void writeTofile(String content,String path) {
        try {

             content = "This is the content to write into file";

            File file = new File("/Users/admin/Desktop/WSO2_SOCIAL_DB/filename.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

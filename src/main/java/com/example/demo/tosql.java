package com.example.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by admin on 2017/8/15.
 */
public class tosql {
    public static String currentDatabase="ES_STORAGE";







    public static void main(String[] args) {
// This is the path where the file's name you want to take.
//        先得到工作路径下的文件的文件名
//        循环判断用哪个数据库，选择该数据库的路径

        getDatabaseFolder("/Users/admin/Desktop/h2/");





    }

    private static void getFile(String path) {
        // get file list where the path has
        File file = new File(path);
        // get the folder list
        File[] array = file.listFiles();
        String s="";
        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile()) {
                // only take file name
                System.out.println(array[i].getName().split("\\.")[0]);

                String tablename = array[i].getName().split("\\.")[0];


                if (tablename.equals("") || tablename == null) {
                    continue;
                }
                String sql = "CALL CSVWRITE('" + "/Users/admin/Desktop/h2/" + currentDatabase+"/" + tablename + ".csv" + "','SELECT * FROM " + tablename + "');" + "\n";

                s=sql+s;

                // take file path and name
//                System.out.println("#####" + array[i]);
                // take file path and name
//                System.out.println("*****" + array[i].getPath());
            } else if (array[i].isDirectory()) {
                System.out.println("该位置不应该存在文件夹");
            }
        }

        writeTofile(s, "/Users/admin/Desktop/sql/"+currentDatabase+".sql");




    }

    private static void getDatabaseFolder(String path) {
        // get file list where the path has
        File file = new File(path);
        // get the folder list
        File[] array = file.listFiles();

        for (int i = 0; i < array.length; i++) {
            if (array[i].isDirectory()) {



                System.out.println(array[i].getName());

                String databaseFolder = array[i].getName();
                currentDatabase=databaseFolder;
                getFile("/Users/admin/Desktop/h2/" + currentDatabase+"/");
//                if (databaseFolder.equals("ES_STORAGE")) {
//                    currentDatabase = "ES_STORAGE";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2_SOCIAL_DB")) {
//                    currentDatabase = "WSO2_SOCIAL_DB";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2AM_DB")) {
//                    currentDatabase = "WSO2AM_DB";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2_SOCIAL_DB")) {
//                    currentDatabase = "WSO2_SOCIAL_DB";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2APPM_DB")) {
//                    currentDatabase = "WSO2APPM_DB";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2CARBON_DB")) {
//                    currentDatabase = "WSO2CARBON_DB";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2DM_DB")) {
//                    currentDatabase = "WSO2DM_DB";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2METRICS_DB")) {
//                    currentDatabase = "WSO2METRICS_DB";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2MobileAndroid_DB")) {
//                    currentDatabase = "WSO2MobileAndroid_DB";
//                    getFile(inPath);
//                } else if (databaseFolder.equals("WSO2MobileWindows_DB")) {
//                    currentDatabase = "WSO2MobileWindows_DB";
//                    getFile(inPath);
//                }
//



                System.out.println("databaseFolder======"+databaseFolder);





            }
        }
    }


    public static void writeTofile(String content, String path) {
        try {

//            content = "This is the content to write into file";

//            File file = new File("/Users/admin/Desktop/WSO2_SOCIAL_DB/filename.txt");
            File file = new File(path);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("it's over !");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}








package filelearn;

import java.io.File;

public class PackageScan {
    public static void main(String[] args) {

    String PACKAGE_PATH="D:\\programming\\Learning\\src\\filelearn";
    File packageFile = new File(PACKAGE_PATH);
        File[] files = packageFile.listFiles();
        if(files.length > 0){
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else System.out.println("Array is Empty");



    }//main

}

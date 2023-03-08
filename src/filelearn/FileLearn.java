package filelearn;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileLearn {
    public static void main(String[] args) throws IOException {
        File dir = new File("d:/testdir/");
        if (!dir.exists()){
            dir.mkdir();
            System.out.println("Dir is created");
        }else{
            System.out.println("Dir already exist");
        }

        File[] files = dir.listFiles();
        if(files.length!=0){
            System.out.println(Arrays.toString(files));
        } else{
            System.out.println("Dir is empty");
        }

        File toCreate = new File(dir,"created.txt");
        if(!toCreate.exists()){
            toCreate.createNewFile();
        }else System.out.println("This file exists");

        String separator = File.separator;
        char sep1 = separator.charAt(0);
        File sepLearn1 = new File(dir, "sep1.txt");

        if (!sepLearn1.exists()) {
            sepLearn1.createNewFile();
        }

        File sepLearn2= new File("d:"+separator+"testdir"+separator,"sepLearn2.txt");
        if (!sepLearn2.exists()) {
            sepLearn2.createNewFile();
        }
        System.out.println("====================");
        System.out.println(sep1);
        System.out.println(sepLearn1);
        System.out.println(sepLearn2);
    }

}

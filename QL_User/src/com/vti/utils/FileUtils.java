package com.vti.utils;

import java.io.File;

public class FileUtils {
    public static void main(String[] args) {
        FileUtils.checkFileExist("/Users/macos/Desktop/VTI/class/ra 99/javacore_ra99/lib/lombok-1.16.20.jar");
    }
    public static boolean checkFileExist(String pathFile){
        File file = new File(pathFile);
        boolean check = file.exists();
        System.out.println(check ? "File tôn tại" : "File ko tồn tại");
        return check;
    }
}

package com.vti.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class FileUtils {
    public static void main(String[] args) {
//        FileUtils.checkFileExist("/Users/macos/Desktop/VTI/class/ra 99/javacore_ra99/lib/lombok-1.16.20.jar");
        abc();
    }
    public static boolean checkFileExist(String pathFile){
        File file = new File(pathFile);
        boolean check = file.exists();
        System.out.println(check ? "File tôn tại" : "File ko tồn tại");
        return check;
    }

    public static void abc(){
        String inputFilePath = "/Users/macos/Desktop/VTI/class/ra 99/javacore_ra99/lib/Untitled.txt";     // file chứa base64
        String outputFilePath = "/Users/macos/Desktop/VTI/class/ra 99/javacore_ra99/lib/p5.pdf";   // file output (đổi đuôi tùy ý)

        try {
            // 1. Đọc toàn bộ nội dung file text
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sb.append(line.trim());
            }
            reader.close();

            String base64 = sb.toString();
            // 2. Decode Base64
            byte[] decodedBytes = Base64.getDecoder().decode(base64);

            // 3. Ghi ra file
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            fos.write(decodedBytes);
            fos.close();

            System.out.println("Convert thành công! File lưu tại: " + outputFilePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

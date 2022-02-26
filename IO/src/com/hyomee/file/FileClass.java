package com.hyomee.file;

import java.io.File;
import java.io.IOException;

public class FileClass {
  public static void main(String... args) throws IOException {
    File file = new File("d:\\works\\readme.txt");

    if (!file.exists()) {
        file.createNewFile();
    }

    // File 객체 주요 API
    System.out.println("절대 경로   : " + file.getAbsolutePath());
    System.out.println("폴더 여부   : " + file.isDirectory());
    System.out.println("파일 여부   : " + file.isFile());
    System.out.println("현재 이름   : " + file.getName());
    System.out.println("부모 이름   : " + file.getParent());
    System.out.println("현재 path   : " + file.getPath());
  }
}

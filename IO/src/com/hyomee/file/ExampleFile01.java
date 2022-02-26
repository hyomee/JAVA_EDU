package com.hyomee.file;

import java.io.File;
import java.io.IOException;

public class ExampleFile01 {
  public static void main(String... args) throws IOException {
    // 폴더 위치 지정 ( 다른 폴더를 지정 하는 경우 이곳을 수정 )
    String pathname = "d:" + File.separator + "temp" ;

    // file 객체 생성
    File file = new File(pathname);
    if(file.exists()) { // 해당 위치에 존재 여부 확인
      // 해당 위치에 폴더가 없으므로 폴더 생성
      file.mkdir();
    }

    System.out.println( "** 폴더 안에 내용을 출력 한다.");
    getDirectoryAndFile(file);

    System.out.println( "** 폴더를 생성 하고 생성 한 폴더에 파일을 생성 한다.");
    // 새로운 폴더를 생성 한다.
    File newDir = makeDir(file, "SampleDir");

    // 새로운 파일을 만든다
    File newFile = makeFile(newDir, "readme.txt");
    getDirectoryAndFile(file);
  }

  /**
   * 현재 File 객체와 하위에 생성할 폴더이 이름을 받아서
   * 폴더를 생성 한다.
   * @param parent          현재 File 객체
   * @param directoryName   하위 폴더 명
   * @return                생성 된 폴더 객체
   */
  static File makeDir(File parent, String directoryName) {
    File newDir = new File(parent, directoryName);
    if (!newDir.exists()) newDir.mkdir();
    return newDir;
  }

  /**
   * 현재 디렉토리(File 객체)와 생성할 파일이름을 받아서
   * 파일을 생성 한다.
   * @param directory   현재 디렉토리(File 객체)
   * @param filename    생성 할 파일이름
   * @return            생성 한 파일 객체
   * @throws IOException
   */
  static File makeFile(File directory, String filename) throws IOException {
    File newFile = new File(directory, filename);
    if (!newFile.exists()) newFile.createNewFile();
    return newFile;
  }

  /**
   * 폴더명을 입력 하면 폴더안에 있는 폴더와 파일을 출력 한다.
   * @param directory
   */
  static void getDirectoryAndFile(File directory) {
    File[] files = directory.listFiles();
    for(File file: files) {
      if (file.isDirectory()) {
        // 폴더 이면 폴더 안의 내용을 읽읽
        viweFile(file);
        getDirectoryAndFile(file);
      } else {
        viweFile(file);
      }
    }
  }

  /**
   * 폴더와 파일을 출력 한다.
   * @param file
   */
  static void viweFile(File file) {
    String dirOrFile = file.isDirectory() ? "폴더" : "파일";
    System.out.println( dirOrFile + " : " + file.getParent() + " : " + file.getName());
  }
}

package com.hyomee.fileStream;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileReadMain {

  public static void main(String... args) throws IOException {
    readFile();
    writeFile();

  }

  static void readFile() throws IOException {
    File file = getile("sample.txt");
    InputStream fileStram = inputFileStream(file);
    // 1 byte 씩 읽기
    readChar(fileStram);
    InputStream fileStramBytes = inputFileStream(file);
    // n byte 읽기
    readByte(fileStramBytes, 10);
    fileStram.close();
    fileStramBytes.close();
  }

  /**
   * 파일 이름을 받아서 파일 객체를 반환 한다.
   * @param fileName
   * @return
   */
  static File getile(String fileName) {
    String pathname = "d:" + File.separator +
            "works" +  File.separator + "JAVA_EDU"
            + File.separator + "IO"
            + File.separator +  fileName;
    return new File(pathname);
  }

  /**
   * 파일 객체를 파일 스트림 객체로 반환 한다.
   * @param file
   * @return
   * @throws IOException
   */
  static InputStream inputFileStream(File file) throws IOException {
    return new FileInputStream(file);
  }

  /**
   * 파일 스트림 객체를 읽어서 출력 한다.
   * @param inputStream
   * @param readByteCout      한번에 읽은 바이트 수
   * @throws IOException
   */
  static void readByte(InputStream inputStream, int readByteCout) throws IOException {
    byte[] bytes = new byte[readByteCout];
    int dataCount, totalReadCout = 0;
    while( (dataCount = inputStream.read(bytes)) != -1 ) {
      String str = new String(bytes, 0, dataCount, Charset.forName("UTF-8"));
      System.out.println(str);
      System.out.println("읽은 데이터 :" + dataCount
              + " , 남은 테이터 : " + inputStream.available());
      totalReadCout = totalReadCout + dataCount;
    }
    System.out.println("readByte 총 읽은 데이터 수 : " + totalReadCout);
  }

  static void readChar(InputStream inputStream) throws IOException {
    int dataCount, totalReadCout = 0;;
    while( (dataCount = inputStream.read()) != -1 ) {
      System.out.println("읽은 데이터 :" + (char)dataCount
          + " , 남은 테이터 : " + inputStream.available());
      totalReadCout = totalReadCout + 1;
    }
    System.out.println("readChar 총 읽은 데이터 수 : " + totalReadCout);
  }

  static void writeFile() throws IOException {
    File file = getile("newSample.txt");
    if (! file.exists()) file.createNewFile();
    OutputStream outputStream = new FileOutputStream(file, true); // 데이터 연결
    writeStream(outputStream, "신규 파일 생성");
    outputStream.close();
  }

  static void writeStream(OutputStream outputStream, String writeStr) throws IOException {
    byte[] bytes =  writeStr.getBytes(StandardCharsets.UTF_8);
    outputStream.write(bytes);
    outputStream.write('\n');
    outputStream.flush();
  }
}

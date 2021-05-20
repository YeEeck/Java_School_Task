package ClassTask9_10.Task10_2;


import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入源文件名:");
        String fileName = scanner.nextLine();
        for (int i = 1; i <= 3; i++) {
            copy(fileName, i + "_" + fileName, 1024);
        }

    }

    public static void copy(String source, String dest, int bufferSize) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(new File(source));
            out = new FileOutputStream(new File(dest));

            byte[] buffer = new byte[bufferSize];
            int len;

            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert in != null;
                in.close();
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

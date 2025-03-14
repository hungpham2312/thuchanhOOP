package baith10.bai1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        String input = "Hello WORLD! This is a Test.";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        MyFilterInputStream myFilterInputStream = new MyFilterInputStream(inputStream);

        try {
            int c;
            while ((c = myFilterInputStream.read()) != -1) {
                System.out.print((char) c);
            }
            myFilterInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


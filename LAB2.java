package bytesteams;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB2 {

    public static void main(String[] args) {

        try {
            FileOutputStream outputStream = new FileOutputStream("data.dat");
            String s = "Hello World";
            byte[] b = s.getBytes();
            outputStream.write(b);
            outputStream.close();
        } catch (FileNotFoundException exception) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, exception);
        } catch (IOException exception) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, exception);
        }

        try {
            FileInputStream inputStream = new FileInputStream("data.dat");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print(value + " ");
                System.out.println((char) value);
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

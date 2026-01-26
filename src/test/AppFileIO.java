
package test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AppFileIO {

    public static void main(String[] args) throws IOException {

        // test file io
        //
        //
        
        String fileName = "data/file.txt";
        File file = new File(fileName);

        System.out.println("file: " + file);
        System.out.println("does it exist? " + file.exists());
        System.out.println("absolute path: " + file.getAbsolutePath());

        FileReader fr = new  FileReader(file);

        if (file.exists()) {
            int i = fr.read();
            System.out.println("i = " + (char) i);
        }

    }

}

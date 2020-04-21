package com.hank.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jk = new File("G:\\JK");
        jk.mkdir();
        FileWriter fr = new FileWriter("G:\\JK\\output.txt");
        fr.write("abcdefg");
        fr.flush();
        fr.close();
    }
}

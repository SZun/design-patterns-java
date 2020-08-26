package com.zun;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        int c;

        byte[] bytes = "Jason Fedin aBBBBccccDDDD".getBytes();

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream(bytes)));

            while((c = in.read()) >= 0){
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

}

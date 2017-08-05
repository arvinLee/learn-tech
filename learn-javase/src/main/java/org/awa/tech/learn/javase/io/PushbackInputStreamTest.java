package org.awa.tech.learn.javase.io;

import java.io.*;

/**
 * Created by lisa on 2017/7/12.
 */
public class PushbackInputStreamTest {

    public static void main(String[] args) {

        try {
            PushbackInputStream in = new PushbackInputStream(new FileInputStream("/Users/lisa/data.txt"));
            DataInputStream dataInputStream = new DataInputStream(in);
            int data = dataInputStream.read();

            System.out.println(data);

            if(data == 2){
                in.unread(data);
            }

            data = dataInputStream.readInt();

            System.out.println(data);


            dataInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

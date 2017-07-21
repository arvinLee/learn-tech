package org.awa.tech.learn.javase.exception;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/7/18.
 */
public class LostException {
    public static void main(String[] args) throws Exception {

        Exception readException = null;

        try {
            System.out.println(1/0);
        } catch (Exception e) {
            readException = e;
        } finally {
            try {
                String[] array = {};
                System.out.println(array[0]);
            } catch (Exception e) {
                if(readException != null){
                    readException.addSuppressed(e);
                }else{
                    readException = e;
                }

                throw readException;
            }
        }

    }

}

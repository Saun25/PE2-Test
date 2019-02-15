package com.stackroute.PE2;

import java.io.*;

public class Frequency {

    public int words(File filename) throws IOException {

        String path1="/home/saunak/PE2_testCases/src/main/java/com.stackroute.PE2/"+filename;

        String res="";
        File file = new File(path1);

        BufferedReader br = new BufferedReader(new FileReader(file));
        int out=0;
        String st;
        while ((st = br.readLine()) != null) {
            out+= st.split("( ){1,}").length;
        }


        return out;
    }

}

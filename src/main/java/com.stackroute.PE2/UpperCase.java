package com.stackroute.PE2;

import java.io.*;

public class UpperCase {
    public String upperCase(String filePath) throws IOException {

        String result="";
        String path="/home/saunak/PE2_testCases/src/main/java/com.stackroute.PE2/"+filePath;
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st="";
        if((st=br.readLine())!=null){
            result = result + st;
        }
        return result.toUpperCase();
    }
}

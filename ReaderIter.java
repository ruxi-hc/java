package com.nikoer.helloworld.data;
//133
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderIter {
    public static void main(String[] args) throws IOException{
        Pattern patt = Pattern.compile("[A-Za-z][a-z]+");
        BufferedReader r = new BufferedReader(new FileReader(args[0]));

        String line;
        while ((line = r.readLine()) !=null){
            Matcher m = patt.matcher(line);
        while(m.find()){
            int start = m.start(0);
            int end = m.end();

            System.out.println(line.substring(start, end));
        }
        }
    }
}

package com.nikoer.helloworld.data;

public class StringConvenience {
    public static void main (String[] argv){
        String pattern = ".*Q[^u]\\d+..*";
        String line = "Order QT300.Now!";
        if(line.matches(pattern)){
            System.out.println(line+"matches\""+pattern+"\"");
        }else{
            System.out.println("NO MATCH");
        }
    }
}

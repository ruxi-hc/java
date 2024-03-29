package com.nikoer.helloworld.data;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;



import java.math.*;
public class Heron {
    public static void main(String[] agrs){

        float af, bf, cf;
        float sf, areaf;

        double ad, bd, cd;
        double sd, aread;

        af = 12345679.0f;
        bf = 12345678.0f;
        cf = 1.01233995f;

        sf = (af+bf+cf)/2.0f;
        areaf = (float) Math.sqrt(sf*(sf-af)*(sf-bf)*(sf-cf));
        System.out.println("Single precision:"+areaf);

        ad = 12345679.0;
        bd = 12345678.0;
        cd = 1.01233995;

        sd = (ad+bd+cd)/2.0d;
        aread = Math.sqrt(sd*(sd-ad)*(sd-bd)*(sd-cd));
        System.out.println("Double precision:" + aread);
    }
}

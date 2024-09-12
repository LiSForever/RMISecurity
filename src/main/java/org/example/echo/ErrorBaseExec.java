package org.example.echo;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ErrorBaseExec {

    public static void do_exec(String args) throws Exception
    {
        Process proc = Runtime.getRuntime().exec(args);
        BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null)
        {
            sb.append(line).append("\n");
        }
        String result = sb.toString();
        throw new Exception(result);
    }
}
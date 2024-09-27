package org.example.jndi;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RMIClientWithJDNI {
    public static void main(String[] args) throws NamingException {
        String url = "rmi://localhost:1099/obj";
        InitialContext initialContext = new InitialContext();
        initialContext.lookup(url);
    }
}

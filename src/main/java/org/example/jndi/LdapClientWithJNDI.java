package org.example.jndi;

import javax.naming.InitialContext;

public class LdapClientWithJNDI {
    public static void main(String[] args) throws Exception{
        Object object=new InitialContext().lookup("ldap://127.0.0.1:7777/any/path/");
    }
}

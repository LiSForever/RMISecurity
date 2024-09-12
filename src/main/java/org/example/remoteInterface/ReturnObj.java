package org.example.remoteInterface;

import java.rmi.Remote;

public interface ReturnObj extends Remote {
    public Object returnObj() throws Exception;
}

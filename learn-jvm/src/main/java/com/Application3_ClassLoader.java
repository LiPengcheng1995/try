package com;

import com.domain.OOMObject;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lipengcheng3 Created date 2019-03-20 09:58
 */
public class Application3_ClassLoader {
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

//        OOMObject oomObject = new OOMObject();
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = "/Users/lipengcheng3/Desktop/"+name + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }

                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                return super.loadClass(name);
            }
        };
//        System.out.println(oomObject.getClass().getClassLoader());
        Object obj = myLoader.loadClass("testLoadClass").newInstance();
        System.out.println(obj.getClass());
//        System.out.println(obj.getClass().equals(oomObject.getClass()));
        System.out.println(obj.getClass().getClassLoader());

    }
}

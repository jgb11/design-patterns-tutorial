package com.jgb.designpatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author txoppe
 * @since 05/09/2017 | 16:26
 */
@SuppressWarnings({"squid:S2062", "squid:UnusedPrivateMethod", "squid:S1182"})
public class SingletonSerializable implements Serializable {

    private static final long serialVersionUID = -1093810940935189395L;

    private static SingletonSerializable sc = new SingletonSerializable();

    private SingletonSerializable() {
        if (sc != null) {
            throw new IllegalStateException("Already created.");
        }
    }

    public static SingletonSerializable getInstance() {
        return sc;
    }

    private Object readResolve() throws ObjectStreamException {
        return sc;
    }

    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("SingletonSerializable, cannot be clonned");
    }

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null)
            classLoader = SingletonSerializable.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }

}

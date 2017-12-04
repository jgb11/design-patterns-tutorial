package com.jgb.designpatterns.prototype;

@SuppressWarnings("squid:S2975")
public interface Prototype extends Cloneable {

    AccessControl clone() throws CloneNotSupportedException;

}

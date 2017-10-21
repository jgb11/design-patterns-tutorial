package com.jgb.designpatterns.chainofresponsibility.handlers;

import com.jgb.designpatterns.chainofresponsibility.model.File;

public interface Handler {
	
	void setHandler(Handler handler);
	void process(File file);
	String getHandlerName();
}

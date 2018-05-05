package com.websystique.springboot.util;

public class AnyMessage {

	private String anyMessage;
	 
    public AnyMessage(String msg){
        this.anyMessage = msg + " Tudo fixe?";
    }
 
    public String getAnyMessage() {
        return anyMessage;
    }
   }

package org.scoula.lib.cli.exception;

public class BadMenuException extends Exception{
    public BadMenuException(){
//        BadMenuException의 super => Exception
        super("Bad Menu");
    }
    public BadMenuException(String message){
        super(message);
    }
}

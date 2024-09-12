package com.niru.exception;

public class NotAllowedVoteException extends RuntimeException{
    public NotAllowedVoteException(String message){
        super(message);
    }
}

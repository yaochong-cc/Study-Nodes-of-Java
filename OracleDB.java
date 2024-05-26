package com.interface_;

public class OracleDB implements DBInterface{
    @Override
    public void connection(){
        System.out.println("connect to Oracle");
    }
    @Override
    public void close(){
        System.out.println("close to Oracle");
    }
}

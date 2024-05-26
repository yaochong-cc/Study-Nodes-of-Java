package com.interface_;

public class MysqlDB implements DBInterface {

	@Override
    public  void connect() {
        System.out.println("Connecting to MySQL database...");
    }
   @Override
    public void close(){
       System.out.println("Close to Mysql");

   }

}

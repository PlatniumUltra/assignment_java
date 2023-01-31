package day4;

import java.util.Scanner;

public class BankAccount {
    private String name;
    private String address;
    private String type;
    private int balance;
    private int transactions;
    private String accountNum;
    private static int accountCnt = 1000;

    public BankAccount(String name, String address, String type){
        this.accountNum = "BA"+accountCnt++;
        this.balance = 0;
        this.name=name;
        this.address = address;
        this.type = type;
    }

    public void getInfo(){
        System.out.println("Name: "+ this.name + "\n" +
                "Address: "+ this.address + "\n" +
                "Account type: "+ this.type + "\n" +
                "Account balance: "+ this.balance + "\n";);
    }

    public void deposit(int deposit){
        transactions++;
        balance+=deposit;
        System.out.println("balence: "+this.balance);
    }

    public void withdraw(int withdraw){
        transactions++;
        balance-=withdraw;
        System.out.println("balence: "+this.balance);
    }

    public void changeaddress(String address){
        this.address = address
        System.out.println("Address: "+this.address);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);


    }
}

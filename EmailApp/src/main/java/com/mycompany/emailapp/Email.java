
package com.mycompany.emailapp;

import java.util.Scanner;


public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private String email;
    private String companySuffix= "company.com";
    private int defaultpasswordLength= 10;
    private int mailboxCapacity= 500;
    
    public Email(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName= lastName;
        System.out.println("Email created for: "+this.firstName+" "+this.lastName);
        this.department= setDepartment();
        System.out.println("Department:"+this.department);
        this.password=randomPassword(defaultpasswordLength);
        System.out.println("Your password is: "+this.password);
        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+ companySuffix;
        System.out.println("Your Email is: "+email);
        mailboxCapacity--;
    }
    
    private String setDepartment(){
        System.out.println("Enter the department:\n1 for Sales\n2 for Development\n3 for Accounting:");
        Scanner in= new Scanner(System.in);
        int depChoice= in.nextInt();
        if(depChoice== 1){
            return "sales";
        }
        else if(depChoice== 2){
            return "dev";
        }
        else if(depChoice== 3){
            return "acct";
        }
        else{
            return " ";}
    }
    private String randomPassword(int lentgh){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUWXYZabcdefghıjklmnopqrstuwxyz0123456789!@+#";
        char[]password= new char[lentgh];
        for(int i=0; i<lentgh;i++){
            int rand= (int)(Math.random()*passwordSet.length()); 
            password[i]= passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public void setMailBoxsCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = alternateEmail;
    }
    
    public void changePassword(String password){
        this.password=password;
    }
    
    public int getMailBoxCapacity(){
        return mailboxCapacity;
    }
    
    public String getAlternateEmail(){
        return alternateEmail;
    }
      
    public String getPassword(){
        return password;
    }
    
    public String showInfo(){
        return "Display name: "+ firstName+ " "+ lastName+
                "Company email: "+ email+ "Mailbox capacity: "+
                mailboxCapacity;
    }
}

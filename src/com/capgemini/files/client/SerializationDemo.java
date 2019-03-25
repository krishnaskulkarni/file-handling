package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.files.model.BankAccount;
import com.capgemini.files.model.DebitCard;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		DebitCard debitCard = new DebitCard(1111222233334444L,234,11,2021);
		BankAccount account = new BankAccount(101,"john doe","SAVING",3400,debitCard);
		
		//serialization process
		FileOutputStream fileOutputStream = new FileOutputStream("account.ser");
		ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(account);
	    objectOutputStream.close();
	    
		FileInputStream fileInputStream = new FileInputStream("account.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		BankAccount account2 = (BankAccount) objectInputStream.readObject();
	    objectInputStream.close();
		System.out.println(account2);
	}
}

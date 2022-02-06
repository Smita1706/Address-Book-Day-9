package com.bridgelabz.AddressBook;

import java.util.Scanner;
public class AddressBook_UC4 extends AddressBook_UC2{
	static Scanner s = new Scanner(System.in);
	public void deleteData() {
		int i;
		System.out.println("\nEnter first name to delete : ");
		String name = s.next();
		for(i = 0 ; i < contactBook.size() ; i++) {
			if(contactBook.get(i).getFirstName().equals(name)) {
				contactBook.removeAll(contactBook);
				System.out.println("deleted");
			}
			else
				System.out.println("not deleted");
		}
	}

	public static void main(String[] args) {
		AddressBook_UC3 a = new AddressBook_UC3();
		AddressBook_UC4 b = new AddressBook_UC4();
		a.readData();
		a.DisplayContacts();
		a.editData();
		b.DisplayContacts();
		b.deleteData();
	}
}

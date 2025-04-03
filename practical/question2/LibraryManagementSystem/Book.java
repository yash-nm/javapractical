package practical.question2.LibraryManagementSystem;

public class Book {
	
	String title, author, ISBN;
	
	public Book(String title, String author, String ISBN) 
	{
		this.title 	= title;
		this.author = author;
		this.ISBN 	= ISBN;
	}
	
	void displayDetails()
	{
		System.out.println("-----------------------");
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("ISBN:  "+ ISBN);
	}
}

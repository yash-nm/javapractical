package practical.question2.LibraryManagementSystem;

public class EBook extends Book{
	
	String fileSize;
	
	public EBook(String title, String author, String ISBN) {
		super(title, author, ISBN);
		super.displayDetails();
		// TODO Auto-generated constructor stub
	}

	public void displayDetails()
	{
		System.out.println("FileSize:  "+fileSize);
		System.out.println("-----------------------");
	}
}

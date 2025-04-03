package practical.question2.LibraryManagementSystem;

public class ShowBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title 	= "Manaat";
		String author 	= "Mr.Achyut Godbole";
		String ISBN 	= "9385266284";
		
		EBook e = new EBook(title, author,ISBN);
		e.fileSize	= "3MB";
		e.displayDetails();
	}

}

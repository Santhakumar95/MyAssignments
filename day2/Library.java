package week1.day2;

public class Library {
	
	public String addBook(String bookTitle) {
		
		System.out.println("Book added successfully");
		return bookTitle;
		
		
	}
	
	public void issueBook() {
		
		System.out.println("Book issued successfully");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library obj= new Library();
		String bookName =	obj.addBook("The Monk");
		System.out.println(bookName);
		obj.issueBook();	

	}

}

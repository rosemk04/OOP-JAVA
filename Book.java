package pro1;

public class Library {
	String title;
	String author;
	final int bookID;
    
	static int bookCounter=1000;
	static final String LIBRARY_NAME="Central Library";
	
	Library() {
		this.title="Unknown Title";
		this.author="UnknownAuthor";
		this.bookID=bookCounter++;
	}
	Library(String title, String author) {
		this.title=title;
		this.author=author;
		this.bookID=bookCounter++;
	}
	void displayInfo() {
		System.out.println("Book ID: "+bookID);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println();
	}
	
	void displayInfo(boolean showLib) {
		displayInfo();
		if(showLib) {
			System.out.println("Library: "+LIBRARY_NAME);
			System.out.println();
		}
	}
	static void displayTotalBooks() {
		System.out.println("Total books added: "+(bookCounter-1000));
	}
	public static void main(String[] args) {
		Library b1=new Library();
		Library b2=new Library("Wings of Fire","A.P.J. Abdul kalam");
		Library b3=new Library("The Alchemist","Paulo Coelho");
		
		b1.displayInfo();
		b2.displayInfo(true);
		b3.displayInfo(false);
		
		Library.displayTotalBooks();
	}
}

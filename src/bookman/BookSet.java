package bookman;

import java.util.Scanner;
import java.util.Set;

/**
 * TODO: complete this specification
 */
public class BookSet {
    // TODO: attributes here
	private Set<Book> books;
	
	
	public BookSet() {
		super();
	}

	public BookSet(Set<Book> books) {
		super();
		this.books = books;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	Scanner scanInt = new Scanner(System.in);
	Scanner scanString = new Scanner(System.in);
	// TODO: complete these required methods with specification as specified in the requirements
    /**
     * TODO: complete this specification
     */
    public void addBook(Book book,Set<Book> books) {
        // TODO: complete this code
    	System.out.println("Enter id:");
    	int id = scanInt.nextInt();
    	System.out.println("Enter title:");
    	String title = scanString.nextLine();
    	System.out.println("Enter AuthorName:");
    	String authorName = scanString.nextLine();
    	System.out.println("Enter PublishedYear ");
    	int publishedYear = scanInt.nextInt();
    	book = new Book(id, title, authorName, publishedYear);
    	books.add(book);
        
    }
    
    /**
     * @requires <tt>this.books</tt> neq empty
     * @effects delete specified <tt>book</tt> from <tt>this.books</tt>
     */
    public void removeBook(Book book,Set<Book> books) {
        // TODO: complete this code
        if(books.contains(book)){
            
        
            books.remove(book);
        }else{
            System.out.println("This book is not available!");
        }
    	
    	
    }
    
    /**
     * @requires <tt>this.books</tt> neq empty
     * @effects returns the book with specified <tt>id</tt> or null if not exists
     */
    public Book getBookByID(int id,Set<Book> books) {
        // TODO: complete this code
    	if(books==null) {
    		System.out.println("Collection book is empty.");
    	}else {
    		for (Book book : books) {
    			if(book.getId()==id) {
    				return book;
    			}
    		}
        	System.out.println("Not data correct...");
    	}
    	
    	return null;
    	
    	
    }
    
    /**
     * @requires <tt>this.books</tt> neq empty
     * @effects returns the first book matched with specified <tt>name</tt> or null if not found
     */
    public Book getBookByName(String name,Set<Book> books) {
        // TODO: complete this code
    	if(books==null) {
    		System.out.println("Collection book is empty.");
    	}else {
    		for (Book book : books) {
    			if(book.getTitle().equals(name)) {
    				return book;
    			}
    		}
        	System.out.println("Not data correct...");
    	}
    	return null;
    }
    
    /**
     * @effects returns a report of all books (each book per line) as a string
     */
    @Override
    public String toString() {
        // TODO: complete this code
    	String collectBook = "";
    	for (Book book : books) {
			collectBook +=" "+book.toString()+"\n";
		}
    	return collectBook;
    }
    
    // other necessary methods here
}

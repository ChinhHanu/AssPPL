package bookman;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @overview the BookMan application
 */
public class BookManApp {
	/**
	 * TODO: complete this program specification
	 */
	public static void main(String[] args) {
		BookSet books = new BookSet();
		Book book = null;
		Scanner scanInt = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		books.setBooks(new HashSet<Book>());

		Scanner user = new Scanner(System.in);
		boolean yourOption = true;
		while (yourOption) {
			System.out.println("===========================");
			System.out.println("     Welcome to BookMan    ");
			System.out.println("---------------------------");
			System.out.println("1. search book by name");
                        System.out.println("2. search book by id");
			System.out.println("3. show all books");
			System.out.println("4. add a new book");
			System.out.println("5. remove a book");
			System.out.println("0. Quit");
			System.out.println("===========================");

			System.out.print("Enter your option: ");
			int option = user.nextInt();
			user.nextLine();
			switch (option) {
			case 1:
				// TODO: complete this code. hint see {@link BookSet.getBookByName(String)}
				if(!books.getBooks().isEmpty()) {
					System.out.println("Enter name book:");
					Book book1 = books.getBookByName(scanString.nextLine(), books.getBooks());
					System.out.println("Result:");
					System.out.println(book1.toString());
				}else {
					System.out.println("Your list book is empty");
				}
				break;
                        case 2:
                                if(!books.getBooks().isEmpty()) {
					System.out.println("Enter book's ID:");
					Book book1 = books.getBookByID(scanInt.nextInt(), books.getBooks());
					System.out.println("Result:");
					System.out.println(book1.toString());
				}else {
					System.out.println("Your list book is empty");
				}
				break;
			case 3:
				// TODO: complete this code
				if(books.getBooks().isEmpty()) {
					System.out.println("Your list book is empty");
				}else {
					System.out.println(books.toString());
				}
				break;

			case 4:
				// TODO: complete this code
				books.addBook(book, books.getBooks());
				break;
			case 5:
				// TODO: complete this code. hint: see {@link BookSet#getBookByID(int)}
				System.out.println("Enter id of book which you wants to remove:");
				Book book2 = books.getBookByID(scanInt.nextInt(), books.getBooks());
				System.out.println("Do you want to remove" + book2.getTitle());
				System.out.println("yes or no?");
				String options = scanString.nextLine();
				if (options.equals("yes".toLowerCase())) {
					books.removeBook(book2, books.getBooks());
					System.out.println("Remove complete");
				} else {
					System.out.println("You did cancle");
				}
				break;
			case 0:
				// TODO: complete this code
				yourOption = false;
				break;
			default:
				System.err.println("Invalid option! please enter a number in range [0, 5].");
				break;
			}
		}
	}
}

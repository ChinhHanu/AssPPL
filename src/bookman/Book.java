package bookman;

/**
 * TODO: complete this specification
 */
public class Book {
	// TODO: complete this code with specification as required from the requirements
    
        // Viết DomainConstraint vào đây trước khi khai báo biến nhé
	private int id;
	private String title;
	private String authorName;
	private int publishedYear;

	public Book() {
	//	super();
	}

	public Book(int id, String title, String authorName, int publishedYear) {
		//super();
//            if(ValidateObject()){
		this.id = id;
		this.title = title;
		this.authorName = authorName;
		this.publishedYear = publishedYear;
//            }else{
//                System.out.println("Invalid input information!");
//            }
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//            if(ValidID(id)){
//                
//            
//		this.id = id;
//            }else{
//                System.out.println("Invalid ID");
//            }
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
            if(ValidTitle(title)){
		this.title = title;
            }else{
                System.out.println("Invalid Title");
            }
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
            if(validAuthorName(authorName)){
		this.authorName = authorName;
            }else{
                System.out.println("Invalid Author's name");
            }
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
            if(validatePublishedYear(publishedYear)){
		this.publishedYear = publishedYear;
            }else{
                System.out.println("Invalid published year");
            }
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +", "+ this.title +", "+this.authorName+", "+this.publishedYear;
	}
        
        private boolean ValidID( int id){
            return id >= 1;
        }
        
        private boolean ValidTitle( String title){
            return !(title == null || title.length() == 0|| title.length()> 80);
        }
        
        private boolean validAuthorName (String authorName){
            return !(authorName == null || authorName.length() == 0 || authorName.length() > 50);
        }
        
        private boolean validatePublishedYear( int publishedYear){
            return !(publishedYear > 2019 || publishedYear < 1900);
        }
        
        
//        private boolean ValidateObject(){
//            return ValidID(id) && ValidTitle(title) && validAuthorName(authorName) && validatePublishedYear(publishedYear);
//        }
//        
        public boolean RepOK(){
            return ValidID(id) && ValidTitle(title) && validAuthorName(authorName) && validatePublishedYear(publishedYear);
        }
}

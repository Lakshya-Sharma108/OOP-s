package JavaOopConcept.OopsTask.FirstTask;

public class Book {

    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private boolean availableStatus;



    Book(int bookId, String bookTitle, String bookAuthor){
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.availableStatus = true;
    }


    public int getBookId(){
        return bookId;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    String getBookAuthor(){
        return this.bookAuthor;
    }

    public boolean isAvailableStatus(){
        return availableStatus;
    }


    public void borrowBook() {
        if (availableStatus) {
            availableStatus = false;
            System.out.println("Borrowing book...");
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }


    public void returnBook() {
        if (!availableStatus) {
            availableStatus = true;
            System.out.println("Returning book...");
        }
//        else {
//            System.out.println("The book is already available.");
//        }
    }


    public void displayBookDetails() {
        System.out.println("Book: " + bookTitle + " by " + bookAuthor);
        System.out.println("Available: " + (availableStatus ? "Yes" : "No"));
    }
}







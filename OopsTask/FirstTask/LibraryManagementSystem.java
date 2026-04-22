package JavaOopConcept.OopsTask.FirstTask;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Godan", "Munshi Premchand");

        System.out.println("Enter your Choice :");
        System.out.println("1. Borrow a Book");
        System.out.println("2. Return a Book");
        System.out.println("3. Display Book Details");

        int choice = UserInputHandler.getUserChoice();
        switch (choice){
            case 1 :
                book1.borrowBook();
                break;
            case 2 :
                book1.returnBook();
                break;
            case 3 :
                book1.displayBookDetails();
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }

    }


}

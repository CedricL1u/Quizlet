// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean create = true;
        quiz Quiz = new quiz();
        String more = "e";


        System.out.println("Welcome to Offbrandquizlet");

        while(create == true) {
            create = false;
            System.out.print("Enter question: ");
            String question = input.nextLine();
            System.out.print("Enter answer: ");
            String answer = input.nextLine();

            Quiz.addFlashcard(question, answer);

            while(!more.equals("yes") || !more.equals("no")) {

                System.out.print("Would you like to create another flashcard (enter yes or no): ");
                more = input.nextLine();
                System.out.println(more);


                if (more.equals("yes")) {
                    create = true;
                    more = "e";
                    break;

                } else if (more.equals("no")) {
                    create = false;
                    more = "e";
                    break;
                }
            }
        }

        ArrayList flashcardList = Quiz.getFlashcards();
        System.out.println("Review your flashcards and memorize everything");
        flashcard testcard = new flashcard("test", "pls work");
        for(Object x: flashcardList){
            System.out.println(x.getClass());
            System.out.println(x.getQuestion);
 //           System.out.println(testcard.getQuestion());
//            System.out.println(testcard.getAnswer());
        }









    }
}

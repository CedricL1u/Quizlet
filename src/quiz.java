import java.util.ArrayList;


public class quiz{
    ArrayList flashcards = new ArrayList();


    public void addFlashcard(String question, String answer){
        flashcards.add(new flashcard(question, answer));

    }

    public ArrayList getFlashcards(){
        return flashcards;
    }

    public void removeFlashcard(int number){

    }

    public int getSize(){
        return flashcards.size();
    }

    public void shuffleFlashcards(){

    }

}

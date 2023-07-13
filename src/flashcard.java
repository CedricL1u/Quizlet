public class flashcard {
    public String question = null;
    public String answer = null;

    flashcard(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }

}

/*
 * Abstract Question Class
 */

package finalproject.tang.chen;

abstract public class Question {
    private String question;
    private String type;
    
    /**
     * This is the primary constructor of the question class
     */
    public Question(){
        question = "";
        type = "";
    }
    
    /**
     * This is the secondary constructor of the question class
     * @param question - the question to be set  
     */
    public Question (String question){
        this();
        this.question = question;
    }
    
    public Question (String question, String type){
        this();
        this.question = question;
        this.type = type;
    }
    
    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    
    /**
     * Accessor: Get the type of the question
     * @return the type of the question it is
     */
    public String getType(){
        return type;
    }
    
    /**
     * Mutator to set the type of question
     * @param type the type of the question 
     */
    public void setType(String type){
        this.type = type;
    }
    
    /**
     * This method is the equals method of the question class
     * @param comparedQuestion - the question to be compared to
     * @return - true or false if the string contained in the question is the same 
     */
    public boolean equals(Question comparedQuestion){
        return this.question.equals(comparedQuestion.question);
    }
    
    /**
     * This is the toString method of the question class
     * @return the formatted representation of the question
     */
    public String toString(){
        return "Question: " + question + "\n";
    }
    
}

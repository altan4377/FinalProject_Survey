/*
 * Abstract Question Class
 */

package finalprojectdec12;

abstract public class Question {
    private String question;
    
    /**
     * This is the primary constructor of the question class
     */
    public Question(){
        question = "";
    }
    
    /**
     * This is the secondary constructor of the question class
     * @param question - the question to be set  
     */
    public Question (String question){
        this.question = question;
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

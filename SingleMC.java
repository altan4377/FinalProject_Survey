/*
 * SingleMC class
 */
package finalproject.tang.chen;

import java.util.ArrayList;

public class SingleMC extends Question {

    private String question;
    private int userSelected;
    private ArrayList<String> answers;
    private int[] collectionOfAnswers = new int[12];

    /**
     * This is the primary constructor of the SingleMC class
     */
    public SingleMC() {
        question = null;
        userSelected = 0;
        answers = null;
    }

    /**
     * This is the secondary constructor of the SingleMC class
     *
     * @param question - the question of this multiple choice question
     * @param answers - the list of answers available to be selected by the user
     */
    public SingleMC(String question, ArrayList<String> answers) {
        this();
        this.question = question;
        this.answers = answers;
    }

    /**
     * This is the tertiary constructor of the SingleMC class
     *
     * @param question - the question of this multiple choice question
     * @param answers - the list of answers available to be selected by the user
     * @param userSelected - the index of the choice of the user in the list
     */
    public SingleMC(String question, ArrayList<String> answers, int userSelected) {
        this(question, answers);
        this.userSelected = userSelected;
        addAnswerToCollection(collectionOfAnswers, userSelected);
    }

    public SingleMC(String question, ArrayList<String> answers, int userSelected, int[] collectionOfAnswers) {
        this(question, answers, userSelected);
        this.collectionOfAnswers = collectionOfAnswers;
    }

    /**
     * This method will add the selected answer to an array of responses
     *
     * @param collectionOfAnswers - the array of answers storing the counter of
     * selected answers
     * @param userSelected - the index of the user's selected answer
     * @return - the updated answer counter storing array
     */
    public int[] addAnswerToCollection(int[] collectionOfAnswers, int userSelected) {
        collectionOfAnswers[userSelected] += 1;
        return collectionOfAnswers;
    }

    /**
     * This method is the equals method of the SingleMC class
     *
     * @param comparedQuestion - the SingleMC to be compared to
     * @return - true or false if the string and answers contained in the
     * SingleMC is the same
     */
    public boolean equals(SingleMC comparedQuestion) {
        return this.getQuestion().equals(comparedQuestion.getQuestion())
                && this.getAnswers().containsAll(comparedQuestion.getAnswers())
                && comparedQuestion.getAnswers().containsAll(this.getAnswers());
    }

    /**
     * This is the clone method for a SingleMC question
     *
     * @return a new SingleMC question with the same question and answer
     * selections
     */
    public SingleMC clone() {
        return new SingleMC(getQuestion(), getAnswers());
    }

    /**
     * This is the toString method of the SingleMC class
     *
     * @return the formatted representation of the SingleMC
     */
    public String toString() {
        String out = "";
        out += "Question: " + getQuestion() + "\n";
        out += "Answers: " + printList(getAnswers()) + "\n";
        return out;
    }

    /**
     * This method will print out all the elements in a list
     *
     * @param answers - the array list of selectable choices of a single MC
     * question
     * @return - string of all the elements in the list
     */
    public String printList(ArrayList<String> answers) {
        String out = "";
        for (String str : answers) {
            out += str + "\n";
        }
        return out;
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
     * @return the userSelected
     */
    public int getUserSelected() {
        return userSelected;
    }

    /**
     * @param userSelected the userSelected to set
     */
    public void setUserSelected(int userSelected) {
        this.userSelected = userSelected;
    }

    /**
     * @return the answers
     */
    public ArrayList<String> getAnswers() {
        return answers;
    }

    /**
     * @param answers the answers to set
     */
    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    /**
     * @return the collectionOfAnswers
     */
    public int[] getCollectionOfAnswers() {
        return collectionOfAnswers;
    }

    /**
     * @param collectionOfAnswers the collectionOfAnswers to set
     */
    public void setCollectionOfAnswers(int[] collectionOfAnswers) {
        this.collectionOfAnswers = collectionOfAnswers;
    }
}

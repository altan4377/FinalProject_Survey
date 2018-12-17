/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectdec12;

import java.util.ArrayList;

/**
 *
 * @author mache9294
 */
public class MultipleMC extends Question {

    private String question;
    private ArrayList<Integer> userSelectedAnswers;
    private ArrayList<String> answers;
    private int[] collectionOfAnswers = new int[answers.size()];

    /**
     * This is the primary constructor of the MultipleMC class
     */
    public MultipleMC() {
        question = null;
        userSelectedAnswers = null;
        answers = null;
    }

    /**
     * This is the secondary constructor of the MultipleMC class
     *
     * @param question - the question of this multiple choice question
     * @param answers - the list of answers available to be selected by the user
     */
    public MultipleMC(String question, ArrayList<String> answers) {
        this();
        this.question = question;
        this.answers = answers;
    }

    /**
     * This is the tertiary constructor of the MultipleMC class
     *
     * @param question - the question of this multiple choice question
     * @param answers - the list of answers available to be selected by the user
     * @param userSelectedAnswers - the indexes of the choice of the user in the
     * list, stored in a list
     */
    public MultipleMC(String question, ArrayList<String> answers, ArrayList<Integer> userSelectedAnswers) {
        this(question, answers);
        this.userSelectedAnswers = userSelectedAnswers;
        addAnswerToCollection(collectionOfAnswers, userSelectedAnswers);
    }
    
    /**
     * This method will add the selected answer to an array of responses
     *
     * @param collectionOfAnswers - the array of answers storing the counter of
     * selected answers
     * @param userSelectedAnswers - the list of indexes of the user's selected answers
     * @return - the updated answer counter storing array
     */
    public int[] addAnswerToCollection(int[] collectionOfAnswers, ArrayList<Integer> userSelectedAnswers) {
        int userSelected;
        
        for (int i = 0; i < userSelectedAnswers.size(); i++) {
            userSelected = userSelectedAnswers.get(i);
            
            collectionOfAnswers[userSelected] += 1;

        }
        return collectionOfAnswers;
    }

    /**
     * This method is the equals method of the MultipleMC class
     *
     * @param comparedQuestion - the MultipleMC to be compared to
     * @return - true or false if the string and answers contained in the
     * MultipleMC is the same
     */
    public boolean equals(MultipleMC comparedQuestion) {
        return this.getQuestion().equals(comparedQuestion.getQuestion())
                && this.getAnswers().containsAll(comparedQuestion.getAnswers())
                && comparedQuestion.getAnswers().containsAll(this.getAnswers());
    }

    /**
     * This is the clone method for a MultipleMC question
     *
     * @return a new MultipleMC question with the same question and answer
     * selections
     */
    public MultipleMC clone() {
        return new MultipleMC(getQuestion(), getAnswers());
    }

    /**
     * This is the toString method of the MultipleMC class
     *
     * @return the formatted representation of the MultipleMC
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
     * @return - all elements in list on new line
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
     * @return the userSelectedAnswers
     */
    public ArrayList<Integer> getUserSelectedAnswers() {
        return userSelectedAnswers;
    }

    /**
     * @param userSelectedAnswers the userSelectedAnswers to set
     */
    public void setUserSelectedAnswers(ArrayList<Integer> userSelectedAnswers) {
        this.userSelectedAnswers = userSelectedAnswers;
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

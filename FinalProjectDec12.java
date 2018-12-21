/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectdec12;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import org.jfree.ui.RefineryUtilities;

public class FinalProjectDec12 {

    public static void main(String[] args) {
        String question = "What is your fav colour";
        ArrayList<String> answers = new ArrayList(Arrays.asList("Red", "Green", "Yellow"));
        int userSelected = 1;
        int[] collectionOfAnswers = {3,4,5};
        SingleMC testMC = new SingleMC(question, answers , userSelected, collectionOfAnswers);
        PieGraph demo = new PieGraph("JFreeChart: PieGraph.java", testMC);
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);


        String question2 = "chekcbozessss";
        ArrayList<String> answers2 = new ArrayList(Arrays.asList("Red", "Green", "Yellow"));
        ArrayList<Integer> userSelected2 = new ArrayList(Arrays.asList(10, 3, 4));
        int[] collectionOfAnswers2 = {3,4,5};
        
        MultipleMC testMC2 = new MultipleMC(question2, answers2 , userSelected2, collectionOfAnswers2);
        
        BarGraph chart = new BarGraph("Car Usage Statistics", "Which car do you like?", testMC2);
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
        chart.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectdec12;

import java.util.ArrayList;
import java.util.Arrays;
import org.jfree.ui.RefineryUtilities;

public class FinalProjectDec12 {

    public static void main(String[] args) {
        String question = "What is your fav colour";
        ArrayList<String> answers = new ArrayList(Arrays.asList("Blue", "Red", "Green", "Yellow"));
        int userSelected = 1;
        int[] collectionOfAnswers = {2,3,4,5};
        
        SingleMC testMC = new SingleMC(question,answers , userSelected, collectionOfAnswers);
        PieGraph demo = new PieGraph("JFreeChart: PieGraph.java", testMC);
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

        BarGraph chart = new BarGraph("Car Usage Statistics", "Which car do you like?");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }

}

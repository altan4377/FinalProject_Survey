/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalprojectdec12;

import org.jfree.ui.RefineryUtilities;


public class FinalProjectDec12{
    
    public static void main(String[] args) {
        
        PieGraph demo = new PieGraph("JFreeChart: PieChart.java");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
        
        BarGraph chart = new BarGraph("Car Usage Statistics", "Which car do you like?");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }
    
    
}

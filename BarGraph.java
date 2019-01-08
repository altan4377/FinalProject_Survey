/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.tang.chen;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class BarGraph extends ApplicationFrame {
    
    //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    MultipleMC questionMC = null;
    
    public BarGraph(String applicationTitle, String chartTitle, MultipleMC question) {
        super(applicationTitle);
        this.questionMC = question;
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Category",
                "Score",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    private CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();
        
        for (int i = 0; i < questionMC.getAnswers().size(); i++) {
            dataset.addValue(questionMC.getCollectionOfAnswers()[i], questionMC.getAnswers().get(i),"");

        }
        return dataset;
    }
}
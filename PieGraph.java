/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectdec12;

import java.text.AttributedString;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.util.Rotation;

/**
 * A pie chart with a custom label generator.
 */
public class PieGraph extends ApplicationFrame {

    SingleMC questionMC = null;
    
    /**
     * Creates a new demo.
     *
     * @param title the frame title.
     * @param questionMC the single multiple choice question to be displayed in
     * graphical form
     */
    public PieGraph(String title, SingleMC questionMC) {
        super(title);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.questionMC = questionMC;
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }

    /**
     * Creates the dataset for the demo.
     *
     * @return A sample dataset.
     */
    private PieDataset createDataset() {
        int fields = (questionMC.getAnswers()).size();
        String category;
        int categoryVal;
        int totalAnswers = getTotalAnswerNum(questionMC.getCollectionOfAnswers());

        DefaultPieDataset result = new DefaultPieDataset();
        
        for (int i = 0; i < fields; i++) {
            category = questionMC.getAnswers().get(i);
            categoryVal = (questionMC.getCollectionOfAnswers())[i];
            result.setValue(category, new Double((double)categoryVal/(double)totalAnswers * 100.0));

        }
        /*
         result.setValue("Java", new Double(43.2));
         */
        return result;

    }
    
    public int getTotalAnswerNum(int[] collectionOfAnswers){
        int total = 0;
        for (int i = 0; i < collectionOfAnswers.length; i++) {
            total += collectionOfAnswers[i];
        }
        return total;
    }

    /**
     * Creates the chart.
     *
     * @param dataset the dataset.
     *
     * @return A chart.
     */
    private JFreeChart createChart(PieDataset dataset) {

        JFreeChart chartMake = ChartFactory.createPieChart3D(
                questionMC.getQuestion(), // chart title
                dataset, // data
                true, // include legend
                true,
                false
        );

        PiePlot3D plot = (PiePlot3D) chartMake.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        plot.setNoDataMessage("No data to display");
        plot.setLabelGenerator(new CustomLabelGenerator());
        return chartMake;

    }

    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     *
     * @return A panel.
     */

    
    public JPanel createDemoPanel() {
        JFreeChart chartPrint = createChart(createDataset());
        return new ChartPanel(chartPrint);
    }
    

    /**
     * A custom label generator (returns null for one item as a test).
     */
    static class CustomLabelGenerator implements PieSectionLabelGenerator {

        /**
         * Generates a label for a pie section.
         *
         * @param dataset the dataset (<code>null</code> not permitted).
         * @param key the section key (<code>null</code> not permitted).
         *
         * @return the label (possibly <code>null</code>).
         */
        public String generateSectionLabel(PieDataset dataset, Comparable key) {
            String result = null;
            if (dataset != null) {
                if (!key.equals("X")) {
                    result = key.toString();
                }
            }
            return result;
        }

        /**
         * Not used.
         *
         * @param dataset the dataset.
         * @param key the key.
         *
         * @return null.
         */
        
        public AttributedString generateAttributedSectionLabel(PieDataset dataset, Comparable key) {
            return null;
        }
        

    }

}

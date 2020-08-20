import java.awt.*;

/**
 * This program uses the DrawingPanel class to make an eye.
 *
 * @author Lucas D. Dahl
 * @version 8/19/20
 */
public class QuestionThree {

    /**
     *  This is the main method to run the program.
     * @param args The arguments passed in.
     */
    public static void main(String[] args) {

        DrawingPanel myPanel = new DrawingPanel();
        Graphics canvas = myPanel.getGraphics();

        // Draw the box
        canvas.drawRect(125, 75, 250, 250);

        // Draw the black eyeball
        canvas.fillOval(125, 75, 250, 250);

        // Set the color to yellow.
        canvas.setColor(Color.YELLOW);

        // Draw the yellow part
        canvas.fillOval(125, 165, 250, 75);

        // Change the color to blue
        canvas.setColor(Color.BLUE);

        // Draw the bleu eyeball
        canvas.fillOval(215, 165, 75, 75);

    }

}

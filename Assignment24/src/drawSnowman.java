// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #24 8/17/20
// Due 8/20/20
//
// THis program will draw snowman

import java.awt.*;

/**
 * This program will make Snowman objects
 *
 * @author Lucas D. Dahl
 * @version 8/19/20
 *
 */
public class drawSnowman {

    /**
     * THis is the main methods to run the program.
     * @param args is the parameters.
     */
    public static void main(String[] args) {

        // Properties
        DrawingPanel myPanel = new DrawingPanel();
        Graphics g = myPanel.getGraphics();
        Snowman[] snowManArray = new Snowman[3];

        // Initialize the snowman
        snowManArray[0] = new Snowman(50, 50, g);
        snowManArray[1] = new Snowman(200, 50, g, Color.RED);
        snowManArray[2] = new Snowman(350, 50, g, Color.GREEN);

        // Draw the snowman
        snowManArray[0].drawSnowMan();
        snowManArray[1].drawSnowMan();
        snowManArray[2].drawSnowMan();

        // Change the color of the snowman
        for(int i = 0; i < 10; i++) {

            for(int j = 0; j < 3; j ++) {

                // Change the color
                snowManArray[j].changeSnowManColor();

                // Redraw the snowman.
                snowManArray[j].drawSnowMan();


            }

            // Pause the changing of color so the user can see it.
            myPanel.sleep(300);

        }

    }

}

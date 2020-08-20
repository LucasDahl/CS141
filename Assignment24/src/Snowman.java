// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #24 8/19/20
// Due 8/20/20
//
// THis class will make a template to make Snowman objects.

import java.awt.*;
import java.util.*;

/**
 * This program will make Snowman objects.
 *
 * @author Lucas D. Dahl
 * @version 8/19/20
 *
 */
public class Snowman {

    // **************************** Fields ****************************
    private Color bodyColor;
    private int x, y;
    private Graphics g;

    // ************************** Constructors *************************

    /**
     * This constructor sets the x, y, and the graphics value
     * with input and sets the color to light gray.
     *
     * @param x is the x value to draw the snowman.
     * @param y is the y value to draw the snowman.
     * @param myG is the graphics to draw the snowman.
     */
    public Snowman(int x, int y, Graphics myG) {

        this.x = x;
        this.y = y;
        bodyColor = new Color(172, 171, 171);
        g = myG;

    }

    /**
     * This constructor sets all the properties for
     * the snowman.
     *
     * @param x is the x value to draw the snowman.
     * @param y is the y value to draw the snowman.
     * @param myG is the graphics to draw the snowman.
     * @param c is the color for the snowman
     */
    public Snowman(int x, int y, Graphics myG, Color c) {

        this.x = x;
        this.y = y;
        g = myG;
        bodyColor = c;

    }

    // **************************** Methods ****************************

    /**
     * This method will draw the actual snowman.
     */
    public void drawSnowMan() {

        // Set the color of the snowman
        g.setColor(bodyColor);

        // Make the snowman by parts.

        // Head
        g.fillOval(x, y, 60, 60);

        // Body
        g.fillOval(x - 10, y + 45, 80, 80);
        g.drawOval(x - 10, y + 45, 80, 80);
        g.fillOval(x - 30, y + 95, 120, 120);

        // Eyes
        g.setColor(Color.WHITE); // THe eys are white
        g.fillOval(x + 20, y + 15, 10, 10);
        g.fillOval(x + 40, y + 15, 10, 10);

        // Mouth
        g.fillArc(x + 20, y + 30, 30, 10, 0, -180);

        // Nose
        g.setColor(Color.YELLOW); // The nose is yellow
        g.fillOval(x + 35, y + 25, 7, 7);

        // Arms
        g.setColor(Color.BLACK); // The arms are black
        g.drawLine(x, y + 65, x - 40, y);
        g.drawLine(x + 65, y + 60, x + 90, y);

    }

    /**
     * This method will make a random color to change the snowman.
     */
    public void changeSnowManColor() {

        // Properties
        Random rand = new Random();
        int red = rand.nextInt(256), green = rand.nextInt(256), blue = rand.nextInt(256);
        Color randColor = new Color(red, green, blue);

        // Set the color to the random color.
        bodyColor = randColor;

    }

}

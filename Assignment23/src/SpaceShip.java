// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #23 8/17/20
// Due 8/19/20
//
// This program uses the DrawingPannel class to draw a picture of a space ship.

import java.awt.*;
import java.util.*;

/**
 * This program uses a class called drawingPanel to make
 * a space ship flying over a city.
 *
 * @author Lucas D. Dahl
 * @version 8/17/20
 *
 */
public class SpaceShip {

    // Main method

    /**
     * This is the main method that calls the method to
     * make the graphic art.
     *
     * @param args
     */
    public static void main(String[] args) {

        // Create the panel.
        DrawingPanel spacePanel = new DrawingPanel();

        // Create the canvas
        Graphics canvas = spacePanel.getGraphics();

        // Create the city

        // Buildings
        drawBuildings(canvas);

        // Draw Ship
        drawShip(canvas);

        // Draw people on roofs(in specific locations)
        drawPeople(canvas, 130, 322);
        drawPeople(canvas, 134, 322);
        drawPeople(canvas, 138, 322);
        drawPeople(canvas, 410, 296);
        drawPeople(canvas, 415, 296);

        // Draw the people on the street.
        // Some will be bunched up because they're in a panicked state
        Random rand = new Random();
        for(int i = 0; i < 200; i++) {

            drawPeople(canvas, rand.nextInt(490), 396);

        }



    }

    /**
     * This method draws all the buildings in the city.
     *
     * @param canvas the canvas or panel on which to place the graphics.
     */
    public static void drawBuildings(Graphics canvas) {

        canvas.setColor(Color.GRAY);
        canvas.fillRect(10,300, 50,300);
        canvas.fillRect(65,350, 50,50);
        canvas.fillRect(120,325, 50,75);
        canvas.fillRect(175,300, 50,300);
        canvas.fillRect(230,350, 50,50);
        canvas.fillRect(285,350, 50,50);
        canvas.fillRect(340,200, 50,400);
        canvas.fillRect(395,300, 50,300);
        canvas.fillRect(450,300, 50,300);

    }

    /**
     * This method will draw the space ship, including the beam(person inside the beam)
     * and the burst from the engine.
     *
     * @param canvas the canvas or panel on which to place the graphics.
     */
    public static void drawShip(Graphics canvas) {

        Color temp = canvas.getColor();

        canvas.fillRect(340,130, 75,10);
        canvas.setColor(Color.BLUE);
        canvas.fillRect(395,130,20,10);

        canvas.setColor(Color.RED);
        Polygon burstOne = new Polygon();
        burstOne.addPoint(340, 137);
        burstOne.addPoint(322, 130);
        burstOne.addPoint(322, 141);
        canvas.fillPolygon(burstOne);

        canvas.setColor(Color.ORANGE);
        Polygon burstTwo = new Polygon();
        burstTwo.addPoint(335, 137);
        burstTwo.addPoint(318, 130);
        burstTwo.addPoint(318, 141);
        canvas.fillPolygon(burstTwo);

        canvas.setColor(Color.YELLOW);
        Polygon burstThree = new Polygon();
        burstThree.addPoint(330, 137);
        burstThree.addPoint(313, 130);
        burstThree.addPoint(313, 141);
        canvas.fillPolygon(burstThree);

        canvas.setColor(Color.BLACK);
        Polygon engPoly = new Polygon();
        engPoly.addPoint(345, 137);
        engPoly.addPoint(327, 130);
        engPoly.addPoint(327, 141);
        canvas.fillPolygon(engPoly);

        Color beamColor = new Color(219, 255, 0, 146);

        canvas.setColor(beamColor);
        Polygon beam = new Polygon();
        beam.addPoint(366, 140);
        beam.addPoint(350, 200);
        beam.addPoint(382, 200);
        canvas.fillPolygon(beam);

        canvas.setColor(Color.BLACK);
        drawPeople(canvas, 365, 180);

        canvas.setColor(temp);

    }

    /**
     * This method will draw a person in the given location of an
     * x andy value.
     *
     * @param canvas the canvas or panel on which to place the graphics.
     * @param x is the x value in which the person will be place.
     * @param y is the y value in which the person will be place.
     */
    public static void drawPeople(Graphics canvas, int x, int y) {

        canvas.drawLine(x, y, x, y - 8);
        canvas.drawLine(x, y, x + 3, y + 3);
        canvas.drawLine(x, y, x - 3 , y + 3);
        canvas.drawLine(x - 2, y - 3 , x + 2 , y - 3);
        canvas.fillOval(x - 1, y - 8, 4, 4);

    }

}

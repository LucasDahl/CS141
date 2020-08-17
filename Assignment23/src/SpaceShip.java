// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #23 8/17/20
// Due 8/19/20
//
// This program uses the DrawingPannel class to draw a picture of a space ship.

import java.awt.*;
import java.util.*;

public class SpaceShip {

    // Main method
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

        // Draw people on roofs
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

    // Draw the buildings.
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

    public static void drawShip(Graphics canvas) {

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

    }

    public static void drawPeople(Graphics canvas, int x, int y) {

        canvas.drawLine(x, y, x, y - 8);
        canvas.drawLine(x, y, x + 3, y + 3);
        canvas.drawLine(x, y, x - 3 , y + 3);
        canvas.drawLine(x - 2, y - 3 , x + 2 , y - 3);
        canvas.fillOval(x - 1, y - 8, 4, 4);

    }

}

// Tested in cityPointTestMainProgram

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 *This class represents a city object with the identifiable x,y coordinate.
 * Where x and y are always positive (aka, 1st quadrant only)
 *
 * @author Lucas D. Dahl
 * @version 8/10/20
 *
 */
public class CityPoint {

    //=================================================
    // Fields
    //=================================================
    private String name;
    private int xCoor;
    private int yCoor;

    // Static means shared. It either uses or is shared data
    private static int numberOfCities = 0;

    //=================================================
    // Constructors - Constructors has no return type and has the same name as class
    //=================================================

    /**
     * This constructor sets all the major information for the CityPoint
     *
     * @param startName This is the name of the city
     * @param startX This is the initial x point
     * @param startY This is the initial y point
     */
    public CityPoint(String startName, int startX, int startY) {

        // "this is the same as self from swift.
        if(startName.length() >= 3) {
            this.name = startName;
        } else {
            name = "[Name is too short]";
        }

        if (startX >= 0 ) {
            xCoor = startX;
        } else {
            xCoor = 0;
        }

        if (startY >= 0 ) {
            yCoor = startY;
        } else {
            yCoor = 0;
        }

        numberOfCities ++;


    }

    /**
     * This constructor sets only the x and y coordinates, but makes the city name unknown.
     *
     * @param startX his is the initial x point
     * @param startY his is the initial x point
     */
    public CityPoint(int startX, int startY) {

       this("Unknown City", startX, startY);

    }

    /**
     * This constructor sets the city name, but makes the points zero.
     *
     * @param startName This sets the city name
     */
    public CityPoint(String startName) {

        if(startName.length() >= 3) {
            name = startName;
        } else {
            name = "[Name is too short]";
        }

        xCoor = 0;
        yCoor = 0;

    }

    // Default constructor

    /**
     * This method sets all the fields
     *
     */
    public CityPoint() {

        name = "Unknown City";
        xCoor = 0;
        yCoor = 0;
    }

    //=================================================
    // Methods
    //=================================================



    /**
     * This function gets the distance from a given city point at the origin (0,0).
     *
     * @return The distance as a double to t(0,0)
     */

    // Don't use static when in a class. Static means "shared"
    public double findDistance() {

        double dist = xCoor * xCoor + yCoor * yCoor;
        dist = Math.sqrt(dist);

        return dist;
    }


    /**
     * This method changes the location of the CityPoint to the new values for x and y provided.
     *
     * @param newXValue The new x value for the xCoor.
     * @param newYValue The new y Value for the yCoor.
     */
    public void setLocation(int newXValue, int newYValue) {


        if (newXValue >= 0) xCoor = newXValue;
        if (newYValue >= 0) yCoor = newYValue;

    }

    /**
     * This method changes the location of CityPoint with the given values deltaX and deltaY
     *
     * @param deltaX by the amount to shift the xCoor.
     * @param deltaY by the amount to shift the yCoor.
     */
    public void translate(int deltaX, int deltaY) {

        xCoor = xCoor + deltaX;
        yCoor = yCoor + deltaY;

    }

    /**
     * This method finds the distance from the current CityPoint to a secondary
     * cityPoint as a double value.
     *
     * @param other The second CityPoint to be compared to
     * @return The distance between the two CityPoints.
     */
    public double distance(CityPoint other) {

        int dx = xCoor - other.xCoor;
        int dy = yCoor - other.yCoor;
        double dist = dx * dx + dy * dy;
        dist = Math.sqrt(dist);

        return dist;

    }

    // Should have in EVERY Class. This is automatically called when we try and print. This makes it easier to print.
    // Start with an empty string and build it.

    @Override // Java Doc annotation, replaces manual java doc. This is all the JavaDac we have to so for toString.
    public String toString() {

        String answer = "";

        answer = answer + name;
        answer = answer + " is at (";
        answer = answer + xCoor;
        answer = answer + ",";
        answer = answer + yCoor;
        answer = answer + ").";

        return answer;

    }

    /**
     * This method returns the current xCoor.
     *
     * @return Returns the current x coordinate.
     */
    public int getXCoor() {
        return xCoor;
    }

    /**
     * This method returns the current yCoor.
     *
     * @return Returns the current y coordinate.
     */
    public int getYcoor() {
        return yCoor;
    }

    /**
     * This method returns the string of the CityPoint.
     *
     * @return Returns the name of the CityPoint.
     */
    public String getNam() {
        return name;
    }

    /**
     * This will return the number of cities
     *
     * @return This returns the total number of cities
     */
    public int getNumberOfCities() {
        return numberOfCities;
    }

}

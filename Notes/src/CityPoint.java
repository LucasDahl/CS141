// Tested in cityPointTestMainProgram

/**
 *This class represents a city object with the identifiable x,y coordinate.
 *
 * @author Lucas d. Dahl
 * @version 8/10/20
 *
 */
public class CityPoint {

    // Fields
    String name;
    int xCoor;
    int yCoor;

    // Methods

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

        xCoor = newXValue;
        yCoor = newYValue;

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

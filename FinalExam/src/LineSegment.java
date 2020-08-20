/**
 * This class will make and keep track of a line segment.
 *
 * @author Lucas D. Dahl
 * @version 8/19/20
 */
public class LineSegment {

    // **************************** Fields ****************************
    private int startX, startY, endX, endY;

    // ************************** Constructors *************************

    /**
     * This constructor will set both the starting and ending
     * values for x and y.
     *
     * @param sX This is the starting x.
     * @param sY This is the starting y.
     * @param eX This is the ending x.
     * @param eY This is the ending y.
     */
    public LineSegment(int sX, int sY, int eX, int eY) {

        startX = sX;
        startY = sY;
        endX = eX;
        endY = eY;

    }

    /**
     *  This is the default constructor that makes a line form
     *  (0,0) to (1,1).
     */
    public LineSegment() {

        startX = 0;
        startY = 0;
        endX = 1;
        endY = 1;

    }

    // **************************** Methods ****************************

    /**
     * This method will set a new x and y
     * start point.
     *
     * @param x The new start x point.
     * @param y The new start y point.
     */
    public void setStartPoint(int x, int y) {

        startX = x;
        startY = y;

    }

    /**
     * This method will set a new x and y
     * end point.
     *
     * @param x The new end x point.
     * @param y The new end y point.
     */
    public  void setEndPoint(int x, int y) {

        endX = x;
        endY = y;

    }

    /**
     * This method will return the distance between two points.
     *
     * @return This will return the distance between the points.
     */
    public double length() {

        return Math.sqrt(Math.pow(startX - endX, 2) + Math.pow(startY - endY, 2));

    }

}

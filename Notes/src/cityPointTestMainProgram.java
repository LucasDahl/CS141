// Uses the city point object

public class cityPointTestMainProgram {

    public static void main(String[] args) {

        CityPoint p1 = new CityPoint();
        CityPoint p2 = new CityPoint();
        CityPoint p3 = new CityPoint();

        p1.name = "Seattle";
        p1.xCoor = 1;
        p1.yCoor = 23;

        p2.name = "Denver";
        p2.xCoor = 40;
        p2.yCoor = 2;

        p3.name = "Miami";
        p3.xCoor = 100;
        p3.yCoor = -13;

        System.out.println(p1.name + " is at (" + p1.xCoor + "," + p1.yCoor + ").");
        System.out.println(p2.name + " is at (" + p2.xCoor + "," + p2.yCoor + ").");
        System.out.println(p3.name + " is at (" + p3.xCoor + "," + p3.yCoor + ").");

    }

}

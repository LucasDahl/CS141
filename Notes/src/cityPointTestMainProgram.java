// Uses the city point object

public class cityPointTestMainProgram {

    public static void main(String[] args) {

        // Properties
//        CityPoint p1 = new CityPoint();
//        CityPoint p2 = new CityPoint();
//        CityPoint p3 = new CityPoint();

        CityPoint[] p = new CityPoint[3];


        // Set the values.
        p[0] = new CityPoint("Seattle", 5, 4);
        p[1] = new CityPoint("San Diego", 50, 4);
        p[2] = new CityPoint("Tacoma", 12, 4);

//        System.out.println(p1.name + " is at (" + p1.xCoor + "," + p1.yCoor + ").");
//        System.out.println(p2.name + " is at (" + p2.xCoor + "," + p2.yCoor + ").");
//        System.out.println(p3.name + " is at (" + p3.xCoor + "," + p3.yCoor + ").");

        System.out.println("The distance to p[0] is " + p[0].findDistance());

        // calls the "toString" method.
        for(int i = 0; i < p.length; i++) {

            System.out.println(p[i]);

        }


    }


}

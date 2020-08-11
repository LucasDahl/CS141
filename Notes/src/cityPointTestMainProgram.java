// Uses the city point object

public class cityPointTestMainProgram {

    public static void main(String[] args) {

        // Properties
//        CityPoint p1 = new CityPoint();
//        CityPoint p2 = new CityPoint();
//        CityPoint p3 = new CityPoint();

        CityPoint[] p = new CityPoint[3];

        // Create an array and fill it with citypoints
        for(int i = 0; i < 3; i++) {

            p[i] = new CityPoint();

        }


        p[0].name = "Seattle";
        p[0].setLocation(4,5);

        p[0].translate(-2, 5);

        p[1].name = "Denver";
        p[1].setLocation(13,45);

        p[2].name = "Miami";
        p[2].setLocation(55,67);

//        System.out.println(p1.name + " is at (" + p1.xCoor + "," + p1.yCoor + ").");
//        System.out.println(p2.name + " is at (" + p2.xCoor + "," + p2.yCoor + ").");
//        System.out.println(p3.name + " is at (" + p3.xCoor + "," + p3.yCoor + ").");

        System.out.println("The distance to p[0] is " + p[0].findDistance());


    }


}

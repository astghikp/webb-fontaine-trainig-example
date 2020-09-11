package datatypes;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner latitude1 = new Scanner(System.in);
        Scanner longitude1 = new Scanner(System.in);
        Scanner latitude2 = new Scanner(System.in);
        Scanner longitude2 = new Scanner(System.in);
        System.out.println("Input coordinates latitude1, longitude1, latitude2, longitude2");


        if (latitude1.hasNextDouble() && longitude1.hasNextDouble() && latitude2.hasNextDouble() && longitude2.hasNextDouble()) {
            double latitude1City = latitude1.nextDouble();
            double longitude1City = longitude1.nextDouble();
            double latitude2City = latitude1.nextDouble();
            double longitude2City = longitude1.nextDouble();
            if (latitude1City > 0 && longitude1City > 0 && latitude2City > 0 && longitude2City > 0) {
// this part with calculation I shamelessly copy  from stackoverflow
                int R = 6371; // Radius of the earth
                double latDistance = Math.toRadians(latitude2City - latitude1City);
                double lonDistance = Math.toRadians(longitude2City - longitude1City);
                double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                        + Math.cos(Math.toRadians(latitude1City)) * Math.cos(Math.toRadians(latitude2City))
                        * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
                double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
                double distance = R * c * 1000; // convert to meters
                System.out.println(distance);

                double dLon = Math.toRadians(longitude2City - longitude1City);

                //convert to radians
                latitude1City = Math.toRadians(latitude1City);
                latitude2City = Math.toRadians(latitude2City);
                longitude1City = Math.toRadians(longitude1City);

                double Bx = Math.cos(latitude2City) * Math.cos(dLon);
                double By = Math.cos(latitude2City) * Math.sin(dLon);
                double lat3 = Math.atan2(Math.sin(latitude1City) + Math.sin(latitude2City), Math.sqrt((Math.cos(latitude1City) + Bx) * (Math.cos(latitude1City) + Bx) + By * By));
                double lon3 = longitude1City + Math.atan2(By, Math.cos(latitude1City) + Bx);

                //print out in degrees
                System.out.println(Math.toDegrees(lat3) + " " + Math.toDegrees(lon3));

            } else System.out.println("Please provide correct latitude and longitude ");
        } else System.out.println("Please provide correct latitude and longitude ");
    }
}

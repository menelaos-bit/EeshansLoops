package Haversine;

public class EeshanHaversine {
    public static void main(String[] args) {


        String exitProgram = "Yes";

        while (!exitProgram.equalsIgnoreCase("quit")) {

            System.out.println("Would you like to measure the distance between two of the 10 most populous US cities, or between two coordinates?");
        }

    }

    public static boolean verifyCity(String city) {
        String[] cityList = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"};

        if (city.equals(cityList[0]) || city.equals(cityList[1]) || city.equals(cityList[2]) || city.equals(cityList[3]) || city.equals(cityList[4]) || city.equals(cityList[5]) || city.equals(cityList[6]) || city.equals(cityList[7]) || city.equals(cityList[8]) || city.equals(cityList[9])) {
            return true;

        } else {
            return false;

        }
    }


}

}

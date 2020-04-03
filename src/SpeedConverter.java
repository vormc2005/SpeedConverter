



public class SpeedConverter {

//    public static void main(String[]args){
//    printResult(10);
//    }

    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else {
            return Math.round(kilometersPerHour / 1.609);
        }


    }
    public static void printResult ( double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("KMH input can n ot be negative");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+ " Km/H = " + milesPerHour + "Mp/H");
        }
    }

}




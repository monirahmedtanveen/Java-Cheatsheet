public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2){
        param1 = (int) (param1 * 1000);
        param2 = (int) (param2 * 1000);

        System.out.println(param1);
        System.out.println(param2);

        return param1 == param2;
    }
}

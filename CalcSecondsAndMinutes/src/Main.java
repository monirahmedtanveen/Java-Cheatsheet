public class Main {

    public static void main(String[] args) {
        String duration = getDurationString(3002);
        System.out.println(duration);
    }

    public static String getDurationString(double minutes, double seconds) {
        if (minutes < 0 || ! (seconds >= 0 && seconds <=59)) {
            return "Invalid value.";
        }

        double totalHours  = (int) ((minutes * 60 + seconds) / 3600);
        int remainingMinutes = (int) (minutes % 60);

        return totalHours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(double seconds) {
        if (seconds < 0) {
            return "Invalid value.";
        }

        double totalMinutes  = (int) (seconds / 60);
        int remainingSeconds = (int) (seconds % 60);
        System.out.println(seconds + " is equal to " + totalMinutes + " minutes and " + remainingSeconds + " seconds.");

        return getDurationString(totalMinutes, remainingSeconds);
    }
}

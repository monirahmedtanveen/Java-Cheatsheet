public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        int number = Integer.parseInt(numberAsString);

        System.out.println("Number As String: " + numberAsString);
        System.out.println("Number: " + number);

        String number2AsString = "2022.35698";
        double number2 = Double.parseDouble(number2AsString);

        System.out.println("Number As String: " + number2AsString);
        System.out.println("Number: " + number2);
    }
}

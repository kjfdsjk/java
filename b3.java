import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer (up to 3 digits): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 999) {
            System.out.println("Invalid input! Please enter a non-negative integer up to 3 digits.");
            return;
        }

        String result = convertToWords(number);
        System.out.println("In words: " + result);
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        String result = "";
        int hundredsDigit = number / 100;
        int tensDigit = (number % 100) / 10;
        int unitsDigit = number % 10;

        switch (hundredsDigit) {
            case 1:
                result += "one hundred";
                break;
            case 2:
                result += "two hundred";
                break;
            case 3:
                result += "three hundred";
                break;
            case 4:
                result += "four hundred";
                break;
            case 5:
                result += "five hundred";
                break;
            case 6:
                result += "six hundred";
                break;
            case 7:
                result += "seven hundred";
                break;
            case 8:
                result += "eight hundred";
                break;
            case 9:
                result += "nine hundred";
                break;
        }

        if (tensDigit == 1) {
            switch (unitsDigit) {
                case 0:
                    result += " ten";
                    break;
                case 1:
                    result += " eleven";
                    break;
                case 2:
                    result += " twelve";
                    break;
                case 3:
                    result += " thirteen";
                    break;
                case 4:
                    result += " fourteen";
                    break;
                case 5:
                    result += " fifteen";
                    break;
                case 6:
                    result += " sixteen";
                    break;
                case 7:
                    result += " seventeen";
                    break;
                case 8:
                    result += " eighteen";
                    break;
                case 9:
                    result += " nineteen";
                    break;
            }
        } else {
            switch (tensDigit) {
                case 2:
                    result += " twenty";
                    break;
                case 3:
                    result += " thirty";
                    break;
                case 4:
                    result += " forty";
                    break;
                case 5:
                    result += " fifty";
                    break;
                case 6:
                    result += " sixty";
                    break;
                case 7:
                    result += " seventy";
                    break;
                case 8:
                    result += " eighty";
                    break;
                case 9:
                    result += " ninety";
                    break;
            }

            switch (unitsDigit) {
                case 1:
                    result += " one";
                    break;
                case 2:
                    result += " two";
                    break;
                case 3:
                    result += " three";
                    break;
                case 4:
                    result += " four";
                    break;
                case 5:
                    result += " five";
                    break;
                case 6:
                    result += " six";
                    break;
                case 7:
                    result += " seven";
                    break;
                case 8:
                    result += " eight";
                    break;
                case 9:
                    result += " nine";
                    break;
            }
        }

        return result.trim();
    }
}
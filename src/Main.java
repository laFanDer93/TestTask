import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ScannerException {
        Scanner scan = new Scanner(System.in);
        String operation;
        HashMap<String, String> romeToArab = getStringHashMapRomeToArab();
        HashMap<String, String> arabToRome = getStringHashMapArabToRome();

        while (true) {
            operation = String.valueOf(scan.nextLine());
            System.out.println(calc(operation, romeToArab, arabToRome));
        }
    }

    public static String calc(String input, HashMap<String, String> romeToArab, HashMap<String, String> arabToRome) throws ScannerException {
        String finalResult;
        String[] parts = input.split(" ");

        if(parts.length > 3) {
            throw new ScannerException("Максимум 2 операнда. Пример: 2 + 3; II * V");
        }

        String firstOperand = parts[0];
        String operator = parts[1];
        String secondOperand = parts[2];

        if ((romeToArab.containsKey(firstOperand) && romeToArab.containsKey(secondOperand))) {

            String firstOperandInArab = romeToArab.get(firstOperand);
            String secondOperandInArab = romeToArab.get(secondOperand);
            String resultArab = calcResultInArabic(firstOperandInArab, secondOperandInArab, operator);
            if (Integer.parseInt(resultArab) < 0 ) {
                throw new ScannerException("Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение" );
            } else {
                finalResult = arabToRome.get(resultArab);
            }

            return finalResult;
        } else if ((Integer.parseInt(firstOperand) > 0 && Integer.parseInt(firstOperand) < 11) &&
                (Integer.parseInt(secondOperand) > 0 && Integer.parseInt(secondOperand) < 11))   {

            finalResult = calcResultInArabic(firstOperand, secondOperand, operator);
            return finalResult;

        } else {
            throw new ScannerException("Неправильный формат выражения. Используйте одну систему счисления(римскую или арабскую), 2 операнда и 1 оператор, пробелы между операндами и оператором, цифры от 1 до 10 включительно. Пример: II * VI; 4 - 9" );
        }
    }

    static String calcResultInArabic (String firstOperand, String secondOperand, String operator ) throws ScannerException {
        int result;
        int firstOperand1 = Integer.parseInt(firstOperand);
        int secondOperand1 = Integer.parseInt(secondOperand);
        
        switch (operator){
            case "+":
                result = firstOperand1 + secondOperand1;
                break;
            case "-":
                result = firstOperand1 - secondOperand1;
                break;
            case "*":
                result = firstOperand1 * secondOperand1;
                break;
            case "/":
                result = firstOperand1 / secondOperand1;
                break;
            default:
                throw new ScannerException("Неправильное арифметическое действие. Только +, -, *, /");
        }

        return Integer.toString(result);
    }

    private static HashMap<String, String> getStringHashMapRomeToArab(){
        HashMap<String, String> romeToArab = new HashMap<String, String>();
        romeToArab.put("I", "1");
        romeToArab.put("II", "2");
        romeToArab.put("III", "3");
        romeToArab.put("IV", "4");
        romeToArab.put("V", "5");
        romeToArab.put("VI", "6");
        romeToArab.put("VII", "7");
        romeToArab.put("VIII", "8");
        romeToArab.put("IX", "9");
        romeToArab.put("X", "10");

        return romeToArab;
    }
    private static HashMap<String, String> getStringHashMapArabToRome(){
        HashMap<String, String> arabToRome = new HashMap<String, String>();
        arabToRome.put("1", "I");
        arabToRome.put("2", "II");
        arabToRome.put("3", "III");
        arabToRome.put("4", "IV");
        arabToRome.put("5", "V");
        arabToRome.put("6", "VI");
        arabToRome.put("7", "VII");
        arabToRome.put("8", "VIII");
        arabToRome.put("9", "IX");
        arabToRome.put("10", "X");
        arabToRome.put("11", "XI");
        arabToRome.put("12", "XII");
        arabToRome.put("13", "XIII");
        arabToRome.put("14", "XIV");
        arabToRome.put("15", "XV");
        arabToRome.put("16", "XVI");
        arabToRome.put("17", "XVII");
        arabToRome.put("18", "XVIII");
        arabToRome.put("19", "XIX");
        arabToRome.put("20", "XX");
        arabToRome.put("21", "XXI");
        arabToRome.put("22", "XXII");
        arabToRome.put("23", "XXIII");
        arabToRome.put("24", "XXIV");
        arabToRome.put("25", "XXV");
        arabToRome.put("26", "XXVI");
        arabToRome.put("27", "XXVII");
        arabToRome.put("28", "XXVIII");
        arabToRome.put("29", "XXIX");
        arabToRome.put("30", "XXX");
        arabToRome.put("31", "XXXI");
        arabToRome.put("32", "XXXII");
        arabToRome.put("33", "XXXIII");
        arabToRome.put("34", "XXXIV");
        arabToRome.put("35", "XXXV");
        arabToRome.put("36", "XXXVI");
        arabToRome.put("37", "XXXVII");
        arabToRome.put("38", "XXXVIII");
        arabToRome.put("39", "XXXIX");
        arabToRome.put("40", "XL");
        arabToRome.put("41", "XLI");
        arabToRome.put("42", "XLII");
        arabToRome.put("43", "XLIII");
        arabToRome.put("44", "XLIV");
        arabToRome.put("45", "XLV");
        arabToRome.put("46", "XLVI");
        arabToRome.put("47", "XLVII");
        arabToRome.put("48", "XLVIII");
        arabToRome.put("49", "XLIX");
        arabToRome.put("50", "L");
        arabToRome.put("51", "LI");
        arabToRome.put("52", "LII");
        arabToRome.put("53", "LIII");
        arabToRome.put("54", "LIV");
        arabToRome.put("55", "LV");
        arabToRome.put("56", "LVI");
        arabToRome.put("57", "LVII");
        arabToRome.put("58", "LVIII");
        arabToRome.put("59", "LIX");
        arabToRome.put("60", "LX");
        arabToRome.put("61", "LXI");
        arabToRome.put("62", "LXII");
        arabToRome.put("63", "LXIII");
        arabToRome.put("64", "LXIV");
        arabToRome.put("65", "LXV");
        arabToRome.put("66", "LXVI");
        arabToRome.put("67", "LXVII");
        arabToRome.put("68", "LXVIII");
        arabToRome.put("69", "LXIX");
        arabToRome.put("70", "LXX");
        arabToRome.put("71", "LXXI");
        arabToRome.put("72", "LXXII");
        arabToRome.put("73", "LXXIII");
        arabToRome.put("74", "LXXIV");
        arabToRome.put("75", "LXXV");
        arabToRome.put("76", "LXXVI");
        arabToRome.put("77", "LXXVII");
        arabToRome.put("78", "LXXVIII");
        arabToRome.put("79", "LXXIX");
        arabToRome.put("80", "LXXX");
        arabToRome.put("81", "LXXXI");
        arabToRome.put("82", "LXXXII");
        arabToRome.put("83", "LXXXIII");
        arabToRome.put("84", "LXXXIV");
        arabToRome.put("85", "LXXXV");
        arabToRome.put("86", "LXXXVI");
        arabToRome.put("87", "LXXXVII");
        arabToRome.put("88", "LXXXVIII");
        arabToRome.put("89", "LXXXIX");
        arabToRome.put("90", "XC");
        arabToRome.put("91", "XCI");
        arabToRome.put("92", "XCII");
        arabToRome.put("93", "XCIII");
        arabToRome.put("94", "XCIV");
        arabToRome.put("95", "XCV");
        arabToRome.put("96", "XCVI");
        arabToRome.put("97", "XCVII");
        arabToRome.put("98", "XCVIII");
        arabToRome.put("99", "XCIX");
        arabToRome.put("100", "C");

        return arabToRome;
    }
    }
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Car audi = new Car("Red", 5, "A4", false);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticGearbox(true);
        System.out.println(audi.getAutomaticGearbox());

 */
/*
        Calculator calculator = new Calculator();
        calculator.add(5, 2);
        System.out.println(calculator.add(5, 2));

 */
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Zdefiniuj operację poprzez podanie + - * / ");
        String znak = scanner.next();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        switch (znak) {
            case "+":
                System.out.println(calculator.add(a, b));
                break;
            case "-":
                System.out.println(calculator.sub(a, b));
                break;
            case "*":
                System.out.println(calculator.multiply(a, b));
                break;
            case "/":
                System.out.println(calculator.div(a, b));
                break;
        }

        /*
        System.out.println("Proszę podać pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Proszę podać drugą liczbę");
        int secondVariable = scanner.nextInt();
        System.out.println("Twój wynik to " + calculator.add(firstVariable, secondVariable));
        System.out.println("Twój wynik to " + calculator.sub(firstVariable, secondVariable));
        System.out.println("Twój wynik to " + calculator.multiply(firstVariable, secondVariable));

         */
    }
}

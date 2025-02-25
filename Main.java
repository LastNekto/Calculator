import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Впишите ваш пример (формат два операнда один оператор");

        Scanner sc = new Scanner(System.in); String s = sc.nextLine(); String[] Primer = s.split(" ");

        if (Primer.length > 3) {
            System.out.println("Не подходит под формат один оператор и два операнда");
        }else
            try {
                int result; int first = Integer.parseInt(Primer[0]); int second = Integer.parseInt(Primer[2]);
                if (first > 10 || first < 1 || second > 10 || second < 1 ){
                    System.out.println("Используйте операнды от 1 до 10");
                }else
                    switch (Primer[1]) {
                    case "+": result = first + second; System.out.println(result); break;
                    case "-": result = first - second; System.out.println(result); break;
                    case "*": result = first * second; System.out.println(result); break;
                    case "/": result = first / second; System.out.println(result); break;
                    default:
                        System.out.println("Неверный оператор"); break;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Исключение ArrayIndexOutOfBoundsException");
            }
            catch (NumberFormatException e){
                System.out.println("Исключение NumberFormatException");
            }
    }
}
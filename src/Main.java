import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        List<String> list = new ArrayList<>(); // создание нового списка
        menu();
        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Какую покупку хотите добавить? ");
                    String input1 = scanner.nextLine();
                    list.add(input1);
                    for (int i = 0; i < list.size(); i++) {
                        count++;
                        System.out.println("Итого в списке покупок: " + count);
                        break;
                    }
                    menu();
                    break;
                case "2":
                    print(list);
                    menu();
                    break;
                case "3":
                    print(list);
                    int a;
                    String b;
                    int s;
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String input2 = scanner.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        try {
                            Integer.parseInt(input2);
                            a = Integer.parseInt(input2) - 1;
                            list.remove(a);
                            count--;
                            System.out.println("Покупка " + input2 + "  удалена");
                            print(list);
                            break;
                        } catch (NumberFormatException e) {
                            if (input2.equals(list.get(i))) {
                                b = input2;
                                s = list.indexOf(b);
                                list.remove(s);
                                count--;
                                System.out.println("Покупка " + input2 + "  удалена");
                                print(list);
                            }
                        }
                    }

                    menu();
                    break;
            }
        }
    }

    public static void print(List list) {
        System.out.println("Список покупок: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " " + list.get(i));
        }
    }

    public static void menu() {
        System.out.println("Выберите операцию ");
        System.out.println("1. Добавить ");
        System.out.println("2. Показать ");
        System.out.println("3. Удалить ");
        System.out.println("===================");
    }

}



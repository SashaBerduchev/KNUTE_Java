import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            System.out.println("Done");
        }

        for (int i = 5; i > 0; i--){
            System.out.println("i = " + i);
        }

        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        int number;
        System.out.println("Wait for number");
        number = Integer.parseInt(String.valueOf(System.in.read()));
        if(number >=0){
            int res = 0;
            for(int i = 0; i <= number; i++){
                res = i+i;
            }
            System.out.println("Answere " + res);
        }

        System.out.println("Next task");
        int option;
        do {
            int fnum;
            int snum;
            System.out.println("Уведіть 2 числа окремо");
            fnum = Integer.parseInt(String.valueOf(System.in.read()));
            snum = Integer.parseInt(String.valueOf(System.in.read()));
            int res = fnum * snum;
            System.out.println(res);
            System.out.println("Уведіть число(якщо 1 то програма зупинить роботу)");
            option = Integer.parseInt(String.valueOf(System.in.read()));
        }while (option != 1);

        System.in.read();

    }
}
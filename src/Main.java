import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[5];
        //Tworze tablicę na 5 indeksów, z 5 indeksami ?
        int i = 0;
        Scanner scan = new Scanner(System.in);
        //Wywołuję scaner
        System.out.println("Podaj 5 imion:");
        while (i < names.length) {
            //Tworzę pętle while
            names[i] = scan.nextLine();
            i++;
        }

        i = names.length - 1;
        while (i >= 0) {
            //Tworzę drugą pętle while, w której piszę cześć + imiona podane od końca
            System.out.println("Cześć " + names[i]);
            i--;
        }
    }
}
//ctrl + alt + l ;)
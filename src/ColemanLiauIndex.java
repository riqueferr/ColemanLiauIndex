import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ColemanLiauIndex {

    public static void main(String[] args) {
        int spaces = 0;
        int sentences = 0;
        int letters = 0;
        int words = 1;
        int x = 0;
        int y = 1;

        Scanner input = new Scanner(System.in);
        String article = input.nextLine(); //get user file


        for (int i = 0; i < article.length(); i++) {
            if (article.substring(x, y).equals(" ")) {
                spaces++;
                words++;
//                System.out.println(article.substring(x, y));
            } else if (article.substring(x, y).equals(":") || article.substring(x, y).equals("!") ||
                    article.substring(x, y).equals("?") || article.substring(x, y).equals(".")) {
                sentences++;
//                System.out.println(article.substring(x, y));
            } else {
                letters++;
//                System.out.println(article.substring(x, y));
            }
            x++;
            y++;
        }


        System.out.println("letters > " + letters);
        System.out.println("words > " + words);
        System.out.println("setences > " + sentences);
        System.out.println("spaces > " + spaces);

        int index = (int) (0.0588 * (100 * letters / words) - 0.296 * (100 * sentences / words) - 15.8);

        if (index > 16) {
            System.out.println("Grade 16+");
        } else {
            System.out.println("Grade " + index);
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ColemanLiauIndex {

    public static void main(String[] args) {
        ArrayList<String> arrayArticle = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String article = input.nextLine(); //get user file
        String words[] = article.split(" "); //quebra a frase pelo espaçamento
        System.out.println("words >>> " + Arrays.toString(words));
        System.out.println("length words=" + words.length);

        System.out.println("artigo = " + article);
        System.out.println("char of article = " + article.substring(0, 1));

        int countCharacter = article.length(); //counts the amount of string in the file
        System.out.println("length of article = " + countCharacter);

        char ch = article.charAt(0);
        boolean alphaNumeric = Character.isLetterOrDigit(ch); //check if it is alphanumeric

        System.out.println("ch=" + ch + " alphaN=" + alphaNumeric);

        for (int i = 0; i < article.length(); i++) {
            arrayArticle.add(article.substring(i, i + 1));
        }

        System.out.println(arrayArticle);

        input.close();
    }
}

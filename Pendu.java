import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pendu
{

    private String dictionnaryWords[] = {"java", "Python", "javascript", "cobol", "pearl", "c++","crêpes", "kouign amann"};
    private static String theWord;

    private static String attemptlEtter;

    private static int chances =7;

    public Pendu()
    {
        //Constructor

    }

    public String wordGenerator()
    {
        // générator for create one word from dictionnaryWords

        int min=0;
        int max=dictionnaryWords.length;
        Random nombre = new Random();
        int nb;
        nb = nombre.nextInt(max );
        theWord = dictionnaryWords[nb];

        return theWord;
    }



    public String anonymousWord()
    {
        // hide the word under stars
        char anonymous = '*';
        char[] letter = new char[theWord.length()];
        String stars = " ";

        ArrayList<Character> ArrayWord = new ArrayList<Character>();

        for(int i =0; i< theWord.length(); i++)
        {
            letter[i] = theWord.charAt(i);
            ArrayWord.add(letter[i]);
        }

        ArrayList <Character> anonymusWord = new ArrayList<Character>();
        char[] starLetter = new char[theWord.length()];
        for(int i =0; i < theWord.length(); i++)
        {
            starLetter[i] = anonymous;
            anonymusWord.add(starLetter[i]);
        }

        for(Character star : anonymusWord)
        {
            stars += star+"";
        }
        return stars;
    }


    public Character userInput()
    {
        // catch input's user
        System.out.println("Entrez une lettre pour tenter de trouver le mot mystère");
        Scanner userinp = new Scanner(System.in);
        char attempt = userinp.next().charAt(0);
        return attempt;

    }






}
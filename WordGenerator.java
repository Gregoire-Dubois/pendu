import java.util.Random;

public class WordGenerator {

    public WordGenerator()
    {
        System.out.println(wordSelector());

    }
    public String wordSelector(){

        // générer un nombre aléatoire
        this.minValueRandom = 0;
        this.maxValueRandom = dicoWords.length;
        Random chf = new Random();
        this.randomNumber = chf.nextInt(maxValueRandom) + minValueRandom;

        // retourner le mot aléatoire
        return this.theWord = dicoWords[randomNumber];
    }

    private String dicoWords[] = { "python", "java", "php", "pascal", "javascript", "cobol" };
    public static String theWord; 
    private int minValueRandom;
    private int maxValueRandom;
    private int randomNumber;

}

public class App_pendu {

    public static void main(String[] args) {

        Pendu jeu = new Pendu();
        System.out.println(jeu.wordGenerator());
//        jeu.wordGenerator();
        System.out.println("Le mot Mystère est : " + jeu.anonymousWord());
        System.out.println(jeu.userInput());    	
    }
}



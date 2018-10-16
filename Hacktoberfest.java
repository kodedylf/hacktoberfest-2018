import java.util.Scanner;

public class Hacktoberfest {
     public static void main(String[] args) {
     	System.out.println("Hej Mathias");
       System.out.println("Hej Hans :-)");
        System.out.println("Boros sucks!");
         iAmThinkingOfANumber();
         iAmAlsoThinkingOfANumber();
     }
     
     public static void iAmThinkingOfANumber()
     {
        int a = (int) (Math.random() * 10 + 1);
        System.out.println("Jeg t�nkte p�: " + a);
     }

     public static void iAmAlsoThinkingOfANumber() {
         int myNumber = (int) (Math.random() * 100 + 1);
         System.out.println("Jeg tænker på et tal mellem 1 og 100. Se om du kan gætte det.");
         Scanner scanner = new Scanner(System.in);
         int numberOfGuesses = 0;
         int guess = 0;
         do {
            System.out.print("Dit gæt: ");
            String s = scanner.next();
            guess = Integer.parseInt(s);
            numberOfGuesses++;
            if (guess != myNumber)
                System.out.println("Forkert. Dit gæt var for " + ((guess < myNumber) ? "lavt" : "højt"));
         } while (guess != myNumber);
         System.out.println("Flot. Du gættede mit tal på " + numberOfGuesses + " gæt");
     }
}

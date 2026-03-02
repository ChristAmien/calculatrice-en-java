import java.util.Scanner;

public class calculatrice {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultat;
        char operateur;

        System.out.println("Bienvenue dans la calculatrice Java !");
        System.out.print("Entrez le premier nombre : ");
        num1 = scanner.nextDouble();

        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        operateur = scanner.next().charAt(0);

        System.out.print("Entrez le deuxième nombre : ");
        num2 = scanner.nextDouble();

        switch (operateur) {
            case '+':
                resultat = num1 + num2;
                break;
            case '-':
                resultat = num1 - num2;
                break;
            case '*':
                resultat = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultat = num1 / num2;
                } else {
                    System.out.println("Erreur : division par zéro !");
                    return; // on arrête le programme
                }
                break;
            default:
                System.out.println("Erreur : opérateur invalide !");
                return;
        }

        System.out.println("Résultat : " + resultat);
        scanner.close();
    }
}


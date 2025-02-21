import java.util.Scanner;

class Calculatrice {
    public double addition(double a,double b){
        return a+b;
    }
    public double soustraction(double a,double b){
        return a-b;
    }
    public double multiplication(double a,double b){
        return a*b;
    }
    public double division(double a,double b){
        if (b==0){
            throw new ArithmeticException("Erreur : Division par zéro")
        }
        return a\b;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice Java");
        System.out.print("Entrez le premier nombre :");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez l'opérateur (+, -, *, /) :");
        char operateur = scanner.next().charAt(0);

        System.out.print("Entrez le second nombre :");
        double num2 = scanner.nextDouble();

        double resultat = 0;
        boolean erreur = false;

    
            switch (operateur) {
                case '+':
                    resultat = calculatrice.addition(num1, num2);
                    break;
                case '-':
                    resultat = calculatrice.soustraction(num1, num2);
                    break;
                case '*':
                    resultat = calculatrice.multiplication(num1, num2);
                    break;
                case '/':
                    resultat = calculatrice.division(num1, num2);
                    break;
                default:
                    System.out.println("Opérateur invalide *_*");
                    erreur = true;
            }
        

        if (!erreur) {
            System.out.println("Résultat : " + resultat);
        }

        scanner.close();
    }
}


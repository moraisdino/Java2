import java.util.Scanner;
public class Main { 
  public static void main(String[] args) {
    Scanner sc = new 
  Scanner (System.in);
    System.out.println("digite seu primeiro nome:");
    String nome = sc.nextLine();
    System.out.println("digite seu sobrenome:");
    String sobrenome = sc.nextLine();
    System.out.println("sobrenome");
    System.out.println("seu nome é " + nome + " + " + sobrenome);
    System.out.println("digite sua idade");
    int idade = sc.nextInt();
    System.out.println("digite sua massa ");
    double massa = sc.nextDouble();
    System.out.println(massa);
    System.out.println("sua altura em centimetros");
    double altura = sc.nextDouble();
    
double alturamanu = altura/100;
    double AlturaQuadrado = alturamanu;
    double MassaDividida = Massa/AlturaQuadrado;
     sc.close ();
  }
 }


  
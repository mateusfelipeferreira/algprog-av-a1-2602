import java.util.Scanner;
public class Algoritimo {
    public static void main(String [] args) {
    
    Scanner teclado = new Scanner(System.in);

    double cotaçãoatual = 0.0;
    double cotaçãoprojetada = 0.0;
    int perda = 0;
    String produto = "";


    System.out.println("Digite o nome do produto:");
    produto = teclado.nextLine();
    System.out.println("Digite cotação do produto:");
    cotaçãoatual = teclado.nextDouble();
    System.out.println("Digite a perda do produto:");
    perda = teclado.nextInt();
        
        if (perda < 0 || perda > 100) {
        System.out.println("Erro:Percentual de perda de safra invalido.");}
        else{
        cotaçãoprojetada = cotaçãoatual + (perda * 0.10);

        System.out.println("Cotação projetada: " + cotaçãoprojetada);

        if (perda > 15 && cotaçãoatual > 50.00) {
        System.out.println("ALERTA:Risco de alta volatilidade no mercado!");
        }
}
}
}
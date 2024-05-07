import java.util.Scanner;

public class VerificadorNumeroConta{
public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double saque;
        for(int i = 0; i <= limiteDiario;) {
            saque = scanner.nextDouble();
            if(saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }
            else if(saque < limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " +limiteDiario);
            }
            else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        scanner.close(); 
    }
}
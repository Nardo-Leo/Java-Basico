import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class contaTerminal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        DecimalFormat saldoFmt = new DecimalFormat();
        saldoFmt.applyPattern("R$ #,##0.00");

        double saldo = ThreadLocalRandom.current().nextDouble(0,50000);
        

        System.out.println("Informe seu nome");
        String nome = scanner.nextLine();

        System.out.println("Informe o numero da sua agencia");
        int agc = scanner.nextInt();

        System.out.println("Informe o numero da conta");
        int cnt = scanner.nextInt();


        scanner.close();


        System.out.println("\tOlá " + nome + " Nº agencia: " +agc + " Nº conta: " + 
        cnt + "\n \tSeu saldo atual é de: " + saldoFmt.format(saldo));


        System.out.println("\nAte a proxima!\n\n"); 
    }
}

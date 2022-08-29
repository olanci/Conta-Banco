import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita sua Agencia:");
        int Agencia = sc.nextInt();

        System.out.println("Digita sua Conta:");
        int Conta = sc.nextInt();

        System.out.println("Digita seu Nome:");
        String Nome = sc.next();

         
        System.out.println("Ola! "+Nome + "  Obrigado por cria uma conta em nosso Banco, sua Agencia:  "+Agencia+ "  Conta:  "+Conta+ "  Seu Saldo é 0  "
          );
        double Saldo = 0;
        Saldo = sc.nextDouble();

         sc.close();



       
        



     

    }
}

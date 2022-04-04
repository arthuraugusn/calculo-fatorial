import java.util.Scanner;

class Fatorial{
    public static void main (String args[]){
        Scanner ler= new Scanner (System.in);
        char op= 's';
        while(op== 's'){
            while(true){
                System.out.println("Informe seu nº positivo: ");
                int n= ler.nextInt();
                long fat= n;
                if(n >=0){
                    for (int i=2; i<=n; i++){
                        fat *=i;
                    }
                    System.out.println(n + "! = "+ fat);
                    System.out.println("");
                    break;
                }
                System.out.println("Somente numeros positivos sao aceitos");
                System.out.println("");
            }
            System.out.println("\nDeseja continuar [s/n]:");
            op = ler.next().charAt(0);
            while(op !='s' && op!= 'n'){
                System.out.println("Digite de maneira correta");
                op= ler.next().charAt(0);
            }
            if (op != 's'){
                System.exit(0);
            }
        }
    }
}
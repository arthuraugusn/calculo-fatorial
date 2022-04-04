import java.util.Scanner;

class Fatorialf{
    public static void main (String args[]){
        Scanner ler= new Scanner (System.in);
        while(true){
            System.out.println("Informe seu nº positivo: ");
            int n= ler.nextInt();
            long fat= 1;

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
    }
}
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            int parametroUm =0;
            int parametroDois =0;

            System.out.println("Informe o primeiro parametro");
            parametroUm = scanner.nextInt();
            

            System.out.println("Informe o primeiro parametro");
            parametroDois = scanner.nextInt();

        

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
                System.out.println("\tO segundo parametro deve ser maior que o primeiro. ");
            }

                    
            scanner.close();
                
           

    }


     static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        

        if(parametroUm > parametroDois){

            throw new ParametrosInvalidosException();

        }

            int count = parametroDois - parametroUm;

            for(int i = 1;count>0;count-- ){
                System.out.println("\n\tImprimindo " + i);
                i++;

            }

    }

   

}







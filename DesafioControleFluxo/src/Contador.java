
import java.util.Scanner;


public class Contador {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = scanner.nextInt();

        try {
            Contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
        
            System.err.println(e.getMessage());
        }
    }


    static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contador = parametroDois - parametroUm;
        for (int i = 1; i <= contador; i++){
            System.out.println("contando " + i);
        }

    }


}

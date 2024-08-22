import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Random aleatorio=new Random();

        int monto,a;
        a= aleatorio.nextInt(1,4);
        int op;


        System.out.println("Ingrese el monto inicial");
        monto=teclado.nextInt();

        do {

            if (a == 3) {
                System.out.println("Perdiste tu dinero");
                monto = 0;
                break;

            } else if (a == 2) {
                System.out.println("Perdiste la mitad de tu dinero");
                monto = monto / 2;
                System.out.println("¿Quiere seguir jugando?(1=Si, 2=No)");
                a= aleatorio.nextInt(1,4);
                op= teclado.nextInt();
                if (op==1){
                    System.out.println("Sigue jugando");
                    continue;

                }
                else{
                    break;
                }
            } else if (a == 1) {
                System.out.println("Su dinero se multiplico");
                monto = monto * 2;
                System.out.println("¿Quiere seguir jugando?(1=Si, 2=No)");
                a= aleatorio.nextInt(1,4);
                op= teclado.nextInt();
                if (op==1){
                    System.out.println("Sigue jugando");
                    continue;
                }
                else{
                    break;
                }


            }
        }while(monto!=3);

    }
}
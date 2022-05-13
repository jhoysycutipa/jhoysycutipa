import java.util.Scanner;
public class tarea13 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //datos de entrada
        //saber cuanto es el pasaje
        //de acuerdo de la cantidad de estudiantes
        double b,a;
        int cant;
        String mensaje;
        System.out.println("ingrese el ingrese la cantidad");
        cant=lt.nextInt();
        //proceso
        if (cant>100) {a=cant*20;b=a/cant;mensaje="usted debe pagar $"+b;
        } else if (cant>49) {a=cant*35;b=a/cant; mensaje="usted debe pagar $"+b; 
        } else if (cant>19) {a=cant*40;b=a/cant; mensaje="usted debe pagar $" +b;
        } else {a=cant*70;b=a/cant;mensaje="usted debe pagar $"+b;}
          //datos de salida
    System.out.println(mensaje);
    }
}

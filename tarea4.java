import java.util.Scanner;
public class tarea4 {
    static Scanner it=new Scanner(System.in);
    public static void main(String[] args) {
     //declarar variables
     //4
    //cuanto debe cobrar por el estacionamiento
    //y  que va bajando el precio de acuerdo de un tiempo
        int horas;
        String mensaje;
        double a,b,e,r;
        //datos de entrada
        System.out.println("ingrese la cantidad de horas");
        horas=it.nextInt();
        //proceso
        if (horas>10) {r=horas*2+17; mensaje="usted debe pagar $"+r;
        }else if (horas>5) {b=horas*3+7; mensaje="usted debe pagar $"+b;
        }else if (horas>3) {e=horas*4+2; mensaje="usted debe pagar $"+e;
        } else { a=horas*5; mensaje="usted debe pagar $"+a; }
        //datos de salida
        System.out.println(mensaje);    
    }
}

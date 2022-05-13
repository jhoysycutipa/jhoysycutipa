import java.util.Scanner;
public class tarea6 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //6
        //datos de entrada
        //saber cuanto de descuento tengo si adquiri aldo de...
        double a;
        int costot;
        String mensaje;
        System.out.println("ingrese el precio");
        costot=lt.nextInt();
        //proceso
        if (costot>=200) {a=costot-(costot*0.15);mensaje="usted debe pagar $"+a;
        } else if (costot>100) {a=costot-(costot*0.12);mensaje="usted debe pagar $"+a;
        } else { a=costot-(costot*0.1);mensaje="usted debe pagar $"+a;}
    //datos de salida
    System.out.println(mensaje);
    }
}

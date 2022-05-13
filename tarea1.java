import java.util.Scanner;
public class tarea1 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //declarar variables
        //puedo votar si tengo la edad de...
        int edad;
        String mensaje;
        //datos de entrada
        System.out.println("ingrese cuantos años tienes");
        edad=lt.nextInt();
        //proceso
        if (edad>=18) {mensaje="puede votar porque es mayor de "+edad;
        } else {mensaje="no puede votar porque es menor de "+edad;}
        //datos de salida
        System.out.println(mensaje);
    }
}

import java.util.Scanner;
public class tarea3 {
    static Scanner it=new Scanner(System.in);
    public static void main(String[] args) {
        //definir variables
        //3.3 que puede comprar con su dinero
        //si solo tengo???
        //datos de entrada 
int precio;
String mensaje;
System.out.println("ingrese el costo");
precio=it.nextInt();
//proceso
if (251<=precio) {
    mensaje="puede comprar un anillo";
    }else if (precio>=101) {mensaje="puede compra flores";
    } else if (precio>=11) {mensaje="puede comprar chocolates";
    }else {mensaje="puede comprar una tarjeta";}
    //datos de salida
    System.out.println(mensaje);
    }
}

import java.util.Scanner;
public class tarea2 {
    static Scanner it=new Scanner(System.in);
    public static void main(String[] args) {
    //declarar variables
       //3.2 
       //trabajo de una semana 40 horas
       // si se excede recibe x2 la dicha hora
       double m,z,q,c;
       int p;
       int pagos;
       int horas;
       String mensaje;
       System.out.println("ingrese el sueldo semanal");
       pagos=it.nextInt();
       System.out.println("ingrese la cantidad de horas");
       horas=it.nextInt();
       //proceso
       p=pagos/40;
        if (40<horas) {m=(horas-40); z=(m); c=(horas*p)+(z*p);
            mensaje="usted recibira el doble de sus horas extras $ "+c;
             }else { q=(horas*p);
             mensaje="usted recibira el pago de sus horas $ "+q;  
            }  
             //datos de salida
               System.out.println(mensaje);    
    }
}

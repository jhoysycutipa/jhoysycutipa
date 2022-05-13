import java.util.Scanner;
public class tarea15 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //datos de entrada
        //saber que dia es poniendo un numero de 1 a 7
        int dia;
        String mensaje;
        System.out.println("indique que numero de dia 1 al 7");
       dia=lt.nextInt();
       if (dia>=7) {mensaje="el dia es domingo";
    }else if (dia>5) {mensaje="el dia es sabado";
         }else if (dia>4) { mensaje="el dia es viernes";
              }else if (dia>3) {  mensaje="el dia es jueves";
            }else if (dia>2) { mensaje="el dia es miercoles";
             }else if (dia>1) {mensaje="el dia es martes";
            } else { mensaje="el dia es lunes";}
              //datos de salida
        System.out.println(mensaje);
    }
}

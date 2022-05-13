import java.util.Scanner;
public class tarea16 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
         //datos de entrada
    //cuanto de salario tiene
    //su bono dependiendo de sus puntos
    double a;
    int puntos;
    int salario;
    String mensaje;
    System.out.println("ingrese sus puntos");
    puntos=lt.nextInt();
    System.out.println("ingrese cuanto es el salario");
    salario=lt.nextInt();
    if (puntos>151) {a=3*salario;mensaje="usted recibe $"+a;
    } else if (puntos>100) {a=2*salario;mensaje="usted recibe $"+a; 
    } else {a=1*salario;mensaje="usted recibe $"+a; }
    //datos de salida
    System.out.println(mensaje);
    }
}

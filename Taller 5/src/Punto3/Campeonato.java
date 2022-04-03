package Punto3;
import java.util.Scanner;
public class Campeonato {
    public static void main(String [] args){
        Scanner entrada= new Scanner(System.in);
    String nombre_del_equipo;
    String ciudad_origen;
    String nombre_del_tecnico;
    int noInscripcion;
    int jugadores;
    String [] nombreJugador= new String [20];
    int [] edad = new int [20];
    String [] posicion = new String [20] ;
    int n,n2,n3=0;
    int n1=0;
    System.out.println("Digite el numero de equipos (No puedes pasar el limite de 5 equipos): ");
    n= entrada.nextInt();
    
    CampeonatoMicro op[] = new CampeonatoMicro[n];
    for (int x=0;x<n;x++){
        entrada.nextLine();
        System.out.print("");
        System.out.print("Digite nombre del equipo: ");
        nombre_del_equipo= entrada.nextLine();
        System.out.print("Digite la ciudad de origen del equipo: ");
        ciudad_origen= entrada.nextLine();
        System.out.print("Digite el nombre del tecnico(equipo): ");
        nombre_del_tecnico= entrada.nextLine();
        System.out.print("Digite Numero de inscripcion: ");
        noInscripcion= entrada.nextInt();
        System.out.print("Digite de jugadores que desea inscribir en el equipo (No puedes pasar el limite de 6 ): ");
        jugadores= entrada.nextInt();
        n2= jugadores+n3;
        
        for (int i=n1; i<n2;i++){
            entrada.nextLine();
            System.out.print("Digite el nombre del jugador "+(i+1)+" : ");
            nombreJugador [i]= entrada.nextLine();
            System.out.print("Digite la edad del jugador "+(i+1)+" : ");
            edad [i]=entrada.nextInt();
            System.out.print("Digite la posicion del jugador "+(i+1)+" : ");
            posicion [i] = entrada.next();
            System.out.print("");
            n1++;
            n3++;
        }
        
    op[x]= new CampeonatoMicro(nombre_del_equipo, ciudad_origen,nombre_del_tecnico,noInscripcion,jugadores, nombreJugador , edad , posicion );
    }
    
    
    for (int i=0;i<op.length;i++){
        System.out.println("\n--- Nomina del equipo "+(i+1)+" ---");
        op[i].mostrarDatos();
        System.out.println("");
    }
    System.out.println("--- Nomina de los jugadores ---");
    for (int i=0; i<n1;i++){
        System.out.println("");
        System.out.println("Este es el nombre del jugador: "+(i+1)+"  "+nombreJugador[i]);
        System.out.println("Esta es la edad del jugador: "+(i+1)+" "+edad[i]);
        System.out.println("Esta es la posicion del jugador:  "+(i+1)+" "+posicion[i]);
       
    }
       
    }

}
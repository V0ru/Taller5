package Punto3;
import java.util.Scanner;
public class CampeonatoMicro {
    Scanner entrada = new Scanner (System.in);
    int a[]= new int [3];
    private int [] equipos;
    private String nombre_del_equipo;
    private String ciudad_origen;
    private String nombre_del_tecnico;
    private int noInscripcion;
    private int jugadores;
    private String [] nombreJugador= new String [20];
    private int [] edad= new int [20];
    private String [] posicion= new String [20];
    
    public CampeonatoMicro(String nombre_del_equipo, String ciudad_origen, String nombre_del_tecnico, int noInscripcion, int jugadores, String [] nombreJugador, int [] edad, String [] posicion){
        super();
        this.nombre_del_equipo = nombre_del_equipo;
        this.ciudad_origen = ciudad_origen;
        this.nombre_del_tecnico = nombre_del_tecnico;
        this.noInscripcion = noInscripcion;
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    public int getJugadores(){
        return jugadores;
    }
    
    public void setJugadores(int jugadores){
        this.jugadores= jugadores;
    }
    public String getNombreEquipo() {
        return nombre_del_equipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombre_del_equipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad_origen;
    }

    public void setCiudad(String ciudad) {
        this.ciudad_origen = ciudad;
    }

    public String getNombreTecnico() {
        return nombre_del_equipo;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombre_del_tecnico = nombreTecnico;
    }

    public int getNoInscripcion() {
        return noInscripcion;
    }

    public void setNoInscripcion(int noInscripcion) {
        this.noInscripcion = noInscripcion;
    }

    public String getNombreJugador() {
        return nombreJugador [20];
    }

    public void setNombreJugador(String [] nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return edad [20];
    }

    public void setEdad(int [] edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion [20];
    }

    public void setPosicion(String [] posicion) {
        this.posicion = posicion;
    }

    public int[] getEquipos() {
        return equipos;
    }

    public void setEquipos(int[] equipos) {
        this.equipos = equipos;
    }

    public void mostrarDatos(){
        System.out.print("");
        System.out.println("El nombre del equipo es: "+nombre_del_equipo);
        System.out.println("La ciudad del equipo es: "+ciudad_origen);
        System.out.println("El nombre del tecnico es: "+nombre_del_tecnico);
        System.out.println("El numero de inscripcion es: "+noInscripcion);
        for (int i=0; i<jugadores;i++){
            System.out.println("El nombre del jugador "+(i+1)+" es: "+nombreJugador[i]);
            System.out.println("La edad del jugador "+(i+1)+" es: "+edad[i]);
            System.out.println("La posicion donde juega el jugador "+(i+1)+" es: "+posicion[i]);
            
        }
    }

    public void nominaJugadores(){
        for (int i=0;i<jugadores;i++){
            System.out.println("El nombre del jugador "+(i+1)+" es: "+nombreJugador[i]);
            System.out.println("La edad del jugador "+(i+1)+" es: "+edad[i]);
            System.out.println("La posicion donde juega el jugador "+(i+1)+" es: "+posicion[i]);
        }
    }
    
   
}
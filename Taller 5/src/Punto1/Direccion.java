
package Punto1;


public class Direccion {
    private String calle;
    private String barrio;
    private String Carrera;

    public Direccion(String calle, String barrio, String Carrera) {
        this.calle = calle;
        this.barrio = barrio;
        this.Carrera = Carrera;
    }
    
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    public void DatosDireccion(){
        System.out.println("Mi direccion es"+Carrera+calle+"Barri"+barrio);
    }
    
    
    
}

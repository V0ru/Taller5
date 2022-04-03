package Punto1;


public class Fecha {
    private int dia;
    private String mes;
    private int año;
    private String Fecha_nacimineto;

    public Fecha(int dia, String mes, int año,String Fecha_nacimiento) {
        this.dia = 26;
        this.mes = "Noviembre";
        this.año = 2002;
        this.Fecha_nacimineto =Fecha_nacimiento;
    }
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void Datos(){
        System.out.println("Mi fecha de nacimiento es: "+dia+"de "+mes+"del "+año);
    }

    
    
}

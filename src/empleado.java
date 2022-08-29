 
public class empleado extends persona{

   
   private double sueldo;
   private int semanas;
   private String trabajo;
   private String horario;

    public empleado() {
        super();
    }

   

    public empleado(double sueldo, int semanas, String trabajo, String horario, String ID, String nombre, int edad, String sexo, int altura, int peso, String estadociv) {
        super(ID, nombre, edad, sexo, altura, peso, estadociv);
        this.sueldo = sueldo;
        this.semanas = semanas;
        this.trabajo = trabajo;
        this.horario = horario;
    }
 

    public double getSueldo() {
        return sueldo;
    }

    public int getSemanas() {
        return semanas;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public String getHorario() {
        return horario;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "empleado{" + "sueldo=" + sueldo + ", semanas=" + semanas + ", trabajo=" + trabajo + ", horario=" + horario + super.toString();
    }
   
}

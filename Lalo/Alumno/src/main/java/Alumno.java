public class Alumno {
    private String nombre;
    private int edad;
    private String correo;
    private String escuela;

    public Alumno(String nombre, int edad, String correo){
        this.nombre=nombre;
        this.edad= edad;
        this.correo = correo;

    }
    public String getNombre(){
       return this.nombre;
    }
    public String getCorreo(){
        return this.correo;
    }
    public int getEdad (){
        return this.edad;
    }
    public String toString(){
	return this.name + " tiene " + this.edad + " a;os";
    }
}

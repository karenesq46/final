public class Atleta {
    private int numero_atleta;
    private String nombre;
    private float tiempo_carrera;

    public Atleta(int numero_atleta, String nombre, float tiempo_carrera){
        this.numero_atleta=numero_atleta;
        this.nombre=nombre;
        this.tiempo_carrera=tiempo_carrera;
    }

    public Atleta(){}

    public int getNumero_atleta() {
        return numero_atleta;
    }

    public void setNumero_atleta(int numero_atleta) {
        this.numero_atleta = numero_atleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTiempo_carrera() {
        return tiempo_carrera;
    }

    public void setTiempo_carrera(float tiempo_carrera) {
        this.tiempo_carrera = tiempo_carrera;
    }

    public String getDatosAtleta(){
        return "Numero: " + numero_atleta + "\nNombre: " + nombre + "\nTiempo de carrera: " + tiempo_carrera;
    }
}

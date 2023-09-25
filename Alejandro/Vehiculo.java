abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private String segmento;

    public Vehiculo(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Vehiculo(){

    }

    public void Acelerar(){
        System.out.println("\nEl Vehiculo " + this.modelo + " esta acelerando.");
    }

    public abstract void frenarAuto();
    
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getSegmento(){
        return this.segmento;
    }

    public void setSegmento(String segmento){
        this.segmento = segmento;
    }

}

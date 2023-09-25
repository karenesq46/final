class hothatch extends Vehiculo {
    final int velocidadActual = 200;

    public hothatch(String marca, String modelo, String color) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setColor(color);
        this.setSegmento("Deportivo");
    }
    public hothatch() {
        this.setSegmento("Deportivo");
        
        System.out.println("Su velocidad maxima es: "+ this.velocidadActual + "KM/H");
    }


    
    public void frenar_Auto(){
        System.out.println("\nEl vehiculo " + this.getModelo()+ " frena contundentemente.");
    }

    public void Informacion() {
        System.out.println("\nLa informacion del vehiculo es: "
                + this.getMarca() + "\n"
                + this.getModelo() + "\n"
                + this.getColor() + "\n"
                + this.getSegmento());
    }
}

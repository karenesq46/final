class suv extends Vehiculo {

    public suv(String marca, String modelo, String color){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setColor(color);
        this.setSegmento("SUV");
    }

    @Override
    public void Acelerar(){
        System.out.println("\nEl vehiculo " + this.getMarca() + " " + this.getModelo() + " esta acelerando a fondo.");
    }

    public void frenar_Auto(){
        System.out.println("\nEl vehiculo " + this.getMarca() + " " + this.getModelo() + " frena muy lentamente.");
    }

    public void Informacion(){
        System.out.println("\nLa informacion del vehiculo es: \n" 
                         + this.getMarca() +"\n"
                         + this.getModelo() +"\n"
                         + this.getColor()+ "\n"
                         + this.getSegmento());
    }
}

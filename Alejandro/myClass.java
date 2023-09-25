public class myClass {
    public static void main(String[] args){
        suv Carro1 = new suv("BMW", "X5", "Azul");
        hothatch Carro2 = new hothatch();
        
        Carro1.Acelerar();
        Carro2.setMarca("Cupra");
        Carro2.setModelo("Formentor");
        Carro2.setColor("Gris Oxford");

        Carro2.Acelerar();
        Carro1.Frenar();
        Carro1.Informacion();
        Carro2.Frenar();
        Carro2.Informacion();

    }


}

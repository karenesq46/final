public class myClass {
    public static void main(String[] args){
        suv Camioneta = new suv("BMW", "X5", "Azul");
        hothatch Carro2 = new hothatch();
        
        Camioneta.Acelerar();
        Carro2.setMarca("Cupra");
        Carro2.setModelo("Formentor");
        Carro2.setColor("Gris Oxford");

        Carro2.Acelerar();
        Camioneta.Frenar();
        Camioneta.Informacion();
        Carro2.Frenar();
        Carro1.frenarAuto();
        Carro1.Informacion();
        Carro2.frenarAuto();
        Carro2.Informacion();

    }


}

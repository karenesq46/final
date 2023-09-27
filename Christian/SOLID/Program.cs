// See https://aka.ms/new-console-template for more information
using System;

namespace SOLID{

    class AtributosPersonaje
    {
        public string Nombre { get; set; }
        public int Fuerza { get; set; }
        public int Inteligencia { get; set; }
        public int Defensa { get; set; }
        public int Vida { get; set; }

        public AtributosPersonaje(string nombre, int fuerza, int inteligencia, int defensa, int vida)
        {
            Nombre = nombre;
            Fuerza = fuerza;
            Inteligencia = inteligencia;
            Defensa = defensa;
            Vida = vida;
        }

        public void MostrarAtributos()
        {
            Console.WriteLine(Nombre + ":");
            Console.WriteLine("·Fuerza: " + Fuerza);
            Console.WriteLine("·Inteligencia: " + Inteligencia);
            Console.WriteLine("·Defensa: " + Defensa);
            Console.WriteLine("·Vida: " + Vida);
        }
    }

    // Clase para gestionar el estado del personaje
    class EstadoPersonaje
    {
        public bool EstaVivo(int vida)
        {
            return vida > 0;
        }

        public void Morir(string nombre)
        {
            Console.WriteLine(nombre + " ha muerto");
        }
    }

    // Clase para las operaciones de combate
    /*class CombatePersonaje
    {
        public int CalcularDano(int fuerza, int defensa)
        {
            return fuerza - defensa;
        }

        public void Atacar(string atacante, string defensor, int dano)
        {
            Console.WriteLine(atacante + " ha realizado " + dano + " puntos de daño a " + defensor);
        }
    }*/

    // Interfaz para definir el comportamiento de ataque
    public interface IAtaqueStrategy
    {
        int CalcularDano(int fuerza, int defensa);
    }

    // Implementación de estrategia para el combate
    public class CombateStrategy : IAtaqueStrategy
    {
        public int CalcularDano(int fuerza, int defensa)
        {
            return fuerza - defensa;
        }
    }

    // Clase principal del personaje que utiliza las otras clases
    class Personaje
    {
        private AtributosPersonaje atributos;
        private EstadoPersonaje estado;
        private CombatePersonaje combate;

        public Personaje(string nombre, int fuerza, int inteligencia, int defensa, int vida)
        {
            atributos = new AtributosPersonaje(nombre, fuerza, inteligencia, defensa, vida);
            estado = new EstadoPersonaje();
            combate = new CombatePersonaje();
        }

        public void MostrarAtributos()
        {
            atributos.MostrarAtributos();
        }

        public void SubirNivel(int fuerza, int inteligencia, int defensa)
        {
            atributos.Fuerza += fuerza;
            atributos.Inteligencia += inteligencia;
            atributos.Defensa += defensa;
        }

        public bool EstaVivo()
        {
            return estado.EstaVivo(atributos.Vida);
        }

        public void Morir()
        {
            estado.Morir(atributos.Nombre);
        }

        public void Atacar(Personaje enemigo)
        {
            int dano = combate.CalcularDano(atributos.Fuerza, enemigo.atributos.Defensa);
            combate.Atacar(atributos.Nombre, enemigo.atributos.Nombre, dano);
            enemigo.atributos.Vida -= dano;

            if (!enemigo.EstaVivo())
            {
                enemigo.Morir();
            }
        }
    }


    
    //clase Mago

    class Mago : Personaje{
        private int libro;

        public Mago(string nombre, int fuerza, int inteligencia, int defensa, int vida, int libro)
            :base(nombre, fuerza, inteligencia, defensa, vida){
            this.libro = libro;
        }

        public int Libro{
            get{
                return libro;
            }
            set{
                libro = value;
            }
        }

        public override void Atributos(){
            base.MostrarAtributos();
            Console.WriteLine("·Libro: " + libro);
        }

        public override int Dano(Personaje enemigo){
            return Inteligencia * libro - enemigo.Defensa;
        }
    }

    //CLASE GUERRERO
    public class Guerrero : Personaje{
        public int Espada { get; set; }

        public Guerrero(string nombre, int fuerza, int inteligencia, int defensa, int vida, int espada)
            : base(nombre, fuerza, inteligencia, defensa, vida)
        {
            Espada = espada;
        }

        public void CambiarArma(int nuevaEspada)
        {
            Espada = nuevaEspada;
        }

        public override void Atributos()
        {
            base.MostrarAtributos();
            Console.WriteLine($"·Espada: {Espada}");
        }

        public override int Dano(Personaje enemigo)
        {
            return Fuerza * Espada - enemigo.Defensa;
        }
    }

    class Program{
        public static void Combate(Personaje jugador1, Personaje jugador2){
            int turno = 0;
            while (jugador1.EstaVivo() && jugador2.EstaVivo()){
                Console.WriteLine("\nTurno " + turno);
                Console.WriteLine(">>> Acción de " + jugador1.Nombre + ":");
                jugador1.Atacar(jugador2);
                Console.WriteLine(">>> Acción de " + jugador2.Nombre + ":");
                jugador2.Atacar(jugador1);
                turno++;
            }

            if (jugador1.EstaVivo()){
                Console.WriteLine("\nHa ganado " + jugador1.Nombre);
            }
            else if (jugador2.EstaVivo()){
                Console.WriteLine("\nHa ganado " + jugador2.Nombre);
            }
            else{
                Console.WriteLine("\nEmpate");
            }
        }

        static void Main(string[] args){
            Guerrero personaje1 = new Guerrero("Christian", 20, 10, 4, 100, 4);
            Mago personaje2 = new Mago("Emmanuel", 5, 15, 4, 100, 3);
            //
            
            
            VisualizadorDeAtributos.MostrarAtributos(personaje1);
            ManejadorDeArmas.CambiarArma(personaje1);
            VisualizadorDeAtributos.MostrarAtributos(personaje2);
        
            //

            personaje1.Atributos();
            //personaje1.SubirNivel(1,2,3);
            //personaje1.Atributos();
            personaje2.Atributos();

            //Combate(personaje1, personaje2);
        }
    }

    

    
}

// See https://aka.ms/new-console-template for more information
using System;

namespace MIPROYECTOSCHARP{

    class Personaje{
        private string nombre;
        private int fuerza;
        private int inteligencia;
        private int defensa;
        private int vida;

        public Personaje(string nombre, int fuerza, int inteligencia, int defensa, int vida){
            this.nombre = nombre;
            this.fuerza = fuerza;
            this.inteligencia = inteligencia;
            this.defensa = defensa;
            this.vida = vida;
        }

        public string Nombre{
            get{
                return nombre;
            }
            set{
                nombre = value;
            }
        }

        public int Fuerza{
            get{
                return fuerza;
            }
            set{
                fuerza = value;
            }
        }

        public int Inteligencia{
            get{
                return inteligencia;
            }
            set{
                inteligencia = value;
            }
        }

        public int Defensa{
            get{
                return defensa;
            }
            set{
                defensa = value;
            }
        }

        public int Vida{
            get{
                return vida;
            }
            set{
                vida = value;
            }
        }

        public virtual void Atributos(){
            Console.WriteLine(nombre + ":");
            Console.WriteLine("·Fuerza: " + fuerza);
            Console.WriteLine("·Inteligencia: " + inteligencia);
            Console.WriteLine("·Defensa: " + defensa);
            Console.WriteLine("·Vida: " + vida);
        }

        public void SubirNivel(int fuerza, int inteligencia, int defensa){
            this.fuerza += fuerza;
            this.inteligencia += inteligencia;
            this.defensa += defensa;
        }

        public bool EstaVivo(){
            return vida > 0;
        }

        public void Morir(){
            vida = 0;
            Console.WriteLine(nombre + " ha muerto");
        }

        public virtual int Dano(Personaje enemigo){
            return fuerza - enemigo.defensa;
        }

        public void Atacar(Personaje enemigo){
            int dano = Dano(enemigo);
            enemigo.vida -= dano;
            Console.WriteLine(nombre + " ha realizado " + dano + " puntos de daño a " + enemigo.nombre);
            if (enemigo.EstaVivo()){
                Console.WriteLine("Vida de " + enemigo.nombre + " es " + enemigo.vida);
            }
            else{
                enemigo.Morir();
            }
        }
    }

    //clase guerrero

    class Guerrero : Personaje{
        private int espada;

        public Guerrero(string nombre, int fuerza, int inteligencia, int defensa, int vida, int espada)
            : base(nombre, fuerza, inteligencia, defensa, vida)
        {
            this.espada = espada;
        }

        public int Espada
        {
            get { return espada; }
            set { espada = value; }
        }

        public void CambiarArma()
        {
            Console.Write("Elige un arma: (1) Acero Valyrio, daño 8. (2) Matadragones, daño 10: ");
            int opcion = Convert.ToInt32(Console.ReadLine());
            if (opcion == 1)
            {
                espada = 8;
            }
            else if (opcion == 2)
            {
                espada = 10;
            }
            else
            {
                Console.WriteLine("Número de arma incorrecta");
            }
        }

        public override void Atributos()
        {
            base.Atributos();
            Console.WriteLine("·Espada: " + espada);
        }

        public override int Dano(Personaje enemigo)
        {
            return Fuerza * espada - enemigo.Defensa;
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
            base.Atributos();
            Console.WriteLine("·Libro: " + libro);
        }

        public override int Dano(Personaje enemigo){
            return Inteligencia * libro - enemigo.Defensa;
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

            personaje1.Atributos();
            //personaje1.SubirNivel(1,2,3);
            //personaje1.Atributos();
            personaje2.Atributos();

            Combate(personaje1, personaje2);
        }
    }

    
}

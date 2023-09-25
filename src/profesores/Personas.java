package profesores;
public class Personas {
private String nombre;
private String ciudad;
private String celular;
private String matricula;

public Personas (String nombre,String ciudad,String celular,String matricula) {
this.nombre=nombre;
this.ciudad=ciudad;
this.celular=celular;
this.matricula=matricula;
}

public void setnombre(String nombre){
this.nombre=nombre;
}
public String getnombre(){ //Permite modificar la información (Pone)
return this.nombre;
}
public void setciudad(String ciudad){ //Me mantiene mi información intacta (Obtine)
this.ciudad=ciudad;
}
public String getciudad(){
return this.ciudad;
}
public void setcelular(String celular){
this.celular=celular;
}
public String getcelular(){
return this.celular;
}
public void setmatricula(String matricula){
this.matricula=matricula;
}
public String matricula(){
return this.matricula;
}

public void datosPersonales() {
System.out.println("Nombre completo:" + getnombre());
System.out.println("Ciudad o estado de origen:" + getciudad());
System.out.println("Número de celular:" + getcelular());
System.out.println("Número de matricula:" + matricula());
}
}

public class SeleccionDeFutbol
{
    String id;
    String nombre;
    String apellidos;
    Integer edad;
    Futbolista futbolista;
    Entrenador entrenador;
    Masajista masajista;

    public SeleccionDeFutbol(){
    }

    public SeleccionDeFutbol(String id, String nombre, String apellidos, Integer edad, Futbolista futbolista, Entrenador entrenador, Masajista masajista){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.futbolista = futbolista;
        this.entrenador = entrenador;
        this.masajista = masajista;
    }

    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public Integer getEdad(){
        return edad;
    }

    public Futbolista getFutbolista(){
        return futbolista;
    }

    public Entrenador getEntrenador(){
        return entrenador;
    }

    public Masajista getMasajista(){
        return masajista;
    }

    public void setId(String id){
    }

    public void setNombre(String nombre){
    }

    public void setApellidos(String apellidos){
    }

    public void setEdad(Integer edad){
    }

    public void setFutbolista(Futbolista futbolista){
    }

    public void setEntrenador(Entrenador entrenador){

    }

    public void setMasajista(Masajista masajista){
    }
    //Metodos analizadores 
    
    public void Concentracion(){
        System.out.print("Los jugadores se concentran");
    }
    public void Viajes(){
        System.out.print("Los jugadores viajan");
    }
    
}


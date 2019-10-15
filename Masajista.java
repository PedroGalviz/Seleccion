
public class Masajista
{
    String titulacion;
    Integer añosExperiencia;
    public Masajista(){
    }

    public Masajista(String titulacion, Integer añosExperiencia){
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion(){
        return titulacion;
    }

    public Integer getAñosExperiencia(){
        return añosExperiencia;
    }

    public void setTitulacion(String titulacion){
    }

    public void setAñosExperiencia(Integer añosExperiencia){
    }

    public void Masajear(){
        System.out.print("Se ha dado un masaje");
    }
}

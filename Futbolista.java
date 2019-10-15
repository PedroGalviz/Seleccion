
public class Futbolista
{
    Integer dorsal;
    String demarcacion;
    public Futbolista(){
    }

    public Futbolista(Integer dorsal, String demarcacion){
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }                                  

    public Integer getDorsal(){
        return dorsal;
    }

    public String getDemarcacion(){
        return demarcacion;
    }

    public void setDorsal(Integer dorsal){
    }

    public void setDemarcacion(String demarcacion){
    }

    public void JugarPartido(){
        System.out.print("Los jugadores están jugando un partido");
    }

    public void Entrenar(){
        System.out.print("Los jugadores están entrenando");
    }

}

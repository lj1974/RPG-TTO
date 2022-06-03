package EntidadesSuperiores;

public abstract class Objetos {

    private String nomeObj;
    private String durabilidadeEscrita;
    private Integer durabilidadeNumeral;
    private String caracteristicaObj;
    private String efeitoObj;
    
    protected Integer maxDuravel = 100;


    public Objetos() {

    }

    public Objetos(String nomeObj, String durabilidadeEscrita, Integer durabilidadeNumeral,
    String caracteristicaObj, String efeitoObj) {
        this.nomeObj = nomeObj;
        this.durabilidadeEscrita = durabilidadeEscrita;
        this.durabilidadeNumeral =durabilidadeNumeral;
        this.caracteristicaObj = caracteristicaObj;
        this.efeitoObj = efeitoObj;
    }


    public String getNomeObj() {
        return nomeObj;
    }
    public void setNomeObj(String nomeObj) {
        this.nomeObj = nomeObj;
    }



    public String getDurabilidadeEscrita() {
        return durabilidadeEscrita;
    }
    public void setDurabilidadeEscrita(String durabilidadeEscrita) {
        this.durabilidadeEscrita = durabilidadeEscrita;
    }



    public Integer getDurabilidadeNumeral() {
        return durabilidadeNumeral;
    }
    public void setDurabilidadeNumeral(Integer durabilidadeNumeral) {
        this.durabilidadeNumeral = durabilidadeNumeral;
    }


    public String getCaracteristicaObj() {
        return caracteristicaObj;
    }
    public void setCaracteristicaObj(String caracteristicaObj) {
        this.caracteristicaObj = caracteristicaObj;
    }

    public String getEfeitoObj() {
        return efeitoObj;
    }
    public void setEfeitoObj(String efeitoObj) {
        this.efeitoObj = efeitoObj;
    }


    @Override
    public String toString() {
        return getNomeObj() + " " + getDurabilidadeEscrita() + " " +
        getDurabilidadeNumeral() + " " + getCaracteristicaObj() + " " +
        getEfeitoObj();
    }


    public class durabilidadeEscrita {
    }
}

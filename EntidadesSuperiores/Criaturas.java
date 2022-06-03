package EntidadesSuperiores;


public class Criaturas {
    
    private String nome;
    private Integer level;

    private Integer forca;
    private Integer defesa;
    private Integer estamina;
    private Integer sorte;


    public Criaturas(String nome, Integer level, Integer forca, Integer defesa,
    Integer estamina, Integer sorte) {
        this.nome = nome;
        this.level = level;
        this.forca = forca;
        this.defesa = defesa;
        this.estamina = estamina;
        this.sorte = sorte;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }



    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }


    public Integer getEstamina() {
        return estamina;
    }

    public void setEstamina(Integer estamina) {
        this.estamina = estamina;
    }



    public Integer getSorte() {
        return sorte;
    }

    public void setSorte(Integer sorte) {
        this.sorte = sorte;
    }




}

package Configuracao;

import java.util.List;

import BancoDeDados.MochilaDoJogador;
import EntidadesSuperiores.Objetos; 

public class ConfigItens {
    
    private MochilaDoJogador mJogador;
    
    private Integer NovoValorDurabilidade;
    

    public String configItemDurabilidade(int durabilidade) {
      String durabilidadeEscrita = null;

        if(durabilidade <= 20) { durabilidadeEscrita = "FRAGIL"; }
        if(durabilidade <= 40) { durabilidadeEscrita = "FRAGIL"; }
        if(durabilidade <= 50) { durabilidadeEscrita = "BLINDADO"; }

        return durabilidadeEscrita;
    }

    public Integer diminuiDurabilidade(int durabilidade) {
        durabilidade -= NovoValorDurabilidade;

       return durabilidade;
    }

    public boolean converteStringNull(String string) {
        boolean nullornot = false;
        if(string == null){ nullornot = true; }

        return nullornot;
    }

    public void AlteraStringsNull() {
        List<Objetos> mochila = mJogador.listarItensMochila();

        for(int i = 0; i < mochila.size(); i++ ) {
           String valorEfeito = mochila.get(i).getEfeitoObj();
           boolean efeitoVerificado = converteStringNull(valorEfeito);

           if(efeitoVerificado == true){ mochila.get(i).setEfeitoObj(" "); }
        }
    }

   
}


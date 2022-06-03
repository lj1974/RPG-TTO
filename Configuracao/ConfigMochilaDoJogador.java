package Configuracao;

import java.util.List;
import java.util.Scanner;

import BancoDeDados.MochilaDoJogador;
import EntidadesSuperiores.Objetos;

public class ConfigMochilaDoJogador {

    Scanner scan = new Scanner(System.in);

    private MochilaDoJogador mJogador;

    public ConfigMochilaDoJogador(){
        this.mJogador = new MochilaDoJogador();

    }
    
    public Integer retornaDurabilidadeNumeral(int posicao) {
        List<Objetos> mochila = mJogador.listarItensMochila();

        Integer durabilidadeEncontrada = mochila.get(posicao).getDurabilidadeNumeral();
        
        return durabilidadeEncontrada;
    }

    public int retornaPosicaoEscolhida() {
        int posicao = scan.nextInt();
        
        return posicao;
    }
}

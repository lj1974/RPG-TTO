package BancoDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import EntidadesSuperiores.Objetos; 

public class MochilaDoJogador {
    public List<Objetos> mochila;

    public MochilaDoJogador() {
        this.mochila = new ArrayList<>();
        AdicionarItemInicial();
    }
    // ERRO NO OBJETO. POR QUE?
    public void AdicionarItemInicial() {
        this.mochila.add(new Objetos("Espada inicial", "FRAGIL", 20, "Espada simples.", null));
        this.mochila.add(new Objetos("Garrafa de Agua", "UNICO", null, "Agua mineral.", "Recupera +2 de estamina"));
    }

    public void adicionar(Objetos item) {
		if(!mochila.contains(item)) {
			mochila.add(item);
		}
	}
	
	public void excluir(Objetos item) {
		this.mochila.remove(item);
	}
	


    public List<Objetos> listarItensMochila(){
		return Collections.unmodifiableList(mochila);	
	}	

}

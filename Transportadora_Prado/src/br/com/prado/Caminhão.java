package br.com.prado;
public class Caminh�o extends Veiculos{
	private int num_eixos;
	private int capac_carga;
    
	public Caminh�o( int num_eixos, int capac_carga, String renavan, String chassi){
		super(renavan, chassi);
		this.num_eixos = num_eixos;
		this.capac_carga = capac_carga;
    }
	
}
package br.com.prado;
public class Veiculos{
	private int codigo;
	private String renavan;
    private String chassi;
    private double preco;
    private int placa;
	
    public Veiculos(int codigo,
            String renavan,
            String chasi,
            double preco,
            int placa){
				this.codigo = codigo;
				this.renavan = renavan;
				this.chassi = chassi;
				this.preco = preco;
				this.placa = placa;
    }
    public Veiculos(int codigo){
				this.codigo = codigo;
    }
    public Veiculos(String renavan, String chassi){
		this.renavan = renavan;
		this.chassi = chassi;
    }
}
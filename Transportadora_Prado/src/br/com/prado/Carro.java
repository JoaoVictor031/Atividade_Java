package br.com.prado;
public class Carro extends Veiculos{
	private double vel_max;
	private int num_passag;
    private int num_portas;
    
	public Carro(double vel_max, int num_passag, int num_portas, int codigo){
		super(codigo);
		this.vel_max = vel_max;
		this.num_passag = num_passag;
		this.num_portas = num_portas;
    }
	
}
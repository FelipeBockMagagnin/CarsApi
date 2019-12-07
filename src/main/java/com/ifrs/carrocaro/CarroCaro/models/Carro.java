package com.ifrs.carrocaro.CarroCaro.models;

import java.util.List;
//import javax.validation.constraints.NotEmpty;

import javax.persistence.Entity;

@Entity
// @Table(name= "carros")
public class Carro {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name="carro_id")
	private long id;
	
	// @Column(name="nome")
    // @NotEmpty(message="* Por favor insira o nome do veiculo")
	private String nome;
	
	// @Column(name="data_compra")
    // @NotEmpty(message="* Por favor insira a data da compra do veiculo")
    private String data_compra;

    // @Column(name="placa")
    // @NotEmpty(message="* Por favor insira a placa do veiculo")
	private String placa;
	
	// @Column(name="preco")
    // @NotEmpty(message="* Por favor insira o preço do veiculo")
    private double preco;

	// @Column(name="forma_compra")
    // @NotEmpty(message="* Por favor insira a forma de compra do veiculo")
	private String forma_compra;
	
    // @Column(name="data_fabricacao")
    // @NotEmpty(message="* Por favor insira a dara de fabricação")
	private String data_fabricacao;
	
	// @Column(name="foto")
	private String foto;
	
	// @Column(name="descricao")
    private String descricao;

	public List<Carro> getAllCarros()
	{
		return null;
	}

	public boolean deleteCarro(long id)
	{
		return false;
	}

	public Carro getCarroById(long id)
	{
		return null;
	}

	public Carro getCarroByPlaca(String placa)
	{
		return null;
	}

	public Carro saveCarro(Carro carro)
	{
		return null;
	}

	public Carro updateCarro(Carro carro, long id)
	{
		return null;
	}
}
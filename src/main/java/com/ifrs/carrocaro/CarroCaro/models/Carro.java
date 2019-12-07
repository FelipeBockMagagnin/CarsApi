package com.ifrs.carrocaro.CarroCaro.models;

import java.util.List;
//import javax.validation.constraints.NotEmpty;

import javax.persistence.*;

@Entity
// @Table(name= "carros")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_Compra()
	{
		return data_compra;
	}

	public void setData_Compra(String data)
	{
		this.data_compra = data;
	}

	public String getPlaca()
	{
		return placa;
	}

	public void setPlaca(String placa)
	{
		this.placa = placa;
	}

	public Double getPreco()
	{
		return preco;
	}

	public void setPreco(double preco)
	{
		this.preco = preco;
	}

	public String getForma_Compra()
	{
		return forma_compra;
	}

	public void setForma_compra(String forma)
	{
		this.forma_compra = forma;
	}

	public String getData_Fabricacao()
	{
		return data_fabricacao;
	}

	public void setData_Fabricacao(String data)
	{ 
		this.data_fabricacao = data;
	}

	public String getFoto()
	{
		return foto;
	}

	public void setFoto(String foto)
	{
		this.foto = foto;
	}
	
	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String desc)
	{
		this.descricao = desc;
	}
}
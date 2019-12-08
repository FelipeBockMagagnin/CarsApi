package com.ifrs.carrocaro.CarroCaro.models;
import javax.persistence.*;

@Entity
@Table(name= "carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private long id;
	
	@Column(name="nome")
    private String nome;
	
	@Column(name="data_compra")
    private String data_compra;

    @Column(name="placa")
	private String placa;
	
	@Column(name="preco")
    private double preco;

	@Column(name="forma_compra")
	private String forma_compra;
	
    @Column(name="data_fabricacao")
	private String data_fabricacao;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="descricao")
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
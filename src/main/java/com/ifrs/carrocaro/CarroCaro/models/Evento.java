package com.ifrs.carrocaro.CarroCaro.models;

import javax.persistence.*;

@Entity
@Table(name= "evento")
public class Evento {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	@Column(name="id")
	private long id;
	
	@Column(name="titulo")	
	private String titulo;
	
	@Column(name="data")
    private String data;

    @Column(name="tag")
	private String tag;
	
	@Column(name="valor")
    private double valor;

	@Column(name="descricao")
	private String descricao;
	
    @Column(name="id_carro")
	private long id_carro;
 
	public long getId()
	{
		return id;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titu)
	{
		this.titulo = titu;
	}

	public String getData()
	{
		return data;
	}

	public void setData(String dat)
	{
		this.data = dat;
	}

	public String getTag()
	{
		return tag;
	}

	public void setTag(String newTag)
	{
		this.tag = newTag;
	}

	public double getValor()
	{
		return valor;
	}

	public void setValor(double val)
	{
		this.valor = val;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descr)
	{
		this.descricao = descr;
	}

	public long getid_carro()
	{
		return id_carro;
	}

	public void setid_carro(long id)
	{
		this.id_carro = id;
	}
}
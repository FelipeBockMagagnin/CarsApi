package com.ifrs.carrocaro.CarroCaro.models;

import java.util.List;

import javax.persistence.*;
// import javax.persistence.*;

 @Entity
 @Table(name= "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private long id;
	
	@Column(name="titulo")
	// @NotEmpty(message="* Por favor insira o titulo")
	
	private String titulo;
	
	 @Column(name="data")
    // @NotEmpty(message="* Por favor insira a data")
    private String data;

     @Column(name="tag")
    // @NotEmpty(message="* Por favor insira a tag")
	private String tag;
	
	 @Column(name="valor")
    // @NotEmpty(message="* Por favor insira o valor")
    private double valor;

	 @Column(name="descricao")
    // @NotEmpty(message="* Por favor insira a descricao")
	private String descricao;
	
     @Column(name="id_carro")
    // @NotEmpty(message="* Por favor insira o id")
	private long id_carro;
 
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
}
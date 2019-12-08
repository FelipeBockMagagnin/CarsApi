package com.ifrs.carrocaro.CarroCaro.models;

import java.util.List;

import javax.persistence.*;
// import javax.persistence.*;

 @Entity
// @Table(name= "Eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name="Evento_id")
	private long id;
	
	// @Column(name="titulo")
    // @NotEmpty(message="* Por favor insira o titulo")
	private String titulo;
	
	// @Column(name="data")
    // @NotEmpty(message="* Por favor insira a data")
    private String data;

    // @Column(name="tag")
    // @NotEmpty(message="* Por favor insira a tag")
	private String tag;
	
	// @Column(name="valor")
    // @NotEmpty(message="* Por favor insira o valor")
    private double valor;

	// @Column(name="descricao")
    // @NotEmpty(message="* Por favor insira a descricao")
	private String descricao;
	
    // @Column(name="id_carro")
    // @NotEmpty(message="* Por favor insira o id")
	private String id_carro;

	public List<Evento> getAllEventos()
	{
		return null;
	}

	public boolean deleteEvento(long id)
	{
		return false;
	}

	public Evento getEventoById(long id)
	{
		return null;
	}

	public Evento getEventoByPlaca(String placa)
	{
		return null;
	}

	public Evento saveEvento(Evento Evento)
	{
		return null;
	}

	public Evento updateEvento(Evento Evento, long id)
	{
		return null;
	}
}
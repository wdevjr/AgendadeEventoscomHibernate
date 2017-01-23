package br.com.warhjr.agenda.dao;

import java.util.List;

import br.com.warhjr.agenda.modelo.Evento;

public interface EventoDAO {
	
	public void alterar(Evento evento);

	public Evento consultar(Evento evento);

	public void excluir(Evento evento);

	public boolean existe(Evento evento);

	public void inserir(Evento evento);

	public List<Evento> listar();



}

package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {
	
	List<FormaPagamento> todas();
	FormaPagamento porId(Long id);
	FormaPagamento salvar(FormaPagamento formaPagamento);
	void remover(FormaPagamento formaPagamento);
	

}

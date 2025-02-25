package com.fostcraiv2.appDemo.service;

import java.util.List;

import com.fostcraiv2.appDemo.entidad.Contrato;

public interface ContratoService {

	public List<Contrato> listarTodoslosContratos();
	
	public Contrato guardarContrato(Contrato contrato);
	
	public Contrato obtenerContratoId(Long id);
	
	public Contrato actualizarContrato(Contrato contrato);
	
	public void eliminarContrato(Long id);
	
}

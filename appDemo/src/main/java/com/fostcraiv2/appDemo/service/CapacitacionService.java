package com.fostcraiv2.appDemo.service;

import java.util.List;

import com.fostcraiv2.appDemo.entidad.Capacitacion;

public interface CapacitacionService {

	public List<Capacitacion> listarTodasLasCapacitaciones();
	
	public Capacitacion guardarCapacitacion(Capacitacion capacitacion);
	
	public Capacitacion obtenerCapacitacionId(Long id);
	
	public Capacitacion actualizarCapacitacion(Capacitacion capacitacion);
	
	public void eliminarCpacitacion(Long id);
}

package com.fostcraiv2.appDemo.service;

import java.util.List;

import com.fostcraiv2.appDemo.entidad.Actividad;

public interface ActividadService {

	public List<Actividad> listarTodasLasActividades();
	
	public Actividad guardarActividad(Actividad acividad);
	
	public Actividad obtenerActividadId(Long id);
	
	public Actividad actualizarActividad(Actividad actividad);
	
	public void eliminarActividad(Long id);
}

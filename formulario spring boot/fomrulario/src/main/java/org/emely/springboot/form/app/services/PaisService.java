package org.emely.springboot.form.app.services;

import org.emely.springboot.form.app.models.domain.Pais;

import java.util.List;

public interface PaisService {
	
	public List<Pais> listar();
	public Pais obtenerPorId(Integer id);

}

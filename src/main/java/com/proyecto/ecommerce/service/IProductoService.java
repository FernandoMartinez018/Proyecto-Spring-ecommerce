package com.proyecto.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.ecommerce.model.Producto;

public interface IProductoService {

	public Producto guardar(Producto producto);
	
	public Optional<Producto> obtener(Integer id);
	
	public void actualizar(Producto producto);
	
	public void borrar(Integer id);
	
	public List<Producto> mostrar();
}

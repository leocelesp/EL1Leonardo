package org.cibertec.edu.pe.EL1Leonardo.interfacesService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.EL1Leonardo.modelo.Productos;

public interface IProductosService {
	public List<Productos> Listar();
	public Optional<Productos> Buscar(String Item);
	public int Grabar(Productos ObjC);
	public void Suprimir(String Item);
}

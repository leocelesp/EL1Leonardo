package org.cibertec.edu.pe.EL1Leonardo.service;
import java.util.List;
import java.util.Optional;
import org.cibertec.edu.pe.EL1Leonardo.interfaces.IProductos;
import org.cibertec.edu.pe.EL1Leonardo.interfacesService.IProductosService;
import org.cibertec.edu.pe.EL1Leonardo.modelo.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService implements IProductosService{

	@Autowired
	private IProductos data;
	
	@Override
	public List<Productos> Listar() {
		return (List<Productos>)data.findAll();
	}

	@Override
	public Optional<Productos> Buscar(String Item) {
		return data.findById(Item);
	}

	@Override
	public int Grabar(Productos ObjC) {
		int rpta = 0;
		Productos Obj = data.save(ObjC);
		if(!Obj.equals(null))rpta = 1;
		return rpta;
	}

	@Override
	public void Suprimir(String Item) {
		data.deleteById(Item);
	}

}

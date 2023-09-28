package org.cibertec.edu.pe.EL1Leonardo.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.EL1Leonardo.interfacesService.IProductosService;
import org.cibertec.edu.pe.EL1Leonardo.modelo.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductosController {

	@Autowired
	private IProductosService servicio;
	
	@GetMapping("/inicio")
	public String Listado(Model m) {
		List<Productos> lista = servicio.Listar();
		m.addAttribute("productos", lista);
		return "inicio";
	}
	
    @GetMapping("/comprar/{item}")
    public String comprarProducto(@PathVariable String item, Model model) {
        Optional<Productos> productoOptional = servicio.Buscar(item);

        if (productoOptional.isPresent()) {
            model.addAttribute("producto", productoOptional.get());
            return "confirmacion";
        } else {
            return "error";
        }  	
    }
}

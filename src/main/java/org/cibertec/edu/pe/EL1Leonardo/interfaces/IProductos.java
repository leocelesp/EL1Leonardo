package org.cibertec.edu.pe.EL1Leonardo.interfaces;

import org.cibertec.edu.pe.EL1Leonardo.modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductos extends JpaRepository<Productos, String>{

}

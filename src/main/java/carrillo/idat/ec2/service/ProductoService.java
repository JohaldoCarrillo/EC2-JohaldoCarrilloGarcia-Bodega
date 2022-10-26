package carrillo.idat.ec2.service;

import java.util.List;

import carrillo.idat.ec2.model.Cliente;
import carrillo.idat.ec2.model.Producto;

public interface ProductoService {

	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);
}

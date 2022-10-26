package carrillo.idat.ec2.service;

import java.util.List;

import carrillo.idat.ec2.model.Bodega;
import carrillo.idat.ec2.model.Cliente;

public interface BodegaService {

	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}

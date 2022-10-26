package carrillo.idat.ec2.service;

import java.util.List;

import carrillo.idat.ec2.model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}

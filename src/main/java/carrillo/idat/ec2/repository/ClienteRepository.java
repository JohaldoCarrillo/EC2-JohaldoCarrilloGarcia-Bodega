package carrillo.idat.ec2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carrillo.idat.ec2.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}

package carrillo.idat.ec2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import carrillo.idat.ec2.model.Bodega;
import carrillo.idat.ec2.service.BodegaService;


@RestController
@RequestMapping("/bodega")
public class BodegaController {



	@Autowired
	private BodegaService service;
	
	
	@RequestMapping(path= "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Bodega>> listar(){
		List<Bodega> listabodegas = service.listar();
		return new ResponseEntity<List<Bodega>>(listabodegas,HttpStatus.OK);
		
	}

	@RequestMapping(path= "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<?>buscarporid(@PathVariable Integer id){
		Bodega bodega = service.obtener(id);
		if (bodega!= null) {
			return new ResponseEntity<>(bodega,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(bodega,HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> registrar(@RequestBody Bodega bodega){
		service.guardar(bodega);
		return new ResponseEntity<>(bodega,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@RequestBody Bodega b,@PathVariable Integer id){

		Bodega bodega = service.obtener(b.getIdbodega());
		if (bodega!= null) {
			service.actualizar(bodega);
			return new ResponseEntity<>(bodega,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(bodega,HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id){
		Bodega bodega = service.obtener(id);
		if (bodega!= null) {
			service.eliminar(id);
			return new ResponseEntity<>(id,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(id,HttpStatus.NOT_FOUND);
		}
	}
	
}

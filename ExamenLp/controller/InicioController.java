package upeu.edu.pe.LpExamen.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.LpExamen.entity.OrdenPais;
import upeu.edu.pe.LpExamen.entity.ProductoCategoria;
import upeu.edu.pe.LpExamen.service.OrdenPaisService;
import upeu.edu.pe.LpExamen.service.ProductoCategoriaService;

@RestController
@RequestMapping("/api/inicio")
@CrossOrigin({"*"})
public class InicioController {
	
	@Autowired
	private ProductoCategoriaService productoService;
	@Autowired
	private OrdenPaisService ordenPaisService;
	
	@GetMapping("/readProductCategories")
	public List<Map<String, Object>> listarProduct(){
		return productoService.readAll();
	};
	
	@GetMapping("/readOrdeCountries")
	public List<Map<String, Object>> listarCountries(){
		return ordenPaisService.readAll();
	};
}

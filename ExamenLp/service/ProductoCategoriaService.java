package upeu.edu.pe.LpExamen.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.LpExamen.dao.Todo;
import upeu.edu.pe.LpExamen.daoimpl.ProductoCategoriaDaoimpl;
import upeu.edu.pe.LpExamen.entity.ProductoCategoria;

@Service
public class ProductoCategoriaService implements Todo<ProductoCategoria>{

	@Autowired
	private ProductoCategoriaDaoimpl daoimpl;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return daoimpl.readAll();
	}

}

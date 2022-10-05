package upeu.edu.pe.LpExamen.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.LpExamen.dao.Todo;
import upeu.edu.pe.LpExamen.daoimpl.OrdenPaisDaoImpl;
import upeu.edu.pe.LpExamen.entity.OrdenPais;

@Service
public class OrdenPaisService implements Todo<OrdenPais>{

	@Autowired
	private OrdenPaisDaoImpl daoimpl;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return daoimpl.readAll();
	}
	
}

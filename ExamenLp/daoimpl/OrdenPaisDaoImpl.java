package upeu.edu.pe.LpExamen.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.LpExamen.dao.Todo;
import upeu.edu.pe.LpExamen.entity.OrdenPais;

@Component
public class OrdenPaisDaoImpl implements Todo<OrdenPais>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "SELECT ORD.OrderID, ORD.ShippedDate FROM orders AS ORD JOIN customers AS CUST ON ORD.CustomerID = CUST.CustomerID limit 10";
		return jdbcTemplate.queryForList(sql);
	}

}

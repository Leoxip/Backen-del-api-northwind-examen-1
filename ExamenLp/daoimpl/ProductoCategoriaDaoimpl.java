package upeu.edu.pe.LpExamen.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.LpExamen.dao.Todo;
import upeu.edu.pe.LpExamen.entity.ProductoCategoria;

@Component
public class ProductoCategoriaDaoimpl implements Todo<ProductoCategoria>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "SELECT cat.CategoryName AS categoria,COUNT(prod.CategoryID) AS cantidad FROM products AS prod INNER JOIN categories AS cat ON  prod.CategoryID =cat.CategoryID GROUP BY prod.CategoryID";
		return jdbcTemplate.queryForList(sql);
	}
}

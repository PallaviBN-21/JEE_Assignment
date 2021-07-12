package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CarDetails;

@Repository
public class CarRepository {

	@Autowired
	private JdbcTemplate template;
	
	public int addCarDetails(CarDetails entity) {
		SimpleJdbcInsert inserter = new SimpleJdbcInsert(template);
		
		inserter.withTableName("carDetails").usingColumns("model","yearOfManufacture","kilometersTravelled","status");
		BeanPropertySqlParameterSource sql = new BeanPropertySqlParameterSource(entity);
		
		return inserter.execute(sql);
		
		
	}
	
	public List<CarDetails> getAllCarDetails(){
		String sql = "select * from carDetails";
		List<CarDetails> carList=
				template.query(sql, BeanPropertyRowMapper.newInstance(CarDetails.class));
		return carList;
	}
	
	public List<CarDetails> getAllModel(){
		String sql = "select model from carDetails";
		List<CarDetails> carList=
				template.query(sql, BeanPropertyRowMapper.newInstance(CarDetails.class));
		return carList;
	}
	
	public List<CarDetails> getCarDetailsByBrand(String model){
		
		String sql = "select * from carDetails WHERE model ='"+ model+"'";
		List<CarDetails> carList=
				template.query(sql, BeanPropertyRowMapper.newInstance(CarDetails.class));
		System.out.println(carList);
		return carList;
	}
}

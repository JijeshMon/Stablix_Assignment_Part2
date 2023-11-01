package com.demo.springBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.springBoot.model.ItemDTO;

public interface AddDAO extends JpaRepository<ItemDTO, Integer>  
{

//	@Query("from ItemDTO order by price desc")
//	List<ItemDTO> sortByHighestPrice();
	
	
}

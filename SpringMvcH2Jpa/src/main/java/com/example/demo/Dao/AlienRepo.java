/**
 * 
 */
package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Alien;




/**
 * @author Annamalai
 *
 */
public interface AlienRepo extends JpaRepository<Alien, Integer> {
	/*
	 * //CrudRepository only gives basic CURD OPERATIONS //complex query
	 * CrudRepository wont support List<Alien> findByTech(String tech); List<Alien>
	 * findByAidGreaterThan(int aid); // we can define the won queries
	 * 
	 * @Query("from Alien where tech=?1 order  by aname") List<Alien>
	 * findByTechSorted(String tech);
	 */


}

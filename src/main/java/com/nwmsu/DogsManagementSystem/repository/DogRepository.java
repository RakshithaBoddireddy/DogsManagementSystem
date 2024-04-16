package com.nwmsu.DogsManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nwmsu.DogsManagementSystem.Models.Dog;

/*
 * @author S564570 Rakshitha Boddireddy
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}

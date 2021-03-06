package edu.cc.examples.api.pais;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface PaisRepository extends CrudRepository<Pais, Long> {
    
    // CRUD:  Create / Read / Update / Delete  --> HTTP:    POST / GET / PUT / DELETE

	// ya temdriamos los prinicpales métodos CRUD
	// y más adelante podemos crear nuestros propios métodos

}
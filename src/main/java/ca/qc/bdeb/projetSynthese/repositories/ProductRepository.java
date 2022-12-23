package ca.qc.bdeb.projetSynthese.repositories;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ca.qc.bdeb.projetSynthese.models.Product;


@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query("select p from Product p left join p.category c where c.categoryId =:id")
	public List<Product> findByCategory(@Param("id") int id);
}

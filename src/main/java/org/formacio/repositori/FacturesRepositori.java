package org.formacio.repositori;

import org.formacio.domain.Factura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface FacturesRepositori extends CrudRepository<Factura, Long> {
	
	@Query("select sum(lin.total) from Factura factura where client.cli_nom =: ?'joan'")
	public double totalClient(String client); 
	
}

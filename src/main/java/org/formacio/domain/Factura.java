package org.formacio.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_factures")
public class Factura {

	@Id
	@Column(name = "fac_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "fac_client")
	private Client client;
	
	@OneToMany
	@JoinColumn(name = "linea_factura")
	private Set<LiniaFactura> linies = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<LiniaFactura> getLinies() {
		return linies;
	}

	public void setLinies(Set<LiniaFactura> linies) {
		this.linies = linies;
	}
	
	
}

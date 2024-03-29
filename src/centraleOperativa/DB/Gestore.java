/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package centraleOperativa.DB;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Gestore")
public class Gestore implements Serializable {
	public Gestore() {
	}
	

	@Column(name="id", nullable=false, unique=true, length=7)	
	@Id	
	@GeneratedValue(generator="GESTORE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="GESTORE_ID_GENERATOR", strategy="native")	
	private String id;
	
	@Column(name="nome", nullable=false, length=25)	
	private String nome;
	
	@Column(name="recapito", nullable=false, length=13)	
	private String recapito;
	
	@OneToMany(mappedBy="gestore", targetEntity=Segnalazione_di_allarme.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_segnalazione_di_allarme = new java.util.HashSet();
	
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return id;
	}
	
	public String getORMID() {
		return getId();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setRecapito(String value) {
		this.recapito = value;
	}
	
	public String getRecapito() {
		return recapito;
	}


	
}

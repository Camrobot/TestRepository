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
@Table(name="`Segnalazione di allarme`")
public class Segnalazione_di_allarme implements Serializable {
	public Segnalazione_di_allarme() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SEGNALAZIONE_DI_ALLARME_SENSORE) {
			this.sensore = (Sensore) owner;
		}
		
		else if (key == ORMConstants.KEY_SEGNALAZIONE_DI_ALLARME_GESTORE) {
			this.gestore = (Gestore) owner;
		}
		
		else if (key == ORMConstants.KEY_SEGNALAZIONE_DI_ALLARME_ROBOT) {
			this.robot = (Robot) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false, unique=true, length=7)	
	@Id	
	@GeneratedValue(generator="SEGNALAZIONE_DI_ALLARME_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="SEGNALAZIONE_DI_ALLARME_ID_GENERATOR", strategy="native")	
	private String id;
	
	@Column(name="stato", nullable=false, length=20)	
	private String stato;
	
	@Column(name="`valore allarme`", nullable=false, length=5)	
	private float valore_allarme;
	
	@Column(name="data", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date data;
	
	@Column(name="ora", nullable=false)	
	private java.sql.Time ora;
	
	@ManyToOne(targetEntity=Gestore.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="gestoreid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKSegnalazio532900"))	
	private Gestore gestore;
	
	@OneToOne(optional=false, targetEntity=Sensore.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="sensoreId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKSegnalazio774156"))	
	private Sensore sensore;
	
	@ManyToOne(targetEntity=Robot.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="robotId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKSegnalazio602868"))	
	private Robot robot;
	
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return id;
	}
	
	public String getORMID() {
		return getId();
	}
	
	public void setStato(String value) {
		this.stato = value;
	}
	
	public String getStato() {
		return stato;
	}
	
	public void setValore_allarme(float value) {
		this.valore_allarme = value;
	}
	
	public float getValore_allarme() {
		return valore_allarme;
	}
	
	public void setData(java.util.Date value) {
		this.data = value;
	}
	
	public java.util.Date getData() {
		return data;
	}
	
	public void setOra(java.sql.Time value) {
		this.ora = value;
	}
	
	public java.sql.Time getOra() {
		return ora;
	}
	
	public void setSensore(Sensore value) {
		if (this.sensore != value) {
			Sensore lsensore = this.sensore;
			this.sensore = value;
			if (value != null) {
				sensore.setSegnalazione_di_allarme(this);
			}
			if (lsensore != null && lsensore.getSegnalazione_di_allarme() == this) {
				lsensore.setSegnalazione_di_allarme(null);
			}
		}
	}
	
	public Sensore getSensore() {
		return sensore;
	}
	

	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Gestore(Gestore value) {
		this.gestore = value;
	}
	
	private Gestore getORM_Gestore() {
		return gestore;
	}
	

	
	public Robot getRobot() {
		return robot;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Robot(Robot value) {
		this.robot = value;
	}
	
	private Robot getORM_Robot() {
		return robot;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

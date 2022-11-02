package com.fostcraiv2.appDemo.entidad;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fostcraiv2.appDemo.entidad.Cliente;
import com.fostcraiv2.appDemo.entidad.Recreador;
import com.fostcraiv2.appDemo.entidad.Servicio;

@Entity
@Table(name="solicitudServicios")
public class SolicitudServicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fechaServicio")
	private Date fechaServicio;
	
	
	@ManyToOne
	@JoinColumn(name = "id_cliente_fk", referencedColumnName = "id")
	private Cliente id_cliente_fk;
	
	@ManyToOne
	@JoinColumn(name = "id_servicio_fk", referencedColumnName = "id")
	private Servicio id_servicio_fk;
	
	@ManyToMany(mappedBy = "listaSolicitudes")
	private List<Recreador> listRec;

	public SolicitudServicio(Long id, Date fechaServicio, com.fostcraiv2.appDemo.entidad.Cliente id_cliente_fk,
			com.fostcraiv2.appDemo.entidad.Servicio id_servicio_fk,
			List<com.fostcraiv2.appDemo.entidad.Recreador> listRec) {
		super();
		this.id = id;
		this.fechaServicio = fechaServicio;
		this.id_cliente_fk = id_cliente_fk;
		this.id_servicio_fk = id_servicio_fk;
		this.listRec = listRec;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaServicio() {
		return fechaServicio;
	}

	public void setFechaServicio(Date fechaServicio) {
		this.fechaServicio = fechaServicio;
	}

	public Cliente getId_cliente_fk() {
		return id_cliente_fk;
	}

	public void setId_cliente_fk(Cliente id_cliente_fk) {
		this.id_cliente_fk = id_cliente_fk;
	}

	public Servicio getId_servicio_fk() {
		return id_servicio_fk;
	}

	public void setId_servicio_fk(Servicio id_servicio_fk) {
		this.id_servicio_fk = id_servicio_fk;
	}

	public List<Recreador> getListRec() {
		return listRec;
	}

	public void setListRec(List<Recreador> listRec) {
		this.listRec = listRec;
	}

	@Override
	public String toString() {
		return "SolicitudServicio [id=" + id + ", fechaServicio=" + fechaServicio + ", id_cliente_fk=" + id_cliente_fk
				+ ", id_servicio_fk=" + id_servicio_fk + ", listRec=" + listRec + "]";
	}
	
	
	
}

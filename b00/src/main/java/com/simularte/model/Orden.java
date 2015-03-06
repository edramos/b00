package com.simularte.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orden {

	@Id @GeneratedValue @Column(name = "idorden")
	private Integer idOrden;
	
	//References
	@OneToOne(cascade = CascadeType.ALL) @JoinColumn(name = "idproyecto")
	private Proyecto proyecto;
	@OneToMany(mappedBy = "ordendetalleOrden")
	private Collection<OrdenDetalle> ordDet;
	
	@Column(length = 30, nullable = false)
	private String codigo;
	@Column(nullable = false)
	private BigDecimal oferta;
	
	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;
	@Column(length = 30, nullable = false)
	private String estado;
	
	
	public Integer getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(Integer idOrden) {
		this.idOrden = idOrden;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public Collection<OrdenDetalle> getOrdDet() {
		return ordDet;
	}
	public void setOrdDet(Collection<OrdenDetalle> ordDet) {
		this.ordDet = ordDet;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public BigDecimal getOferta() {
		return oferta;
	}
	public void setOferta(BigDecimal oferta) {
		this.oferta = oferta;
	}
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
package com.simularte.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "ordendetalle")
public class ProyectoDetalle {

	@Id @GeneratedValue @Column(name = "idordendetalle")
	private Integer idOrdenDetalle;
	
	//References
	@ManyToOne @JoinColumn(name = "idorder")
	private Orden ordendetalleOrden;
	@ManyToOne @JoinColumn(name = "idproveedor")
	private Proveedor ordendetalleProveedor; 
	
	@Column(nullable = false)
	private BigDecimal costo;
	
	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;
	@Column(length = 30, nullable = false)
	private String estado;
	
	
	public Integer getIdOrdenDetalle() {
		return idOrdenDetalle;
	}
	public void setIdOrdenDetalle(Integer idOrdenDetalle) {
		this.idOrdenDetalle = idOrdenDetalle;
	}
	public Orden getOrdendetalleOrden() {
		return ordendetalleOrden;
	}
	public void setOrdendetalleOrden(Orden ordendetalleOrden) {
		this.ordendetalleOrden = ordendetalleOrden;
	}
	public Proveedor getOrdendetalleProveedor() {
		return ordendetalleProveedor;
	}
	public void setOrdendetalleProveedor(Proveedor ordendetalleProveedor) {
		this.ordendetalleProveedor = ordendetalleProveedor;
	}
	public BigDecimal getCosto() {
		return costo;
	}
	public void setCosto(BigDecimal costo) {
		this.costo = costo;
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
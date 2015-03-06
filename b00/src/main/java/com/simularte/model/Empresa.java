package com.simularte.model;

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
public class Empresa {

	@Id @GeneratedValue @Column(name = "idempresa")
	private Integer idEmpresa;
	
	//References
	@OneToOne(cascade = CascadeType.ALL) @JoinColumn(name = "idusuario")
	private Usuario usuario;
	@OneToMany(mappedBy = "oficinaEmpresa")
	private Collection<Oficina> ofiEmp;
	
	@Column(length = 90, nullable = true)
	private String nombre;
	@Column(length = 30, nullable = true)
	private String ruc;
	@Column(length = 270, nullable = true)
	private String website;
	@Column(length = 270, nullable = true)
	private String facebook;
	
	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;
	@Column(length = 30, nullable = false)
	private String estado;
	
	
	public Integer getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Collection<Oficina> getOfiEmp() {
		return ofiEmp;
	}
	public void setOfiEmp(Collection<Oficina> ofiEmp) {
		this.ofiEmp = ofiEmp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
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

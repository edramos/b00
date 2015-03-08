package com.simularte.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Proyecto {

	@Id @GeneratedValue @Column(name = "idproyecto")	
	private Integer idProyecto;
	
	//References
	@ManyToOne @JoinColumn(name = "idusuario")
	private Usuario proyectoUsuario;	
	@OneToOne(mappedBy = "proyecto")
	private Cliente cliente;
	@OneToOne(mappedBy = "proyecto")
	private Orden orden;
  	
	@Column(length = 30, nullable = false)
	private String codigo;
	@Column(length = 180, nullable = true)
	private String nombre;
	@Column(length = 60, nullable = true)
	private String tipo;
	@Column(length = 255, nullable = true)
	private String direccion;
	@Column(length = 60, nullable = true)
	private String distrito;
	@Column(length = 60, nullable = true)
	private String ciudad;
	@Column(length = 60, nullable = true)
	private String departamento;
	
	@Column(name = "fechacreacion", nullable = false)
	private Timestamp fechaCreacion;
	@Column(length = 30, nullable = false)
	private String estado;
	
	
	public Integer getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}
	public Usuario getProyectoUsuario() {
		return proyectoUsuario;
	}
	public void setProyectoUsuario(Usuario proyectoUsuario) {
		this.proyectoUsuario = proyectoUsuario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Orden getOrden() {
		return orden;
	}
	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
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
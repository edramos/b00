package com.simularte.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.simularte.model.Empresa;
import com.simularte.model.Perfil;
import com.simularte.model.Usuario;
import com.simularte.util.Dates;

@Service
public class UserServiceImpl implements UserService{

	@PersistenceContext EntityManager em;
	
	@Transactional
	public boolean crearCuenta(Usuario usuario){
		boolean result = false;
		
		usuario.setFechaCreacion(Dates.fechaCreacion());
		usuario.setEstado("enabled");
		
		try{
			em.persist(usuario);
			System.out.println(usuario.getEmail());
			Perfil perfil = new Perfil();
			
			perfil.setUsuario(usuario);
			perfil.setRol("administrador");
			perfil.setFechaCreacion(Dates.fechaCreacion());
			perfil.setEstado("enabled");
			
			em.persist(perfil);
			System.out.println(perfil.getEstado());
			Empresa empresa = new Empresa();
			
			empresa.setUsuario(usuario);
			empresa.setFechaCreacion(Dates.fechaCreacion());
			empresa.setEstado("enabled");
			
			em.persist(empresa);
			System.out.println(empresa.getEstado());
			result = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
}

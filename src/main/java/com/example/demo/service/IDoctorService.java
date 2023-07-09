package com.example.demo.service;

import com.example.demo.repo.modelo.Doctor;

public interface IDoctorService {

	public void agregar(Doctor d);
	public void actualizar(Doctor d);
	public Doctor buscar(String cedula);
	public void borrar(String cedula);
	
}

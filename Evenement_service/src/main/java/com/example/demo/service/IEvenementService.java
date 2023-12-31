package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Evenement;



public interface IEvenementService {
	
	public Evenement addEvenement(Evenement e);
	public void deleteEvenement(Long id);
	public Evenement updateEvenement(Evenement e);
	public Evenement findEvenement(Long id) ;
	public List<Evenement> findAll();
	public List<Evenement> findBytitre(String titre);
	public List<Evenement> findBylieu(String lieu);
}

package com.github.redfox197.bedandbreakfast.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.redfox197.bedandbreakfast.db.Entity.Prenotazione;
import com.github.redfox197.bedandbreakfast.db.Repo.PrenotazioneRepo;

@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneRepo prenotazioneRepo;

    public void save(Prenotazione prenotazione) {
        prenotazioneRepo.save(prenotazione);
    }

    public List<Prenotazione> findAll() {
        return prenotazioneRepo.findAll();
    }

    public void delete(Prenotazione entity) {
        prenotazioneRepo.delete(entity);
    }

    public Prenotazione findById(Long id) {
        return prenotazioneRepo.findById(id).orElse(null);
    }

    
}

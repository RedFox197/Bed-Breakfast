package com.github.redfox197.bedandbreakfast.db.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.redfox197.bedandbreakfast.db.Entity.Prenotazione;

@Repository
public interface PrenotazioneRepo extends JpaRepository<Prenotazione, Long> {

}

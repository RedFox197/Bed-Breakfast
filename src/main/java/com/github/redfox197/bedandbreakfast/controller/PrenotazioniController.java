package com.github.redfox197.bedandbreakfast.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.redfox197.bedandbreakfast.db.Entity.Prenotazione;
import com.github.redfox197.bedandbreakfast.db.service.PrenotazioneService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioniController {

    @Autowired
    PrenotazioneService prenotazioneService;

    @PostMapping("/salvaPrenotazione")
    public String salvaPrenotazione(@RequestBody Prenotazione prenotazione) {
        prenotazioneService.save(prenotazione);

        return "Salvataggio effettuato";
    }

    @GetMapping("/cercaPrenotazione")
    public ResponseEntity<Prenotazione> cercaPrenotazione(@RequestParam String estremoDocumento) {
        for (Prenotazione prenotazione : prenotazioneService.findAll()) {
            if (prenotazione.getDocumento().equalsIgnoreCase(estremoDocumento)) {
                return new ResponseEntity<>(prenotazione, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/aggiornaPrenotazione/{id}")
    public String aggiornaPrenotazione(@PathVariable String id, @RequestBody Prenotazione prenotazione) {
        if (prenotazioneService.findById(Long.parseLong(id)) == null) {
            return "Id inesistente";
        }
        prenotazione.setId(Long.parseLong(id)); 
        prenotazioneService.save(prenotazione);
        return "Aggiornamento effettuato";
    }

    @GetMapping("/visualizzaPrenotazioni")
    public List<Prenotazione> visualizzaPrenotazioni() {
        return prenotazioneService.findAll();
    }
    
}

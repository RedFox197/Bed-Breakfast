package com.github.redfox197.bedandbreakfast.db.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private int numeroPersona;
    private String nominativo;
    private String nCellulare;
    private String documento;
    private boolean soggiorno;

    public Prenotazione() {}

    public Prenotazione(Long id, LocalDate dataCheckIn, LocalDate dataCheckOut, int numeroPersona, String nominativo,
            String nCellulare, String documento, boolean soggiorno) {
        this.id = id;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.numeroPersona = numeroPersona;
        this.nominativo = nominativo;
        this.nCellulare = nCellulare;
        this.documento = documento;
        this.soggiorno = soggiorno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public int getNumeroPersona() {
        return numeroPersona;
    }

    public void setNumeroPersona(int numeroPersona) {
        this.numeroPersona = numeroPersona;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getnCellulare() {
        return nCellulare;
    }

    public void setnCellulare(String nCellulare) {
        this.nCellulare = nCellulare;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isSoggiorno() {
        return soggiorno;
    }

    public void setSoggiorno(boolean soggiorno) {
        this.soggiorno = soggiorno;
    }

    

    @Override
    public String toString() {
        return "Prenotazione [id=" + id + ", dataCheckIn=" + dataCheckIn + ", dataCheckOut=" + dataCheckOut
                + ", numeroPersona=" + numeroPersona + ", nominativo=" + nominativo + ", nCellulare=" + nCellulare
                + ", documento=" + documento + ", soggiorno=" + soggiorno + "]";
    }

    

}

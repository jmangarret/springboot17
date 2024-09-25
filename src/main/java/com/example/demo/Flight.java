package com.example.demo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity(name="flights")
public class Flight {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idUsuario;
    private int idVuelo;
    private int idTicket;
    private String destino;
    private int idReserva;

    public int getIdUsuario(){
        return this.idUsuario;
    }

    public void setIdUsuario(int usuario){
        this.idUsuario= usuario;
    }

    public int getIdVuelo(){
        return this.idVuelo;
    }

    public void setIdVuelo(int vuelo){
        this.idVuelo = vuelo;
    }

    public int getIdTicket(){
        return this.idTicket;
    }

    public void setIdTicket(int ticket){
        this.idTicket = ticket;
    }

    public String getDestino(){
        return this.destino;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public int getIdReserva(){
        return this.idReserva;
    }

    public void setIdReserva(int reserva){
        this.idReserva = reserva;
    }
}

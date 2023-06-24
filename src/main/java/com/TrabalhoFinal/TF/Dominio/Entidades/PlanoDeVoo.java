package com.TrabalhoFinal.TF.Dominio.Entidades;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "planos_de_voo")
public class PlanoDeVoo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(unique=true)
  private int idVoo;
  private boolean dispatched;
  private Date dia;
  private Integer altitude;
  private Float velocidade;

  public PlanoDeVoo() {}

  public PlanoDeVoo(
    int idVoo,
    Date dia, 
    Integer altitude, 
    Float velocidade, 
    Aeronave aeronave,
    Rota rota) {
    this.idVoo = idVoo;
    this.dia = dia;
    this.altitude = altitude;
    this.velocidade = velocidade;
    this.aeronave = aeronave;
    this.rota = rota;
    this.dispatched = false;
  }

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
  private Aeronave aeronave;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
  private Rota rota;

  public int getId() {
    return id;
  }
  public int getidVoo() {
    return idVoo;
  }
  public boolean getDispatched() {
    return dispatched;
  }
  public Date getDia() {
    return dia;
  }
  public Integer getAltitude() {
    return altitude;
  }
  public Float getvelocidade() {
    return velocidade;
  }
  public Rota getRota() {
    return rota;
  }

  public void setDispatched(boolean dispatched) {
    this.dispatched = dispatched;
  }
}

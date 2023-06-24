package com.TrabalhoFinal.TF.Dominio.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aeroportos")
public class Aeroporto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(unique=true)
  private String nome;
  private Float latitude;
  private Float longitude;

  public Aeroporto() {}

  public Aeroporto(String nome, Float latitude, Float longitude) {
    this.nome = nome;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public int getId() {
    return id;
  }
  public String getnome() {
    return nome;
  }
  public Float getLatitude() {
    return latitude;
  }
  public Float getLongitude() {
    return longitude;
  }
}

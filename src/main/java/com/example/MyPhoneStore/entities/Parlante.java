package com.example.MyPhoneStore.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "parlante")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Parlante extends Articulo {

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "frecuencia")
    private int frecuencia;

    @Column(name = "inalambrico")
    private boolean inalambrico;

}

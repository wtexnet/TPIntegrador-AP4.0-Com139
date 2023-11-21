package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tecnico")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tecnicoId")
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String nombre;

    @Enumerated(EnumType.STRING)
    private Set<Servicio> especialidades;

    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    private Set<Incidente> incidentes;

    @Enumerated(EnumType.STRING)
    private Set<Notificacion> mediosDeNotificacion;



}

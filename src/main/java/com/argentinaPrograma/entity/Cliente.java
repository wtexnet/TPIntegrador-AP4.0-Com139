package com.argentinaPrograma.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteId")
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String razonSocial;

    @Column(columnDefinition = "TEXT")
    private String Cuit;

    @Enumerated(EnumType.STRING)
    private Set<Servicio> serviciosContratados;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Set<Incidente> incidentes;

}

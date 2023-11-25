package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "incidente")
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "incidenteId")
    private Long id;

    @ManyToOne(targetEntity = Cliente.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Cliente cliente;

    @ManyToMany(targetEntity = Servicio.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Servicio> servicios;

    @OneToOne(targetEntity = Problema.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Problema problema;

    @ManyToOne(targetEntity = Tecnico.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Tecnico tecnico;

    @Column(name = "fecha_ingreso")
    private LocalDateTime fechaIngreso;

    @Column(name = "fecha_resolucion")
    private LocalDateTime fechaResolucion;

    @Enumerated(EnumType.STRING)
    private EstadoIncidente estado;

}

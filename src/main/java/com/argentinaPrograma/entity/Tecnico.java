package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tecnico")
public class Tecnico extends Persona{

    @ManyToMany(targetEntity = Servicio.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Servicio> especialidad;

//    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
//    @JoinColumn(name = "incidente_id")
    private Set<Incidente> incidentes;

    @Enumerated(EnumType.STRING)
    @Column(name = "medios_de_notificacion")
    private Set<Notificacion> mediosDeNotificacion;

}

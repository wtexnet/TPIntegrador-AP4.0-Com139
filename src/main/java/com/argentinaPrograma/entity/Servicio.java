package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicioId")
    private Long id;

    private String nombre;

//    @ManyToMany(mappedBy = "servicio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "tecnico_id")
    private Set<Tecnico>  tecnico;

//    @ManyToMany(mappedBy = "servicio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "cliente_id")
    private Set<Cliente> cliente;

//    @ManyToMany(mappedBy = "servicio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "incidente_id")
    private Set<Incidente> incidentes;
}

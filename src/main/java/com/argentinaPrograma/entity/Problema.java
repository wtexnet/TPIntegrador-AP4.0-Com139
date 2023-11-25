package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "problema")
public class Problema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problemaId")
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

//    @OneToOne(mappedBy = "problema", cascade = CascadeType.ALL)
//    @JoinColumn(name = "incidente_id")
    private Incidente incidente;

    @Column(name = "complejidad")
    private boolean esComplejo;

}

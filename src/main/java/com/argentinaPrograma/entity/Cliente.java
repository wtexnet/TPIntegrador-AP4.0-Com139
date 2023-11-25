package com.argentinaPrograma.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente extends Persona {

    private String Cuit;

    @ManyToMany(targetEntity = Servicio.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Servicio> serviciosContratados;


//    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
//    @JoinColumn(name = "incidente_id")
    private Set<Incidente> incidentes;


    private boolean activo;

}

package com.jjramirezr.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name="Notificacion_Vendedor")
public class NotificacionVendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNotificacion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idVendedor",nullable = false)
    private Vendedor vendedor;

    @Column(name = "Notificacion", nullable = false)
    private String Notificacion;

    @Column(name = "Fecha", nullable = false)
    private Timestamp fecha;
}

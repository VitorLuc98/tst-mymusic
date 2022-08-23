package com.ciandt.mymusic.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Usuarios")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private String  id;

    @Column(name = "Nome", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "PlaylistId")
    private Playlist playlist;
}

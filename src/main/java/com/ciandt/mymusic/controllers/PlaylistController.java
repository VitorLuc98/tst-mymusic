package com.ciandt.mymusic.controllers;

import com.ciandt.mymusic.models.Playlist;
import com.ciandt.mymusic.services.dtos.PlaylistDTO;
import com.ciandt.mymusic.services.impl.PlaylistServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/playlists")
public class PlaylistController {

    private final PlaylistServiceImpl service;

    @GetMapping
    public ResponseEntity<List<PlaylistDTO>> buscar(){
        return ResponseEntity.ok(service.buscarTodos());
    }
}

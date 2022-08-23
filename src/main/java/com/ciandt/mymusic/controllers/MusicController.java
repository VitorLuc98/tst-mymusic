package com.ciandt.mymusic.controllers;

import com.ciandt.mymusic.services.MusicService;
import com.ciandt.mymusic.services.dtos.MusicDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/musicas")
@RequiredArgsConstructor
public class MusicController {

    private final MusicService service;

    @GetMapping
    public ResponseEntity<List<MusicDTO>> findByNameOrMusic(@RequestParam(required = false) String filtro){
        return ResponseEntity.ok(service.findAllByNameMusicOrArtist(filtro));
    }
}

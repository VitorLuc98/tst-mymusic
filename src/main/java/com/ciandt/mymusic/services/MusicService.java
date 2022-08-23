package com.ciandt.mymusic.services;

import com.ciandt.mymusic.services.dtos.MusicDTO;

import java.util.List;

public interface MusicService {

    List<MusicDTO> findAllByNameMusicOrArtist(String name);
}

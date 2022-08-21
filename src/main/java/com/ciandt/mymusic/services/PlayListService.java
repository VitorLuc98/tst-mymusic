package com.ciandt.mymusic.services;

import com.ciandt.mymusic.services.dtos.PlaylistDTO;

import java.util.List;

public interface PlayListService {

    List<PlaylistDTO> buscarTodos();
}

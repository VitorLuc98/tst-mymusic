package com.ciandt.mymusic.services.impl;


import com.ciandt.mymusic.repositories.PlaylistRepository;
import com.ciandt.mymusic.services.PlayListService;
import com.ciandt.mymusic.services.dtos.PlaylistDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl implements PlayListService {

    private final PlaylistRepository repository;


    @Override
    @Transactional(readOnly = true)
    public List<PlaylistDTO> buscarTodos() {
        var list = repository.findAll().stream().map(p -> new PlaylistDTO(p)).collect(Collectors.toList());
        return list;
    }
}

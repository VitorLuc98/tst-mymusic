package com.ciandt.mymusic.services.impl;

import com.ciandt.mymusic.repositories.MusicRepository;
import com.ciandt.mymusic.services.MusicService;
import com.ciandt.mymusic.services.dtos.MusicDTO;
import com.ciandt.mymusic.services.exceptions.BusinessException;
import com.ciandt.mymusic.services.exceptions.ListIsEmptyException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MusicServiceImpl implements MusicService {

    private final MusicRepository repository;

    @Override
    public List<MusicDTO> findAllByNameMusicOrArtist(String name) {
        if (Objects.isNull(name) || name.isEmpty()) {
            return findAll();
        }
        if (name.length() < 2) {
            throw new BusinessException("The name must be longer than 2 characters");
        }

        var musics = repository.findAllByNameMusicOrNameArtist(name);

        if (musics.isEmpty()) {
            throw new ListIsEmptyException("Music not found!");
        }
        return musics.stream().map(m -> new MusicDTO(m)).collect(Collectors.toList());
    }

    private List<MusicDTO> findAll() {
        return repository.findAll()
                .stream().map(m -> new MusicDTO(m)).collect(Collectors.toList());
    }
}

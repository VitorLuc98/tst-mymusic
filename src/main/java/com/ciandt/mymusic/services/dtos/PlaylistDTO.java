package com.ciandt.mymusic.services.dtos;

import com.ciandt.mymusic.models.Playlist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistDTO {

    private String id;
    private List<MusicDTO> musics = new ArrayList<>();

    public PlaylistDTO(Playlist entity) {
        this.id = entity.getId().toString();
        this.musics = entity.getMusics().stream().map(m -> new MusicDTO(m)).collect(Collectors.toList());
    }
}

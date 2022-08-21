package com.ciandt.mymusic.services.dtos;

import com.ciandt.mymusic.models.Music;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MusicDTO {
    private String id;

    @NotBlank(message = "Name invalid")
    private String name;

    @NotNull(message = "Artist invalid")
    private ArtistDTO artist;

    public MusicDTO(Music entity) {
        this.id = entity.getId().toString();
        this.name = entity.getName();
        this.artist = new ArtistDTO(entity.getArtist());
    }
}

package com.ciandt.mymusic.services.dtos;

import com.ciandt.mymusic.models.Artist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDTO {

    private String id;

    @NotBlank(message = "Name invalid")
    private String name;

    public ArtistDTO(Artist entity) {
        this.id = entity.getId().toString();
        this.name = entity.getName();
    }
}

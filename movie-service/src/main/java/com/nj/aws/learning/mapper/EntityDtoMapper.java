package com.nj.aws.learning.mapper;

import com.nj.aws.learning.dto.MovieDto;
import com.nj.aws.learning.entity.Movie;

public class EntityDtoMapper {

    public static MovieDto toDto(Movie movie){
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(),
                movie.getGenre()
        );
    }

}

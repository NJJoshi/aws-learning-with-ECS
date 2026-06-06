package com.nj.aws.learning.dto;

import com.nj.aws.learning.domain.Genre;

import java.util.List;

public record CustomerDto(Integer id,
                          String name,
                          Genre favoriteGenre,
                          List<MovieDto> recommendedMovies) {
}

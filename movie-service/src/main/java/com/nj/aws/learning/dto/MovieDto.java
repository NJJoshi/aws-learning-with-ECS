package com.nj.aws.learning.dto;

import com.nj.aws.learning.domain.Genre;

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}

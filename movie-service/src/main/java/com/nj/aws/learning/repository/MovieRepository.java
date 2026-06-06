package com.nj.aws.learning.repository;

import com.nj.aws.learning.domain.Genre;
import com.nj.aws.learning.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByGenre(Genre genre);

}

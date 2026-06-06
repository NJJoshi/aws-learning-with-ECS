package com.nj.aws.learning.service;

import com.nj.aws.learning.client.MovieClient;
import com.nj.aws.learning.dto.CustomerDto;
import com.nj.aws.learning.dto.GenreUpdateRequest;
import com.nj.aws.learning.exceptions.CustomerNotFoundException;
import com.nj.aws.learning.mapper.EntityDtoMapper;
import com.nj.aws.learning.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final MovieClient movieClient;
    private final CustomerRepository repository;

    public CustomerService(MovieClient movieClient, CustomerRepository repository) {
        this.movieClient = movieClient;
        this.repository = repository;
    }

    public CustomerDto getCustomer(Integer id) {
        var customer = this.repository.findById(id)
                                      .orElseThrow(() -> new CustomerNotFoundException(id));
        var movies = this.movieClient.getMovies(customer.getFavoriteGenre());
        return EntityDtoMapper.toDto(customer, movies);
    }

    public void updateCustomerGenre(Integer id, GenreUpdateRequest request) {
        var customer = this.repository.findById(id)
                                      .orElseThrow(() -> new CustomerNotFoundException(id));
        customer.setFavoriteGenre(request.favoriteGenre());
        this.repository.save(customer);
    }

}

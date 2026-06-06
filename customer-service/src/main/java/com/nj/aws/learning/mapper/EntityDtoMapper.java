package com.nj.aws.learning.mapper;

import com.nj.aws.learning.dto.CustomerDto;
import com.nj.aws.learning.dto.MovieDto;
import com.nj.aws.learning.entity.Customer;

import java.util.List;

public class EntityDtoMapper {

    public static CustomerDto toDto(Customer customer, List<MovieDto> movies){
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getFavoriteGenre(),
                movies
        );
    }

}

package com.boyer.challenge1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.boyer.challenge1.models.Contact;

@RepositoryRestResource
public interface ContactRespository extends CrudRepository<Contact, Long> {

}

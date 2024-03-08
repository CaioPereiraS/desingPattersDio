package spr.design.partterns.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spr.design.partterns.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
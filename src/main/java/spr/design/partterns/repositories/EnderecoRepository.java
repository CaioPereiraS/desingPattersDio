package spr.design.partterns.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spr.design.partterns.models.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
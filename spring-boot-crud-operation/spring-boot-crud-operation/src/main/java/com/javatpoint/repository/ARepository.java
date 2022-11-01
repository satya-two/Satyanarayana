package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.javatpoint.model.A;
public interface ARepository extends CrudRepository<A, Integer>
{
}

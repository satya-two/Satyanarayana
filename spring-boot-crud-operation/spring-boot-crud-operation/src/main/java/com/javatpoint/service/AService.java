package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.A;
import com.javatpoint.repository.ARepository;
//defining the business logic
@Service
public class AService
{
    @Autowired
    ARepository aRepository;
    //getting all books record by using the method findaAll() of CrudRepository
    public List<A> getAllA()
    {
        List<A> a = new ArrayList<A>();
        aRepository.findAll().forEach(a1 -> a.add(a1));
        return as;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public A getAById(int id)
    {
        return aRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(A a)
    {
        aRepository.save(a);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        aRepository.deleteById(id);
    }
    //updating a record
    public void update(A a, int aid)
    {
        aRepository.save(a);
    }
}
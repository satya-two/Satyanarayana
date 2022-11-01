package com.javatpoint.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.A;
import com.javatpoint.service.BooksService;
//mark class as Controller
@RestController
public class AController
{
//autowire the BooksService class
@Autowired
AService aService;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/a")
private List<A> getAllBooks()
{
return aService.getAllA();
}
//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/a/{aid}")
private A getBooks(@PathVariable("aid") int aid)
{
return aService.getAById(aid);
}
//creating a delete mapping that deletes a specified book
@DeleteMapping("/a/{aid}")
private void deleteBook(@PathVariable("aid") int aid)
{
aService.delete(aid);
}
//creating post mapping that post the book detail in the database
@PostMapping("/a")
private int saveA(@RequestBody A a)
{
aService.saveOrUpdate(a);
return a.getAid();
}
//creating put mapping that updates the book detail 
@PutMapping("/a")
private A update(@RequestBody A books)
{
aService.saveOrUpdate(a);
return a;
}
}

package feladat.szemely.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feladat.szemely.dto.SzemelyDTO;
import feladat.szemely.services.SzemelyService;

@RestController
@RequestMapping("/szemely")
public class SzemelyController {

    @Autowired
    private SzemelyService service;

    @GetMapping("/list")
    public List<SzemelyDTO> getAllBook() {
        return service.getAllSzemely();
    }

  /*  @GetMapping("/list/{id}")
    public BookDTO getBookById(@PathVariable Long id) {
        return service.getOneBook(id);
    }

    @PostMapping("/add")
    public BookDTO createBook(@RequestBody BookDTO book) {
        return service.createBook(book);
    }

    @PutMapping("/update")
    public BookDTO updateBook(@RequestBody BookDTO book) {
        return service.updateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
    }*/
}
package feladat.szemely.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feladat.szemely.dto.SzemelyDTO;
import feladat.szemely.services.SzemelyService;

@RestController
@RequestMapping("/szemely")
public class SzemelyController {

    @Autowired
    private SzemelyService service;

    
    @GetMapping("/incorrectPersons/{szemelyek}")
    public List<SzemelyDTO> getAllIncorrectPerson(@PathVariable List<SzemelyDTO> szemelyek) {
        return  service.szemelyCheck(szemelyek);
    }
    

}
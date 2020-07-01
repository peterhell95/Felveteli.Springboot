package feladat.okmany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feladat.okmany.dto.OkmanyDTO;
import feladat.okmany.services.OkmanyService;


@RestController
@RequestMapping("/okmany")
public class OkmanyController {

    @Autowired
    private OkmanyService service;

    
    @GetMapping("/incorrectDocuments/{okmanyok}")
    public List<OkmanyDTO> getAllIncorrectDocument(@PathVariable List<OkmanyDTO> okmanyok) throws Exception {
        return  service.okmanyCheck(okmanyok);
    }
    
    @GetMapping("/validDocuments/{okmanyok}")
    public List<OkmanyDTO> getAllValidDocuments(@PathVariable List<OkmanyDTO> okmanyok)  {
        return  service.getAllValidDocuments(okmanyok);
    }
    
    @GetMapping("/list")
    public List<OkmanyDTO> getAllOkmany() {
        return service.getAllOkmany();
    }
    

}
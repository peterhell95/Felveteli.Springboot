package feladat.okmany.services;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import feladat.okmany.checker.OkmanyCheckerImpl;
import feladat.okmany.dto.OkmanyDTO;
import feladat.okmany.tipus.Okmanytipus;
import feladat.okmany.tipus.OkmanytipusJSON;


@Service
public class OkmanyServiceImpl implements OkmanyService {

	@Autowired
    private OkmanyCheckerImpl checker;
	
    public Set<OkmanyDTO> okmanyCheck(List<OkmanyDTO> okmanyok) throws Exception{
    	Set<OkmanyDTO> incorrectDocuments = new HashSet<>();
    	List<Okmanytipus> okmanytipus = loadJSON();
    	
    	for (OkmanyDTO okmany : okmanyok) 
    	{ 
    	    if(checker.incorrectOkmTipus(okmany, okmanytipus ))
    	    	incorrectDocuments.add(okmany);
    	    
    	    if(checker.incorrectOkmanySzam(okmany))
    	    	incorrectDocuments.add(okmany);
    	    
    	    if(checker.incorrectOkmanyKep(okmany))
    	    	incorrectDocuments.add(okmany);
    	    
    	    if(checker.incorrectLejarDat(okmany))
    	    	incorrectDocuments.add(okmany);
    	    
    	    if(checker.incorrectErvenyes(okmany))
    	    	incorrectDocuments.add(okmany);
    	 
    	}
    	return incorrectDocuments;
    }
    
    public List<Okmanytipus> loadJSON() throws Exception {  
 	   OkmanytipusJSON okmanytipus ;
 	   
 		    // create object mapper instance
 		    ObjectMapper mapper = new ObjectMapper();

 		    // convert JSON string to Book object
 		    okmanytipus = mapper.readValue(Paths.get("kodszotar46_okmanytipus.json").toFile(), OkmanytipusJSON.class);

 		    // print book
 		    System.out.println(okmanytipus);

 	return okmanytipus.getRows();
    }

}
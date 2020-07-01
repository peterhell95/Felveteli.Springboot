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
    	boolean incorrect = false;
    	
    	for (OkmanyDTO okmany : okmanyok) 
    	{ 
    		incorrect = false;
    		
    	    if(checker.incorrectOkmTipus(okmany, okmanytipus ))
    	    	incorrect = true;
    	    
    	    if(checker.incorrectOkmanySzam(okmany))
    	    	incorrect = true;
    	    
    	    if(checker.incorrectOkmanyKep(okmany))
    	    	incorrect = true;
    	    
    	    if(checker.incorrectLejarDat(okmany))
    	    	incorrect = true;
    	    
    	    if(checker.incorrectErvenyes(okmany))
    	    	incorrect = true;
    	    
    	    if(incorrect == true)
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
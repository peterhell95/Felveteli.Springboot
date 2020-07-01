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
	
    public List<OkmanyDTO> okmanyCheck(List<OkmanyDTO> okmanyok) throws Exception{
    	List<OkmanyDTO> incorrectDocuments = new ArrayList<>();
    	List<Okmanytipus> okmanytipus = loadJSON();
    	
    	for (OkmanyDTO okmany : okmanyok) 
    	{ 
    		
    	    if(checker.incorrectOkmTipus(okmany, okmanytipus )){
    	    	incorrectDocuments.add(okmany);
    	    	continue;
    	    }
    	    
    	    if(checker.incorrectOkmanySzam(okmany)){
    	    	incorrectDocuments.add(okmany);
    	    	continue;
    	    }
    	    
    	    if(checker.incorrectOkmanyKep(okmany)){
    	    	incorrectDocuments.add(okmany);
    	    	continue;
    	    }
    	    
    	    if(checker.incorrectLejarDat(okmany)){
    	    	incorrectDocuments.add(okmany);
    	    	continue;
    	    }
    	    
    	    if(checker.incorrectErvenyes(okmany)){
    	    	incorrectDocuments.add(okmany);
    	    	continue;
    	    }
    	    
    	}
    	return incorrectDocuments;
    }
    
	public List<OkmanyDTO> getAllValidDocuments(List<OkmanyDTO> okmanyok) {
		for (OkmanyDTO okmany : okmanyok) 
    	{ 
    		okmany.setErvenyes();
    	}
		return okmanyok;
		
	}
	
	public List<OkmanyDTO> getAllOkmany() {
		
		List<OkmanyDTO> okmanylista = new ArrayList<>();
		return okmanylista;
		
	}

    public List<Okmanytipus> loadJSON() throws Exception {  
    	
    		OkmanytipusJSON okmanytipus ;
 	
 		    ObjectMapper mapper = new ObjectMapper();

 		    okmanytipus = mapper.readValue(Paths.get("kodszotar46_okmanytipus.json").toFile(), OkmanytipusJSON.class);


 	return okmanytipus.getRows();
    }

	
}
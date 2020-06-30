package feladat.okmany.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feladat.okmany.checker.OkmanyCheckerImpl;
import feladat.okmany.dto.OkmanyDTO;


@Service
public class OkmanyServiceImpl implements OkmanyService {

	@Autowired
    private OkmanyCheckerImpl checker;
	
    public List<OkmanyDTO> okmanyCheck(List<OkmanyDTO> okmanyok){
    	List<OkmanyDTO> incorrectDocuments = new ArrayList<>();
    	
    	for (OkmanyDTO okmany : okmanyok) 
    	{ 
    	    if(checker.incorrectOkmTipus(okmany))
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

}
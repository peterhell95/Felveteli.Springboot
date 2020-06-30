package feladat.szemely.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feladat.szemely.checker.SzemelyCheckerImpl;
import feladat.szemely.dto.SzemelyDTO;


@Service
public class SzemelyServiceImpl implements SzemelyService {

	@Autowired
    private SzemelyCheckerImpl checker;
	
    public List<SzemelyDTO> szemelyCheck(List<SzemelyDTO> szemelyek){
    	List<SzemelyDTO> incorrectPersons = new ArrayList<>();
    	
    	for (SzemelyDTO szemely : szemelyek) 
    	{ 
    	    if(checker.incorrectVisNev(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(checker.incorrectSzulNev(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(checker.incorrectANev(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(checker.incorrectSzulDat(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(checker.incorrectNeme(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(checker.incorrectAllampKod(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(checker.incorrectAllampDekod(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(checker.incorrectOkmanylista(szemely))
    	    	incorrectPersons.add(szemely);
    	 
    	}
    	return incorrectPersons;
    }

}
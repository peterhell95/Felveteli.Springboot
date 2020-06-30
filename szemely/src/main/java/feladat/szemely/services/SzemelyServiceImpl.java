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
    	    if(!checker.correctVisNev(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctSzulNev(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctANev(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctSzulDat(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctNeme(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctAllampKod(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctAllampDekod(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctOkmanylista(szemely))
    	    	incorrectPersons.add(szemely);
    	 
    	}
    	return incorrectPersons;
    }

}
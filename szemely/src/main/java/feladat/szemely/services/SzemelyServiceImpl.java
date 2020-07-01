package feladat.szemely.services;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import feladat.szemely.allamp.Allampolgarsag;
import feladat.szemely.allamp.AllampolgarsagJSON;
import feladat.szemely.checker.SzemelyCheckerImpl;
import feladat.szemely.dto.SzemelyDTO;


@Service
public class SzemelyServiceImpl {

	@Autowired
    private SzemelyCheckerImpl checker;
	
    public List<SzemelyDTO> szemelyCheck(List<SzemelyDTO> szemelyek) throws  Exception{
    	List<SzemelyDTO> incorrectPersons = new ArrayList<>();
    	List<Allampolgarsag> allampolgarsag = loadJSON();
    	boolean incorrect = false;
    	for (SzemelyDTO szemely : szemelyek) 
    	{ 
    		incorrect = false;

    	    if(!checker.correctVisNev(szemely))
    	    	incorrect = true;
    	    
    	    if(!checker.correctSzulNev(szemely))
    	    	incorrect = true;
    	    
    	    if(!checker.correctANev(szemely))
    	    	incorrect = true;
    	    
    	    if(!checker.correctSzulDat(szemely))
    	    	incorrect = true;
    	    
    	    if(!checker.correctNeme(szemely))
    	    	incorrect = true;
    	    
    	    if(!checker.correctAllampKod(szemely,allampolgarsag))
    	    	incorrect = true;
    	    
    	    if(!checker.correctAllampDekod(szemely))
    	    	incorrect = true;
    	    
    	    if(!checker.correctOkmanylista(szemely))
    	    	incorrect = true;
    	 
    	    if(incorrect == true)
    	    	incorrectPersons.add(szemely);

    	}
    	return incorrectPersons;
    }
    
    public List<SzemelyDTO> getAllDecodedSzemely(List<SzemelyDTO> szemelyek) throws Exception {
    	List<Allampolgarsag> allampolgarsag = loadJSON();
    	
    	for (SzemelyDTO szemely : szemelyek) 
    	{ 
    		szemely.setAllampDekod("", allampolgarsag);
    	}
    	return szemelyek;
    }
    
   public List<Allampolgarsag> loadJSON() throws Exception {
	   
	   AllampolgarsagJSON allampolgarsag ;
	   
		    ObjectMapper mapper = new ObjectMapper();

		    allampolgarsag = mapper.readValue(Paths.get("kodszotar21_allampolg.json").toFile(), AllampolgarsagJSON.class);
  
	return allampolgarsag.getRows();
   }

}
package feladat.szemely.services;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    	List<Allampolgarsag> allampolgarsag = loadJson();
    	
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
    	    
    	    if(!checker.correctAllampKod(szemely,allampolgarsag))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctAllampDekod(szemely))
    	    	incorrectPersons.add(szemely);
    	    
    	    if(!checker.correctOkmanylista(szemely))
    	    	incorrectPersons.add(szemely);
    	 
    	}
    	return incorrectPersons;
    }
   public List<Allampolgarsag> loadJson() throws Exception {
	   
	   AllampolgarsagJSON allampolgarsag ;
	   
		    // create object mapper instance
		    ObjectMapper mapper = new ObjectMapper();

		    // convert JSON string to Book object
		    allampolgarsag = mapper.readValue(Paths.get("kodszotar21_allampolg.json").toFile(), AllampolgarsagJSON.class);

		    // print book
		    System.out.println(allampolgarsag);

		
	   
	return allampolgarsag.getRows();
   }

}
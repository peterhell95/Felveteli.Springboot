package feladat.szemely.checker;

import org.springframework.stereotype.Service;

import feladat.szemely.dto.SzemelyDTO;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Service
public class SzemelyCheckerImpl implements SzemelyChecker {

    
	public boolean correctVisNev(SzemelyDTO szemely) {
		
		String visNev = szemely.getVisNev();
		
		if(!this.checkString(visNev))
			return false;
		
		return true;
    }
    
    public boolean correctSzulNev(SzemelyDTO szemely) {
    	
    	String szulNev = szemely.getSzulNev();
		
		if(!this.checkString(szulNev))
			return false;
		
		return true;
    }
    
    public boolean correctANev(SzemelyDTO szemely) {
    	
    	String aNev = szemely.getaNev();
		
		if(!this.checkString(aNev))
			return false;
		
		return true;
    }
    
    public boolean correctSzulDat(SzemelyDTO szemely) {
    	
    	Date szulDat = szemely.getSzulDat();
    	Calendar startCal = Calendar.getInstance();
    	startCal.add(Calendar.YEAR, -120);
    	Calendar endCal = Calendar.getInstance();
    	endCal.add(Calendar.YEAR, -18);
    	Date startDate = startCal.getTime();
    	Date endDate = endCal.getTime();
    	
    	return szulDat.compareTo(startDate) >= 0 && szulDat.compareTo(endDate) <=0;
    }
    
    public boolean correctNeme(SzemelyDTO szemely) {
    	
    	String neme = szemely.getNeme();
    	if(neme.equals("F") || neme.equals("N"))
    		return true;
    	else
    		return false;
    }
    
    public boolean correctAllampKod(SzemelyDTO szemely) {
    	
    	if(szemely.getAllampKod().length()!=3)
    		return false;
    	// meg ellenorizni kell a jsonbol
    	return true;
    }
    
    public boolean correctAllampDekod(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean correctOkmanylista(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean checkString(String name) {
    	
    	String[] arrOfName = name.split(" "); 
		int numberOfName = 0;
		boolean containsDr = false;
		final String REGEX = "([ a-zA-ZÄ./'-]*)"; 
		
		//hossz
		if(name.length() > 80 || name.isEmpty())  
			return false;							
		
		//karakter ellenorzes
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(name);
			if(!m.matches())
				return false;	
			
		//legalabb 2 nevelem
	    for (String i : arrOfName) {	
	    	numberOfName++;
	    	if(i.equals("Dr."))
	    		containsDr = true;
	    }
	    if((containsDr && numberOfName < 3) || (!containsDr && numberOfName < 2)) 
	    	return false;							
	    
    	return true;
    }

}
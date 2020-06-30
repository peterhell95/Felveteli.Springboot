package feladat.okmany.checker;

import org.springframework.stereotype.Service;

import feladat.okmany.dto.OkmanyDTO;

@Service
public class OkmanyCheckerImpl implements OkmanyChecker {


	public boolean incorrectOkmTipus(OkmanyDTO okmany) {
		if(okmany.getOkmTipus().length()!=1)
    		return false;
    	// meg ellenorizni kell a jsonbol
    	return true;
	}

	public boolean incorrectOkmanySzam(OkmanyDTO okmany) {
		String okmanySzam = okmany.getOkmanySzam();
		String okmanyTipus = okmany.getOkmTipus();
		int okmanySzamLength = okmany.getOkmanySzam().length();
		
		switch (okmanyTipus) {
		  case "1":
			if(okmanySzamLength != 8)
				return false;
		    for(int i = 0; i < 6 ; i++){
		    	if(!Character.isDigit(okmanySzam.charAt(i)))
		    		return false;
		    }
		    if(!Character.isLetter(okmanySzam.charAt(6)) || !Character.isLetter(okmanySzam.charAt(7)))
	    		return false;
		    break;
		  case "2":
			  if(okmanySzamLength != 9)
					return false;
			    for(int i = 2; i < 9 ; i++){
			    	if(!Character.isDigit(okmanySzam.charAt(i)))
			    		return false;
			    }
			    if(!Character.isLetter(okmanySzam.charAt(0)) || !Character.isLetter(okmanySzam.charAt(1)))
		    		return false;
		    break;
		  case "3":
		    
		    break;
		  case "4":
		    
		    break;
		  case "5":
		    
		    break;
		  case "6":
		    
		    break;
		}
		return true;
	}

	public boolean incorrectOkmanyKep(OkmanyDTO okmany) {
		return true;
	}

	public boolean incorrectLejarDat(OkmanyDTO okmany) {
		return true;
	}

	public boolean incorrectErvenyes(OkmanyDTO okmany) {
		return true;
	}


}
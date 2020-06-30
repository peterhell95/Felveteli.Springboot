package feladat.szemely.checker;

import org.springframework.stereotype.Service;

import feladat.szemely.dto.SzemelyDTO;

@Service
public class SzemelyCheckerImpl implements SzemelyChecker {

    
	public boolean incorrectVisNev(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean incorrectSzulNev(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean incorrectANev(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean incorrectSzulDat(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean incorrectNeme(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean incorrectAllampKod(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean incorrectAllampDekod(SzemelyDTO szemely) {
    	return true;
    }
    
    public boolean incorrectOkmanylista(SzemelyDTO szemely) {
    	return true;
    }


}
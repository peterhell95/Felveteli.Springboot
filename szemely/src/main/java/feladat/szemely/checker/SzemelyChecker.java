package feladat.szemely.checker;



import feladat.szemely.dto.SzemelyDTO;

public interface SzemelyChecker {
	
	public boolean incorrectVisNev(SzemelyDTO szemely);
    
    public boolean incorrectSzulNev(SzemelyDTO szemely);
    
    public boolean incorrectANev(SzemelyDTO szemely) ;
    
    public boolean incorrectSzulDat(SzemelyDTO szemely) ;
    
    public boolean incorrectNeme(SzemelyDTO szemely) ;
    
    public boolean incorrectAllampKod(SzemelyDTO szemely) ;
    
    public boolean incorrectAllampDekod(SzemelyDTO szemely) ;
    
    public boolean incorrectOkmanylista(SzemelyDTO szemely) ;

}
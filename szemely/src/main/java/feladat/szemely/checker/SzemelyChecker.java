package feladat.szemely.checker;



import feladat.szemely.dto.SzemelyDTO;

public interface SzemelyChecker {
	
	public boolean correctVisNev(SzemelyDTO szemely);
    
    public boolean correctSzulNev(SzemelyDTO szemely);
    
    public boolean correctANev(SzemelyDTO szemely) ;
    
    public boolean correctSzulDat(SzemelyDTO szemely) ;
    
    public boolean correctNeme(SzemelyDTO szemely) ;
    
    public boolean correctAllampKod(SzemelyDTO szemely) ;
    
    public boolean correctAllampDekod(SzemelyDTO szemely) ;
    
    public boolean correctOkmanylista(SzemelyDTO szemely) ;

}
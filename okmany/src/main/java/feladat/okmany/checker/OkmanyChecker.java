package feladat.okmany.checker;



import feladat.okmany.dto.OkmanyDTO;

public interface OkmanyChecker {
	
	public boolean incorrectOkmTipus(OkmanyDTO okmany);
    
    public boolean incorrectOkmanySzam(OkmanyDTO okmany);
    
    public boolean incorrectOkmanyKep(OkmanyDTO okmany) ;
    
    public boolean incorrectLejarDat(OkmanyDTO okmany) ;
    
    public boolean incorrectErvenyes(OkmanyDTO okmany) ;
    

}
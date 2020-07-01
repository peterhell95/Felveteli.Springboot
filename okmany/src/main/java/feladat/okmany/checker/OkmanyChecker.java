package feladat.okmany.checker;



import java.util.List;

import feladat.okmany.dto.OkmanyDTO;
import feladat.okmany.tipus.Okmanytipus;

public interface OkmanyChecker {
	
	public boolean incorrectOkmTipus(OkmanyDTO okmany,List<Okmanytipus> okmanytipus);
    
    public boolean incorrectOkmanySzam(OkmanyDTO okmany);
    
    public boolean incorrectOkmanyKep(OkmanyDTO okmany) throws Exception ;
    
    public boolean incorrectLejarDat(OkmanyDTO okmany) ;
    
    public boolean incorrectErvenyes(OkmanyDTO okmany) ;
    

}
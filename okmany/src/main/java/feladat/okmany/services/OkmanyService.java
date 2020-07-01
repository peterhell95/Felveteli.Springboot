package feladat.okmany.services;

import java.util.List;

import feladat.okmany.dto.OkmanyDTO;
import feladat.okmany.tipus.Okmanytipus;

public interface OkmanyService {
	
	public List<OkmanyDTO> okmanyCheck(List<OkmanyDTO> okmanyok) throws Exception;

	public List<OkmanyDTO> getAllValidDocuments(List<OkmanyDTO> okmanyok);
	
	public List<OkmanyDTO> getAllOkmany();
	
  
}
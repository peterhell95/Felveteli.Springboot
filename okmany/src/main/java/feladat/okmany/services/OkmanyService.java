package feladat.okmany.services;

import java.util.List;
import java.util.Set;

import feladat.okmany.dto.OkmanyDTO;

public interface OkmanyService {
	
	public List<OkmanyDTO> okmanyCheck(List<OkmanyDTO> okmanyok) throws Exception;

	public List<OkmanyDTO> getAllValidDocuments(List<OkmanyDTO> okmanyok);
	
  
}
package feladat.okmany.services;

import java.util.List;
import java.util.Set;

import feladat.okmany.dto.OkmanyDTO;

public interface OkmanyService {
	
	public Set<OkmanyDTO> okmanyCheck(List<OkmanyDTO> okmanyok) throws Exception;
	
  
}
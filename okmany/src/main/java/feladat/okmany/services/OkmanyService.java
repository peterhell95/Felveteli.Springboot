package feladat.okmany.services;

import java.util.List;

import feladat.okmany.dto.OkmanyDTO;

public interface OkmanyService {
	
	public List<OkmanyDTO> okmanyCheck(List<OkmanyDTO> okmanyok) throws Exception;
	
  
}
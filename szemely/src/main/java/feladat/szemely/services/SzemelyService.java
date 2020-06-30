package feladat.szemely.services;

import java.util.List;

import feladat.szemely.dto.SzemelyDTO;

public interface SzemelyService {
	
	public List<SzemelyDTO> szemelyCheck(List<SzemelyDTO> szemelyek);
	
  
}
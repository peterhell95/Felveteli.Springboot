package feladat.szemely.services;

import java.util.List;

import feladat.szemely.dto.SzemelyDTO;

public interface SzemelyService {
    public List<SzemelyDTO> getAllSzemely();

    public SzemelyDTO getOneSzemely(Long id);

    public SzemelyDTO createSzemely(SzemelyDTO book);

    public SzemelyDTO updateSzemely(SzemelyDTO book);

    public boolean deleteSzemely(Long id);
}
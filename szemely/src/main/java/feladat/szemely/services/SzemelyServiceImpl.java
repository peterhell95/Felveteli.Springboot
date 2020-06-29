package feladat.szemely.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import feladat.szemely.dto.SzemelyDTO;
import feladat.szemely.mapper.SzemelyMapper;
import feladat.szemely.model.Szemely;
import lombok.Getter;
import lombok.Setter;
import feladat.szemely.repository.SzemelyRepository;

@Service
@Transactional
public class SzemelyServiceImpl implements SzemelyService {
    @Autowired
    @Getter
    @Setter
    private SzemelyRepository repository;

    @Autowired
    private SzemelyMapper SzemelyMapper;

    public List<SzemelyDTO> getAllSzemely() {
        return SzemelyMapper.szemelyListToSzemelyDTOList(repository.findAll());
    }

    public SzemelyDTO getOneSzemely(Long id) {
        return SzemelyMapper.szemelyToSzemelyDTO(repository.findById(id).get());
    }

    public SzemelyDTO createSzemely(SzemelyDTO szemely) {
        Szemely entity = SzemelyMapper.szemelyDTOToSzemely(szemely);
        return SzemelyMapper.szemelyToSzemelyDTO(repository.save(entity));
    }

    public SzemelyDTO updateSzemely(SzemelyDTO szemely) {
        Szemely entity = SzemelyMapper.szemelyDTOToSzemelyUpdate(szemely);
        return SzemelyMapper.szemelyToSzemelyDTO(repository.save(entity));
    }

    public boolean deleteSzemely(Long id) {
        repository.deleteById(id);
        return true;
    }

}
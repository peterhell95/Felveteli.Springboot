package feladat.szemely.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import feladat.szemely.dto.SzemelyDTO;
import feladat.szemely.model.Szemely;

@Mapper
public interface SzemelyMapper {

    public SzemelyDTO szemelyToSzemelyDTO(Szemely source);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "rate", ignore = true)
    @Mapping(target = "ratecount", ignore = true)
    public Szemely szemelyDTOToSzemely(SzemelyDTO source);

    @IterableMapping(qualifiedByName = "szemelyToSzemelyDTO")
    public default List<SzemelyDTO> szemelyListToSzemelyDTOList(List<Szemely> source) {
        return source == null ? new ArrayList<>() : source.stream().map(this::szemelyToSzemelyDTO).collect(Collectors.toList());
    }

    public Szemely szemelyDTOToSzemelyUpdate(SzemelyDTO source);

}

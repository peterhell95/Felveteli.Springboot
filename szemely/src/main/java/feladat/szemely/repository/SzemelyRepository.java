package feladat.szemely.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import feladat.szemely.model.Szemely;

@Repository("SzemelyRepository")
public interface SzemelyRepository extends JpaRepository<Szemely, String> {

    Optional<Szemely> findById(Long id);

    void deleteById(Long id);

}
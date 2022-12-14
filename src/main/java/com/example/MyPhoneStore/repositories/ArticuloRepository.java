package com.example.MyPhoneStore.repositories;

import com.example.MyPhoneStore.entities.Articulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {

    @Query(
            value = "SELECT * FROM articulo WHERE articulo.marca LIKE %:filtro%",
            nativeQuery = true
    )
    List<Articulo> search(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM articulo WHERE articulo.marca LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM articulo",
            nativeQuery = true
    )
    Page<Articulo> search(@Param("filtro") String filtro, Pageable pageable);
}

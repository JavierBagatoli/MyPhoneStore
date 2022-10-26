package com.example.MyPhoneStore.services;

import com.example.MyPhoneStore.entities.Articulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticuloService extends BaseService<Articulo, Long>{

    List<Articulo> search(String filtro) throws Exception;

    Page<Articulo> search(String filtro, Pageable pageable) throws Exception;
}

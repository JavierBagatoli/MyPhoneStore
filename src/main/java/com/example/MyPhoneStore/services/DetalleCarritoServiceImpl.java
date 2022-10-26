package com.example.MyPhoneStore.services;

import com.example.MyPhoneStore.entities.DetalleCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.MyPhoneStore.repositories.BaseRepository;
import com.example.MyPhoneStore.repositories.DetalleCarritoRepository;

@Service
public class DetalleCarritoServiceImpl extends BaseServiceImpl<DetalleCarrito, Long> implements DetalleCarritoService{

    @Autowired
    private DetalleCarritoRepository detalleCarritoRepository;

    public DetalleCarritoServiceImpl(BaseRepository<DetalleCarrito, Long> baseRepository) {
        super(baseRepository);
    }
}

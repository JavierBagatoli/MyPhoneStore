package com.example.MyPhoneStore.services;

import com.example.MyPhoneStore.entities.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.MyPhoneStore.repositories.BaseRepository;
import com.example.MyPhoneStore.repositories.CarritoRepository;

@Service
public class CarritoServiceImpl extends BaseServiceImpl<Carrito, Long> implements CarritoService{

    @Autowired
    private CarritoRepository carritoRepository;

    public CarritoServiceImpl(BaseRepository<Carrito, Long> baseRepository) {
        super(baseRepository);
    }
}

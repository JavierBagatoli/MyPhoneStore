package com.example.MyPhoneStore.services;

import com.example.MyPhoneStore.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.MyPhoneStore.repositories.BaseRepository;
import com.example.MyPhoneStore.repositories.CelularRepository;

@Service
public class CelularServiceImpl extends BaseServiceImpl<Celular, Long> implements CelularService{

    @Autowired
    private CelularRepository celularRepository;

    public CelularServiceImpl(BaseRepository<Celular, Long> baseRepository) {
        super(baseRepository);
    }
}

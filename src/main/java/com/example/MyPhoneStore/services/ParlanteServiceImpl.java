package com.example.MyPhoneStore.services;

import com.example.MyPhoneStore.entities.Parlante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.MyPhoneStore.repositories.BaseRepository;
import com.example.MyPhoneStore.repositories.ParlanteRepository;

@Service
public class ParlanteServiceImpl extends BaseServiceImpl<Parlante, Long> implements ParlanteService{

    @Autowired
    private ParlanteRepository parlanteRepository;

    public ParlanteServiceImpl(BaseRepository<Parlante, Long> baseRepository) {
        super(baseRepository);
    }
}

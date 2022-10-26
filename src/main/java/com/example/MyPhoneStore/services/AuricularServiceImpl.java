package com.example.MyPhoneStore.services;

import com.example.MyPhoneStore.entities.Auricular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.MyPhoneStore.repositories.AuricularRepository;
import com.example.MyPhoneStore.repositories.BaseRepository;

@Service
public class AuricularServiceImpl extends BaseServiceImpl<Auricular, Long> implements AuricularService{

    @Autowired
    private AuricularRepository auricularRepository;

    public AuricularServiceImpl(BaseRepository<Auricular, Long> baseRepository) {
        super(baseRepository);
    }
}

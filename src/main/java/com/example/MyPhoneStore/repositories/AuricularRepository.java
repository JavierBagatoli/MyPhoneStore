package com.example.MyPhoneStore.repositories;

import com.example.MyPhoneStore.entities.Auricular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AuricularRepository extends JpaRepository<Auricular, Long> {
}

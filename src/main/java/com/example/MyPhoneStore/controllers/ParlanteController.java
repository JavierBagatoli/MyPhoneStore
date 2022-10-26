package com.example.MyPhoneStore.controllers;

import com.example.MyPhoneStore.entities.Parlante;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.MyPhoneStore.services.ParlanteServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/parlantes")

public class ParlanteController extends BaseControllerImpl<Parlante, ParlanteServiceImpl> {
}

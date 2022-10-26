package com.example.MyPhoneStore.controllers;

import com.example.MyPhoneStore.entities.Persona;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.MyPhoneStore.services.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/personas")

public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}

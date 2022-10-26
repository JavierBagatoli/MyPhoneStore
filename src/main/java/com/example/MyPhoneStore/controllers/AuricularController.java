package com.example.MyPhoneStore.controllers;

import com.example.MyPhoneStore.entities.Auricular;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.MyPhoneStore.services.AuricularServiceImpl;

@RestController
@RequestMapping(path = "/api/v1/auriculares")
@CrossOrigin(origins = "*")


public class AuricularController extends BaseControllerImpl<Auricular, AuricularServiceImpl>{

}

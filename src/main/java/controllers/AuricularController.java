package controllers;

import entities.Auricular;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.AuricularServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/auriculares")

public class AuricularController extends BaseControllerImpl<Auricular, AuricularServiceImpl>{
}

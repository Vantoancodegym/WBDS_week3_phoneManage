package vantoan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vantoan.model.SmartPhone;
import vantoan.service.ISmartPhoneService;

import java.util.List;

@Controller
@RequestMapping("/smartPhones")
public class SmartPhoneRestController {
    @Autowired
    private ISmartPhoneService iSmartPhoneService;
    @GetMapping()
    public ModelAndView showAll(){
        return new ModelAndView("home","list",iSmartPhoneService.findAll());
    }
    @GetMapping("list")
    public ResponseEntity<List<SmartPhone>> findAll(){
        List<SmartPhone> list= iSmartPhoneService.findAll();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<SmartPhone> delete(@PathVariable Long id){
        iSmartPhoneService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("create")
    public ResponseEntity<SmartPhone> create(@RequestBody SmartPhone smartPhone){
        iSmartPhoneService.save(smartPhone);
        return new ResponseEntity<>(smartPhone, HttpStatus.CREATED);

    }
}

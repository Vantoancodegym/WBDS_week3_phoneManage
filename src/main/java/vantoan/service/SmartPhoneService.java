package vantoan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vantoan.model.SmartPhone;
import vantoan.repository.SmartPhoneRepo;

import java.util.List;

@Service
public class SmartPhoneService implements ISmartPhoneService{
    @Autowired
    private SmartPhoneRepo smartPhoneRepo;
    @Override
    public List<SmartPhone> findAll() {
        return (List<SmartPhone>) smartPhoneRepo.findAll();
    }

    @Override
    public SmartPhone findById(Long id) {
        return smartPhoneRepo.findOne(id);
    }

    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return smartPhoneRepo.save(smartPhone);
    }

    @Override
    public void delete(Long id) {
        smartPhoneRepo.delete(id);

    }
}

package vantoan.service;

import vantoan.model.SmartPhone;

import java.util.List;

public interface ISmartPhoneService {
    List<SmartPhone> findAll();
    SmartPhone findById(Long id);
    SmartPhone save(SmartPhone smartPhone);
    void delete(Long id);
}

package vantoan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vantoan.model.SmartPhone;

@Repository
public interface SmartPhoneRepo extends CrudRepository<SmartPhone,Long> {
}

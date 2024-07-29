package ma.hibernate.dao;

import ma.hibernate.model.Phone;

import java.util.List;
import java.util.Map;

public interface PhoneDao {
    Phone create(Phone phone);

    // Use CriteriaQuery for this method
    List<Phone> findAll(Map<String, String[]> params);
}

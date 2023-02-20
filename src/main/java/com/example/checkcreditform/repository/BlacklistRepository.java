package com.example.checkcreditform.repository;

import com.example.checkcreditform.entity.BlacklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlacklistRepository extends JpaRepository<BlacklistEntity, Long> {

    //@Query("SELECT b FROM BlacklistEntity b WHERE b.passportSerial = :passportSerial AND b.passportNumber = :passportNumber")
    //List<BlacklistEntity> getByPassportSerialAndPassportNumber(@Param("passport_serial") String passportSerial, @Param("passport_number") String passportNumber);

    List<BlacklistEntity> getByPassportSerialAndPassportNumber( String passportSerial, String passportNumber);
}
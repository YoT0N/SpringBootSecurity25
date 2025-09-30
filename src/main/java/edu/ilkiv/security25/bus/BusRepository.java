package edu.ilkiv.security25.bus;

/*
@author   Bodya
@project   security25
@class  BusRepository
@version  1.0.0
@since 30.09.2025 - 19.24
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends MongoRepository<Bus, String> {
}

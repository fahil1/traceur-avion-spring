package io.iliass.traceuravion.antenna;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AntennaRepository extends MongoRepository<Antenna, String> {
    List<Antenna> findAllByNameLike(String name);
}

package io.iliass.traceuravion.antenna;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AntennaRepository extends MongoRepository<Antenna, String>, AntennaRepositoryCustom {
    List<Antenna> findAllByNameLike(String name);

    @Query(value = "{}", count = true)
    Long countAllAntennas();

    @Query(value = "{'angleOfView.angleRange':360}", count = true)
    Long countOmniAntennas();
}

package io.iliass.traceuravion.recording;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface RecordingRepository extends MongoRepository<Recording, String>, RecordingRepositoryCustom {
    @Query(value = "{}", count = true)
    Long countAllRecordings();
}

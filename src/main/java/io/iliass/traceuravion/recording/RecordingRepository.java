package io.iliass.traceuravion.recording;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordingRepository extends MongoRepository<Recording, String> {

}

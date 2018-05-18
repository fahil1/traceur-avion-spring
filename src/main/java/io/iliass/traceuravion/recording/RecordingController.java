package io.iliass.traceuravion.recording;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/recordings")
public class RecordingController {
    private RecordingRepository recordingRepository;

    public RecordingController(RecordingRepository recordingRepository) {
        this.recordingRepository = recordingRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Recording> getAll() {
        return recordingRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insert(@RequestBody Recording recording) {
        this.recordingRepository.insert(recording);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Recording recording) {
        this.recordingRepository.save(recording);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable("id") String id) {
        this.recordingRepository.deleteById(id);
    }
}

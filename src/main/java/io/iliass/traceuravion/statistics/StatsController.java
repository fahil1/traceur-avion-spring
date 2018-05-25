package io.iliass.traceuravion.statistics;

import io.iliass.traceuravion.antenna.AntennaRepository;
import io.iliass.traceuravion.recording.Recording;
import io.iliass.traceuravion.recording.RecordingRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "/api/statistics")
public class StatsController {
    private RecordingRepository recordingRepository;
    private AntennaRepository antennaRepository;

    public StatsController(RecordingRepository recordingRepository, AntennaRepository antennaRepository) {
        this.recordingRepository = recordingRepository;
        this.antennaRepository = antennaRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Stats getStats() {
        Stats stats = new Stats();
        Long countOmni = this.antennaRepository.countOmniAntennas();
        Long countAllAntennas = this.antennaRepository.countAllAntennas();
        stats.setCountAntennas(countAllAntennas);
        stats.setCountRecordings(this.recordingRepository.countAllRecordings());
        stats.setCountPOIs(this.antennaRepository.countAllPOIsList());
        stats.setCountPositions(this.recordingRepository.countAllTotalPositions());
        stats.setCountOmni(countOmni);
        stats.setCountDirectionnal(countAllAntennas - countOmni);
        stats.setSingleDateList(this.countPositionsOfWeek());
        return stats;
    }

    public List<SingleDate> countPositionsOfWeek() {
        List<SingleDate> result = new ArrayList<>();
        List<Recording> allRecordings = this.recordingRepository.findAll();
        for(int i = 0; i < 7; i++) {
            String strDate = LocalDate.now().minusDays(7 - i - 1).toString();
            Long total = 0L;
            for(Recording recording : allRecordings) {
                String dateOfThisRecording = new SimpleDateFormat("yyyy-MM-dd").format(recording.getCreatedAt());
                if (dateOfThisRecording.equals(strDate)) {
                    total += recording.getTotalPositions();
                }
            }
            result.add(new SingleDate(strDate, total));
        }
        return result;
    }



}

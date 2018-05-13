package io.iliass.traceuravion;

import io.iliass.traceuravion.antenna.AngleOfView;
import io.iliass.traceuravion.antenna.Antenna;
import io.iliass.traceuravion.antenna.AntennaRepository;
import io.iliass.traceuravion.antenna.Poi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner{
    private AntennaRepository antennaRepository;

    public DbSeeder(AntennaRepository antennaRepository) {
        this.antennaRepository = antennaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        List<Antenna> junks = new ArrayList<>();
//        for(int i=0; i < 100; i++) {
//            Antenna junk = new Antenna("Junk " + (i+1), 124.5F, new double[]{-9.634478, 30.43599},
//                Arrays.asList(
//                        new Poi("KONBA", new double[]{-15.30167, 31.30083}),
//                        new Poi("LEPRU", new double[]{-14.80111, 32}),
//                        new Poi("OSDIV", new double[]{-13.83611, 33.14944}),
//                        new Poi("SAMAR", new double[]{-14.41556, 30.89972}),
//                        new Poi("MITLA", new double[]{-14.08222, 31.30833}),
//                        new Poi("ABTIR", new double[]{-12.80167, 32.84889}),
//                        new Poi("NEVTU", new double[]{-13.24472, 32.97861})
//                ), 7, new AngleOfView(120, 70));
//            junks.add(junk);
//        }
//        // this.antennaRepository.deleteAll();
//        this.antennaRepository.saveAll(junks);
    }
}

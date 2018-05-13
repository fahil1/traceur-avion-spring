package io.iliass.traceuravion.antenna;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/antennas")
public class AntennaController {

    private AntennaRepository antennaRepository;

    public AntennaController(AntennaRepository antennaRepository) {
        this.antennaRepository = antennaRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Antenna> getAll() {
        return antennaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insert(@RequestBody Antenna antenna) {
        this.antennaRepository.insert(antenna);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Antenna antenna) {
        this.antennaRepository.save(antenna);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable("id") String id) {
        this.antennaRepository.deleteById(id);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
    public List<Antenna> getAllByName(@PathVariable("name") String name) {
        return this.antennaRepository.findAllByNameLike(name);
    }
}

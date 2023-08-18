package com.mtbp.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbp.data.entity.Theatre;
import com.mtbp.data.repository.TheatreRepository;
@Service
public class TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;

    public List<Theatre> getAllTheatres() {
        return (List<Theatre>) theatreRepository.findAll();
    }

    public Theatre createTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }
}

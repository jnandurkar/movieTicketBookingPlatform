package com.mtbp.web.application;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtbp.business.service.TheatreService;
import com.mtbp.data.entity.Theatre;

@RestController
@RequestMapping("/theatres")
public class TheatreController {
	
	@Autowired
    private TheatreService theatreService;

	 @GetMapping
	    public ResponseEntity<List<Theatre>> getAllTheatres() {
	        List<Theatre> theatres = theatreService.getAllTheatres();
	        return ResponseEntity.ok(theatres);
	    }

	    @PostMapping
	    public ResponseEntity<Theatre> createTheatre(@RequestBody Theatre theatre) {
	        Theatre createdTheatre = theatreService.createTheatre(theatre);
	        return ResponseEntity.created(URI.create("/theatres/" + createdTheatre.getTheatreId())).body(createdTheatre);
	    }
}

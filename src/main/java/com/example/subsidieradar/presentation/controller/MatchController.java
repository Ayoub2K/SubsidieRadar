package com.example.subsidieradar.presentation.controller;

import com.example.subsidieradar.application.MatchService;
import com.example.subsidieradar.presentation.dto.InputDTO;
import com.example.subsidieradar.presentation.dto.MatchDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/match")
public class MatchController {
    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping(consumes = { "application/JSON", "application/XML" })
    public MatchDTO getMatches(@RequestBody InputDTO inputDTO) throws Exception {
        System.out.println("controller");
        System.out.println("DTO " + inputDTO.getSamenwerking());
        return matchService.matchSubsidies(inputDTO);
    }
}

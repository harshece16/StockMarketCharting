package com.hg.fsd.SectorService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hg.fsd.SectorService.dto.CompanyDto;
import com.hg.fsd.SectorService.dto.SectorDto;
import com.hg.fsd.SectorService.service.Services;

@RestController
@RequestMapping("/sector")
public class SectorController {
	
	@Autowired
	private Services sectorService;

	public SectorController(Services sectorService) {
		super();
		this.sectorService = sectorService;
	}

	@GetMapping("/{sectorId}")
	public ResponseEntity<SectorDto> getSectorById(@PathVariable("sectorId") Long sectorId){
		return new ResponseEntity<SectorDto>(sectorService.getSectorById(sectorId), HttpStatus.FOUND);
	}
	
	@GetMapping("/{sectorId}/companies")
	public ResponseEntity<List<CompanyDto>> getCompaniesBySectorId(@PathVariable("sectorId") Long sectorId){
		return new ResponseEntity<List<CompanyDto>>(sectorService.getCompaniesBySectorId(sectorId), HttpStatus.FOUND);
	}
	
	@PostMapping("/")
	public ResponseEntity<SectorDto> addSector(@RequestBody SectorDto sectorDto){
		sectorService.addSector(sectorDto);
		return new ResponseEntity<SectorDto>(HttpStatus.CREATED);
	}
}
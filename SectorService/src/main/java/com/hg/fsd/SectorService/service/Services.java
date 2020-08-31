package com.hg.fsd.SectorService.service;

import java.util.List;

import com.hg.fsd.SectorService.dto.CompanyDto;
import com.hg.fsd.SectorService.dto.SectorDto;

public interface Services {
	public SectorDto getSectorById(Long sectorId);

	public List<CompanyDto> getCompaniesBySectorId(Long sectorId);

	public void addSector(SectorDto sectorDto);
}

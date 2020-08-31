package com.hg.fsd.SectorService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.fsd.SectorService.dao.SectorDao;
import com.hg.fsd.SectorService.dto.CompanyDto;
import com.hg.fsd.SectorService.dto.SectorDto;
import com.hg.fsd.SectorService.entity.SectorEntity;
public class ServicesImpl implements Services {
	@Autowired
	private SectorDao sectorRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ServicesImpl(SectorDao sectorRepository) {
		super();
		this.sectorRepository = sectorRepository;
	}

	@Override
	@Transactional
	public SectorDto getSectorById(Long sectorId) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(sectorRepository.findById(sectorId), SectorDto.class);
	}

	@Override
	@Transactional
	public void addSector(SectorDto sectorDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		sectorRepository.save(modelMapper.map(sectorDto, SectorEntity.class));
		
	}

	@Override
	public List<CompanyDto> getCompaniesBySectorId(Long sectorId) {
		// TODO Auto-generated method stub
		return null;
	}
}

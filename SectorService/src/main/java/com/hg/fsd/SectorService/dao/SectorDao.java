package com.hg.fsd.SectorService.dao;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import com.hg.fsd.SectorService.entity.SectorEntity;

public interface SectorDao extends JpaRepositoryExtension<SectorEntity, Long>{

}

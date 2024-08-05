package com.ikucuk.fsproject_mvdv_backend.service.impl;

import com.ikucuk.fsproject_mvdv_backend.dto.ILIlceDto;
import com.ikucuk.fsproject_mvdv_backend.entity.ILIlce;
import com.ikucuk.fsproject_mvdv_backend.mapper.ILIlceMapper;
import com.ikucuk.fsproject_mvdv_backend.repository.ILIlceRepository;
import com.ikucuk.fsproject_mvdv_backend.service.ILIlceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ILIlceServiceImpl implements ILIlceService {
    private ILIlceRepository ilIlceRepository;

    public ILIlceServiceImpl(ILIlceRepository ilIlceRepository) {
        this.ilIlceRepository = ilIlceRepository;
    }

    @Override
    public ILIlceDto createILIlce(ILIlceDto ilIlceDto) {

        //entity objcet
        ILIlce ilIlce = ILIlceMapper.mapToILIlceEntity(ilIlceDto);

        ILIlce savedILIlce = ilIlceRepository.save(ilIlce);

        return ILIlceMapper.mapToILIlceDto(savedILIlce);
    }

    @Override
    public List<ILIlceDto> getAllILIlce() {

        List<ILIlce> iLIlceList = ilIlceRepository.findAll();

        return iLIlceList.stream().map((ilIlce)-> ILIlceMapper.mapToILIlceDto(ilIlce))
                .collect(Collectors.toList());
    }
}

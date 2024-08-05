package com.ikucuk.fsproject_mvdv_backend.service;

import com.ikucuk.fsproject_mvdv_backend.dto.ILIlceDto;

import java.util.List;

public interface ILIlceService {

    ILIlceDto createILIlce(ILIlceDto ilIlceDto);

    //Get all ILIlce
    List<ILIlceDto> getAllILIlce();

}

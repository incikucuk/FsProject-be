package com.ikucuk.fsproject_mvdv_backend.mapper;

import com.ikucuk.fsproject_mvdv_backend.dto.ILIlceDto;
import com.ikucuk.fsproject_mvdv_backend.entity.ILIlce;

public class ILIlceMapper {

    public static ILIlceDto mapToILIlceDto(ILIlce ilIlce){
        return new ILIlceDto(
                ilIlce.getId(),
                ilIlce.getIl(),
                ilIlce.getIlce()
        );
    }

    public static ILIlce mapToILIlceEntity(ILIlceDto ilIlceDto){
        return new ILIlce(
                ilIlceDto.getId(),
                ilIlceDto.getIl(),
                ilIlceDto.getIlce()
        );
    }
}

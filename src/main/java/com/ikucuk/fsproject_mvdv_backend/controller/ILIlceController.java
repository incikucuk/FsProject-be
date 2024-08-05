package com.ikucuk.fsproject_mvdv_backend.controller;

import com.ikucuk.fsproject_mvdv_backend.dto.ILIlceDto;
import com.ikucuk.fsproject_mvdv_backend.service.ILIlceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/il_ilce")
public class ILIlceController {
    private ILIlceService ilIlceService;

    public ILIlceController(ILIlceService ilIlceService) {
        this.ilIlceService = ilIlceService;
    }

    //Build Add ILIlce REST API
    @PostMapping
    public ResponseEntity<ILIlceDto> createILIlce(@RequestBody ILIlceDto ilIlceDto){
        ILIlceDto savedILIlce = ilIlceService.createILIlce(ilIlceDto);

        return new ResponseEntity<>(savedILIlce, HttpStatus.CREATED);  //HTTP 201
    }

    //Build Get All ILIlce entity
    @GetMapping
    public ResponseEntity<List<ILIlceDto>> getAll(){
        List<ILIlceDto> ilIlceDtoList = ilIlceService.getAllILIlce();
        return ResponseEntity.ok(ilIlceDtoList);
    }

}

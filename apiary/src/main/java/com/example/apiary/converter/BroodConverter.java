package com.example.apiary.converter;

import com.example.apiary.entity.Brood;
import com.example.apiary.entity.WaxFoundation;
import com.example.apiary.entity.entityDTO.BroodDTO;
import com.example.apiary.entity.entityDTO.WaxFoundationDTO;
import com.example.apiary.repository.WaxFRepository;
import com.example.apiary.services.WaxFoundationService;

public class BroodConverter extends AbstractConverter {

    private static WaxFRepository wr;
    private static WaxFoundationService ws;

    public BroodConverter(WaxFoundationService s, WaxFRepository r) {
        this.ws = s;
        this.wr = r;
    }

    public static BroodDTO fromEntity(Brood e) {
        if(e != null) {
            BroodDTO broodDTO = new BroodDTO();
            broodDTO.setId(e.getId());
            broodDTO.setType(e.getType());
            WaxFoundation waxFoundation = e.getBroodInWax();
            WaxFoundationDTO waxFoundationDTO = new WaxFoundationDTO();
            if(waxFoundation != null) {
                waxFoundationDTO = ws.findById(waxFoundation.getId());
            }
            broodDTO.setBroodInWax(waxFoundationDTO);
            return broodDTO;
        } else {
            return null;
        }
    }

    public static Brood toEntity(BroodDTO d) {
        if(d != null) {
            Brood brood = new Brood();
            brood.setId(d.getId());
            brood.setType(d.getType());
            WaxFoundation waxFoundation = new WaxFoundation();
            WaxFoundationDTO waxFoundationDTO = d.getBroodInWax();
            if(waxFoundationDTO != null) {
                waxFoundation = wr.getOne(waxFoundationDTO.getId());
            }
            brood.setBroodInWax(waxFoundation);
            return brood;
        } else {
            return null;
        }
     }
}

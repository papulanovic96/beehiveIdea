package com.example.apiary.converter;

import com.example.apiary.entity.Brood;
import com.example.apiary.entity.Frame;
import com.example.apiary.entity.WaxFoundation;
import com.example.apiary.entity.entityDTO.FrameDTO;
import com.example.apiary.entity.entityDTO.WaxFoundationDTO;
import com.example.apiary.repository.BroodRepository;
import com.example.apiary.repository.FrameRepository;
import com.example.apiary.services.FrameService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WaxFoundationConverter extends AbstractConverter {

    private static FrameRepository fr;
    private static FrameService fs;
    private static BroodRepository br;

    public WaxFoundationConverter(FrameRepository f, FrameService s, BroodRepository r) {
        this.fr = f;
        this.fs = s;
        this.br = r;
    }

    public static WaxFoundationDTO fromEntity(WaxFoundation e) {
        if(e != null) {
            WaxFoundationDTO waxFoundationDTO = new WaxFoundationDTO();
            waxFoundationDTO.setId(e.getId());
            waxFoundationDTO.setFoundationState(e.getFoundationState());
            Frame frame = e.getWaxInFrame();
            FrameDTO frameDTO = new FrameDTO();
            if(frame != null) {
                frameDTO = fs.findById(frame.getId());
            }
            waxFoundationDTO.setWaxInFrame(frameDTO);
            List<Long> broodID = new ArrayList<>();
            Collection<Brood> broods = e.getBrood();
            if(broods != null) {
                for(Brood b : broods) {
                    broodID.add(b.getId());
                }
            }
            waxFoundationDTO.setBrood(broodID);
            return waxFoundationDTO;
        } else {
            return null;
        }
    }

    public static WaxFoundation toEntity(WaxFoundationDTO d) {
        if(d != null){
            WaxFoundation waxFoundation = new WaxFoundation();
            waxFoundation.setId(d.getId());
            waxFoundation.setFoundationState(d.getFoundationState());
            FrameDTO frameDTO = d.getWaxInFrame();
            Frame frame = new Frame();
            if(frameDTO != null) {
                frame = fr.getOne(frameDTO.getId());
            }
            waxFoundation.setWaxInFrame(frame);
            List<Long> broodIDs = d.getBrood();
            Collection<Brood> broods = new ArrayList<>();
            if(broodIDs != null) {
                for(Long key : broodIDs) {
                    broods.add(br.getOne(key));
                }
            }
            waxFoundation.setBrood(broods);
            return waxFoundation;
        } else {
            return null;
        }
    }
}

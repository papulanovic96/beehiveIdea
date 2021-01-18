package com.example.apiary.converter;

import com.example.apiary.entity.Frame;
import com.example.apiary.entity.HiveBox;
import com.example.apiary.entity.WaxFoundation;
import com.example.apiary.entity.entityDTO.FrameDTO;
import com.example.apiary.entity.entityDTO.HiveBoxDTO;
import com.example.apiary.repository.HiveBoxRepository;
import com.example.apiary.repository.WaxFRepository;
import com.example.apiary.services.HiveBoxService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FrameConverter extends AbstractConverter{

    private static HiveBoxRepository hbr;
    private static HiveBoxService hbs;
    private static WaxFRepository wfr;

    public FrameConverter(HiveBoxRepository h, HiveBoxService hs, WaxFRepository w) {
        this.hbr = h;
        this.hbs = hs;
        this.wfr = w;
    }

    public static FrameDTO fromEntity(Frame e) {
        if(e != null) {
            FrameDTO frameDTO = new FrameDTO();
            frameDTO.setCapacity(e.isCapacity());
            frameDTO.setId(e.getId());
            frameDTO.setType(e.getType());
            HiveBoxDTO hiveBoxDTO = new HiveBoxDTO();
            HiveBox hiveBox = e.getFrameInBox();
            if(hiveBox != null) {
                hiveBoxDTO = hbs.findById(hiveBox.getId());
            }
            frameDTO.setFrameInBox(hiveBoxDTO);
            List<Long> waxFID = new ArrayList<>();
            Collection<WaxFoundation> waxFoundations = e.getWaxFoundation();
            if(waxFoundations != null) {
                for(WaxFoundation wf : waxFoundations) {
                    waxFID.add(wf.getId());
                }
            }
            frameDTO.setWaxFoundation(waxFID);
            return frameDTO;
        } else {
            return null;
        }
    }

    public static Frame toEntity(FrameDTO d) {
        if(d != null) {
            Frame frame = new Frame();
            frame.setCapacity(d.isCapacity());
            frame.setId(d.getId());
            frame.setType(d.getType());
            HiveBoxDTO hiveBoxDTO = d.getFrameInBox();
            HiveBox hiveBox = new HiveBox();
            if(hiveBoxDTO != null) {
                hiveBox = hbr.getOne(hiveBoxDTO.getId());
            }
            frame.setFrameInBox(hiveBox);
            List<Long> waxIDs = d.getWaxFoundation();
            Collection<WaxFoundation> waxFoundations = new ArrayList<>();
            if(waxIDs != null) {
                for(Long key : waxIDs) {
                    waxFoundations.add(wfr.getOne(key));
                }
            }
            frame.setWaxFoundation(waxFoundations);
            return frame;
        } else {
            return null;
        }
    }
}

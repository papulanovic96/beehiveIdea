package com.example.apiary.converter;

import com.example.apiary.entity.Beehive;
import com.example.apiary.entity.Frame;
import com.example.apiary.entity.HiveBox;
import com.example.apiary.entity.entityDTO.BeehiveDTO;
import com.example.apiary.entity.entityDTO.HiveBoxDTO;
import com.example.apiary.repository.BeehiveRepository;
import com.example.apiary.repository.FrameRepository;
import com.example.apiary.services.BeehiveService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HiveBoxConverter extends AbstractConverter {

    private static BeehiveService bs;
    private static BeehiveRepository br;
    private static FrameRepository fr;

    public HiveBoxConverter(BeehiveService b, FrameRepository f, BeehiveRepository bxa) {
        this.bs = b;
        this.fr = f;
        this.br = bxa;
    }

    public static HiveBoxDTO fromEntity(HiveBox e) {
        if(e != null) {
            HiveBoxDTO hiveBoxDTO = new HiveBoxDTO();
            hiveBoxDTO.setColor(e.getColor());
            hiveBoxDTO.setFrameNumber(e.getFrameNumber());
            hiveBoxDTO.setId(e.getId());
            Collection<Frame> frames = e.getFrame();
            List<Long> frameID = new ArrayList<>();
            if(frames != null) {
                for(Frame f : frames) {
                    frameID.add(f.getId());
                }
            }
            hiveBoxDTO.setFrame(frameID);
            Beehive beehive = e.getBoxInHive();
            BeehiveDTO beehiveDTO = new BeehiveDTO();
            if(beehive != null) {
                beehiveDTO = bs.findById(beehive.getId());
            }
            hiveBoxDTO.setBoxInHive(beehiveDTO);
            return hiveBoxDTO;
        } else {
            return null;
        }
    }

    public static HiveBox toEntity(HiveBoxDTO d) {
        if(d != null) {
            HiveBox hiveBox = new HiveBox();
            hiveBox.setColor(d.getColor());
            hiveBox.setId(d.getId());
            hiveBox.setFrameNumber(d.getFrameNumber());
            List<Long> frameID = d.getFrame();
            Collection<Frame> frames = new ArrayList<>();
            if(frameID != null) {
                for(Long key : frameID) {
                    frames.add(fr.getOne(key));
                }
            }
            hiveBox.setFrame(frames);
            BeehiveDTO beehiveDTO = d.getBoxInHive();
            Beehive beehive = new Beehive();
            if(beehiveDTO != null) {
                beehive = br.getOne(beehiveDTO.getId());
            }
            hiveBox.setBoxInHive(beehive);
            return hiveBox;
        } else {
            return null;
        }
    }

}

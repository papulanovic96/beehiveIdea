package com.example.apiary.converter;

import com.example.apiary.entity.Apiary;
import com.example.apiary.entity.Beehive;
import com.example.apiary.entity.HiveBox;
import com.example.apiary.entity.WeeklyReview;
import com.example.apiary.entity.entityDTO.ApiaryDTO;
import com.example.apiary.entity.entityDTO.BeehiveDTO;
import com.example.apiary.repository.ApiaryRepository;
import com.example.apiary.repository.HiveBoxRepository;
import com.example.apiary.repository.WeeklyReviewRepository;
import com.example.apiary.services.ApiaryService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BeehiveConverter extends AbstractConverter{

    private static WeeklyReviewRepository wr;
    private static ApiaryRepository ar;
    private static ApiaryService as;
    private static HiveBoxRepository hbr;

    public BeehiveConverter(WeeklyReviewRepository w, ApiaryRepository a, ApiaryService s, HiveBoxRepository hb) {
        this.wr = w;
        this.ar = a;
        this.as = s;
        this.hbr = hb;
    }

    public static BeehiveDTO fromEntity(Beehive e) {
        BeehiveDTO beehiveDTO = new BeehiveDTO();
        if(e != null) {
            beehiveDTO.setBoxNumber(e.getBoxNumber());
            beehiveDTO.setType(e.getType());
            beehiveDTO.setId(e.getId());
            Apiary apiary = e.getHiveInApiary();
            Long ap = null;
            if (apiary != null) {
                ap = apiary.getId();
            }
            beehiveDTO.setHiveInApiary(ap);
            Collection<WeeklyReview> colWeekly = e.getReviews();
            List<Long> idWeekly = new ArrayList<>();
            if (colWeekly != null) {
                for (WeeklyReview w : colWeekly) {
                    idWeekly.add(w.getId());
                }
            }
            beehiveDTO.setReviews(idWeekly);
            Collection<HiveBox> hiveBoxes = e.getBoxes();
            List<Long> idBoxes = new ArrayList<>();
            if (hiveBoxes != null) {
                for (HiveBox hb : hiveBoxes) {
                    idBoxes.add(hb.getId());
                }
            }
            beehiveDTO.setBoxes(idBoxes);
            return beehiveDTO;
        } else
            return null;
    }

    public static Beehive toEntity(BeehiveDTO d) {
        Beehive behiveEnt = new Beehive();
        if(d != null) {
            behiveEnt.setId(d.getId());
            behiveEnt.setType(d.getType());
            behiveEnt.setBoxNumber(d.getBoxNumber());
            Collection<WeeklyReview> weeklyReviews = new ArrayList<>();
            List<Long> oldWeekly = d.getReviews();
            if(oldWeekly != null) {
                for(Long key : oldWeekly) {
                    weeklyReviews.add(wr.getOne(key));
                }
            }
            behiveEnt.setReviews(weeklyReviews);
            Collection<HiveBox> hiveBoxes = new ArrayList<>();
            List<Long> oldHiveKeys = d.getBoxes();
            if(oldHiveKeys != null) {
                for(Long key : oldHiveKeys) {
                    hiveBoxes.add(hbr.getOne(key));
                }
            }
            behiveEnt.setBoxes(hiveBoxes);
            Apiary apiary = new Apiary();
            Long aps = d.getHiveInApiary();
            if(aps != null) {
                apiary.setId(aps);
            }
            behiveEnt.setHiveInApiary(apiary);
            return behiveEnt;
        } else
            return null;
    }
}

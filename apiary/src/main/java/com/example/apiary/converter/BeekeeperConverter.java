package com.example.apiary.converter;

import com.example.apiary.entity.*;
import com.example.apiary.entity.entityDTO.BeekeeperDTO;
import com.example.apiary.repository.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BeekeeperConverter extends AbstractConverter {

    private static WeeklyReviewRepository wrr;
    private static ActivityCalendarRepository acr;
    private static FrameExtractionRepository fer;
    private static PlugsRepository pr;

    public BeekeeperConverter(WeeklyReviewRepository w, ActivityCalendarRepository a,
                              FrameExtractionRepository f, PlugsRepository p) {
        this.wrr = w;
        this.acr = a;
        this.fer = f;
        this.pr = p;
    }

    public static BeekeeperDTO fromEntity(Beekeeper e) {
        if(e != null) {
            BeekeeperDTO beekeeperDTO = new BeekeeperDTO();
            beekeeperDTO.setId(e.getId());
            beekeeperDTO.setName(e.getName());
            beekeeperDTO.setSurname(e.getSurname());
            beekeeperDTO.setSmoker(e.isSmoker());
            beekeeperDTO.setBrush(e.isBrush());
            beekeeperDTO.setClothes(e.isClothes());
            Collection<ActivityCalendar> entityCollection = e.getActivityCalendar();
            List<Long> dtoListId = new ArrayList<>();
            if (entityCollection != null) {
                for(ActivityCalendar a : entityCollection) {
                    dtoListId.add(a.getTurnus());
                }
            }
            beekeeperDTO.setActivityCalendar(dtoListId);
            Collection<WeeklyReview> reviewCollection = e.getReviews();
            List<Long> weeklyDTO = new ArrayList<>();
            if(reviewCollection != null) {
                for(WeeklyReview w : reviewCollection) {
                    weeklyDTO.add(w.getId());
                }
            }
            beekeeperDTO.setReviews(weeklyDTO);
            Collection<FrameExtraction> frameCollection = e.getFrameExtractions();
            List<Long> frameDTO = new ArrayList<>();
            if(frameCollection != null) {
                for(FrameExtraction fe : frameCollection) {
                    frameDTO.add(fe.getId());
                }
            }
            beekeeperDTO.setFrameExtractions(frameDTO);
            Collection<Plugs> plugsCollection = e.getPlugs();
            List<Long> plugsDTO = new ArrayList<>();
            if(plugsCollection != null) {
                for(Plugs p : plugsCollection) {
                    plugsDTO.add(p.getId());
                }
            }
            beekeeperDTO.setPlugs(plugsDTO);
            return beekeeperDTO;
        } else {
            return null;
        }
    }

    public static Beekeeper toEntity(BeekeeperDTO d) {
        Beekeeper beekeeper = new Beekeeper();
        if(d != null) {
            beekeeper.setBrush(d.isBrush());
            beekeeper.setClothes(d.isClothes());
            beekeeper.setSmoker(d.isSmoker());
            beekeeper.setId(d.getId());
            beekeeper.setName(d.getName());
            beekeeper.setSurname(d.getSurname());
            List<Long> activityDTO = d.getActivityCalendar();
            Collection<ActivityCalendar> activityCalendarsE = new ArrayList<>();
            if(activityDTO != null) {
                for(Long key : activityDTO) {
                    activityCalendarsE.add(acr.findById(key).orElse(null));
                }
            }
            beekeeper.setActivityCalendar(activityCalendarsE);
            List<Long> weeklyDTO = d.getReviews();
            Collection<WeeklyReview> weeklyReviewsE = new ArrayList<>();
            if(weeklyDTO != null) {
                for(Long key : weeklyDTO) {
                    weeklyReviewsE.add(wrr.findById(key).orElse(null));
                }
            }
            beekeeper.setReviews(weeklyReviewsE);
            List<Long> frameDTO = d.getFrameExtractions();
            Collection<FrameExtraction> frameExtractionsE = new ArrayList<>();
            if(frameDTO != null) {
                for(Long key : frameDTO) {
                    frameExtractionsE.add(fer.findById(key).orElse(null));
                }
            }
            beekeeper.setFrameExtractions(frameExtractionsE);
            List<Long> plugsDTO = d.getPlugs();
            Collection<Plugs> plugsCollectionE = new ArrayList<>();
            if(plugsDTO != null) {
                for(Long key : plugsDTO) {
                    plugsCollectionE.add(pr.findById(key).orElse(null));
                }
            }
            beekeeper.setPlugs(plugsCollectionE);
            return beekeeper;
        } else {
            return null;
        }
    }
}

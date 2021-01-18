package com.example.apiary.converter;

import com.example.apiary.entity.Beehive;
import com.example.apiary.entity.Beekeeper;
import com.example.apiary.entity.WeeklyReview;
import com.example.apiary.entity.entityDTO.BeehiveDTO;
import com.example.apiary.entity.entityDTO.BeekeeperDTO;
import com.example.apiary.entity.entityDTO.WeeklyReviewDTO;
import com.example.apiary.repository.BeehiveRepository;
import com.example.apiary.repository.BeekeeperRepository;
import com.example.apiary.services.BeehiveService;
import com.example.apiary.services.BeekeeperService;

public class WeeklyConverter extends AbstractConverter{

    private static BeehiveService bs;
    private static BeekeeperService bks;
    private static BeekeeperRepository br;
    private static BeehiveRepository bhr;

    public WeeklyConverter(BeehiveService bbs, BeekeeperService bs, BeekeeperRepository brr, BeehiveRepository bh) {
        this.bs = bbs;
        this.bks = bs;
        this.br = brr;
        this.bhr = bh;
    }

    public static WeeklyReviewDTO fromEntity(WeeklyReview e) {
        if(e != null) {
            WeeklyReviewDTO reviewDTO = new WeeklyReviewDTO();
            Beehive beehive = e.getBeehiveInWR();
            Long beehiveDTO = null;
            if (beehive != null) {
                beehiveDTO = (beehive.getId());
            }
            reviewDTO.setBeehiveInWR(beehiveDTO);
            Beekeeper entityBeekeeper = e.getBeekeeperInWR();
            Long beekeeperDTO = null;
            if (entityBeekeeper != null) {
                beekeeperDTO = (entityBeekeeper.getId());
            }
            reviewDTO.setBeekeeperInWR(beekeeperDTO);
            reviewDTO.setId(e.getId());
            reviewDTO.setReviewDate(e.getReviewDate());
            reviewDTO.setReviewType(e.getReviewType());
            return reviewDTO;
        } else {
            return null;
        }
    }

    public static WeeklyReview toEntity(WeeklyReviewDTO d) {
        if(d != null) {
            WeeklyReview review = new WeeklyReview();
            Beekeeper entityBeekeeper = new Beekeeper();
            Long beekeeperDTO = d.getBeekeeperInWR();
            if (beekeeperDTO != null) {
                entityBeekeeper.setId(beekeeperDTO);
            }
            review.setBeekeeperInWR(entityBeekeeper);
            Beehive entityBeehive = new Beehive();
            Long beehiveDTO = d.getBeehiveInWR();
            if (beehiveDTO != null) {
                entityBeehive.setId(beehiveDTO);
            }
            review.setBeehiveInWR(entityBeehive);
            review.setId(d.getId());
            review.setReviewDate(d.getReviewDate());
            review.setReviewType(d.getReviewType());
            return review;
        } else {
            return null;
        }
    }
}

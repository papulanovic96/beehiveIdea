package com.example.apiary.services;

import com.example.apiary.converter.WeeklyConverter;
import com.example.apiary.entity.WeeklyReview;
import com.example.apiary.entity.entityDTO.WeeklyReviewDTO;
import com.example.apiary.repository.WeeklyReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeeklyService {

    @Autowired
    private WeeklyReviewRepository wr;

    public List<WeeklyReviewDTO> findAll() {
        List<WeeklyReview> weeklyReviews = wr.findAll();
        return WeeklyConverter.fromEntityList(weeklyReviews, e -> WeeklyConverter.fromEntity(e));
    }

    public String save(WeeklyReviewDTO reviewDTO) {
        if(reviewDTO != null) {
            wr.save(WeeklyConverter.toEntity(reviewDTO));
            return "Successfully added weekly review!";
        } else {
            return "Review insert not working!";
        }
    }

    public String delete(Long key) {
        WeeklyReview review = wr.getOne(key);
        if(review != null) {
            wr.delete(review);
            return "Weekly review deleted successfully!";
        } else {
            return "Can't delete review!";
        }
    }

    public WeeklyReviewDTO findById(Long key) {
        WeeklyReview review = wr.getOne(key);
        if(review != null) {
            return WeeklyConverter.fromEntity(review);
        } else {
            return null;
        }
    }


}

package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRateCalender;

import java.util.List;

public interface HotelRateCalenderService {

    HotelRateCalender save(HotelRateCalender hotelRateCalender);

    HotelRateCalender update(HotelRateCalender hotelRateCalender,Long id);

    List<HotelRateCalender> findAll();

    HotelRateCalender findById(Long id);

    void delete(Long id);

}

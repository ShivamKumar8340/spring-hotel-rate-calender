package com.sunglowsys.service;


import com.sunglowsys.domain.HotelRateCalender;
import com.sunglowsys.repository.HotelRateCalenderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelRateCalenderServiceImpl  implements HotelRateCalenderService{
    private final HotelRateCalenderRepository hotelRateCalenderRepository;

    public HotelRateCalenderServiceImpl(HotelRateCalenderRepository hotelRateCalenderRepository) {
        this.hotelRateCalenderRepository = hotelRateCalenderRepository;
    }

    @Override
    public HotelRateCalender save(HotelRateCalender hotelRateCalender) {
        return hotelRateCalenderRepository.save(hotelRateCalender);
    }

    @Override
    public HotelRateCalender update(HotelRateCalender hotelRateCalender, Long id) {
        HotelRateCalender hotelRateCalender1=hotelRateCalenderRepository.getById(id);
        hotelRateCalender1.setExtra_adult(hotelRateCalender.getExtra_adult());
        return hotelRateCalenderRepository.save(hotelRateCalender1);
    }

    @Override
    public List<HotelRateCalender> findAll() {
        return hotelRateCalenderRepository.findAll();
    }

    @Override
    public HotelRateCalender findById(Long id) {
        Optional<HotelRateCalender> optional=hotelRateCalenderRepository.findById(id);
        HotelRateCalender hotelRateCalender=null;
        if(optional.isPresent()){
            hotelRateCalender=optional.get();

        }
        else {
            throw new RuntimeException("record not found for idNo :"+ id);

        }
        return hotelRateCalender;
    }

    @Override
    public void delete(Long id) {
        hotelRateCalenderRepository.deleteById(id);

    }
}

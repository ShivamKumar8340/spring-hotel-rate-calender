package com.sunglowsys.cotroller;

import com.sunglowsys.domain.HotelRateCalender;
import com.sunglowsys.service.HotelRateCalenderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class HotelRateCalenderResource {

    private final HotelRateCalenderService hotelRateCalenderService;

    public HotelRateCalenderResource(HotelRateCalenderService hotelRateCalenderService) {
        this.hotelRateCalenderService = hotelRateCalenderService;
    }

    @PostMapping("hotel-rate-calenders")
    public HotelRateCalender createHotelRateCalender(@RequestBody HotelRateCalender hotelRateCalender) {
        return hotelRateCalenderService.save(hotelRateCalender);
    }

    @PutMapping("hotel-rate-calenders/{id}")

    public HotelRateCalender updateHotelRateCalender(@RequestBody HotelRateCalender hotelRateCalender, @PathVariable("id") Long id){
        return hotelRateCalenderService.update(hotelRateCalender,id);
    }
    @GetMapping("hotel-rate-calenders")
    public List<HotelRateCalender> getHotelRateCalenders() {
        List<HotelRateCalender> hotelRateCalenders=hotelRateCalenderService.findAll();
        return hotelRateCalenders;
    }

    @GetMapping("/hotel-rate-calenders/{id}")

    public HotelRateCalender getHotelRateCalenderById(@PathVariable("id") Long id ){
        return hotelRateCalenderService.findById(id);
    }
    @DeleteMapping("/hotel-rate-calenders/{id}")
    public void deleteHotelRateCalender(@PathVariable("id") Long id) {
        hotelRateCalenderService.delete(id);
    }

}

package dev.carlos.MongoDB._Springboot.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class AppUtils {

    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}

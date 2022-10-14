package dev.arydalex.Application.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Apputils {

    public ModelMapper modelMapper() {

        return new ModelMapper();

    }

}

package com.example.arydalex.HelloWorld.services.implementation;

import com.example.arydalex.HelloWorld.controller.MyEndpoints;
import com.example.arydalex.HelloWorld.models.Device;
import com.example.arydalex.HelloWorld.services.MyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServiceImplementation implements MyService {

    // LIST MOCK because we don't have a database... yet.
    private List<Device> myDevices = new ArrayList<>();

//    @Override
//    public Device save(Device device) {
//        myDevices.add(device);
//        return device;
//    }

//@Override // example one
//public Device save(Device device) {
//Para cada dispositivo dessa lista, chame de devicefound
//    myDevice.forEach(deviceFound ->{
//        if(deviceFound.getMacAddress().equalsIgnoreCase(device.getMacAddress())){
//            throw new RuntimeException("Device com o mesmo mac");
//        }
//    });
//
//    myDevices.add(device);
//    return device;
//}

    @Override // example two
    public Device save(Device device) {
        boolean contains = myDevices.contains(device);
        if(!contains) myDevices.add(device);
        return device;
    }

    @Override
    public Device getDeviceByMac(String macAddress) {
        return null;
    }

    @Override
    public List<Device> getAllDevices() {
        return myDevices;
    }

    @Override
    public Device deleteDevice(String MacAdress) {
        return null;
    }
}

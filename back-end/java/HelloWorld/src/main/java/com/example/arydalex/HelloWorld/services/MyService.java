package com.example.arydalex.HelloWorld.services;

import com.example.arydalex.HelloWorld.models.Device;

import java.util.List;

public interface MyService {
    Device save(Device device); // salvar dipositivo
    Device getDeviceByMac(String macAddress); // recuperar dispositivo
    List<Device> getAllDevices(); // lista de dispositivos

    Device deleteDevice(String MacAdress);
}

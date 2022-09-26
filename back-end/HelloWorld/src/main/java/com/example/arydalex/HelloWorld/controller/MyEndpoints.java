package com.example.arydalex.HelloWorld.controller;

import com.example.arydalex.HelloWorld.models.Device;
import com.example.arydalex.HelloWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Mudar porta: resources/application.properties | server.port=2040

@RestController
@RequestMapping("/test")
public class MyEndpoints {
    @Autowired
    private MyService myService;

    @GetMapping // http://localhost:2040/test
    public List<Device> myFirstGet() {
        return myService.getAllDevices();
    }

    @GetMapping("/{myId}") // http://localhost:2040/test/<id>
    public String enpointWithParameter(@PathVariable Integer myId) {
        System.out.println(myId);
        return "Hello World " + myId;
    }

    @GetMapping("/v1") // http://localhost:2040/test/v1?value=<value>
    public String endpointWithQuery(@RequestParam Integer value) {
        System.out.println(value);
        return "Hello World " + value;
    }

    @PostMapping // http://localhost:2040/test
    public Device myFirstPost(@RequestBody Device device) {
        return myService.save(device);
    }

    @DeleteMapping("/{mac}")
    public Device myFirstDelete(@RequestParam String mac) { return myService.deleteDevice(mac); }
}
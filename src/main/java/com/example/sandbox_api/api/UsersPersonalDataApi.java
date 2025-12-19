package com.example.sandbox_api.api;

import com.example.sandbox_api.entity.UsersPersonalData;
import jakarta.validation.constraints.NotBlank;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


public interface UsersPersonalDataApi {

    @PostMapping
    UUID addUsersPersonalData(@RequestBody UsersPersonalData userData);

    @GetMapping("/surname/{surname}")
    List<UsersPersonalData> getListUsersPersonalDataBySurname
            (@NotBlank @PathVariable String surname);

    @GetMapping("/count")
    Long getUsersCount();

    @GetMapping("/getPage")
    List<UsersPersonalData> getUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int size
    );


}

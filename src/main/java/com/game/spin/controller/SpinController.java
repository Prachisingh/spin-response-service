package com.game.spin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.game.spin.constant.SpinConstant.spinResp;

@RestController
@RequestMapping("rsg/games/{gameId}/")
@Slf4j
public class SpinController {

    @GetMapping("/spin")
    public String spin() {
        log.info("======================Inside Spin Project==============================");
        return spinResp;
    }

}

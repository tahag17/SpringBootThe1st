package com.jetbrains.taha.Gphoto.Clone.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/profile")
    public String showHome(){return "profile";}
    // look for the reason why this doesn't display the profile.html file content.
}

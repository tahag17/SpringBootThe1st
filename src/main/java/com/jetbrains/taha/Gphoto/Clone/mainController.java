package com.jetbrains.taha.Gphoto.Clone;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

// the main reason for creating this controller
//is to explore sessions and redis
@RestController
public class mainController {
    //      @GetMapping("/profile")
//    public String showHome(){return "profile";}
    // look for the reason why this doesn't display the profile.html file content.
    private final String HOME_VIEW_COUNT = "HOME_VIEW_COUNT";

    @GetMapping("/mainhome")
    public String home(Principal principal, HttpSession session) {
        incrementCount(session, HOME_VIEW_COUNT);
        return "hmmm Hey There...";
    }

    @GetMapping("/count")
    public String count(HttpSession session) {
        return "HOME VIEW COUNT " + session.getAttribute(HOME_VIEW_COUNT);
    }


    private void incrementCount(HttpSession session, String attr) {
        var homeViewCount = session.getAttribute(attr) == null ? 0 : (Integer) session.getAttribute(attr);
        session.setAttribute(attr, homeViewCount += 1);
    }
}

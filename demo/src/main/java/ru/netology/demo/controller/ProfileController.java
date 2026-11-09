
package ru.netology.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.demo.profile.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {

    private static final Logger logger =
            LoggerFactory.getLogger(ProfileController.class);

    private final SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        logger.info("Получен GET-запрос /profile");

        String result = profile.getProfile();

        logger.info("Профиль успешно получен: {}", result);

        return result;
    }
}

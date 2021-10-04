package practice.homework;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor @AllArgsConstructor
@ToString
@Slf4j
@Setter

public class Animal {
    private String animalName;
    private String nickname;
    private String command;
    private boolean isWild;
    private int animalWeight;
    private int animalAge;
    private int energyLevel;



    public void goToSleep () {
        if (command != "goToSleep") {
            command = "goToSleep";
            if (isWild || nickname == null) {
                log.info("The {} is sleeping now", animalName);
            } else
                log.info("{} is sleeping now", nickname);
        } else
        if (isWild || nickname == null) {
            log.info("The {} already sleeping, please specify another command for the {}", animalName, animalName);
        } else
            log.info("{} already sleeping, please specify another command for {}", nickname, nickname);
    }

    public void letsGoEat () {
        if (command != "letsGoEat") {
            command = "letsGoEat";
            energyLevel = 4;
            if (isWild || nickname == null) {
                log.info("The {} is feeding now", animalName);
            } else log.info("{} is feeding now", nickname);
        } else
            if (isWild || nickname == null) {
                log.info("The {} just ate, please specify another command for the {}", animalName, animalName);
            } else
                log.info("{} just ate, please specify another command for {}", nickname, nickname);
    }

    public void letsGoWalk () {
        if (command != "letsGoWalk") {
            if (energyLevel > 0) {
                command = "letsGoWalk";
                --energyLevel;
                if (isWild || nickname == null) {
                    log.info("The {} now is walking", animalName);
                } else log.info("{} now is walking", nickname);
            }
            if (energyLevel == 0) {
                if (isWild || nickname == null) {
                    log.info("The energy level now is {}, please feed the {}", energyLevel, animalName);
                } else log.info("The energy level now is {}, please feed {}", energyLevel, nickname);
            }
        } else
            if (isWild || nickname == null) {
                log.info("The {} already walking, please specify another command for the {}", animalName, animalName);
            } else
                log.info("{} already walking, please specify another command for {}", nickname, nickname);
    }

    public void letsGoPlay () {
        if (command != "letsGoPlay") {
            if (energyLevel > 0) {
                command = "letsGoPlay";
                --energyLevel;
                if (isWild || nickname == null) {
                    log.info("The {} now is playing", animalName);
                } else log.info("{} now is playing", nickname);
            }
            if (energyLevel == 0) {
                if (isWild || nickname == null) {
                    log.info("The energy level now is {}, please feed the {}", energyLevel, animalName);
                } else log.info("The energy level now is {}, please feed {}", energyLevel, nickname);
            }
        } else
        if (isWild || nickname == null) {
            log.info("The {} already playing, please specify another command for the {}", animalName, animalName);
        } else
            log.info("{} already playing, please specify another command for {}", nickname, nickname);
    }

    public void letsGoExercise () {
        if (command != "letsGoExercise") {
            if (energyLevel > 0) {
                command = "letsGoExercise";
                --energyLevel;
                if (isWild || nickname == null) {
                    log.info("The {} now is exercising", animalName);
                } else log.info("{} now is exercising", nickname);
            }
            if (energyLevel == 0) {
                if (isWild || nickname == null) {
                    log.info("The energy level now is {}, please feed the {}", energyLevel, animalName);
                } else log.info("The energy level now is {}, please feed {}", energyLevel, nickname);
            }
        } else
        if (isWild || nickname == null) {
            log.info("The {} already exercising, please specify another command for the {}", animalName, animalName);
        } else
            log.info("{} already exercising, please specify another command for {}", nickname, nickname);
    }


    public Animal(String animalName, boolean isWild, int energyLevel) {
        this.animalName = animalName;
        this.isWild = isWild;
        this.energyLevel = energyLevel;
    }

    public Animal(String animalName, String nickname, boolean isWild, int energyLevel) {
        this.animalName = animalName;
        this.nickname = nickname;
        this.isWild = isWild;
        this.energyLevel = energyLevel;
    }
}

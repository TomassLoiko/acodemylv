package practice.homework;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@ToString
@Slf4j



public class Tamagotchi {
    private String animalName;
    private String nickname;
    private String command;
    private String setCommand;
    private boolean isWild;
    private int energyLevel;



        public void letsDoIt (String command) {
            if (!Objects.equals(command, setCommand)) {
                setCommand = command;
                if (Objects.equals(command, "eat")) {
                    energyLevel = 4;
                }
                if (energyLevel > 0) {
                    if (Objects.equals(command, "walk") || Objects.equals(command, "play") || Objects.equals(command, "train")) {
                        energyLevel--;
                    }
                    if (isWild || nickname == null) {
                        log.info("The {} now is {}ing", animalName, command);
                    } else log.info("{} now is {}ing", nickname, command);
                }
                if (energyLevel == 0) {
                    if (isWild || nickname == null) {
                        log.info("The energy level now is {}, please feed the {}", energyLevel, animalName);
                    } else log.info("The energy level now is {}, please feed {}", energyLevel, nickname);
                }
            } else
            if (isWild || nickname == null) {
                log.info("The {} already {}ing, please specify another command for the {}", animalName, command, animalName);
            } else
                log.info("{} already {}ing, please specify another command for {}", nickname, command, nickname);
        }



    public Tamagotchi(String animalName, boolean isWild, int energyLevel) {
        this.animalName = animalName;
        this.isWild = isWild;
        this.energyLevel = energyLevel;
    }

    public Tamagotchi(String animalName, String nickname, boolean isWild, int energyLevel) {
        this.animalName = animalName;
        this.nickname = nickname;
        this.isWild = isWild;
        this.energyLevel = energyLevel;
    }
}

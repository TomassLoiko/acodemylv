//package practice.homework;
//
//import lombok.ToString;
//import lombok.extern.slf4j.Slf4j;
//
//@ToString
//@Slf4j
//
//
//
//public class Tamagotchi {
//    private String animalName;
//    private String nickname;
//    private String command;
//    private boolean isWild;
//    private int animalWeight;
//    private int animalAge;
//    private int energyLevel;
//
//    public int commandForTamagotchi (String command) {
//        this.command = command;
//        switch (command) {
//            case "walk":
//                energyLevel = 2;
//                return  energyLevel;
//                break;
//            case "eat":
//                energyLevel = 4;
//                return  energyLevel;
//                break;
//            default:
//                energyLevel--;
//                return energyLevel;
//
//        }
//    }
//
//        public void letsDoIt () {
//        String setCommand = "";
//            if (setCommand != command) {
//                if (energyLevel > 0) {
//                    setCommand = command;
//                    //--energyLevel;
//                    if (isWild || nickname == null) {
//                        log.info("The {} now is {}ing", animalName, setCommand);
//                    } else log.info("{} now is {}ing", nickname, setCommand);
//                }
//                if (energyLevel == 0) {
//                    if (isWild || nickname == null) {
//                        log.info("The energy level now is {}, please feed the {}", energyLevel, animalName);
//                    } else log.info("The energy level now is {}, please feed {}", energyLevel, nickname);
//                }
//            } else
//            if (isWild || nickname == null) {
//                log.info("The {} already {}ing, please specify another command for the {}", animalName, setCommand, animalName);
//            } else
//                log.info("{} already {}ing, please specify another command for {}", nickname, setCommand, nickname);
//        }
//
//
//
//    public Tamagotchi(String animalName, boolean isWild, int energyLevel) {
//        this.animalName = animalName;
//        this.isWild = isWild;
//        this.energyLevel = energyLevel;
//    }
//
//    public Tamagotchi(String animalName, String nickname, boolean isWild, int energyLevel) {
//        this.animalName = animalName;
//        this.nickname = nickname;
//        this.isWild = isWild;
//        this.energyLevel = energyLevel;
//    }
//}

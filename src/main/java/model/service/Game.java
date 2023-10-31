package model.service;

import camp.nextstep.edu.missionutils.Randoms;
import model.domain.Car;
import model.domain.Participant;

public class Game {

    private static final int MINIMUM_VALUE = 0;
    private static final int MAXIMUM_VALUE = 9;
    private static final int BASE_NUMBER = 4;

    public static void play(Participant participant) {

        for (Car car : participant.getParticipant()) {

            if (makeRandomValue() >= BASE_NUMBER) {
                car.add();
            }

        }

    }

    private static int makeRandomValue() {
        return Randoms.pickNumberInRange(MINIMUM_VALUE, MAXIMUM_VALUE);
    }

}
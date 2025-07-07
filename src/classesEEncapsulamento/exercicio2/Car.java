package classesEEncapsulamento.exercicio2;

public class Car {

    private int speed;
    private boolean isOn;
    private int gear;

    public Car() {
        this.isOn = false;
        this.gear = 0;
        this.speed = 0;
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("O carro já está ligado.");
            return;
        }
        isOn = true;
        System.out.println("Ligando o carro...");
    }
    public void turnOff() {
        if (!isOn) {
            System.out.println("O carro já está desligado.");
        } else if (gear != 0 || speed != 0) {
            System.out.println("O carro deve estar em ponto morto e parado antes de ser desligado.");
        } else {
            isOn = false;
            System.out.println("Desligando o carro...");
        }
    }

    public void accelerate() {

        if (!isOn) {
            System.out.println("Não é possível acelerar o carro desligado.");
        } else {

            switch (gear) {
                case 0 -> System.out.println("Não é possível acelerar o carro em ponto morto.");
                case 1 -> attemptSpeedVariation(20, 0);
                case 2 -> attemptSpeedVariation(40, 0);
                case 3 -> attemptSpeedVariation(60, 0);
                case 4 -> attemptSpeedVariation(80, 0);
                case 5 -> attemptSpeedVariation(100, 0);
                case 6 -> attemptSpeedVariation(120, 0);
            }

        }

    }

    public void decelerate() {

        if (!isOn) {
            System.out.println("Não é possível desacelerar o carro desligado ou parado.");
        } else {
            switch (gear) {
                case 0 -> System.out.println("Não é possível desacelerar o carro em ponto morto.");
                case 1 -> attemptSpeedVariation(0, 1);
                case 2 -> attemptSpeedVariation(21, 1);
                case 3 -> attemptSpeedVariation(41, 1);
                case 4 -> attemptSpeedVariation(61, 1);
                case 5 -> attemptSpeedVariation(81, 1);
                case 6 -> attemptSpeedVariation(101, 1);
            }
        }

    }

    public void attemptSpeedVariation(int speedLimit, int option) {
        /**
         * Option = 0 -> Acelerar
         * Option = 1 -> Desacelerar
         * speedLimit é o limite máximo de velocidade caso deseje acelerar ou o limite mínimo caso deseje desacelerar.
         * */
        switch (option) {
            case 0 -> {
                if (speed < speedLimit) {
                    speed += 1;
                    System.out.printf("Aumentando a velocidade em 1 km/h, velocidade atual: %s km/h\n", speed);
                } else {
                    System.out.printf("A velocidade máxima para a %s marcha já foi atingido. Para acelerar troque" +
                            " de marcha.\n", gear);
                }
            }
            case 1 -> {
                if (speed > speedLimit) {
                    speed -= 1;
                    System.out.printf("Reduzindo a velocidade em 1 km/h, velocidade atual: %s km/h \n", speed);
                } else {
                    System.out.printf("A velocidade mínima para a %s marcha já foi atingido. Para desacelerar troque" +
                            " de marcha.\n", gear);
                }
            }
        }
    }

    public void turn(String direction) {
        if (!isOn) {
            System.out.println("Impossível fazer curva com o carro desligado.");
        } else {
            if (speed < 1 || speed > 40) {
                System.out.printf("Para realizar uma curva é necessário que o carro esteja no seguinte intervalo de " +
                        "velocidade: 1 km/h - 40 km/h. Velocidade atual: %s km/h\n", speed);
            } else {
                System.out.printf("Virando para a %s\n", direction);
            }
        }
    }

    public void checkSpeed() {
        System.out.printf("A velocidade atual do carro é: %s km/h\n", speed);
    }


    public void attemptGearChange(int option, int speedLimit) {

        /**
         * Option = 0 -> Diminuir marcha
         * Option = 1 -> Aumentar marcha
         *
         * */

        switch (option) {
            case 0 -> {
                if (speed > speedLimit) {
                    System.out.printf("Para passar para a marcha %s é necessário estar a no máximo %s km/h\n",
                            gear - 1, speedLimit);
                } else {
                    gear -= 1;
                    if (gear > 1) {
                        speed -= 1;
                    }
                    System.out.printf("Passando da %s marcha para a %s marcha.\n", gear+1, gear);
                }
            }
            case 1 -> {
                if (speed < speedLimit) {
                    System.out.printf("Para passar para a marcha %s é necessário estar a no mínimo %s km/h\n",
                            gear + 1, speedLimit);
                } else {
                    gear += 1;
                    System.out.printf("Passando da %s marcha para a %s marcha.\n", gear-1, gear);
                }
            }
        }


    }

    public void changeGear(int option) {

        if (!isOn) {
            System.out.println("Impossível trocar a marcha com o carro desligado.");
        } else {
            switch (option) {
                // Diminuir a marcha
                case 0 -> {
                    switch (gear) {
                        case 0 -> System.out.println("O carro já está em ponto morto.");
                        case 1 -> attemptGearChange(0, 1);
                        case 2 -> attemptGearChange(0, 21);
                        case 3 -> attemptGearChange(0, 41);
                        case 4 -> attemptGearChange(0, 61);
                        case 5 -> attemptGearChange(0, 81);
                        case 6 -> attemptGearChange(0, 101);
                    }
                }
                // Aumentar a marcha
                case 1 -> {
                    switch (gear) {
                        case 0 -> attemptGearChange(1, -1);
                        case 1 -> attemptGearChange(1, 20);
                        case 2 -> attemptGearChange(1, 40);
                        case 3 -> attemptGearChange(1, 60);
                        case 4 -> attemptGearChange(1, 80);
                        case 5 -> attemptGearChange(1, 100);
                        case 6 -> System.out.println("O carro já está na última marcha.");
                    }
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    public int getGear() {
        return gear;
    }

}

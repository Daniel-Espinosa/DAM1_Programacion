package robot;

public class Movimiento {

    private Robot robot;

    public Movimiento(int posX, int posY, int angulo) {
        robot = new Robot(posX, posY, angulo);
    }

    /**
     * Método que hace que el robot avance en línea recta hasta que encuentre un
     * obstáculo delante.
     */
    public void avanzaRecto() {
        while (robot.avanza()) {
            robot.avanza();
            robot.pinta();
        }
    }

    /**
     * Método que hace que el robot avance en cuadrado avanzando diez pasos y
     * girando noventa grados.
     */
    public void avanzaEnCuadrado() {
        for (int i = 0; i <= 4; i++) {
            for (int x = 0; x <= 10; x++) {
                if (robot.avanza()) {
                    robot.pinta();
                }
            }
            robot.gira90();
            robot.pinta();
        }
    }

    /**
     * Método que hace que el robot avance veinte veces en línea recta hasta
     * encontrar un obstáculo y que gire noventa grados. 35.55
     */
    public void avanza20() {
        int cont = 0;

        while (cont < 20) {
            if (robot.avanza()) {
                robot.pinta();
            } else {
                robot.gira90();
                robot.pinta();
                cont++;
            }

        }

    }

    /**
     * Método que hace que el robot avance cien veces en línea recta hasta
     * encontrar un obstáculo y que luego gire un ángulo aleatorio de noventa,
     * ciento ochenta o doscientos setenta grados.
     */
    public void avanza100GiroAleat() {
        int cont = 0;

        while (cont < 100) {
            if (robot.avanza()) {
                robot.pinta();
            } else {
                int var = (int) ((Math.random() * 3) + 1);
                switch (var) {
                    case 3:
                        robot.gira90();
                        robot.pinta();
                    case 2:
                        robot.gira90();
                        robot.pinta();
                    case 1:
                        robot.gira90();
                        robot.pinta();
                        break;
                    default:
                        throw new AssertionError();
                }
                cont++;
            }
        }
    }

    /**
     * Método que hace que el robot avance un número de pasos aleatorio entre
     * cero y diez y que gire un ángulo aleatorio de cero, noventa, ciento
     * ochenta o doscientos setenta grados y cuenta el número de pasos.
     */
    public void movimientoAleatorio() {
        int cont = 0;

        while (robot.estaDentroLaberinto()) {
            cont = (int) ((Math.random() * 11));
            while (cont < 10) {
                if (robot.avanza()) {
                    robot.pinta();
                    cont++;
                } else {
                    int var = (int) ((Math.random() * 4) + 1);
                    switch (var) {
                        case 4:
                            robot.gira90();
                            robot.pinta();
                        case 3:
                            robot.gira90();
                            robot.pinta();
                        case 2:
                            robot.gira90();
                            robot.pinta();
                        case 1:
                            robot.gira90();
                            robot.pinta();
                            cont = 10;
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            }
        }
    }

    /**
     * Método que hace que el robot salga del laberinto manteniendo la mano
     * derecha pegada en todo momento a las paredes del laberinto y devuelve el
     * número de pasos.
     */
    public void salirDerecha() {
        //int cont = 0;

        while (robot.estaDentroLaberinto()) {
            if (!robot.avanza()) {
                robot.gira90();
                robot.pinta();
            }else if (robot.hayObstaculo(Robot.DCHA) && !robot.hayObstaculo(Robot.DELANTE)) {
                robot.gira90();
                robot.pinta();
                robot.avanza();
                       
            }
            
            robot.pinta();
            
            
            
            
            /*
            if (robot.hayObstaculo(Robot.DCHA) && !robot.hayObstaculo(Robot.DELANTE)) {
                robot.avanza();
                robot.pinta();
            } else {
                robot.gira90();
                robot.gira90();
                robot.gira90();
                robot.pinta();
                while(!robot.hayObstaculo(Robot.DCHA)) {
                    robot.avanza();
                    robot.pinta();
                }
                        
            }
            */
        }
    }

}

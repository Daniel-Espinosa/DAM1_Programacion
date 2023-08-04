package robot;

/**
 * Clase que contiene un robot que se mueve por un recinto.
 */
public class Robot {

    /**
     * Constante estática para la dirección; es relativa a la orientacion del
     * robot.
     */
    public static int DELANTE = Recinto.DELANTE;

    /**
     * Constante estática para la dirección; es relativa a la orientacion del
     * robot.
     */
    public static int DETRAS = Recinto.DETRAS;

    /**
     * Constante estática para la dirección; es relativa a la orientacion del
     * robot.
     */
    public static int IZQDA = Recinto.IZQDA;

    /**
     * Constante estática para la dirección; es relativa a la orientacion del
     * robot.
     */
    public static int DCHA = Recinto.DCHA;

    // Posición del robot, en celdas, y ángulo, en cuadrantes (0, 1, 2, 3)
    private int posX, posY;
    private int angulo; // Expresado en cuadrantes
    // Recinto en el que se mueve el robot
    private Recinto rec;

    /**
     * Constructor al que se le pasa la posición inicial en celdas, y el ángulo
     * inicial en grados (múltiplo de 90).
     */
    public Robot(int posX, int posY, int angulo) {
        this.angulo = (angulo % 360) / 90;
        rec = new Recinto();
        if (rec.posicionValida(posX, posY)) {
            this.posX = posX;
            this.posY = posY;
            rec.cambiaRobot(posX, posY, angulo);
        } else {
            System.out.println("La posición " + posX + ","
                    + posY + " no es válida.");
            System.out.println("Se inicializa el robot en 25,25");
            this.posX = 25;
            this.posY = 25;
            rec.cambiaRobot(25, 25, angulo);
        }
    }

    /**
     * Avanza el robot una celda si se puede; retorna true si avanzo, o false si
     * había un obstaculo delante.
     */
    public boolean avanza() {
        if (rec.hayObstaculo(Recinto.DELANTE)) {
            return false;
        } else {
            switch (angulo) {
                case 0:
                    posX++;
                    break;
                case 1:
                    posY--;
                    break;
                case 2:
                    posX--;
                    break;
                case 3:
                    posY++;
            }
            rec.cambiaRobot(posX, posY, angulo * 90);
            return true;
        }
    }

    /**
     * Gira el robot 90 grados
     */
    public void gira90() {
        angulo = (angulo + 1) % 4;
        rec.cambiaRobot(posX, posY, angulo * 90);
    }

    /**
     * Indica si el robot tiene un obstáculo en la dirección indicada La
     * dirección se expresa mediante las constantes estáticas DELANTE, DETRAS,
     * IZQDA, DCHA, y es relativa al ángulo actual del robot.
     */
    public boolean hayObstaculo(int direccion) {
        return rec.hayObstaculo(direccion);
    }

    /**
     * Pinta el robot y el recinto
     */
    public void pinta() {
        espera(50);
        rec.pinta();
    }

    // Espera un rato expresado en milisegundos
    private void espera(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
        }
    }

    /**
     * Indica si el robot está dentro del laberinto
     */
    public boolean estaDentroLaberinto() {
        return 30 <= posX && posX <= 80 && 30 <= posY && posY <= 80;
    }
}

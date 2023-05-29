package robot;

import fundamentos.Dibujo;
import fundamentos.ColorFig;

/**
 * Clase que representa un recinto con obstáculos, en el que se mueve un robot
 * móvil.
 */
public class Recinto {

    /**
     * Constante estática para la dirección; es relativa a la orientacion del
     * robot.
     */
    public static int DELANTE = 0;

    /**
     * Constante estática para la dirección; es relativa a la orientacion del
     * robot.
     */
    public static int DETRAS = 2;

    /**
     * Constante estática para la dirección; es relativa a la orientacion del
     * robot.
     */
    public static int IZQDA = 1;

    /**
     * Constante estática para la dirección; es relativa a la orientacion del
     * robot.
     */
    public static int DCHA = 3;

    // Ventana para hacer el dibujo
    private Dibujo dib;

    // Iconos disponibles
    private static final String[] fichIcono
            = {"icono0.png", "icono90.png", "icono180.png", "icono270.png"};

    // Posición del icono
    private int posX = 0, posY = 0;
    // Icono a usar 0, 1, 2, 3, para 0, 90, 180, 270 grados
    private int icono = 0;

    // Celda del recinto, que define los obstáculos a dibujar
    // True indica que la celda está ocupada por un obstáculo
    private boolean[][] celda;

    /*Obstáculos a usar, teniendo en cuenta que el robot mide más
    de una celda. Contiene el dibujo de las celdas, aumentado.
    True indica que la celda está ocupada por un obstáculo*/
    private boolean[][] obstaculo;

    // Máximo número de celdas contenidas en el recinto
    private int maxX = 120;
    private int maxY = 120;

    //Tamaño de las celdas del dibujo
    private int paso = 5;

    // Margen que debe librarse alrededor del robot, en celdas
    // El robot mide (2*margen+1)*paso
    private int margen = 2;

    // Límites del dibujo
    private int limiteX = paso * (maxX + 2);
    private int limiteY = paso * (maxY + 2);

    /**
     * Constructor que da un valor concreto al recinto
     */
    public Recinto() {
        dib = new Dibujo("Recinto", limiteX, limiteY);
        celda = new boolean[maxX][maxY]; // Se inicializa a false por omisión
        obstaculo = new boolean[maxX][maxY]; // Se inicializa a false por omisión
        // Colocar los bordes superior e inferior del recinto
        for (int i = 0; i < maxX; i++) {
            celda[i][0] = true;
            celda[i][maxY - 1] = true;
        }
        // Colocar los bordes izqdo y dcho del recinto
        for (int i = 0; i < maxY; i++) {
            celda[0][i] = true;
            celda[maxX - 1][i] = true;
        }

        // Crear un laberinto en el centro
        // Líneas horizontales
        for (int i = 30; i <= 80; i++) {
            celda[i][30] = true;
        }
        for (int i = 30; i <= 70; i++) {
            celda[i][40] = true;
        }
        for (int i = 40; i <= 50; i++) {
            celda[i][50] = true;
        }
        for (int i = 60; i <= 70; i++) {
            celda[i][50] = true;
        }
        for (int i = 40; i <= 50; i++) {
            celda[i][70] = true;
        }
        for (int i = 30; i <= 80; i++) {
            celda[i][80] = true;
        }
        // Líneas verticales
        for (int i = 40; i <= 80; i++) {
            celda[30][i] = true;
        }
        for (int i = 40; i <= 50; i++) {
            celda[40][i] = true;
        }
        for (int i = 50; i <= 70; i++) {
            celda[50][i] = true;
        }
        for (int i = 60; i <= 80; i++) {
            celda[60][i] = true;
        }
        for (int i = 40; i <= 70; i++) {
            celda[70][i] = true;
        }
        for (int i = 30; i <= 80; i++) {
            celda[80][i] = true;
        }
        // Colocar los obstáculos
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                if (celda[i][j]) {
                    for (int x = Math.max(0, i - margen);
                            x <= Math.min(maxX - 1, i + margen); x++) {
                        for (int y = Math.max(0, j - margen);
                                y <= Math.min(maxY - 1, j + margen); y++) {
                            obstaculo[x][y] = true;
                        }
                    }
                }
            }
        }
    }

    //Transforma coordenada x de celda al dibujo.
    private int coordX(int x) {
        return x * paso + paso;
    }

    //Transforma coordenada y de celda al dibujo.
    private int coordY(int y) {
        return y * paso + paso;
    }

    /**
     * Pintar el dibujo.
     */
    public void pinta() {
        dib.borra(ColorFig.blanco);
        dib.ponGrosorLapiz(1);
        dib.ponColorLapiz(ColorFig.rojo);
        dib.ponRelleno(ColorFig.rojo);
        for (int x = 0; x < maxX; x++) {
            for (int y = 0; y < maxX; y++) {
                if (celda[x][y]) {
                    dib.dibujaRectangulo(coordX(x), coordY(y), coordX(x) + paso, coordY(y) + paso);
                }
            }
        }
        dib.dibujaImagen(coordX(posX) - margen * paso, coordY(posY) - margen * paso, fichIcono[icono]);
        dib.pinta();
    }

    /**
     * Cambia la posición y ángulo del robot.El ángulo debe ser múltiplo de 90.
     */
    public void cambiaRobot(int posX, int posY, int angulo) {
        this.posX = posX;
        this.posY = posY;
        angulo = angulo % 360;
        icono = angulo / 90;
    }

    /**
     * Indica si el robot tiene un obstáculo en la direccion indicada.
     */
    public boolean hayObstaculo(int direccion) {
        switch ((icono + direccion) % 4) {
            case 0:
                return obstaculo[posX + 1][posY];
            case 1:
                return obstaculo[posX][posY - 1];
            case 2:
                return obstaculo[posX - 1][posY];
            case 3:
                return obstaculo[posX][posY + 1];
            default:
                return false;
        }
    }

    /**
     * Indica si estas coordenadas son válidas para poner el robot.
     */
    public boolean posicionValida(int x, int y) {
        return !obstaculo[x][y];
    }
}

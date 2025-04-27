package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        nakresliCtverec(100, 200, 50);
        nakresliCtverec(150, 200, 100);
        nakresliRovnostrannyTrojuhelnik(200, 400, 130);
        nakresliKolecko(400, 200, 60);
        nakresliObdelnik( 100,400,30,60);
        nakresliObdelnik(100,500,80,140);
        nakresliPravouhlyTrojuhelnik(500,500,80);
    }

    public void nakresliCtverec(double x, double y, int delkaStrany) {
        zofka.setLocation(x, y);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    public void nakresliRovnostrannyTrojuhelnik(double x, double y, int delkaStrany) {
        zofka.setLocation(x, y);
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(120);
        }
    }

    public void nakresliKolecko(double x, double y, int delkaStrany) {
        zofka.setLocation(x, y);
        zofka.penDown();
        for (int i = 0; i < 12; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(30);
        }
    }
    public void nakresliObdelnik (double x, double y, int delkaKratsiStrany, int delkaDelsiStrany ) {
        zofka.setLocation(x, y);
            zofka.move(delkaKratsiStrany);
            zofka.turnRight(90);
            zofka.move(delkaDelsiStrany);
            zofka.turnRight(90);
            zofka.move (delkaKratsiStrany);
            zofka.turnRight(90);
            zofka.move(delkaDelsiStrany);
            zofka.turnRight(90);
    }
    public void nakresliPravouhlyTrojuhelnik (double x, double y, int delkaKratsiStrany) {
        zofka.setLocation(x, y);
        zofka.turnLeft(90);
        zofka.move(delkaKratsiStrany);
        zofka.turnRight(135);
        var velikostPrepony = Math.sqrt(2*Math.pow(delkaKratsiStrany, 2))
        zofka.move(velikostPrepony);
        zofka.turnRight(135);
        zofka.move(delkaKratsiStrany);
        zofka.turnRight(180);
    }
}
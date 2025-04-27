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
        nakresliMnohouhelnik(400, 200, 60);
        nakresliObdelnik( 100,400,30,60);
        nakresliObdelnik(100,500,80,140);
        nakresliPravouhlyTrojuhelnik(500,500,80);

        //zmrzlina
        zofka.turnLeft(30);
        nakresliRovnostrannyTrojuhelnik(800, 400, 155);
        zofka.turnRight(30);
        nakresliKoleckoPolomer(720, 240, 80, 360);
        //snehulak
        nakresliKoleckoPolomer(1000, 500, 100, 360);
        nakresliKoleckoPolomer(1020, 320, 80, 360);
        nakresliKoleckoPolomer(960, 320, 30, 360);
        nakresliKoleckoPolomer(1180, 320, 30, 360);
        nakresliKoleckoPolomer(1050, 190, 50, 360);
        //masinka
        nakresliPravouhlyTrojuhelnik(150, 800, 90);
        nakresliObdelnik(150,780,110,200);
        nakresliKoleckoPolomer(180,810, 30, 360);
        nakresliKoleckoPolomer(270,810, 30, 360);
        nakresliObdelnik(350,780,200,120);
        nakresliKoleckoPolomer(350,780,60,360);

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

    public void nakresliMnohouhelnik(double x, double y, int delkaStrany) {
        zofka.setLocation(x, y);
        zofka.penDown();
        for (int i = 0; i < 12; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(30);
        }
    }

    public void nakresliObdelnik(double x, double y, int delkaKratsiStrany, int delkaDelsiStrany) {
        zofka.setLocation(x, y);
        zofka.move(delkaKratsiStrany);
        zofka.turnRight(90);
        zofka.move(delkaDelsiStrany);
        zofka.turnRight(90);
        zofka.move(delkaKratsiStrany);
        zofka.turnRight(90);
        zofka.move(delkaDelsiStrany);
        zofka.turnRight(90);
    }

    public void nakresliPravouhlyTrojuhelnik(double x, double y, int delkaStrany) {
        zofka.setLocation(x, y);
        zofka.turnLeft(90);
        zofka.move(delkaStrany);
        zofka.turnRight(135);
        var velikostPrepony = Math.sqrt(2 * Math.pow(delkaStrany, 2));
        zofka.move(velikostPrepony);
        zofka.turnRight(135);
        zofka.move(delkaStrany);
        zofka.turnRight(180);
    }

    public void nakresliKoleckoPolomer(double x, double y, int polomer, int pocetKroku) {
        double delkaKroku = 2 * Math.PI * polomer / pocetKroku;
        double uhelKroku = 360 / pocetKroku;
        zofka.setLocation(x, y);
        for (int i = 0; i < pocetKroku; i++) {
            zofka.move(delkaKroku);
            zofka.turnRight(uhelKroku);
        }
    }
}
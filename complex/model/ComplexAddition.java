package complex.model;

import java.util.logging.Logger;

public class ComplexAddition implements ComplexOperation {
    Logger logger = Logger.getAnonymousLogger();

    @Override
    public Complex mathOperation(Complex c1, Complex c2) {
        logger.info("Входные параметры: " + "\n" + String.valueOf(c1) + "\n" + String.valueOf(c1));

        Complex temp = new Complex(0, 0);
        temp.setRe(c1.getRe() + c2.getRe());
        temp.setIm(c1.getIm() + c2.getIm());
        logger.info("Выполнено сложение двух комплексных чисел");
        return temp;
    }

    public void print(Complex complex) {
        System.out.printf("Действительная часть: %s; Мнимая часть: %s", complex.getRe(), complex.getIm());
    }
}
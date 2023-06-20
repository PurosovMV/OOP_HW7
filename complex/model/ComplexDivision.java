package complex.model;

import java.util.logging.Logger;

public class ComplexDivision implements ComplexOperation {
    Logger logger = Logger.getAnonymousLogger();

    @Override
    public Complex mathOperation(Complex c1, Complex c2) {
        logger.info("Входные параметры: " + "\n" + String.valueOf(c1) + "\n" + String.valueOf(c1));
        Complex temp = new Complex(0, 0);
        temp.setRe((c1.getRe() * c2.getRe() + c1.getIm() * c2.getIm())
                / (c2.getRe() * c2.getRe() + c2.getIm() * c2.getIm()));
        temp.setIm((c2.getRe() * c1.getIm() - c1.getRe() * c2.getIm())
                / (c2.getRe() * c2.getRe() + c2.getIm() * c2.getIm()));
        logger.info("Выполнено деление двух комплексных чисел");
        return temp;
    }

    @Override
    public void print(Complex complex) {
        System.out.printf("Результат: Действительная часть: %s; Мнимая часть: %s", complex.getRe(), complex.getIm());
    }
}

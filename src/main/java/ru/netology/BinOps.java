package ru.netology;

public class BinOps {

    private enum Operation {SUM, MULT}

    public String sum(String a, String b) {
        return calc(a,b,Operation.SUM);
    }

    public String mult(String a, String b) {
        return calc(a,b,Operation.MULT);
    }

    private String calc(String a, String b, Operation operation) {
        String result = "";
        int x;
        int y;

        try {
            x = Integer.parseInt(a, 2);
            y = Integer.parseInt(b, 2);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Введено некорректное значение параметра \r" + ex.getMessage());
        }

        switch (operation) {
            case SUM:
                result = Integer.toBinaryString(x + y);
                break;
            case MULT:
                result = Integer.toBinaryString(x * y);
                break;
        }

        return result;
    }
}

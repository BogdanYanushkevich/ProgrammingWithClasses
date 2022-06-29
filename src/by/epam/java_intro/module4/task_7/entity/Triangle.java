package by.epam.java_intro.module4.task_7.entity;

public class Triangle {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle() {
        super();
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x2 - x1) * (y3 - y1) != (x3 - x1) * (y2 - y1)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        } else {
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 0;
            this.y2 = 0;
            this.x3 = 0;
            this.y3 = 0;
        }


    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    @Override
    public boolean equals(Object sumObj) {
        if (this == sumObj) {
            return true;
        }
        if (sumObj == null) {
            return false;
        }
        if (sumObj.getClass() != this.getClass()) {
            return false;
        }
        Triangle other = (Triangle) sumObj;

        return this.x1 == other.x1 && this.x2 == other.x2 && this.x3 == other.x3 &&
                this.y1 == other.y1 && this.y2 == other.y2 && this.y3 == other.y3;

    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((x1 == 0) ? 0 : Double.valueOf(x1).hashCode());
        result = prime * result + ((x2 == 0) ? 0 : Double.valueOf(x2).hashCode());
        result = prime * result + ((x3 == 0) ? 0 : Double.valueOf(x3).hashCode());
        result = prime * result + ((y1 == 0) ? 0 : Double.valueOf(y1).hashCode());
        result = prime * result + ((y2 == 0) ? 0 : Double.valueOf(y2).hashCode());
        result = prime * result + ((y3 == 0) ? 0 : Double.valueOf(y3).hashCode());
        return result;
    }

    @Override
    public String toString() {
        if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0 && x3 == 0 && y3 == 0) {
            return "Such a triangle does not exist.";
        } else
            return "Triangle: " +
                    "x1 = " + x1 +
                    ", y1 = " + y1 +
                    ", x2 = " + x2 +
                    ", y2 = " + y2 +
                    ", x3 = " + x3 +
                    ", y3 = " + y3;
    }
}

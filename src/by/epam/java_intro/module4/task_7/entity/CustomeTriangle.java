package by.epam.java_intro.module4.task_7.entity;

public record CustomeTriangle(double a, double b, double c) {

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
        CustomeTriangle other = (CustomeTriangle) sumObj;

        return this.a == other.a && this.b == other.b && this.c == other.c;

    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((a == 0) ? 0 : Double.valueOf(a).hashCode());
        result = prime * result + ((b == 0) ? 0 : Double.valueOf(b).hashCode());
        result = prime * result + ((c == 0) ? 0 : Double.valueOf(c).hashCode());

        return result;
    }

    @Override
    public String toString() {
        if (a == 0 && b == 0 && c == 0) {
            return "Such a triangle does not exist.";
        } else {

            return "Triangle: " +
                    "a = " + a +
                    ", b = " + b +
                    ", c = " + c;
        }
    }
}

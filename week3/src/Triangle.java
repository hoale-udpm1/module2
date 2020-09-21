public class Triangle {
    public static String triangle(double a, double b, double c) {
        if ((a > 0) && (c > 0) && (b > 0) && ((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            if ((a == b) && (a == c) && (b == c)) {
                return "Tam giac deu";
            } else if ((a == b) || (a == c) || (b == c)) {
                return "Tam giac can";
            } else if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b)) {
                return "Tam giac vuong";
            } else  {
                return "Tam giac thuong";
            }
        }
        return "khong phai tam giac";
    }
}

public class TriangleClassifier {
    public static String getTypeTriangle(int a, int b, int c) {
        String text ="";
        if (isEquilateral(a, b, c)) {
            text= "equilateral";
        }else if(isIsosceles(a, b, c)) {
            text = "isosceles";
        }else if(isTriangle(a, b, c)){
            text= "triangle";
        }else {
            text="Nottriangle";
        }

        return text;
    }

    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static boolean isIsosceles(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a && (a == b) || (b == c) || (c == a);
    }


    private static boolean isEquilateral(int a, int b, int c ) {
        return a + b > c && a + c > b && b + c > a && a == b && b == c;
    }
}

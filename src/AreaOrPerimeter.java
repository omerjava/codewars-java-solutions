// https://www.codewars.com/kata/5ab6538b379d20ad880000ab
// if square return area
// if rectangle return perimeter

public class AreaOrPerimeter {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(3,4));
        System.out.println(areaOrPerimeter(6,6));
    }
    public static int areaOrPerimeter (int l, int w) {
       return l==w ? l*w : 2*(l+w);
    }
}

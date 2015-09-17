public class GeometryLabTest { 
    
    public static void main(String[] args) {
        GeometryLab geom = new GeometryLab();
        System.out.println(geom.f(2,3));
        System.out.println(geom.g(3, 5));
        System.out.println(geom.f(4, 8));
        System.out.println(geom.g(5, 3));
        System.out.println(geom.h(2, 9));
        System.out.println(geom.h(4, 10));
        System.out.println(geom.j(5, 10));
        System.out.println(geom.j(10, 5));
        System.out.println(geom.k(9, 7));
        System.out.println(geom.k(7, 9));
        System.out.println(geom.m(3, 4, 5));
        System.out.println(geom.m(4, 6, 3));
        //// finish up the rest 
        
        
        
        System.out.println(geom.triArea(2, 3));
        System.out.println(geom.triArea(4, 8));
        System.out.println(geom.rectArea(3, 5));
        System.out.println(geom.rectArea(5, 3));
        System.out.println(geom.trapArea(3, 4, 5));
        System.out.println(geom.trapArea(4, 6, 3));
        System.out.println(geom.circArea(7));
        System.out.println(geom.circArea(9));
        System.out.println(geom.paralArea(2, 9));
        System.out.println(geom.paralArea(4, 10));
        System.out.println(geom.pythHypotenuse(5, 10));
        System.out.println(geom.pythHypotenuse(9, 7));
        System.out.println(geom.triPrismVol(10, 5, 4));
        System.out.println(geom.triPrismVol(7, 9, 3));
        System.out.println(geom.rectPrismVol(2, 3, 4));
        System.out.println(geom.rectPrismVol(8, 3, 6));
        System.out.println(geom.rectPyramidVol(5, 7, 9));
        System.out.println(geom.rectPyramidVol(4, 6, 8));
        System.out.println(geom.cylVol(9, 2));
        System.out.println(geom.cylVol(10, 3));
        System.out.println(geom.sphereVol(6));
        System.out.println(geom.sphereVol(8));
        System.out.println(geom.coneVol(6, 5));
        System.out.println(geom.coneVol(8, 7));
        System.out.println(geom.sphereSurfArea(4));
        System.out.println(geom.sphereSurfArea(7));
        System.out.println(geom.cylSurfArea(4, 7));
        System.out.println(geom.cylSurfArea(5, 3));
        System.out.println(geom.rectPrismSurfArea(2, 3, 4));
        System.out.println(geom.rectPrismSurfArea(8, 3, 6));
        System.out.println(geom.triArea(geom.f(2, 3), geom.h(4, 8)));
        System.out.println(geom.rectArea(geom.g(7, 5), geom.j(5, 3)));
        System.out.println(geom.trapArea(geom.m(3, 4, 5), geom.m(4, 6, 3), geom.m(8, 3, 6)));
        System.out.println(geom.circArea(geom.k(8, 5)));
        System.out.println(geom.paralArea(geom.j(9, 2), geom.f(4, 10)));
        System.out.println(geom.pythHypotenuse(geom.f(5, 10), geom.g(9, 7)));
        System.out.println(geom.triPrismVol(geom.m(10, 5, 4), geom.m(7, 9, 3), geom.m(5, 7, 3)));
        System.out.println(geom.rectPrismVol(geom.h(2, 4), geom.m(8, 3, 6), geom.h(3, 6)));
        System.out.println(geom.rectPyramidVol(geom.m(5, 7, 9), geom.m(4, 6, 8), geom.k(20, 7)));
        System.out.println(geom.cylVol(geom.h(9, 2), geom.k(10, 3)));
        System.out.println(geom.sphereVol(geom.g(9, 6)));
        System.out.println(geom.coneVol(geom.j(6, 5), geom.j(8, 7)));
        System.out.println(geom.sphereSurfArea(geom.m(4, 3, 1)));
        System.out.println(geom.cylSurfArea(4, geom.f(5, 3)));
        System.out.println(geom.rectPrismSurfArea(geom.pythHypotenuse(3, 4), 3, geom.k(13, 5)));
       
        /// Template for the previous one. System.out.println(geom.);
    } 
}    
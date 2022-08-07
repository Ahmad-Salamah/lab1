public class Test1 {
    public static void main(String[] args) {
        int a =(int)(Math.random()*101);
        int b =(int)(Math.random()*101);
        System.out.println("this is a "+a);
        System.out.println("this is b "+b);

        int sum =a+b;
        System.out.println("The sum of (a + b) "+sum);

        double avg = (a+b)/2.0;
        System.out.println("the average value is "+avg);

        System.out.println("the remainder when dividing a in 10 ("+a%10+")");
        System.out.println("the remainder when dividing b in 10 ("+b%10+")");

        System.out.println("the area of rectangle is "+a*b);

    }

}

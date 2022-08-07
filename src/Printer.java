public class Printer {
    public static void main(String[] args) {
        String part1 = "There will be ";
        int visitors = 5;
        String part2 = " people for dinner ";
// print statement for "There will be 5 people for dinner"
        System.out.println(part1+visitors+part2);
//2 try to increment the number of visitors to 7 [visitors+2] in the print line
        // What happens when adding just visitors+2?
        System.out.println(part1+(visitors+2)+part2);
        //this won't chang the value of visitors it will only display the number 7
        System.out.println(visitors);
        //What is the right way of updating the print line?
        // the right  way is by doing this
        visitors+=2;
        System.out.println(part1+visitors+part2);



    }



}

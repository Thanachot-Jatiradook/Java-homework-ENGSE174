package Lab5010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Complex task desc : ") ;
        String inputCtaskDesc = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Hours : ") ;
        int inputCtaskHours = scanner.nextInt() ;

        System.out.println("--------------------------");

        System.out.println("Fee : ") ;
        double inputFee = scanner.nextDouble() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("Simple task desc : ") ;
        String inputStaskDesc = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Hours : ") ;
        int inputStaskHours = scanner.nextInt() ;

        System.out.println("----------result----------");

        ComplexTask blehComplexTask = new ComplexTask(inputCtaskDesc, inputCtaskHours, inputFee) ;
        SimpleTask blehSimpleTask = new SimpleTask(inputStaskDesc, inputStaskHours) ;

        ProjectTask[] blehProjectTasks = new ProjectTask[2] ;

        blehProjectTasks[0] = blehComplexTask ;
        blehProjectTasks[1] = blehSimpleTask ;


        for (ProjectTask p : blehProjectTasks) {

            System.out.println(p.calculateCost()) ;

        }

        scanner.close();

    }

}

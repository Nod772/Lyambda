import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        MyLambda test=(x)->{
//            return x+"!";
//        };
//
//        String result=test.formatText("Hello");
//        System.out.println(result);
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(3);
//        list.add(1);
//        list.add(4);
//        list.add(5);
//        list.forEach((x)-> System.out.print(x+"\t"));
//
//        Collections.sort(list);
//        System.out.println();
//        list.forEach((x)-> System.out.print(x+"\t"));

////////////////////////Завдання 1/////////////////////////////////////
//1
//        isLeapYear leapYear = (x) -> {
//            if (x % 4 == 0 && x % 100 != 0) {
//                return true;
//            } else if (x % 400 == 0) {
//                return true;
//            } else {
//                return false;
//            }
//        };
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter year : ");
//        boolean result = leapYear.checkYear(Math.abs(in.nextInt()));
//        if (result) {
//
//            System.out.println("Is Leap Year");
//        } else {
//
//            System.out.println("Isn`t Leap Year");
//        }
/////////////////////////////////////////////////////////////
        //2
//        DaysCount days = (x, y) -> {
//
//            return Days.daysBetween(new LocalDate(x), new LocalDate(y)).getDays();
//
//        };
//
//        Date a = new Date(1000, 12, 12);
//        Date b = new Date(1000, 12, 16);
//
//        int count = days.countDays(a, b);
//        System.out.println(count);

        //3//////////////////////////////
//        WeeksCount weeks = (x, y) -> {
//
//            return Weeks.weeksBetween(new LocalDate(x), new LocalDate(y)).getWeeks();
//
//        };
//
//        Date a = new Date(1000, 12, 12);
//        Date b = new Date(1000, 1, 16);
//
//        int count = Math.abs(weeks.countWeek(a, b));
//        System.out.println(count);
        //4
//        NameOfDay date=(x)->{
//            return x.dayOfWeek().getAsText();
//        };
//
//        DateTime day=new DateTime(1999,12,27,0,0);
//        System.out.println(date.getNameByDate(day));

////////////////////////Завдання 2//////////////////////////////


        //1
//        Fraction sum = (x, y) -> {
//            return x + y;
//        };
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a :");
//        double a = in.nextDouble();
//        System.out.print("Enter b :");
//        double b = in.nextDouble();
//        double res=sum.res(a,b);
//        System.out.println("Sum from "+a+" and "+b+" = "+res);
        //2
//        Fraction sub = (x, y) -> {
//            return x - y;
//        };
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a :");
//        double a = in.nextDouble();
//        System.out.print("Enter b :");
//        double b = in.nextDouble();
//        double res=sub.res(a,b);
//        System.out.println("Sub from "+a+" and "+b+" = "+res);

        //3
//        Fraction mul = (x, y) -> {
//            return x * y;
//        };
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a :");
//        double a = in.nextDouble();
//        System.out.print("Enter b :");
//        double b = in.nextDouble();
//        double res=mul.res(a,b);
//        System.out.println("Mul from "+a+" and "+b+" = "+res);


        //4
//        DivFraction fraction = (x, y) -> {
//            return x / y;
//        };
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a :");
//        double a = in.nextDouble();
//        System.out.print("Enter b :");
//        double b = in.nextDouble();
//        double res=fraction.div(a,b);
//        System.out.println("Div from "+a+" and "+b+" = "+res);

////////////////////////Завдання 3//////////////////////////////
//        SelectValue<Double> min = (a, b, c, d) -> {
//            List<Double> list = new ArrayList<Double>();
//            list.add(a);
//            list.add(b);
//            list.add(c);
//            list.add(d);
//
//            return Collections.min(list);
//
//        };
//        SelectValue<Double> max = (a, b, c, d) -> {
//            List<Double> list = new ArrayList<Double>();
//            list.add(a);
//            list.add(b);
//            list.add(c);
//            list.add(d);
//
//            return Collections.max(list);
//
//        };
//
//
//        double value = min.res((double)2, (double)5, (double)7, (double)1);
//        System.out.println("Min value equals " + value);
//        value = max.res((double)2, (double)5, (double)7, (double)1);
//        System.out.println("Max value equals " + value);

////////////////////////Завдання 4//////////////////////////////

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(3);
//        list.add(6);
//        list.add(-3);
//        list.add(2);
////1
//        SumOfElements isSame = (arr,b) -> {
//            int sum = 0;
//            for (int i = 0; i < arr.size(); i++) {
//                if (arr.get(i).equals(b) )
//                {
//                    sum=sum+b;
//                }
//            }
//            return sum;
//        };
//
//        int sum=isSame.sum(list,3);
//
//        System.out.println("Sum of the same elements in list equals:"+sum);

        //2
//        SumOfElementsInRange inRange = (arr,a,b) -> {
//            int sum = 0;
//            for (int i = 0; i < arr.size(); i++) {
//                if (arr.get(i)>=a&&arr.get(i)<=b)
//                {
//                    sum+=arr.get(i);
//                }
//            }
//            return sum;
//        };
//
//        int sum=inRange.sum(list,2,3);
//
//        System.out.println("Sum of the elements in range equals:"+sum);

        //3
//        SumOfPositive positive = (arr) -> {
//            int sum = 0;
//            for (int i = 0; i < arr.size(); i++) {
//                if (arr.get(i) > 0) {
//                    sum += arr.get(i);
//                }
//            }
//            return sum;
//        };
//
//        int sum = positive.sum(list);
//
//        System.out.println("Sum of the positive elements equals:" + sum);
        //4
//        SumOfPositive negative = (arr) -> {
//            int sum = 0;
//            for (int i = 0; i < arr.size(); i++) {
//                if (arr.get(i) < 0) {
//                    sum += arr.get(i);
//                }
//            }
//            return sum;
//        };
//
//        int sum = negative.sum(list);
//
//        System.out.println("Sum of the positive elements equals:" + sum);

    }

    interface SumOfElements {
        int sum(List<Integer> list, int value);
    }

    interface SumOfPositive {
        int sum(List<Integer> list);
    }
    interface SumOfNegative {
        int sum(List<Integer> list);
    }
    interface SumOfElementsInRange {
        int sum(List<Integer> list, int from, int to);
    }

    interface SelectValue<T> {
        T res(T a, T b, T c, T d);
    }

    interface Fraction {
        double res(double a, double b);
    }

    interface WeeksCount {

        int countWeek(Date from, Date to);
    }

    interface DaysCount {
        int countDays(Date from, Date to);

    }

    interface NameOfDay {
        String getNameByDate(DateTime date);
    }

    interface isLeapYear {
        boolean checkYear(int year);
    }

    interface MyLambda {
        String formatText(String text);
    }
}


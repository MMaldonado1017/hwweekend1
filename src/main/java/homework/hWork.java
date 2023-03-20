package homework;

public class hWork {
    public static void main(String[] args) {
        //question 1

        String firstName = "Miguel";
        String lastName = "Maldonado";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //Question 2
        int[] firstArray = {103, 23, 34, 41, 75};
        int[] secondArray = {66, 75, 18, 91, 120};
        int product = firstArray[3] * secondArray[1];
        firstArray[firstArray.length - 1] = 69;
        product /= firstArray[1];
        System.out.println("the final product is " + product);

        //Question 3
        int i = 0;
        String[] top3 = {"Rihanna", "Drake", "Lil Baby"};
        while (i < top3.length) {
            System.out.println(top3[i]);
            i++;
        }

        //Question6
        for (int m = 13; m <= 19; m++) {
            System.out.println(m);

        }

        //Question 7
        for (int p = 1; p <= 20; p++) {
            if (p % 2 != 0) {
                System.out.println(p);
            }

        }
//Question 8
        int grade = 90;
        System.out.println("Your grade is " + grade);
        if (grade >= 90 && grade <= 100) {
            System.out.println("You got an A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("You got a B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("You got a C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("You got a D");
        } else if (grade <= 59) {
            System.out.println("You got an F");
        }

        //Question 9

        int[] numbersArray = {2, 34, 7, 48, 0, 13, 24};
        int sum = 0;
        for (int f = 0; f < numbersArray.length; f++) {
            System.out.print(numbersArray[f] + " ");

            sum += numbersArray[f];

        }
        System.out.println("\nSum of all elements is " + sum);
        double average = (double) sum / numbersArray.length;
        System.out.println("Average of all elements is " + average);
//Question 10
      printNumbers();
      //Question 4
        learningJava();
    }
    //Question 4
    public static String learningJava() {
        return "Learning Java Is Fun";
    }

    public static void  printNumbers() {
        for (int m = 45; m >= 1; m--) {
            if (m % 3 == 0 && m % 5 == 0) {
                System.out.println("Year Up");
            } else if (m % 3 == 0) {
                System.out.println("Year");
            } else if ( m % 5 == 0) {
                System.out.println("Up");
            } else {
                System.out.println(m);
            }
        }
    }



}








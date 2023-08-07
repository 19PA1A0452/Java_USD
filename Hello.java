import java.util.Scanner;
class Hello{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        x=Math.round(x*100);
        x=x/100;
        y=Math.round(y*100);
        y=y/100;
        if(x==y){
            System.out.println("the two numbers are same");
        }
        else{
            System.out.println("the two numbers are different");
        }

        }

    }
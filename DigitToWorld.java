import java.util.Scanner;

public class DigitToWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number GreaterThan Zero");
        int n=sc.nextInt();
        Word(n);
    }
    public static  void Word(int n){
         String a1[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String a2[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String a3[]={"","","Twenty","Thirty","Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String a4[]={"","One Hundred","Two Hundred","Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred","Eight Hundred","Nine Hundred"};
        if(n<10){
            System.out.println(a1[n]);
        }else if(n<20){
            System.out.println(a2[n]);
        }else if(n<99){
              System.out.print(a3[n/10]+" ");
              Word(n%10);
        }
        else if(n<=999){
              System.out.print(a4[n/100]+" ");
              Word(n%100);
        }
         else if(n<=9999){
              System.out.print(a1[n/1000]+"thousand"+" ");
              Word(n%1000);
        }else if(n<=99999){
              System.out.print(a3[n/10000]);
              Word(n%10000);
        }
        else if(n<=999999){
              System.out.print(a4[n/100000]);
              Word(n%100000);
        }
    }
}

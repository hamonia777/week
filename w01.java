import java.util.*;

public class w01 {
    public static void main(String[] args) {
        //1.랜덤 숫자 만들기
        Scanner sc = new Scanner(System.in);
        int[] a= new int[3];
        int count=0;
        while(true){
            for(int i=0;i<3;i++) {
                a[i] = (int) (Math.random() * 10);
            }
            if(a[0]!=a[1] && a[1]!=a[2] && a[0] != a[2]){
                break;
            }
        }
        int s=0;
        int b=0;
        int[] arr= new int[3];
        while(true){
            String str= sc.next();
            String[] Arrays = str.split("");
            for(int i=0;i<=2;i++) {
                arr[i]=Integer.parseInt(Arrays[i]);
            }
            for(int i=0;i<=2;i++)
            {
                for(int j=0;j<=2;j++){
                    if(i == j && a[i]== arr[j]){
                        s++;
                    }
                    else if(i != j && a[i] == arr[j]){
                        b++;
                    }
                }
            }

            if(s==3){
                System.out.println(s+"S");
                System.out.println(count+"번 만에 맞히셨습니다");
                System.out.println("게임을 종료합니다");
                break;
            }
            else if(b==3){
                System.out.println(b+"B");
            }
            else {
                System.out.println(b + "B" + s + "s");
            }
        b=0;
        s=0;
        count++;

        }


    }
}

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayLyst {
    public static void main(String[] args) {
        Scanner a=new Scanner (System.in);
        String name="Hawa";
        System.out.println("nama : " +name);
        System.out.println("masukan kabupaten");
        String c1=a.next();
        System.out.println("kabupaten tujuan");
        String c2=a.next();
        System.out.println("apakah kamu siswa atau siswi (ya/tidak;");
        char A=a.next().charAt(0);
        String k1[]={"cisaat", "cibadak", "cipelang", "karang tengah", "cicurug", "sagaranten", "cidaun", "sukaraja"};
        int p[]=new int [7];
        ArrayList<Integer>M=new ArrayList<>();
        
        M.add(10000); M.add(15000); M.add(7500); M.add(5000); M.add(7500); M.add(600000);
        int r=0;
        int c=0;
        int price=0;
        for (int i=0;i<k1.length; i++){
            if(k1[i].equals(c1)){
                r=i;            
            }
        }
        for (int i = Math.min(r, c);i<Math.max(r,c);i++){
            price+=M.get(i);
        }
        if (A== 'Y' || A== 'Y'){
            price = price-(price*10)/100;
        }
        if ((r== 0 && c== 6) || (r== 6 && c== 0)){
            price = price- (price *5)/100;
        }
        System.out.println("tujuan: "+price);
        
    }
    
}

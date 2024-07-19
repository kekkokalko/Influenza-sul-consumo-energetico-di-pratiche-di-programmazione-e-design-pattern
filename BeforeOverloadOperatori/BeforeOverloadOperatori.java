import java.util.*;
import java.io.*;
import java.math.BigDecimal;


class BeforeOverloadOperatori {
    public static void main(String[] args){
        for(int i=0;i<1000000000;i++){
        int sum1= Math.addExact(1,2);
        int sum2=Math.addExact(3,4);
        double divisione1= Math.divideExact(sum1,sum2);
        int sottrazione1= (int) Math.subtractExact(1,2);
        int sottrazione2= (int) Math.subtractExact(3,4);
        int divisione2=Math.divideExact(sottrazione1,sottrazione2);
        int moltiplicazione = Math.multiplyExact((int) divisione1, divisione2);
        System.out.println(moltiplicazione);}
    }
}
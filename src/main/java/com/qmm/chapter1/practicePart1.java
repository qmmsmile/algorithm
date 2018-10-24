package com.qmm.chapter1;

import java.util.Random;

/**
 *
 * @author qinmengmei
 * @date 2018/9/29
 */
public class practicePart1 {

    /**
     * 1.1.1
     */
    public static void test111(){
        System.out.println("(0+15)/2 = " + (0+15)/2);
        System.out.println("true && false || true && true = " + (true && false || true && true));
    }

    /**
     * 1.1.2
     */
    public static void test112(){
        System.out.println("(1+2.236)/2 = " + (1+2.236)/2);
        System.out.println("1+2+3+4.0 = " + (1+2+3+4.0));
        System.out.println("4.1>=4 = " + (4.1>=4));
        System.out.println("1+2+\"3\" = " + (1+2+"3"));
    }

    /**
     * 1.1.3
     * @param args
     */
    public static void test113(String[] args){
        if (args.length > 0 && args.length == 3){
            String s1 = args[0];
            String s2 = args[1];
            String s3 = args[2];
            if (s1.equals(s2) && s2.equals(s3)){
                System.out.println("equal");
            }else {
                System.out.println("not equal");
            }
        }else {
            System.out.println("请输入三个整数！");
        }
    }

    /**
     * 1.1.5
     */
    public static void  test115(){
        Double x = 0.111;
        Double y = 0.999;
        if ( 0<x && x<1 &&  0<y && y<1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    /**
     * 1.1.6
     */
    public static void test116(){
        int f = 0;
        int g = 1;
        for (int i=0 ; i<15 ; i++){
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    /**
     * 1.1.7
     */
    public static void test117(){
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001){
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n",t);

        int sum = 0;
        for(int i=1 ; i<1000 ; i++){
            for (int j=0 ; j<i ; j++){
                sum++;
            }
        }
        System.out.println(sum);

        int sum2 = 0;
        for(int i=1 ; i<1000 ; i*=2){
            for (int j=0 ; j<i ; j++){
                sum2++;
            }
        }
        System.out.println(sum2);
    }

    /**
     * 1.1.8
     */
    public static void test118(){
        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char)('a'+4));
    }

    /**
     * 1.1.9
     */
    public static void test119(){
        String s = "";
        Integer N = 1213;
        for (int i=N ; i>0 ; i /= 2){
            s = (i%2) + s;
        }
        System.out.println(s);
        System.out.println(Integer.toBinaryString(N));
    }

    /**
     * 1.1.11
     */
    public static void test1111(){
        Boolean[][] b = new Boolean[6][6];
        Random r = new Random();
        for (int i=0 ; i<b.length ; i++){
            for (int j=0 ; j<b[i].length ; j++){
                b[i][j] = r.nextBoolean();
            }
        }
        for (int i=0 ; i<b.length ; i++){
            for (int j=0 ; j<b[i].length ; j++){
                if (b[i][j] == true) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * 1.1.12
     */
    public static void test1112(){
        int[] a = new int[10];
        for (int i=0 ; i<10 ; i++){
            a[i] = 9-i;
        }
        for (int i=0 ; i<10 ; i++){
            a[i] = a[a[i]];
        }
        for (int i=0 ; i<10 ; i++){
            System.out.println(a[i]);
        }
    }

    /**
     * 1.1.13
     */
    public static void test1113(){
        int[][] a = new int[5][7];
        Random r = new Random();
        for (int i=0 ; i< a.length ; i++){
            for (int j=0 ; j<a[i].length ; j++){
                a[i][j] = r.nextInt(100);
            }
        }
        for (int i=0 ; i< a.length ; i++){
            for (int j=0 ; j<a[i].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("转置之后。。。");
        for (int i=0 ; i< a[0].length ; i++){
            for (int j=0 ; j<a.length ; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 1.1.14
     * @param N
     * @return
     */
    public static int test1114(double N)
    {
        int k=0;
        if(N>0 && N<1){
            double count=1;
            while(count>=N){
                count*=1/2.0;
                k-=1;
            }
            return k+1;
        }else if(N>=1){
            int count=1;
            while(count<=N){
                count*=2;
                k+=1;
            }
            return k-1;
        }
        else
            return -1;
    }

    /**
     * 1.1.15
     */
    public static void test1115(int[] a , int m){
        int[] result = new int[m];
        for (int i=0 ; i<result.length ; i++){
            int count  = 0;
            for (int k=0 ; k<a.length ; k++){
                if (a[k] == i) count++;
            }
            result[i] = count;
        }
        System.out.println("转换后。。");
        for (int i=0 ; i<result.length ; i++){
            System.out.print(result[i]);
        }
    }

    /**
     * 1.1.16
     */
    public static String test1116(int n){
        if (n<=0) return "";
        return test1116(n-3) + n + test1116(n-2) + n;
    }

    /**
     * 1.1.18
     * @return
     */
    public static int test1118(int a , int b){
//        if(b == 0) return 0;
//        if(b%2 == 0) return test1118(a+a, b/2);
//        return test1118(a+a, b/2) + a;

        if(b == 0) return 1;
        if(b%2 == 0) return test1118(a*a, b/2);
        return test1118(a*a, b/2) + a;
    }

    /**
     * 1.1.19
     * @return
     */
    public static long test1119(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return test1119(n-1) + test1119(n-2);
    }

    /**
     * 1.1.20
     */
    public static double test1120(double N){
        // 0的阶乘和1的阶乘都为1
        if(N == 0 || N == 1) return 0.0;
        else {
            return Math.log(N)+test1120(N-1);
        }
    }

    /**
     * 1.1.22
     */
    public static int test1122(int key,int[] a,int lo,int hi,int level){
        for (int i=0 ; i<level ; i++){
            System.out.print(" ");
        }
        System.out.println("lo="+lo+",hi="+hi);
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if (key < a[mid]) return test1122(key,a,lo,mid-1,level+1);
        else if(key>a[mid]) return test1122(key,a,mid+1,hi,level+1);
        else return mid;
    }

    /**
     * 1.1.26
     * @return
     */
    public static void test1126(){
        int a = 10;
        int b = 2;
        int c = 6;
        int t = 0;
        if (a > b){
            t = a;
            a = b;
            b = t;
        }
        if (a > c){
            t = a;
            a = c;
            c = t;
        }
        if (b > c){
            t = b;
            b = c;
            c = t;
        }
        System.out.println("a:"+a+ " b:"+b + " c:"+c);
    }

    /**
     * test1.1.27
     */
    public static double test1127(int N, int K, double P,int count){
        System.out.println(count);
        if (N == 0 && K == 0) return 1.0;
        if (N < 0 || K <0) return 0.0;
        return (1.0 - P) * test1127(N - 1, K, P,count+1) + P * test1127(N - 1, K - 1, P,count+1) ;
    }

    /**
     * 1.1.29
     */
    public static void test1129(int key , int a[]){
        int count1 = 0;
        int count2 = 0;
        for (int i:a) {
            if(i < key) count1++;
            if( i == key) count2++;
        }
        System.out.println("数组中小于key的元素个数：" + count1);
        System.out.println("数组中等于key的元素个数：" + count2);
    }

    /**
     * test1.1.30
     */
    public static void test1130(){
        boolean b[][] = new boolean[6][6];
        for(int i=0; i<b.length ; i++ ){
            for(int j=0; j<b[i].length ; j++ ){
                if (isCoprime(i,j)){
                    b[i][j] = true;
                } else{
                    b[i][j] = false;
                }
            }
        }

        for(int i=0; i<b.length ; i++ ){
            for(int j=0; j<b[i].length ; j++ ) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isCoprime(int x,int y) {
        //1和1互质
        if(x==1 && y==1)
            return true;
        //非正整数都不存在互质的说法
        else if(x<=0 || y<=0 || x==y)
            return false;
        //1和任何正整数都互质
        else if(x==1 || y==1)
            return true;
        else{
            int tmp=0;
            //使用求商判断法，如果输入的x<y，第一次循环会交换x和y的位置
            while(true){
                tmp=x%y;
                if(tmp==0){
                    break;
                }else{
                    x=y;
                    y=tmp;
                }
            }
            //最大公约数为1,所以互质
            if(y==1)
                return true;
            //最大公约数大于1，所以不互质
            else
                return false;
        }
    }

    public static void main(String[] args) {
//        test111();
//        test112();
//        test113(args);
//        test115();
//        test116();
//        test117();
//        test118();
//        test119();
//        test1111();
//        test1112();
//        test1113();
//        System.out.println(test1114(0.9));

//        int[] a = new int[5];
//        Random r = new Random();
//        for (int i=0 ; i<a.length ; i++){
//            a[i] = r.nextInt(10);
//            System.out.print(a[i]);
//        }
//        test1115(a,10);

//        System.out.println(test1116(6) );

//        System.out.println(test1118(2,25));
//        System.out.println(test1118(3,11));

//        for (int n=0 ; n<100 ; n++){
//            System.out.println(n + " " + test1119(n));
//        }
        // 改编之后
//        long[] result = new long[100];
//        for (int n=0 ; n<100 ; n++){
//            long print  = 0;
//            if (n > 1 && result[n-1] != 0){
//                print += (result[n-1] + result[n-2]);
//            }else {
//                print = test1119(n);
//            }
//            result[n] = print;
//            System.out.println(n + " " + print);
//        }

//        System.out.println(test1120(2));

//        int[] a = new int[]{1,2,6,8,9,5,4,7,3,0};
//        System.out.println(test1122(2,a,0,a.length,0));

//        test1126();

//        test1127(100, 50, 0.25, 0);

//        test1129(5 , new int[]{2,2,3,4,5,5,5,7,9,10,18,18,18,25,32,33,34,46});

//        test1130();
    }
}

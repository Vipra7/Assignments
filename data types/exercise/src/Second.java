class Second {
    public static void main(String[] args) {
        
        int a,b,c,d,e,f;
        int num1 = 1, num2 = 2, num3 = 9;
        boolean result;
        
        a=12;
        b=23 ;
        c=a+b;
        
        
        d=12;
        e=0;
        f=d+e;
        System.out.println(c);
        System.out.println(f);
        result = (num1 > num2) || (num3 > num1);
        System.out.println(result);
        result = (num1 > num2) && (num3 > num1);
        System.out.println(result);



    }
}
class TestPassByValue {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        System.out.println("Before invoking the swap method num1 is " +num1+ " and num2 is " +num2);
        swap(num1,num2);
        System.out.println("After invoking the swap method num1 is " +num1+ " and num2 is " +num2);


    }
    public static void swap(int x,int y){
        System.out.println("inside the swap method ");
        System.out.println("Before swaping num1 is " +x+ " and num2 is "+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After swaping num1 is " +x+ " and num2 is"+y);

    }
}

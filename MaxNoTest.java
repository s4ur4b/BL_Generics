public class MaxNoTest {

    public static Integer findMax(Integer a, Integer b, Integer c) {
        Integer max = a;
        if(b.compareTo(max)> 0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        System.out.printf("The max of three numbers %s %s %s is : %s \n",a,b,c,max);
        return max;
    }
    public static void main(String[] args) {
        //TC1.1 max no. at first
        Integer int1 = 89,int2 = 85,int3 = 26;
        Integer max = findMax(int1,int2,int3);

        //TC1.2 max no. at second
        Integer int4 = 37,int5 = 65,int6 = 56;
        Integer max1 = findMax(int4,int5,int6);

        //TC1.3 max no. at third
        Integer int7 = 36,int8 = 75,int9 = 96;
        Integer max2 = findMax(int7,int8,int9);
    }
}

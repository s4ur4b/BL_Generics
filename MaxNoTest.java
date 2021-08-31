public class MaxNoTest {

    //returns the max value of three floats
    public static Float findMax(Float a, Float b, Float c) {
        Float max = a;
        if(b.compareTo(max)> 0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        System.out.printf("The max of three numbers %s %s %s is : %s \n",a,b,c,max);
        return max;
    }
    public static void main(String[] args) {
        //TC1.1 max no. at first
        Float float1 = 55.65f, float2 = 55.7f,float3 = 55.90f;
        Float max = findMax(float1,float2,float3);

        //TC1.2 max no. at second
        Float float4 = 37.56f,float5 = 65.23f,float6 = 56.125f;
        float max1 = findMax(float4,float5,float6);

        //TC1.3 max no. at third
        Float float7 = 36f,float8 = 75f,float9 = 96f;
        float max2 = findMax(float7,float8,float9);
    }
}

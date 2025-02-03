public class Deez {

    public static void main(String []args) {
        int[] hhhhaaaa = {1,2,4,554,3,234,620,4628,6969,97456,44444444,24,5426,835,41,864,367,136,836,974,245,2356,54,4,444,4,4,4,5,727,47,97,45,62,52,497,69,7865,67,24,642,7,368,8,758,4};
        int sum = 0; //find sum
        for (int i : hhhhaaaa) {
            sum += i;
        } System.out.println("sum: " + sum);

        double egg = 0;
        for (int c : hhhhaaaa) {//find avg
            egg += c;
        }
        egg /= hhhhaaaa.length;
        System.out.println("avg: " + egg);
    
        int littlemac = hhhhaaaa[0];
        int bigmac = hhhhaaaa[0];
        for (int rice : hhhhaaaa) {
            
            if (littlemac > rice) {
                littlemac = rice; //find min
            } 
            if (bigmac < rice) {
                bigmac = rice; //find max
            }
        }System.out.println("min: " + littlemac);
        System.out.println("max: " + bigmac);

      
        int[] deez = new int[bigmac+1]; //find mode
        for (int nuts : deez) {
            deez[nuts]++;
        }
    }
}

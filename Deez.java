import java.util.ArrayList;

public class Deez {

    public static void main(String []args) {
        int[] hhhhaaaa = {1,2,4,554,3,234,620,4628,6969,97456,44444444,24,5426,835,41,864,367,136,836,974,245,2356,54,4,444,4,4,4,5,727,47,97,45,62,52,497,69,7865,67,24,642,7,368,8,758,4};
        int sum = 0; //find sum
        for (int i : hhhhaaaa) {
            sum += i;
        } System.out.println("sum: " + sum);

        double egg = 0.0d;
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
        int gggggg = 0;
        for (int rice : deez) {
            
           
            if (gggggg < rice) {
                gggggg = rice; //find max
            }
        }
        int kjjhg = 0;
        for (int i = 0;i < deez.length;i++) {
            if (deez[i] == gggggg) {
                kjjhg = i;
            }
        }
        System.out.println("mode: " + kjjhg);


        //==============================================arraylist timmme

        ArrayList<Integer> shrek = new ArrayList<Integer>();
        for (int i = 0; i < ((int) (Math.random() * 6969)); i++) {
            shrek.add( (int) (Math.random() * 70));
        }
        System.out.println(shrek);
        System.out.println(shrek.size());

        //find sum
        int mon = 0;
        for (int my : shrek) {
            mon += my;
        }
        System.out.println(mon);
        
        //find avg
        float tamago = 0.0f;
        for (int p : shrek) {
            tamago += p;
        }
        tamago /= shrek.size();
        System.out.println(tamago);

        //find za min ando max
        int minmin = shrek.get(0);
        int largemac = shrek.get(0);
        for (int o : shrek) {
            if (minmin > o) {
                minmin = o;
            }
            if (largemac < o) {
                largemac = o;
            }
        }
        System.out.println(minmin);
        System.out.println(largemac);

//find median'
        ArrayList<Integer> donkey = new ArrayList<Integer>();
        donkey.addAll(shrek);
        int c = 1;
        if (donkey.size() % 2 == 0) {
            c++;
        }
        
        donkey.sort(null);
        for (;donkey.size() > c;) {
            donkey.remove(0);
            donkey.remove(donkey.size()-1);
        }
        donkey.add(donkey.get(0));
        if (c == 2) {
            donkey.set(0, (int)( (donkey.get(1) + donkey.get(0))/2));
        }
        System.out.println(donkey.get(0));
    }
}

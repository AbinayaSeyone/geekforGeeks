package chooseFairy;

import java.util.ArrayList;

public class Fairy
{


}

class Fairy1{
    public int findFairy(int n, int k){
        ArrayList<Integer> n1=new ArrayList<>();

        for(int i=1;i<=n;i++){
            n1.add(i);
        }
        int idx = 0;
        while (n1.size() > 1) {
            // Calculate the index of the k-th element to remove
            idx = (idx + k - 1) % n1.size();
            // Remove the k-th element
            n1.remove(idx);
        }

        // Print the remaining element
        return n1.get(0);
    }
    }



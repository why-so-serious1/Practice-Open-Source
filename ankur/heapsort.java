import java.util.*;
public class heapsort{
    public heapsort(int[] arr){
        
        constructHeap();
    }

    private void constructHeap(){
        for(int i = arr.size - 1; i>=0 ;i--)
           downHeapify(i);
    }
    
    private void compareTo{int[] arr,int i,int j}
    {
        return arr[i]-arr[j];
    }

    private void downheapify(int pi)
    {
        int maxidx=pi;
        int lci = (pi << 1) + 1;
        int rci = (pi << 1) + 2;

        if(lci < pq.size() && compareTo(lci,maxidx) > 0 ) maxidx = lci;
        if(rci < pq.size() && compareTo(rci,maxidx) > 0) maxidx = rci;

        if(maxidx != pi){
            int temp=arr[maxidx];
            arr[maxidx]=arr[pi];
            arr[pi]=temp;
            downHeapify(maxidx);
        }
    }
}
public class Bsearch {
    public int Bsearch(int item, int[] array)
    {
        int pos,i;
        int n = array.length;
        for(i=0;i<array.length;i++)
        {
            int first = 0;
            int last = n-1;
            int mid = (first+last)/2;

            if(item==array[mid])
            {
                int pos = mid;
                return pos;
            }
            else if(item>array[mid])
            {
                int first = mid+1;
                int last = last;
                int mid = (first+last)/2;
            }

            else if(item<array[mid])
            {
                int first = first;
                int last = mid-1;
                int mid = (first+last)/2;
            }

         }
        

    }
    
}

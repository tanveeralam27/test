public class Search {
    public int search(int item, int[] array)
    {
        int pos,i;
        for(i=0;i<array.length;i++)
        {
            if(item==array[i]){
            pos = i;
            return pos;
            }
         }
        return -1;

    }
    
}

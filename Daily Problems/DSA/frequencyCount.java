public static void frequencyCount(int arr[], int N, int P) {
        
    HashMap<Integer,Integer> hs = new HashMap<>();
    for(int i=0;i<N;i++)
    {
        hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
    }
    
    
    for(int i=0;i<N;i++)
    {
        if(!hs.containsKey(i+1))
        {
            arr[i]=0;
        }else{
            arr[i]=hs.get(i+1);
        }
    }
    
    
}
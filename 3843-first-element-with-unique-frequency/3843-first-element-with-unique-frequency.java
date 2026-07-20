class Solution {
    public int firstUniqueFreq(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        if(nums.length == 1){
            return nums[0];
        }


        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }else{
                q.offer(nums[i]);
                map.put(nums[i],1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        
        while(!q.isEmpty()){
            list.add(q.remove());
        }

        ArrayList<Integer> freq = new ArrayList<>();
        int l=0;
        for(Integer i: map.keySet()){
            freq.add(map.get(list.get(l)));
            l++;
        }
        
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int i=0;i<freq.size();i++){
            freqMap.put(freq.get(i),freqMap.getOrDefault(freq.get(i),0)+1);
        }

        for(int i=0;i<list.size();i++){
            int num = list.get(i);
            int num_freq = freq.get(i);
            if(freqMap.get(num_freq) == 1){
                return num;
            }
        }

        return -1;
    }
}
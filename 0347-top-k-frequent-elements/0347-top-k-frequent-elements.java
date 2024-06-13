class Solution {
    // O(N)
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freqSorted = new List[nums.length +1];
	    Map<Integer, Integer> frequencyCount = new HashMap();
	    List<Integer> res = new ArrayList();

        for(int n:nums){
            frequencyCount.put(n,frequencyCount.getOrDefault(n,0)+1);
        }

        for(int key:frequencyCount.keySet()){
            if(freqSorted[frequencyCount.get(key)] == null)
		       freqSorted[frequencyCount.get(key)] = new ArrayList();
	        freqSorted[frequencyCount.get(key)].add(key);
        }

        for(int i = freqSorted.length - 1; i >= 0 && res.size() < k; i--)
	   if(freqSorted[i] != null){
			res.addAll(freqSorted[i]);
  }
        return res.stream().mapToInt(i->i).toArray();
    }
}
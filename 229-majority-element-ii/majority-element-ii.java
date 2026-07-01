
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int required_count = nums.length / 3;
        for(int key:map.keySet()){
            if(map.get(key) > required_count) list.add(key);
        }
        return list;
        
    }
}
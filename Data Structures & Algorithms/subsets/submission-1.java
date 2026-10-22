class Solution {
    static void rec(List<List<Integer>> al,List<Integer> sl,int[] nums,int ind){
        if(ind==nums.length){
            al.add(new ArrayList<>(sl));
            return;
        }
        sl.add(nums[ind]);
         rec(al,sl,nums,ind+1);
        sl.remove(sl.size()-1);
        rec(al,sl,nums,ind+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al =new ArrayList<>();
        List<Integer> sl=new ArrayList<>();
        rec(al,sl,nums,0);
        return al;
    }
}

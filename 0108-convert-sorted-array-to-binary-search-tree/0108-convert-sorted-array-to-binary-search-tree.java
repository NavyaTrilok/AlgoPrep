/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans = helper(nums,0,nums.length-1);
        return ans;
    }
    public TreeNode helper(int[] nums,int start, int end){
        if(end < start)
            return null;
        int mid = (start+end)/2;
        TreeNode newnode = new TreeNode(nums[mid]);
        newnode.left = helper(nums, start, mid-1);
        newnode.right = helper(nums, mid+1, end);
        return newnode;
    }
}
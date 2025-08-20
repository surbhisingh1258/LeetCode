// Last updated: 8/20/2025, 10:07:48 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        boolean leftToright =true;
        while(!que.isEmpty()){
            int levelsize = que.size();
            LinkedList<Integer> level = new LinkedList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode curr = que.poll();
                if(leftToright){
                    level.addLast(curr.val);

                }
                else{
                    level.addFirst(curr.val);
                }
                if(curr.left!=null)que.offer(curr.left);
                if(curr.right!=null)que.offer(curr.right);
            }
            res.add(level);
            leftToright = !leftToright;

        }
        return res;
    }
}
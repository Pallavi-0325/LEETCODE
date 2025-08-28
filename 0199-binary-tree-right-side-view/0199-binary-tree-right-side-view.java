
class Solution {

    public static List<Integer> rightSideHelper(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null)return result;

        Queue<TreeNode> memory = new LinkedList<>();

        int level = 0;
        memory.offer(root);

        while(!memory.isEmpty()){
            int size = memory.size();

            for(int i=0;i< size;i++){
                TreeNode temp = memory.poll();
                if(i == size-1) result.add(temp.val);
                if(temp.left != null)memory.offer(temp.left);
                if(temp.right != null)memory.offer(temp.right);
            }            
            level++;
        }

        return result;
    }

    public List<Integer> rightSideView(TreeNode root) {
        return rightSideHelper(root);
    }
}

public class invert_tree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(11);
        TreeNode head = root;
        for(int i = 0; i < 3; i++){
            TreeNode temp1 = new TreeNode(i);
            TreeNode temp2 = new TreeNode(i+1);
            root.left = temp1;
            root.right = temp2; 
            root = root.left;
        }
        for(int i = 3; i < 6; i++){
            TreeNode temp1 = new TreeNode(i);
            TreeNode temp2 = new TreeNode(i+1);
            root.left = temp1;
            root.right = temp2; 
            root = root.right;
        }

        in_order(head);
        in_order(invert(head));
    }

    public static void in_order(TreeNode root){
        if(root == null) return;

        in_order(root.left);
        System.out.println(root.val);
        in_order(root.right);
    }

    public static TreeNode invert(TreeNode root){
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = invert(root.right);
        root.right = invert(temp);
        return root;
    }
}

class TreeNode{
    TreeNode left, right;
    int val;
    TreeNode(int v){
        val = v;
    }
}

class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list = new ArrayList<>();
      left(root,0,list);
      return list;
    }
    public void left(Node root , int level , ArrayList<Integer> list){
        if(root == null){
            return;
        }
        if(level == list.size()){
            list.add(root.data);
            
        }
        left(root.left , level+1 , list);
        left(root.right , level+1 , list) ;
        
    }
}
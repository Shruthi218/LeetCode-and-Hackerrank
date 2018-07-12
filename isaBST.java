public boolean isaBST(Node root,int min,int max) {

if(root==null)
   return true;
   
   if(root.data<min && root.data>=max) {
      return false;
    }
    else {
    return isaBST(root.left,min,root.data) && isaBST(root.right,root.data,max)
    }
 }
      
      

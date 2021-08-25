/* First attempt
Note:
binary tree
unbalanced tree


   2 <- root = root.right
 /  \
1    3 <- temp

     2
   /  \
  1    3

  - check if it's balanced

  root: 3
  - save root as temp
  - remove root
  - move other node to root
     root.left or right
  - add temp
*/

package za.co.kholofelo.algos.sort;

public class TreeSort
{

  private TreeNode root;
  public static void main(String[] args)
  {
    System.out.println("Running a Binary Sort");
    int[] items = new int[]{6, 7, 8, 14, 10, 11, 52, 71, 0, 9, 4, 36};

    TreeSort tree  = new TreeSort();
    tree.treeInsert(items);
    tree.inorderRec(tree.root);

  }

  private TreeNode treeInsert(TreeNode rootNode, int value)
  {
    if (rootNode == null)
    {
      rootNode = new TreeNode(value);
      return rootNode;
    }

    if (value < rootNode.getValue())
    {
      rootNode.setLeft(treeInsert(rootNode.getLeft(), value));
    }
    else
    {
      rootNode.setRight(treeInsert(rootNode.getRight(), value));
    }

    return rootNode;
  }

  private void inorderRec(TreeNode root)
  {
    if (root != null)
    {
      inorderRec(root.getLeft());
      System.out.print(root.getValue() + " ");
      inorderRec(root.getRight());
    }
  }
  private void treeInsert(int arr[])
  {
    for(int i = 0; i < arr.length; i++)
    {
      insert( arr[i]);
    }

  }

 private void insert(int key)
  {
    root = treeInsert(root, key);
  }

}

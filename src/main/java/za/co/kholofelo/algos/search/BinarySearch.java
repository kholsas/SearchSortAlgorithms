package za.co.kholofelo.algos.search;

public class BinarySearch
{
  public static void main(String[] args)
  {
    int[] items = new int[]{0, 1, 1, 2, 3,4, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
    int searchFor = 4;
    System.out.println("Calling Binary Search: Searching for " + searchFor);
    int searchIndex = new BinarySearch().search(items, searchFor, 0, items.length - 1);
    System.out.println("Done searching, search index for " + searchFor + " is " + searchIndex);
  }

  private int search(int[] items, int searchFor, int leftIndex, int rightIndex)
  {

    if (rightIndex >= leftIndex)
    {
      int mid =  (leftIndex + rightIndex) / 2;

      int itemAtMid = items[mid];
      if (itemAtMid == searchFor)
      {
        return mid;
      }
      if (itemAtMid > searchFor)
      {
        return search(items, searchFor, leftIndex, mid - 1);
      }
      return search(items, searchFor, mid + 1, rightIndex);
    }
    return -1;
  }
}

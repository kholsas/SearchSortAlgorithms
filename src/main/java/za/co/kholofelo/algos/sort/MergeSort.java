package za.co.kholofelo.algos.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort
{
  public static void main(String[] args)
  {
    System.out.println("Running a Binary Sort");
    int[] items = new int[]{6, 7, 8, 14, 10, 11, 52, 71, 0, 9, 4, 36};

    int[] sortedItems = new MergeSort().sort(items);

    Arrays.stream(sortedItems).forEach(item -> System.out.print(item + ","));

  }

  private int[] sort(int[] items)
  {

    if (items.length == 2)
    {
      //check if you should swap
      if (items[0] > items[1])
      {
        int temp = items[1];
        items[1] = items[0];
        items[0] = temp;
        return items;
      }
    }
    if (items.length == 1)
    {
      return items;
    }

    int mid = items.length / 2;

    int[] firstHalf = new int[mid];
    int[] secondHalf = new int[mid];

    for (int i = 0; i < firstHalf.length; i++)
    {
      firstHalf[i] = items[i];
    }

    for (int i = 0; i < secondHalf.length; i++)
    {
      secondHalf[i] = items[mid + i];
    }
    firstHalf = sort(firstHalf);
    secondHalf = sort(secondHalf);
    return merge(firstHalf, secondHalf);
  }

  private int[] merge(int[] firstHalf, int[] secondHalf)
  {
    List<Integer> mergedList = new ArrayList<>();

    for (int value : firstHalf)
    {
      mergedList.add(value);
    }
    for (int value : secondHalf)
    {
      mergedList.add(value);
    }

    int[] mergedArray = new int[mergedList.size()];

    for (int i = 0; i < mergedArray.length; i++)
    {
      mergedArray[i] = mergedList.get(i);
    }
    return mergedArray;
  }
}

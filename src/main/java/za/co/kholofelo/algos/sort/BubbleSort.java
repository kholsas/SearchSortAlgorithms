package za.co.kholofelo.algos.sort;

import java.util.Arrays;

public class BubbleSort extends Sorter
{
  public static void main(String[] args)
  {
    System.out.println("--- Bubble Sort Start ---");
    new BubbleSort().run();
    System.out.println("--- Bubble Sort End ---");
  }

  @Override
  public void sort(int[] items)
  {
    boolean swappedAgain;
    for (int i = 0; i < items.length - 1; i++)
    {
      swappedAgain = false;
      for (int j = i + 1; j < items.length; j++)
      {
        if (items[j] < items[i])
        {
          //swap
          swappedAgain = true;
          int tempValue = items[j];
          items[j] = items[i];
          items[i] = tempValue;
        }
      }
      if (!swappedAgain)
      {
        break;
      }
    }

    Arrays.stream(items).forEach(System.out::println);
  }
}

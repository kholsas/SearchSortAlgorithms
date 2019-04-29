package za.co.kholofelo.algos.sort;

import java.util.Arrays;

public class SelectionSort extends Sorter
{

  public static void main(String[] args)
  {
    System.out.println("--- Selection Sort Start ---");
    new SelectionSort().run();
    System.out.println("--- End Of Selection Sort ---");
  }

  @Override
  public void sort(int[] items)
  {
    for (int i = 0; i < items.length - 1; i++)
    {
      int minIndex = i;
      for (int j = i + 1; j < items.length; j++)
      {
        if (items[j] < items[minIndex])
        {
          minIndex = j;
        }
      }
      //swap values
      int tempValue = items[minIndex];
      items[minIndex] = items[i];
      items[i] = tempValue;
    }

    Arrays.stream(items).forEach(System.out::println);
  }
}

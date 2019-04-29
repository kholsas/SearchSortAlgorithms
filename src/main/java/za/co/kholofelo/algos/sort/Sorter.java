package za.co.kholofelo.algos.sort;

public abstract class Sorter
{

  protected void run()
  {
    int[] items = new int[]{6,7,8,14,10,11, 52, 71, 0, 9, 4, 36, };
    sort(items);
  }

  abstract void sort(int[] items);
}

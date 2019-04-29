package za.co.kholofelo.algos.search;

public class JumpSearch
{
  public static void main(String[] args)
  {
    int[] items = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
    int searchFor = 55;
    System.out.println("Calling Jump Search: Searching for " + searchFor);
    int searchIndex = new JumpSearch().search(searchFor, items);
    System.out.println("Done searching, search index for " + searchFor + " is " + searchIndex);
  }

  private int search(int keyToSearchFor, int[] items)
  {
    int increment = (int) Math.floor(Math.sqrt(items.length));
    int currentStep = increment;
    int previousStep = currentStep;

    while (currentStep < items.length)
    {
      int currentItem = items[currentStep];
      if (currentItem > keyToSearchFor)
      {
        //at this point we realise that we have overstepped, so we gonna go back to do a linear search
        for (int i = previousStep; i < currentStep; i++)
        {
          if (items[i] == keyToSearchFor)
          {
            return i;
          }
        }
      }
      previousStep = currentStep;
      currentStep += increment;
    }
    return -1;
  }
}

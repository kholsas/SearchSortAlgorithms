package za.co.kholofelo.algos.datastructure.tree;

import java.util.Objects;
import java.util.Optional;

public class TrieStructure
{
  private TrieNode rootNode = new TrieNode(' ');

  public static void main(String[] args)
  {
    TrieStructure structure = new TrieStructure();
    structure.insert("String");
    structure.insert("Sting");
    structure.insert("Stop");

    structure.search("Stop");
    structure.search("Start");
  }


  private boolean search(String searchTerm)
  {

    TrieNode currentNode = rootNode;

    for (Character currentChar : searchTerm.toCharArray())
    {
      currentNode = currentNode.getChildren().stream().filter(node -> node.getNodeValue() == currentChar).findFirst().orElse(null);

      if (currentNode == null)
      {
        System.out.println("Search terminated at Node with value, " + currentChar);
        return false;
      } else {
        System.out.println("Found Char, " + currentChar);
      }
    }
    return true;
  }

  private void insert(String inputValue)
  {
    TrieNode currentNode = rootNode;
    Optional<TrieNode> foundNode;

    for (Character currentCharToInsert : inputValue.toCharArray())//String, Sting
    {

      if (!Objects.equals(currentNode.getNodeValue(), currentCharToInsert))
      {

        foundNode = currentNode.getChildren().stream().filter(aByte -> aByte.getNodeValue() == currentCharToInsert).findFirst();

        if (foundNode.isPresent())
        {
          currentNode = foundNode.get();
          System.out.println("Existing Node: " + currentNode.getNodeValue());
        }
        else
        {
          TrieNode newTrieNode = new TrieNode(currentCharToInsert);
          currentNode.getChildren().add(newTrieNode);
          currentNode = newTrieNode;
          System.out.println("Added: " + ((char) newTrieNode.getNodeValue()));
        }
      }
    }
  }

}

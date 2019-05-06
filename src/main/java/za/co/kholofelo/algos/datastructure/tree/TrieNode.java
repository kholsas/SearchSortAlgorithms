package za.co.kholofelo.algos.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class TrieNode
{
  private char nodeValue;
  private List<TrieNode> children = new ArrayList<>();

  public TrieNode(char nodeValue)
  {
    this.nodeValue = nodeValue;
  }

  public char getNodeValue()
  {
    return nodeValue;
  }

  public void setNodeValue(char nodeValue)
  {
    this.nodeValue = nodeValue;
  }

  public List<TrieNode> getChildren()
  {
    return children;
  }

  public void setChildren(List<TrieNode> children)
  {
    this.children = children;
  }

  @Override
  public String toString()
  {
    return "TrieNode{" +
        "nodeValue=" + nodeValue +
        ", children=" + children +
        '}';
  }
}

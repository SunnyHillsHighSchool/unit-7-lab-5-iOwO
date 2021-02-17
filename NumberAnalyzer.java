//(c) A+ Computer Science
//www.apluscompsci.com
//Name Wesley Truong

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[] n)
  {
    list = new ArrayList<Number>();
    for(int a : n)
     {
       list.add(new Number(a));
     }
  }

	//write count odds
  public int countOdds()
  {
    int count = 0;
    for(int i = 0; i < list.size(); i++)
    {
      if (list.get(i).isOdd())
        count++;
    }
   return count;
  }

	//write count evens
  public int countEvens()
  {
    int count = 0;
    for(int i = 0; i < list.size(); i++)
    {
      if (!(list.get(i).isOdd()))
        count++;
    }
   return count;
  }
	//write count perfects
	  public int countPerfects()
  {
    int count = 0;
    for(int i = 0; i < list.size(); i++)
    {
      if (list.get(i).isPerfect())
        count++;
    }   
    return count;
  }
	//write a toString
    public String toString()
  {
    return " ";
  }
}
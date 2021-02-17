//(c) A+ Computer Science
//www.apluscompsci.com
//Name Wesley Truong


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{
  //private instance variable (must be an Integer)
  private int num;

  //constructors
  public Number()
  {
    num = 0;
  }

  public Number(int n)
  {
    num = n;
  }

  //getter method
  public Integer getNum()
  {
    return num;
  }

  //setter method
  public void setNum(int n)
  {
    num = n;
  }

  //isOdd method
  public boolean isOdd()
  {
    if (num % 2 != 0)
      return true;
    else
      return false;
  }

  //isPerfect method
  public boolean isPerfect()
  {
    int total = 0;
    for (int i = 1; i < num; i++)
    {
      if ((num % i) == 0)
        total = total + i;
    }
    if (total == num)
      return true;
    else
      return false;
  }

  //toString
  public String toString()
  {
    return num + " ";
  }
}
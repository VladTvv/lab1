import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0;
		for (String arg: args) 
		{
			//String[] parts = arg.split(" ");
			if (arg.equals("Tea")) 
			{
				System.out.println("Введите цвет чая");
				Scanner in = new Scanner(System.in);
				String color = in.nextLine();
			    breakfast[itemsSoFar] = new Tea(color);
			}
			else if(arg.equals("Cheese"))
			{
				breakfast[itemsSoFar] = new Cheese();
			}
			else if (arg.equals("Apple"))
			{
				System.out.println("Введите размер яблока");
				Scanner in = new Scanner(System.in);
				String size = in.nextLine();
			    breakfast[itemsSoFar] = new Apple(size);
			}
			itemsSoFar++;
			
		}
		
		Food food = new Tea();
        System.out.println(food + ": " + countFoods(breakfast, food));
        printFoods(breakfast);
				
		for (Food item: breakfast)
	    {
			if (item!=null)
			    item.consume();
			else
			    break;
		}
		
	}
	
	static Integer countFoods(Food[] breakfast, Food food) 
	{
        Integer count = 0;
        for(int i = 0; i < breakfast.length; i++) 
        {
            if(food.equals(breakfast[i]))
            {
                count++;
            }
        }
        return count;
    }

    static void printFoods(Food[] breakfast)
    {
        int c = 0;
        int a = 0;
        int t = 0;
        for(int i = 0; i < breakfast.length; i++) 
        {

            if(breakfast[i] instanceof Cheese)
            {
                c++;
            }
            else if (breakfast[i] instanceof Tea)
            {
                t++;
            }
            else if(breakfast[i] instanceof Apple)
            {
            	a++;
            }
        }
        System.out.println("Cheese - " + c);
        System.out.println("Tea - " + t);
        System.out.println("Apple - " + a);
    }

}

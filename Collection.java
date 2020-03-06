import java.util.*;
import java.util.stream.Stream;
class Collection
{
    private static<T>void getStream(List<T>list)
    {
        Stream<T>stream=list.stream();
        Iterator<T>it=stream.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
    public static void main(String[] args)
    {
        List<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter number:");
            int num=sc.nextInt();
            list.add(num);
        }
            getStream(list);
            System.out.println("Enter the index no. to be deleted");
            int del=sc.nextInt();
            list.remove(del);
            System.out.println("after removing list is :");
            getStream(list);
        }
    }

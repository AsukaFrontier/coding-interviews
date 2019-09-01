package ReOrderArray;
import java.util.ArrayList;
public class SolutionRevise //
{
    public void reOrderArray(int[] array)
    {
        ArrayList<Integer> oddArray= new ArrayList<>();
        ArrayList<Integer> evenArray= new ArrayList<>();
        for(int outerIndex= 0;outerIndex<array.length;outerIndex++)
            if(array[outerIndex]%2==1)
                oddArray.add(array[outerIndex]);
            else
                evenArray.add(array[outerIndex]);
        for(int oddArrayIndex= 0;oddArrayIndex<oddArray.size();oddArrayIndex++)
            array[oddArrayIndex]= oddArray.get(oddArrayIndex);
        for(int evenArrayIndex= 0;evenArrayIndex<evenArray.size();evenArrayIndex++)
            array[evenArrayIndex+oddArray.size()]= evenArray.get(evenArrayIndex);
    }
}

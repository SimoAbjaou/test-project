package test;

import org.adneom.ListPartition;
import org.junit.*;
 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestPartition {

    private static List<Integer> inputList = null;
    private static List<List<Integer>> expectedList = null;


    @BeforeClass
    public static void beforeclass(){
        //initialiser inputList
        inputList = new ArrayList<>();

        //initialiser outputList
        expectedList = new ArrayList<>();
        int i=1;

        while(i<=5){
            inputList.add(i);
            i++;
        }
        System.out.println("inputList to test :" +inputList.toString()+"\n");

    }

    @After
    public void afterMethode(){
        System.out.println("test réussite \n");
    }

    @Test
    public void testCase1() {

        expectedList.clear();
        //outputList expected [[1, 2], [3, 4], [5]]
        expectedList.addAll(Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4),Arrays.asList(5)));
        System.out.println("outputList 1 expected :" +expectedList.toString());
        assertEquals(ListPartition.partition(inputList, 2),expectedList);

    }

    @Test
    public void testCase2() {

        expectedList.clear();
        expectedList.addAll(Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5)));
        //outputList expected [[1, 2], [3, 4], [5]]
        System.out.println("outputList 2 expected :" +expectedList.toString());
        assertEquals(ListPartition.partition(inputList, 3),expectedList);

    }

    @Test
    public void testCase3() {

        expectedList.clear();
        expectedList.addAll(Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3),
                Arrays.asList(4), Arrays.asList(5))); //outputList expected [[1], [2], [3], [4], [5]]
        System.out.println("outputList 3 expected :" +expectedList.toString());
         assertEquals(ListPartition.partition(inputList, 1),expectedList);

    }
}

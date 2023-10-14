public class randTest {
    
    public randTest(){
        int num = (int)Math.floor(Math.random()*(5));

        for (int i=0;i<num;i++){
            System.out.println("Test case #"+(i+1)+" [");
            testCaseGen();
            System.out.println("]");
        }
    }

    public void testCaseGen(){
        double correct[];
        double rand[];
        int length;

        length = (int)Math.floor(Math.random()*101);
        correct = new double[length];
        rand = new double[length];

        for (int i=0; i<length;i++){
            rand[i]=-1;
            if (i==0){
                correct[i] = Math.random()*10;
            }
            else{
                correct[i] = correct[i-1]+Math.random()*10;
            }
        } //Generate correct array in ascending order

        int temp = length;
        int pos; //The position that i should be put in rand array

        for (int i=0; i<length;i++){

            pos = (int)Math.floor(Math.random()*(length));

            if (rand[pos]==-1){
                rand[pos] = correct[i];
                temp--;
            }
            else {
                i--;
            }   //redo the correct[i] if rand[pos] already has an element inside of it 

            if (temp < 0) break;
        }//randomly distribute the integers in correct array into rand array

        check(rand,correct);

    }

    public void check(double[] rand, double[] correct){
        double[] result;
        sort obj;

        obj =  new sort();
        result = obj.ascending(rand);

        for (int i=0; i<result.length; i++){
            if (result[i] != correct[i]){
                System.out.println("Incorrect output at point " +i+ " in list");
            }
        }//loops through correct and result to find differences between the correct ans and the program

        System.out.println("input: ");
        obj.printSort(rand);
        System.out.println("Output: ");
        obj.printSort(result);

    }
    public static void main(String args[]){new randTest();}
}

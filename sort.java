public class sort{

    public sort(){
        double[] arr = {100,200,222,-1,023,2.3};
        ascending(arr);

        // printSort(arr);
    }

    public double[] ascending(double data[]){
        double temp;
        boolean end;
        int length;

        length = data.length;
        if (data.length < 2){
            System.out.println("Data doesn't have enough elements to sort");
        }
        else {
            for (int j=0; j<data.length; j++){
                end = false;
                for (int i=0; i<length-1; i++){
                    if (data[i] > data[i+1]){

                        temp = data[i];
                        data[i] = data[i+1];
                        data[i+1] = temp; //Swap elements
                        
                        end = true;

                    }
                }   //Cycle through data array once
                length--;
                if (!end) break;    //break if fully sorted
            }//loop through multiple iterations of data array with one less element every time
        }
        return data;
    }

    public void printSort(double data[]){
        System.out.print("{ ");
        for (int j=0; j<data.length; j++){
            System.out.print(data[j]+", ");
        }
        System.out.print(" }\n\n");
    }
    public static void main(String args[]){new sort();}
}
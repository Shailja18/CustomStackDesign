package assingment.stack;

public class DynamicStack extends CustomStack{

    public DynamicStack(int size) {
        super(size);
    }
    int[] createNewArray()
    {
        int[] newDataArray=new int[size+size];
        for(int i=0;i<size;i++)
        {
            newDataArray[i]=data[i];
        }
        return newDataArray;
    }
    public void push(int val) {
       if(top+1==size)
       {
          //Double array size
          data=createNewArray();
       }
       top+=1;
       data[top]=val;
    }
    public int pop() throws StackUnderFlowException {
        return super.pop();
    }

}

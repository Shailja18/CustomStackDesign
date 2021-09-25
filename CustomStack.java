package assingment.stack;

public class CustomStack
{
    protected int[] data;
    protected int top;
    protected int size;


    public CustomStack(int size)
    {
        data=new int[size];
        top=-1;
        this.size=size;
    }

    public int size()
    {
        return top+1;
    }

    public void display() throws StackUnderFlowException {
        if(top==-1)
            throw new StackUnderFlowException("Stack Underflow is found");
        else
        {
            for(int i=0;i<=top;i++)
                System.out.println(data[i]);
        }
    }
    public void push(int val) throws StackOverFlowException {
        if(top==size)
        {
            //Stack overflow
            throw new StackOverFlowException("Stack Overflow");
        }
        top=top+1;
        data[top]=val;
    }

    public int pop() throws StackUnderFlowException {
        if(isEmpty())
        {
          //Stack underfow
            throw new StackUnderFlowException("Stack Underflow");
        }
        return data[top--];
    }
    public boolean isEmpty()
    {
        if(size==0)
            return true;
        return false;
    }

    public int peek()
    {
        if(!isEmpty())
            return data[top];
        return -1;
    }
}
class StackOverFlowException extends Exception
{
    public StackOverFlowException (String str)
    {
        super(str);
    }
}
class StackUnderFlowException extends Exception
{
    public StackUnderFlowException (String str)
    {
        super(str);
    }
}
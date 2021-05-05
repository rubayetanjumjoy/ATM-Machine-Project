package atm;



public class MemberArray
{	
	
	Member marray[]=new Member[2];
	int count=0;
	public void addMember(Member m)
	{
		marray[count]=m;
		count++;
	//	System.out.println(count);

	}
	
	
	//Searching id
    public Member findID(int id)
    {
    	for(int i=0;i<marray.length;i++)
    	{
    		if(marray[i].getId()==id)
    		{
    			return marray[i];
    		}
    	}
    	marray[0].setId(0);
    	marray[0].setBalance(0);;
    	marray[0].setName("");
    	
     
    	return marray[0];
    }
    public int findArrayNumber(int id)
    {
    	for(int i=0;i<marray.length;i++)
    	{
    		if(marray[i].getId()==id)
    		{
    			return i;
    		}
    	}
     
    	return -1;
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }


	

	
	
	
	
}

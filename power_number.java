
public class power_number {

	public static void main(String[] args) {
	int num=132,rem=0,add=0,product=1;//
for(;num>0;num/=10)//132>0/13/1>0
      {
	rem=num%10;//2,3,1
	add=add+rem;//=2+3+1=6
	product=product+rem;
      }
if (add==product)
{
	System.out.println("IT IS A POWER NUMBER");
}
else 
	System.out.println("NOT A POWER NUMBER");

	}

}

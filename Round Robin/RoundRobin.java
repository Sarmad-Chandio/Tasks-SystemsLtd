/**
-->Pseudo-Code<--
Create an array of arrival time ar_time[] which keeps track of arrival time of process Pi
Create another array of burst time br_time[] which keeps track of remaining burst time
Initialize CPU time to 0; t = 0
Repeat these steps until ready queue is empty
if br_time[i] > quantum, t = t + quantum, br_time[i] -= quantum
else t = t + br_time[i], br_time = 0
**/
import java.util.Scanner;
public class RoundRobin{
	public static void main (String [] args){
		Scanner scan=new Scanner(System.in);
		//process, i am taking here four process, P1,P2,P3,P4
		int numProcess=4;
		//Arrival time
		int [] arrivalTime=new int [numProcess];
		//burst time
		int [] burstTime=new int [numProcess];
		//assign one variable to get total burst time for all process after each itreation
		int total;
		//waiting time for each process 
		int wait[]=new int [numProcess];
		//time Quantam
		int timeQuantam=2;
		
		for(int i=0;i<numProcess;i++){
			System.out.println("enter the arrivalTime for process P"+(i+1));
			arrivalTime[i]=Integer.parseInt(scan.nextLine());
		}
		for(int i=0;i<numProcess;i++){
			System.out.println("enter the burstTime for process P"+(i+1));
			burstTime[i]=Integer.parseInt(scan.nextLine());
		}
		
		//now assign one aray to get waiting for each process
		
		
		//Now , do loop until every process burst time become zero
		do{
			for(int i=0;i<numProcess;i++){
				if(burstTime[i]>timeQuantam){ //checking burt time is greater than time quantum
					for(int j=0;j<numProcess;j++){
						if(j!=i && burstTime[j]!=0){
							wait[j]=wait[j]+timeQuantam;
						}
					}
					burstTime[i]=(burstTime[i]-timeQuantam);
				}else{// if (burstTime[index] < time quantum)
					for(int j=0;j<numProcess;j++){
						if(j!=i && burstTime[j]!=0){
							wait[j]=wait[j]+burstTime[i];
						}
					}
					burstTime[i]=0;
				}
				
			}
			//assign one variable to get total burst time for all process after each itreation
			total=0;
			for(int i=0;i<numProcess;i++){
				total+=burstTime[i];
			}
		}while(total!=0);//if there all processes burst time will become 0 then stop the do while() loop
		
		System.out.println("process\t\t\tWaiting time ");
		
		//now assign one variable to get total of all waiting time 
		double totalWait=0;
		for(int i=0;i<numProcess;i++){
			System.out.println("P"+(i+1)+"\t\t\t"+wait[i]);
			totalWait+=wait[i];
		}
					//System.out.println("TaT="+totalWait);
		//Average waiting time
		System.out.println("Average waiting time="+(totalWait/numProcess));
	}
}
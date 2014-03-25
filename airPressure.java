/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;
/*

 */
public class airPressure extends ConsoleProgram {
	public void run() {
	   println ("this only works for cables 300 pair and up");
	   println ();
	   println ();
	   println ("Go to manifold and get pressure and flow");
	   println ();
	   println ("the highest flow = the beiggest leak");
	   println ();
	   double pres = readDouble("input pressure at manifold (in psi with a decimal): ");
	   println ();
	   double flow = readDouble("input flow at manifold (in cfm):  ");
	   println ();
	   println ("look in translore and get the second and third digit of the cable in question");
	   println ();
	   println ("the second digit of the cable designation = pulp if it is: d, s, or x.");
	   println ();
	   println ("otherwise it is pic.");
	   println ();
	   int isItPulp = readInt("input 1 for pulp or 2 for pic.: ");
	   println ();
	   println("the third letter = the Gauge of the cable.");
	   println ();
	   println ("B=19, A=22, M=24, T=26, W=28.");
	   println ();
	   int guage = readInt("what is the guage of the cable ?: ");
	   println ();
	   int pairs = readInt("how many pairs:  ");
	   double resistance =  res ( guage, isItPulp, pairs);
	   int IsItDualFlow = readInt("is the cable dual flow? (no plug)  if dual flow enter 1 otherwise enter 2: ");
	       if(IsItDualFlow==1){
		   println ("Now go one span in the direction you think the leak is.");  
		   double secondReading = readDouble("get a second reading at that point in psi and enter it: ");
		   int ftToSecondPoint = readInt("how many foot is it to the second read point?: ");
		   println(" the resistance is " +resistance);
		   double FlowToSecondPoint = (((pres - secondReading) / ftToSecondPoint)/resistance)*1000;
		   double FlowInOtherDirection = flow - FlowToSecondPoint;
		   println("the flow to where you are =: "+FlowToSecondPoint+".");
		   println ();
		   println ("the flow to the other direction  =: "+FlowInOtherDirection);
		   println ();
		   double flowTwo = readDouble("input the higher flow:  ");
		   println ();
		   double DistanceToLeak = ((pres / flowTwo) / resistance )*1000; 
		   println ();
		   println ("the big leak is within "+DistanceToLeak+" ft of the manifold in the direction of the highest flow.");
		   println ();
		   println ("go "+DistanceToLeak+"ft find a read point if it is zero you are very close to the leak stop here");
		   println ();
		   double backPressure = readDouble("If the pressure isnt zero the leak is closer to the manifold and you should enter the pressure here : ");
		   println ();
		   DistanceToLeak = (((pres-backPressure) / flow) / resistance )*1000;
		   println ("the leak is within "+DistanceToLeak+"ft of the manifold");
		   println ();
		    }
		    	println(" the resistance is " +resistance);
		    	println ();
		    	double DistanceToLeak = ((pres / flow) / resistance )*1000; 
				   println ("the leak is within "+DistanceToLeak+"ft of the manifold");
				   println ();
				   println ("go "+DistanceToLeak+"ft find a read point after it if it is zero you are very close to the leak stop here");
				   println ();
				   double backPressure = readDouble("If the pressure isnt zero the leak is closer to the manifold and you should enter the pressure here : ");
				   println ();
				   DistanceToLeak = (((pres-backPressure) / flow) / resistance )*1000;
				   println ("the leak is within "+DistanceToLeak+"ft of the manifold");
		    }
	       
	       
	       
	
	

	
	    
      private  double res(int gu,int  b, int c){
    	  
	   if (gu==19 && b ==1){
			    if(c==450){
				   return .7;}
				   else if(c==400){
					   return .8;}
					   else if(c==300){
						   return 1;}
	   }
		   if (gu==22 && b ==1){
			   if(c==1200){
				   return .7;}
				   else if(c==1100){
					   return .8;}
					   else if(c==900){
						   return 1;}
						   else if(c==600){
							   return 1.5;}
							   else if(c==450){
								   return 1.8;}
								   else if(c==400){
									   return 2.0;}
									   else if(c==300){
										   return 3.0;}
		   }
		   if (gu==24 && b ==1){
			    if(c==1800){
				   return .9;}
				   else if(c==1500){
					   return 1.2;}
					   else if(c==1200){
						   return 1.5;}
						   else if(c==900){
							   return 1.9;}
							   else if(c==600){
								   return 2.5;}
								   else if(c==400){
									   return 4.0;}
									   else if(c==300){
										   return 5.0;}
		   }
		   if (gu==26 && b ==1){
			    if(c==3600){
				   return .6;}
				   else if(c==3000){
					   return .7;}
					   else if(c==2700){
						   return .8;}
						   else if(c==2400){
							   return 1.0;}
							   else if(c==2100){
								   return 1.3;}
								   else if(c==1800){
									   return 1.6;}
									   else if(c==1500){
										   return 1.8;}
										   else if(c==1200){
											   return 2.2;}
											   else if(c==1100){
												   return 2.6;}
												   else if(c==900){
													   return 3.0;}
													   else if(c==600){
														   return 4.5;}
														   else if(c==450){
															   return 5.25;}
															   else if(c==400){
																   return 6.0;}
																   else if(c==300){
																	   return 7.5;}
		   }
		   if (gu==19 && b ==2){
			    if(c==300){
				   return .1;}
	   }
		   if (gu==22 && b ==2){
			    if(c==600){
				   return .2;}
				   else if(c==400){
					   return .3;}
					   else if(c==300){
						   return .4;}
		   }
		   if (gu==24 && b ==2){
			    if(c==1800){
				   return .2;}
				   else if(c==1500){
					   return .3;}
					   else if(c==1200){
						   return .4;}
						   else if(c==900){
							   return .4;}
							   else if(c==600){
								   return .5;}
								   else if(c==400){
									   return .6;}
									   else if(c==300){
										   return .8;
										 }
		   }
		  
		   if (gu==26 && b == 2){
			    if(c==3600){
				    return .1;
			   }
				   else if(c==3000){
					   return .1;
				   }
					   else if(c==2700){
						   return .2;
					   }
						   else if(c==2400){
							   return .3;
						   }
							   else if (c==2100){
								   return .4;
							   }
								   else if(c==1800){
									   return .4;
								   }
									   else if(c==1500){
										   return .5;
									   }
										   else if(c==1200){
											   return .6;
										   }
												   else if(c==900){
													   return .6;
												   }
													   else if(c==600){
														   return .8;
													   }
															   else if(c==400){
																   return 1.4;
															   }
																   else if(c==300){
																	   return 1.8;
																	   									   }
		   }
		return 0;
		
	
      }
}

	       								   


	
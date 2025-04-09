import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] sampless;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    int x=0;
    for(int i=0;i<samples.length;i++){
if(samples[i]>limit){samples[i]=limit;x++;}
    if(samples[i]<0-limit){samples[i]=0-limit;x++;}

    }
    return x;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: sampless contains at least one nonzero value
   *  Postcondition: the length of sampless reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
  boolean a =false;
    int count =0;
    for(int i=0;i<samples.length;i++){
if(samples[i]!=0){a=true;}
      if(x==true){count++;}


    }
    int hi=samples.length - count;
    int[] newSamples = new int[count];
    int y=0;
    for(int i=hi,i<samples.length;i++){
newSamples[y]=samples[i];
      y++;


    }
    samples = newSamples;
  }
}

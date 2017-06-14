package com.vodoke.service;


import java.io.IOException; 

import com.vodoke.tutorial.R;

import android.app.Service; 
import android.content.Intent; 
import android.media.MediaPlayer; 
import android.os.IBinder; 
 
public class MusicService extends Service { 
	   private MediaPlayer mp; 
	   
	    @Override 
	    public void onStart(Intent intent, int startId) { 
	        // TODO Auto-generated method stub  
	        mp.start();  
	        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { 
	 
	            public void onCompletion(MediaPlayer mp) { 
	                // TODO Auto-generated method stub  
	                try { 
	                    mp.start(); 
	                } catch (IllegalStateException e) { 
	                    // TODO Auto-generated catch block  
	                    e.printStackTrace(); 
	                } 
	            } 
	        }); 
	        mp.setOnErrorListener(new MediaPlayer.OnErrorListener() { 
	 
	            public boolean onError(MediaPlayer mp, int what, int extra) { 
	                // TODO Auto-generated method stub  
	                try { 
	                    mp.release(); 
	                } catch (Exception e) { 
	                    e.printStackTrace(); 
	                } 
	 
	                return false; 
	            } 
	        }); 
	 
	        super.onStart(intent, startId); 
	    } 
	 
	    @Override 
	    public void onCreate() { 
	        // TODO Auto-generated method stub  
	        try { 
	            mp = new MediaPlayer(); 
	            mp = MediaPlayer.create(MusicService.this, R.raw.music); 
	            mp.prepare(); 
	        } catch (IllegalStateException e) { 
	            // TODO Auto-generated catch block  
	            e.printStackTrace(); 
	        } catch (IOException e) { 
	            // TODO Auto-generated catch block  
	            e.printStackTrace(); 
	        } 
	 
	        super.onCreate(); 
	    } 
	 
	    @Override 
	    public void onDestroy() { 
	        // TODO Auto-generated method stub  
	        mp.stop(); 
	        mp.release(); 
	 
	        super.onDestroy(); 
	    } 
	 
	    @Override 
	    public IBinder onBind(Intent intent) { 
	        // TODO Auto-generated method stub  
	        return null; 
	    }
 
} 
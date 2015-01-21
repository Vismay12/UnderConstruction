package com.vismay.android.missionimpossible;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Vismay on 1/20/2015.
 */
public class MissionApplication extends Application {
    @Override
    public void onCreate() {
        Log.d("MissionApplication","inside onCreate");
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "lXlo2GX3EJjLdCy2GC9d0gOLnjhDo65srhWqcX0n", "1vly1120q8miVghYPKEqDSt2hF1Yl3eKJlL9PYvh");
        //super.onCreate();
        Log.d("MissionApplication","missionapple");
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}

/**
 * Copyright 2014 John Persano
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.johnpersano.jenkins.util;


import android.graphics.Color;

public class JenkinsResponse {

    @SuppressWarnings("UnusedDeclaration")
    private static final String TAG = "JenkinsResponse";

    private String mReply;
    private int mMood;
    private String mSerial;

    /* Different moods for Jenkins visualizer */
    public static class MOOD {

        public static int NORMAL = Color.CYAN;
        public static int ANGRY = Color.RED;
        public static int ANNOYED = Color.YELLOW;
        public static int HAPPY = Color.GREEN;
        public static int AGGRAVATED = Color.MAGENTA;
        public static int INDIFFERENT = Color.WHITE;

    }

    public JenkinsResponse() {

        /* Empty constructor */

    }

    public JenkinsResponse(String reply, int mood, String serial) {

        this.mReply = reply;
        this.mMood = mood;
        this.mSerial = serial;

    }

    public void setMood(int mood) {

        this.mMood = mood;

    }

    public void setReply(String reply) {

        this.mReply = reply;

    }

    public void setSerial(String serial) {

        this.mSerial = serial;

    }

    public String getReply() {

        return mReply;

    }

    public int getMood() {

        return mMood;

    }

    public String getSerial() {

        return mSerial;

    }

    /* This is used to convert XML string to int */
    public int convertStringToMood(String mood) {

        if (mood.equalsIgnoreCase("NORMAL")) {

            return JenkinsResponse.MOOD.NORMAL;

        } else if (mood.equalsIgnoreCase("ANGRY")) {

            return JenkinsResponse.MOOD.ANGRY;

        } else if (mood.equalsIgnoreCase("ANNOYED")) {

            return JenkinsResponse.MOOD.ANNOYED;

        } else if (mood.equalsIgnoreCase("HAPPY")) {

            return JenkinsResponse.MOOD.HAPPY;

        } else if (mood.equalsIgnoreCase("AGGRAVATED")) {

            return JenkinsResponse.MOOD.AGGRAVATED;

        } else if (mood.equalsIgnoreCase("INDIFFERENT")) {

            return JenkinsResponse.MOOD.INDIFFERENT;

        }

        return JenkinsResponse.MOOD.NORMAL;

    }

}

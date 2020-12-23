package com.company;

public class UserMood {
    public static boolean user_mood_is_good; //устанавливается через сеттер в другом окне

    public void setUserMoodGood(){ user_mood_is_good = true; }
    public void setUserMoodBad(){
        user_mood_is_good = false;
    }
}

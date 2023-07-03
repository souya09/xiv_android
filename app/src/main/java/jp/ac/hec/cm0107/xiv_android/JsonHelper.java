package jp.ac.hec.cm0107.xiv_android;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonHelper {

    static String pubDate;

    public static ArrayList<CharaItem> parseJson (String strJson) {

        ArrayList<CharaItem> charaItemArrayList = new ArrayList<>();
        try{
            JSONObject json = new JSONObject(strJson);
            JSONObject feed = json.getJSONObject("Character");

            pubDate = feed.getString("pubDate");

            JSONArray entries = feed.getJSONArray("ClassJobs");
            for(int i = 0; i < entries.length();i++) {
                JSONObject entry = entries.getJSONObject(i);
                charaItemArrayList.add(parseToItem(entry));
            }
        }catch (Exception e) {
            Log.e("JsonHelper", e.getMessage());
        }
        return charaItemArrayList;

    }
    public static CharaItem parseToItem (JSONObject json) throws JSONException {
        CharaItem item = new CharaItem();
        item.setJobID(json.getInt("JobID"));
        item.setJ_Name(json.getString("Name"));
        item.setLevel(json.getInt("Level"));


        return item;
    }
}

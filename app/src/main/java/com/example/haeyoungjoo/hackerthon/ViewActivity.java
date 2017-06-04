package com.example.haeyoungjoo.hackerthon;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.haeyoungjoo.hackerthon.NameChecker.CYG;
import com.example.haeyoungjoo.hackerthon.NameChecker.JGC;
import com.example.haeyoungjoo.hackerthon.NameChecker.JGS;
import com.example.haeyoungjoo.hackerthon.NameChecker.JJS;
import com.example.haeyoungjoo.hackerthon.NameChecker.JTH;
import com.example.haeyoungjoo.hackerthon.NameChecker.ProfessorName;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by hae young Joo on 2016-11-12.
 */

public class ViewActivity extends AppCompatActivity {



    /*한 교수가 가르칠수 있는 최대과목이 4개밖에 없어서 RatingBar를 4개 선언 하였다*/
    RatingBar Average1;
    RatingBar Average2;
    RatingBar Average3;
    RatingBar Average4;

    RatingBar[] ratingBars = new RatingBar[4];
    Vector<Integer> Averages = new Vector<Integer>();

    Map<Integer,String> lectures = new HashMap<>();
    String phoneNumber;
    String emailAddress;

    /*각 교수의 각 과목당 평점을 매기기 위해서 필요한 url ( 각 교수당 최대 3개의 과목이 있다 ) */
    private String url;

    // json으로 결과값을 받기위해 필요함!.
    String jsonResult1;

    ProfessorName[] nameCheckers = new ProfessorName[] {
            new CYG(),
            new JGC(),
            new JGS(),
            new JJS(),
            new JTH(),





    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("ViewActivity", "onCreate");

        Intent intent = getIntent();
        String professorName = intent.getExtras().getString("NAME");
        System.out.println(professorName + "2");

        /* 해당 이름에 맞는 activity를 보여준다 */

        for (ProfessorName nameChecker : nameCheckers) {
            if (nameChecker.isMatchName(professorName)) {
                setContentView(nameChecker.getView());
                url = nameChecker.getUrl();

                Averages = nameChecker.ratingBarControl();
                for(int i = 0 ; i < Averages.size() ; i++ )
                    ratingBars[i] = (RatingBar) findViewById(Averages.get(i));

                lectures = nameChecker.getLecture();

                phoneNumber = nameChecker.getCall();
                emailAddress = nameChecker.getEmail();
                accessWebServiceRating();
            }
        }
    }

    //웹서버에 접근해서 데이터들을 json으로 읽어오는 스레드~
    private class JSonReadTaskRating extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... params) {

            Log.d("ViewActivity","doInBackground");
            HttpClient httpclient1 = new DefaultHttpClient();
            HttpPost httppost1 = new HttpPost(params[0]); //(params[0]에는 url 값이 들어있습! Post로 서버에 연결.
            try {

                HttpResponse response1 = httpclient1.execute(httppost1);//서버로 연결하고 그 결과 값을.
                InputStream inputStream1 = response1.getEntity().getContent();//서버에서 주는 결과를 받아올수 있는 inputStream 객체 생성.
                jsonResult1 = inputStreamToString(inputStream1).toString();//스트림을 매개변수 값으로 넣고 원래 json은 문자열이기때문에 문자열로 바꿔서 온다.


            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        private StringBuilder inputStreamToString(InputStream is) {

            Log.d("ViewActivity","inputStreamToString");

            String rLine = "";
            StringBuilder answer = new StringBuilder();
            BufferedReader rd = new BufferedReader( new InputStreamReader(is) );//해당 스트림으로부터 읽어 와서 버퍼에 저장한다~

            try {
                while ( (rLine = rd.readLine()) != null ) {
                    answer.append(rLine);
                    Log.d("line",rLine );
                    Log.d("number","1");
                }
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(),
                        "Error..." + e.toString(), Toast.LENGTH_LONG).show();
            }
            Log.d("answer",answer.toString() );

            return answer;
        }
        @Override
        protected void onPostExecute(String result) {

            Log.d("ViewActivity","onPostExecute");

            try {

                JSONObject jsonResponse1 = new JSONObject(jsonResult1);
                JSONArray jsonMainNode1 = jsonResponse1.optJSONArray("avgData");
                for (int i = 0; i < jsonMainNode1.length(); i++) {
                    JSONObject jsonChildNode1 = jsonMainNode1.getJSONObject(i);
                    String subjectavg = jsonChildNode1.optString("avg");
                    Log.d("avg",subjectavg);

                    if( i == 0 )
                        ratingBars[i].setRating( Float.parseFloat(subjectavg) );
                    else if ( i == 1 )
                        ratingBars[i].setRating( Float.parseFloat(subjectavg) );
                    else if( i == 2 )
                        ratingBars[i].setRating( Float.parseFloat(subjectavg) );
                    else
                        ratingBars[i].setRating( Float.parseFloat(subjectavg) );
                }

            } catch (JSONException e) {
                Toast.makeText(getApplicationContext(), "Error" + e.toString(),
                        Toast.LENGTH_SHORT).show();
            }

        }
    }
    /* url이 2개일때 3개일때 스레드가 다르다. */
    public void accessWebServiceRating(){

        Log.d("ViewActivity","accessWebServiceRating");

        JSonReadTaskRating task =new JSonReadTaskRating();

        task.execute( new String[]{url});
    }

    public void onClick(View view){

        Intent i = new Intent(this, evaluateActivity.class);
        i.putExtra("professorlecture",lectures.get(view.getId()) );

        Log.d("view.getId()",lectures.get(view.getId()) );
        startActivity(i);
        finish();

    }

    public void onClickCall(View view){

        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(phoneNumber));
        if(intent != null ){
            if(intent.resolveActivity(getPackageManager()) != null){
                startActivity(intent);
            }
        }
    }
    public void onClickMail(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(emailAddress));
        if(intent != null ){
            if(intent.resolveActivity(getPackageManager()) != null){
                startActivity(intent);
            }
        }
    }
}

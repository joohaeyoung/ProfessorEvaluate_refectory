package com.example.haeyoungjoo.hackerthon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView listview ;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       Log.d("MainActivity","onCreate");
        setContentView(R.layout.activity_main2);
       ListViewAdapter2 adapter;

       // Adapter 생성
       adapter = new ListViewAdapter2() ;
       // 리스트뷰 참조 및 Adapter달기
       listview = (ListView) findViewById(R.id.listview1);
       listview.setAdapter(adapter);

       /*어댑터에다가 이미지로된 파일을 저장]한다 */
       adapter.addItem( ContextCompat.getDrawable( this, R.drawable.cyg ),"최영규","c++,자료구조,그래픽스");//최영규
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.jgc),"정구철","컴퓨터공학입문,c언어") ;//정구철
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.jgs),"장경식","머머가르침") ;//장경식
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kys), "김윤상","머머가르침") ;//김윤상
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.ljh), "이재협","머머가르침") ;//이재협
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.uhg), "윤한경","머머가르침") ;//윤한경
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.hanyunhee), "한연희","머머가르침") ;//한연희
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.jojaesu), "조재수","머머가르침") ;//조재수
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.joojb), "주영복","머머가르침") ;//주영복
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.jth), "조태훈","머머가르침") ;//조태훈
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kanghj), "강형주","머머가르침") ;//강형주
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kanghwan), "이강환","머머가르침") ;//이강환
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kangsw), "강승우","머머가르침") ;//강승우
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kimenkung), "김은경","머머가르침") ;//김은경
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kimsangjin), "김상진","머머가르침") ;//김상진
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kimsy), "김상연","머머가르침") ;//김상연
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kimwantae), "김원태","머머가르침") ;//김원태
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.kwonoy), "권오영","머머가르침") ;//권오영
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.minjk), "민준기","머머가르침") ;//민준기
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.mohamad), "무하마드","머머가르침") ;//무하마드
       adapter.addItem( ContextCompat.getDrawable(this, R.drawable.moon), "문일영","머머가르침") ;//문일영
    //   adapter.addItem( ContextCompat.getDrawable(this, R.drawable.parksc), "psc") ;//박승철
    //   adapter.addItem( ContextCompat.getDrawable(this, R.drawable.shisuck), "shs") ;//서희석


       EditText editTextFilter = (EditText)findViewById(R.id.editTextFilter) ;
       editTextFilter.addTextChangedListener(new TextWatcher() {
           @Override
           public void afterTextChanged(Editable edit) {
               String filterText = edit.toString() ;
               if (filterText.length() > 0) {
                   listview.setFilterText(filterText) ;
               } else {
                   listview.clearTextFilter() ;
               }
           }

           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {
           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
           }
       }) ;


       /* ListView 클릭시 발생하는 이벤트  - > viewActivity로 넘어 간다.*/
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView parent, View v, int position, long id) {

               Log.d("MainActivity","onItemClick");

               ListViewItem2 item = (ListViewItem2) parent.getItemAtPosition(position) ;

               String professorName =  item.getTitle();

               System.out.println( professorName );

               Intent intent = new Intent(MainActivity.this, ViewActivity.class);

               intent.putExtra("NAME",professorName);

               startActivity(intent);
              //Drawable iconDrawable = item.getIcon() ;
               // TODO : use item data.
           }
       }) ;

    }

}

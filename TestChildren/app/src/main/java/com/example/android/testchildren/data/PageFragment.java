package com.example.android.testchildren.data;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.testchildren.R;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class PageFragment extends Fragment {

    //Номер страницы
    private int pageNumber;

    //Номер буквы в Кириллице в UTF-8
    private int firstCodeLettersRu = 1040;

    //Номер буквы Ё в Кириллице в UTF-8
    private int letterYe = 1025;

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    //Конструктор по умолчанию
    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    //Верстаем макет по типу fragment_page.xml
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment_page, container, false);

        //Ищем айдишники элементов
        TextView letterUperCase = (TextView) result.findViewById(R.id.displayText);
        TextView letterLowerCase = (TextView) result.findViewById(R.id.displayTextSmall);
        TextView word = (TextView) result.findViewById(R.id.word_tv);
        Button button = (Button) result.findViewById(R.id.start_sound);

        //Создаем медиплеер
        final MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.alex);

        //Вешаем листенер на кнопку звука, чтобы при нажатии был звук ))
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        //Проверка номера, чтобы вставить букву Ё в середину
        if (pageNumber == 6) {
            char ch = (char) (letterYe);
            lettersResult(ch, letterUperCase, letterLowerCase, word);
        } else if (pageNumber > 0 && pageNumber < 6) {
            char ch = (char) (firstCodeLettersRu + pageNumber);
            lettersResult(ch, letterUperCase, letterLowerCase, word);
        } else if (pageNumber > 6) {
            char ch = (char) (firstCodeLettersRu + pageNumber - 1);
            lettersResult(ch, letterUperCase, letterLowerCase, word);
        }

        return result;
    }

    //Метод для вставки разных букв во фрагменты
    public void lettersResult(char ch, TextView tvUP, TextView tvLow, TextView word) {
        String resultLetter = String.valueOf(ch);
        try {
            //Преобразуем кодировку, чтобы нормально отображалась Кириллица
            String m = new String(resultLetter.getBytes(), "UTF-8");

            tvUP.setText(m);
            tvLow.setText(m.toLowerCase());

            word.setText(String.valueOf(getResources().getStringArray(R.array.words_array_ru)[pageNumber]));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
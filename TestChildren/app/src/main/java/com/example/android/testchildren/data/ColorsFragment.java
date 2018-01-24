package com.example.android.testchildren.data;

import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.testchildren.R;



public class ColorsFragment extends Fragment {

    private int pageNumber;

    public static ColorsFragment newInstance(int page) {
        ColorsFragment fragment = new ColorsFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    public ColorsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment_colors, container, false);

        TextView word = (TextView) result.findViewById(R.id.color_tv);
        ImageView color = (ImageView) result.findViewById(R.id.iv_color);
        Button button = (Button) result.findViewById(R.id.start_sound);

        final MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.alex);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        word.setText(String.valueOf(getResources().getStringArray(R.array.colors_array)[pageNumber]));

        switch (pageNumber){
            case 0:
                color.setBackgroundColor(getResources().getColor(R.color.rainbow1));
                break;
            case 1:
                color.setBackgroundColor(getResources().getColor(R.color.rainbow2));
                break;
            case 2:
                color.setBackgroundColor(getResources().getColor(R.color.rainbow3));
                break;
            case 3:
                color.setBackgroundColor(getResources().getColor(R.color.rainbow4));
                break;
            case 4:
                color.setBackgroundColor(getResources().getColor(R.color.rainbow5));
                break;
            case 5:
                color.setBackgroundColor(getResources().getColor(R.color.rainbow6));
                break;
            case 6:
                color.setBackgroundColor(getResources().getColor(R.color.rainbow7));
                break;
            case 7:
                color.setBackgroundColor(getResources().getColor(R.color.rainbow8));
                break;
        }


        return result;
    }


}

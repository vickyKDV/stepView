package com.vickykdv.stepviewanimation;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class stepViewAnimation extends RelativeLayout {


    public stepViewAnimation(Context context) {
        super(context);
        init(context,null );
    }

    public stepViewAnimation(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);

    }

    public stepViewAnimation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @SuppressLint("NewApi")
    public stepViewAnimation(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }


    @SuppressLint("ResourceType")
    private void init (Context context,AttributeSet attrs){
        String deskripsi1,deskripsi2,deskripsi3,deskripsi4;
        boolean step_1_aktif,step_2_aktif,step_3_aktif,step_4_aktif;
        TextView txt_step1,txt_step2,txt_step3,txt_step4;

        LinearLayout step1,step2,step3,step4;

        View div_1,div_2,div_3;

        if (attrs != null && context != null) {
            TypedArray a = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.stepViewAnimation,
                    0, 0
            );

            deskripsi1 = a.getString(R.styleable.stepViewAnimation_step_1_desc);
            deskripsi2 = a.getString(R.styleable.stepViewAnimation_step_2_desc);
            deskripsi3 = a.getString(R.styleable.stepViewAnimation_step_3_desc);
            deskripsi4 = a.getString(R.styleable.stepViewAnimation_step_4_desc);

            step_1_aktif = a.getBoolean(R.styleable.stepViewAnimation_showstep_1,true);
            step_2_aktif = a.getBoolean(R.styleable.stepViewAnimation_showstep_2,true);
            step_3_aktif = a.getBoolean(R.styleable.stepViewAnimation_showstep_3,true);
            step_4_aktif = a.getBoolean(R.styleable.stepViewAnimation_showstep_4,true);

            setLayoutParams(new ViewGroup.LayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)));
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View view = inflater.inflate(R.layout.stepview, this, true);


            txt_step1 = view.findViewById(R.id.txt_step1);
            txt_step2 = view.findViewById(R.id.txt_step2);
            txt_step3 = view.findViewById(R.id.txt_step3);
            txt_step4 = view.findViewById(R.id.txt_step4);


            step1 = view.findViewById(R.id.step1);
            div_1 = view.findViewById(R.id.div_1);


            step2 = view.findViewById(R.id.step2);
            div_2 = view.findViewById(R.id.div_2);

            step3 = view.findViewById(R.id.step3);
            div_3 = view.findViewById(R.id.div_3);

            step4 = view.findViewById(R.id.step4);






            if(!step_1_aktif) {
                step1.setVisibility(GONE);
                div_1.setVisibility(GONE);
            }

            if(!step_2_aktif) {
                step2.setVisibility(GONE);
                div_2.setVisibility(GONE);
            }

            if(!step_3_aktif) {
                step3.setVisibility(GONE);
                div_3.setVisibility(GONE);
            }

            if(!step_4_aktif) {
                step4.setVisibility(GONE);
            }


            txt_step1.setText(deskripsi1);
            txt_step2.setText(deskripsi2);
            txt_step3.setText(deskripsi3);
            txt_step4.setText(deskripsi4);



            setClipToPadding(false);
        }

        }
}

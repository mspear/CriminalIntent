package com.bignerdranch.andorid.criminalintent;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by mspear on 3/22/16.
 */
public class SuspectViewFragment extends DialogFragment {
    public static final String ARG_FILE = "file";

    public static SuspectViewFragment newInsance(File mPhotoFile) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_FILE, mPhotoFile);

        SuspectViewFragment fragment = new SuspectViewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        File file = (File) getArguments().getSerializable(ARG_FILE);
        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_suspect, null);

        //If file does not exist, the app will simply not display an image and continue running
        Bitmap image = PictureUtils.getScaledBitmap(file.getPath(), getActivity());
        ImageView suspectView = (ImageView) v.findViewById(R.id.dialog_suspect_view);
        suspectView.setImageBitmap(image);






        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .create();
    }

}

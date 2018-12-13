package edu.umass.cs325.beleaf;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class dFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                // Set Dialog Title
                .setTitle("save the earth!")
                // Set Dialog Message
                .setMessage("claim this resource?")

                // Positive button
                .setPositiveButton("claim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //maybe add overlay or another dialog indicating success
                    }
                })

                // Negative Button
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,	int which) {
                        // Do something else
                    }
                }).create();
    }
}

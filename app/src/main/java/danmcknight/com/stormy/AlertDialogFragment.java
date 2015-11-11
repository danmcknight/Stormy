package danmcknight.com.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by danielmcknight on 10/16/15.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.Error_title)
                .setMessage("There was an error, try again")
                .setPositiveButton("OK", null);

        AlertDialog dialog = builder.create();
        return dialog;

    }
}

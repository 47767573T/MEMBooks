package app.membooks;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F_Login extends Fragment implements View.OnClickListener{

    TextView tvNewUser;


    public F_Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LoginView = inflater.inflate(R.layout.lay_f_login, container, false;



        return );
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.txvNewUser:
                Intent intentNewUser = new Intent(getActivity().getApplication()
                        , A_NewUser.class);
            startActivity(intentNewUser);
        }


    }
}
